package pl.pawelsuska.AutoKomis.model;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import pl.pawelsuska.AutoKomis.dto.OperationDto;

import javax.persistence.*;
import java.math.BigDecimal;
import java.util.Date;


@Getter
@Setter
@NoArgsConstructor
@Entity
@Table(name = "operations")
public class Operation {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @Column
    private Date data;
    @Column
    private BigDecimal value;
    @Column
    private Enum<TypeOfOperation> type;
    @OneToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "vehicle_id")
    private Vehicle vehicle;
    @OneToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "customer_id")
    private Customer customer;

    public Operation(OperationDto operationDto) {
        this.id = operationDto.getOperationId();
        this.value = operationDto.getOperationValue();
        this.type = operationDto.getOperationType();
    }


}
