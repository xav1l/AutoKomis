package pl.pawelsuska.AutoKomis.model;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import pl.pawelsuska.AutoKomis.dto.OperationDto;

import javax.persistence.*;


@Getter
@Setter
@NoArgsConstructor
@Entity
@Table(name = "customers")
public class Customer {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @Column
    private String name;
    @Column
    private String firstName;
    @Column
    private String address;
    @Column
    private String nip;
    @Column (unique = true)
    private String pesel;

    public Customer(OperationDto operationDto) {
        this.id = operationDto.getCustomerId();
        this.name = operationDto.getCustomerName();
        this.firstName = operationDto.getCustomerFirstName();
        this.address = operationDto.getCustomerAddress();
        this.nip = operationDto.getCustomerNip();
        this.pesel = operationDto.getCustomerPesel();
    }


}
