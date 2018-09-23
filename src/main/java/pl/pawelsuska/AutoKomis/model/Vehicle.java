package pl.pawelsuska.AutoKomis.model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;


@Setter
@Getter
@Entity
@Table(name = "vehicles")
public class Vehicle {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @Column (unique = true)
    private String vin;
    @Column
    private String brand;
    @Column
    private String model;
    @Column
    private Integer capacity;
    @Column
    private Integer horsePower;
    @Column
    private String fuelType;
    @Column
    private Integer mileage;
    @Column
    private String gearType;
    @Column
    private String description;
    @Column
    private Integer testDriveCounter = 0;
    @Column
    private Integer productionDate;
    @Column
    private Integer status = 0;




}
