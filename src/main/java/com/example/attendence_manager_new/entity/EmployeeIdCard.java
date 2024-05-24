package com.example.attendence_manager_new.entity;

import jakarta.persistence.*;

import static jakarta.persistence.CascadeType.ALL;
import static jakarta.persistence.GenerationType.SEQUENCE;

@Entity(name = "EmployeeIdCard")
@Table(name = "employee_id_card",
        uniqueConstraints = {
        @UniqueConstraint(name = "employee_card_no_unique", columnNames = {"employee_card_no"})
        }
)
public class EmployeeIdCard {

    @Id
    @Column(name = "employee_card_id",
    updatable = false)
    @SequenceGenerator(
            name = "employee_card_sequence",
            sequenceName = "employee_card_no",
            allocationSize = 1
    )
    @GeneratedValue(
            strategy = SEQUENCE,
            generator = "employee_card_no"
    )
    private Long id;


    @Column(name = "employee_card_no",
    nullable = false,
    length = 15
    )
    private String cardNo;

    public EmployeeIdCard(String cardNo) {
        this.cardNo = cardNo;
    }

    public EmployeeIdCard() {
    }

    public EmployeeIdCard(String cardNo, Employee employee) {
        this.cardNo = cardNo;
        this.employee = employee;
    }

    public Long getId() {
        return id;
    }

    public String getCardNo() {
        return cardNo;
    }

    public void setCardNo(String cardNo) {
        this.cardNo = cardNo;
    }

    //RelationShip
    @OneToOne(cascade = ALL,
    fetch = FetchType.EAGER
    )
    @JoinColumn(name = "employee_id",
    referencedColumnName = "employee_id"
    )
    private Employee employee;

    @Override
    public String toString() {
        return "EmployeeIdCard{" +
                "id=" + id +
                ", cardNo='" + cardNo + '\'' +
                ", employee=" + employee +
                '}';
    }
}
