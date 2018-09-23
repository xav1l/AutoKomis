package pl.pawelsuska.AutoKomis.model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;


@Getter
@Setter
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


}
