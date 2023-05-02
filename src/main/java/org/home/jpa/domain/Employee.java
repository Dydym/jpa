package org.home.jpa.domain;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.math.BigDecimal;

@Data
@NoArgsConstructor
@Entity
@Table(name = "Pracownicy")
public class Employee {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private long id;
    @Column(name = "Imie", nullable = false, length = 10)
    private String name;
    @Column(name = "Nazwisko", columnDefinition = "VARCHAR(30) NOT NULL")
    private String lastName;
    @Column(name = "Pensja")
    private double salary;
    @Column(name = "Prowizja", precision = 10, scale = 2)
    BigDecimal provision;
}
