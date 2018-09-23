package pl.pawelsuska.AutoKomis.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import pl.pawelsuska.AutoKomis.exceptions.WrongObjectException;
import pl.pawelsuska.AutoKomis.model.Customer;
import pl.pawelsuska.AutoKomis.services.CustomerService;

import java.util.List;
import java.util.Optional;

@Controller
@RequestMapping("/customer")
public class CustomerController {

    private final CustomerService customerService;

    @Autowired
    public CustomerController(CustomerService customerService) {
        this.customerService = customerService;
    }

    @GetMapping("/list")
    public String showList(Model model) {
        List<Customer> customers = customerService.findAll();
        model.addAttribute("customers", customers);
        return "customer/list";
    }

    @GetMapping("/{id}/edit")
    public String showEditCustomer(@PathVariable("id") Integer id, Model model) {
        Optional<Customer> first = customerService.findById(id);
        if (!first.isPresent()) {
            throw new WrongObjectException("Nie ma takiego klienta");
        }
        model.addAttribute("customer", first.get());
        return "customer/edit";
    }

    @GetMapping("/add")
    public String showAddNewCustomer(Model model) {
        model.addAttribute("customer", new Customer());
        return "customer/edit";
    }

    @PostMapping("/save")
    public String saveCustomer(@ModelAttribute("customer") Customer customer) {
        customerService.save(customer);
        return "redirect:/customer/list";
    }

    @GetMapping("/{id}/delete")
    public String deleteCustomer(@PathVariable("id") Integer id, Model model) {
        customerService.deleteById(id);
        return "redirect:/customer/list";
    }
}
