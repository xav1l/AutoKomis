package pl.pawelsuska.AutoKomis.dto;


import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import pl.pawelsuska.AutoKomis.model.Customer;
import pl.pawelsuska.AutoKomis.model.Operation;
import pl.pawelsuska.AutoKomis.model.TypeOfOperation;
import pl.pawelsuska.AutoKomis.model.Vehicle;

import java.math.BigDecimal;
import java.text.SimpleDateFormat;
import java.util.Date;

@Getter
@Setter
@NoArgsConstructor
public class OperationDto {
    private Integer vehicleId;
    private String vehicleVin;
    private String vehicleBrand;
    private String vehicleModel;
    private Integer vehicleCapacity;
    private Integer vehicleHorsePower;
    private String vehicleFuelType;
    private Integer vehicleMileage;
    private String vehicleGearType;
    private String vehicleDescription;
    private Integer vehicleProductionDate;
    private Integer customerId;
    private String customerName;
    private String customerFirstName;
    private String customerAddress;
    private String customerNip;
    private String customerPesel;
    private Integer operationId;
    private String operationData;
    private BigDecimal operationValue;
    private Enum<TypeOfOperation> operationType;

    public OperationDto(Vehicle vehicle, Customer customer, Operation operation) {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        String data = "";
        try {
            data = sdf.format(operation.getData());
        } catch (Exception e) {
            data = sdf.format(new Date());
        }
    }
}