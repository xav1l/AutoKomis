package pl.pawelsuska.AutoKomis.model;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import pl.pawelsuska.AutoKomis.dto.OperationDto;

import javax.persistence.*;


@Setter
@NoArgsConstructor
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
    private Integer status = 0;
    @Column
    private Integer productionDate;

    public Vehicle(OperationDto operationDto) {
        this.id = operationDto.getVehicleId();
        this.vin = operationDto.getVehicleVin();
        this.brand = operationDto.getVehicleBrand();
        this.model = operationDto.getVehicleModel();
        this.capacity = operationDto.getVehicleCapacity();
        this.horsePower = operationDto.getVehicleHorsePower();
        this.fuelType = operationDto.getVehicleFuelType();
        this.mileage = operationDto.getVehicleMileage();
        this.gearType = operationDto.getVehicleGearType();
        this.description = operationDto.getVehicleDescription();
        this.productionDate = operationDto.getVehicleProductionDate();
    }


}
