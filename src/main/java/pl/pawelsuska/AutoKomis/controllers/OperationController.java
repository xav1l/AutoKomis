package pl.pawelsuska.AutoKomis.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import pl.pawelsuska.AutoKomis.dto.OperationDto;
import pl.pawelsuska.AutoKomis.model.Customer;
import pl.pawelsuska.AutoKomis.model.Operation;
import pl.pawelsuska.AutoKomis.model.Vehicle;
import pl.pawelsuska.AutoKomis.services.CustomerService;
import pl.pawelsuska.AutoKomis.services.OperationService;
import pl.pawelsuska.AutoKomis.services.VehicleService;


import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

@Controller
@RequestMapping("/operation")
public class OperationController {

    private final OperationService operationService;
    private final VehicleService vehicleService;
    private final CustomerService customerService;

    @Autowired
    public OperationController(OperationService operationService, VehicleService vehicleService, CustomerService customerService) {
        this.operationService = operationService;
        this.vehicleService = vehicleService;
        this.customerService = customerService;
    }

    @PostMapping("/buy")
    public String buyVehicle(@ModelAttribute("operationDto") OperationDto operationDto) {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        Date data = null;
        try {
            data = sdf.parse(operationDto.getOperationData());
        } catch (ParseException e) {
            e.printStackTrace();
        } finally {
            data = new Date();
        }

        Vehicle vehicle = vehicleService.update(new Vehicle(operationDto));
        vehicle.setStatus(1);
        Customer customer = customerService.update(new Customer(operationDto));
        Operation operation = new Operation(operationDto);
        operation.setData(data);
        operation.setCustomer(customer);
        operation.setVehicle(vehicle);

        vehicleService.save(vehicle);
        customerService.save(customer);
        operationService.save(operation);

        return "redirect:/vehicle/toSaleList";
    }
}
