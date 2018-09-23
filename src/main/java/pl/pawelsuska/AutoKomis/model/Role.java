package pl.pawelsuska.AutoKomis.model;

import lombok.Getter;

import lombok.Setter;

import javax.persistence.*;


@Setter
@Getter
@Entity
@Table(name = "roles")
public class Role {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @Column (unique = true)
    private String name;
    @Column
    private String description;


}
