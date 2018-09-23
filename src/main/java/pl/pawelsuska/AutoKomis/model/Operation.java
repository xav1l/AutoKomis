package pl.pawelsuska.AutoKomis.model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.math.BigDecimal;
import java.util.Date;


@Getter
@Setter
@Entity
@Table(name = "operations")
public class Operation {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @Column
    private Date data;
    @Column
    private BigDecimal amount;
    @Column
    private Enum<TypeOfOperation> typeOfOperation;


}
