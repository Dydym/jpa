package org.home.jpa.domain;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Transient;
import java.math.BigDecimal;
import java.math.BigInteger;

@Entity
@Data
@NoArgsConstructor
public class PossibleType {
    @Id
    private long id;
    private short shortType;
    private boolean booleanType;
    private byte byteType;
    private int intType;
    private float floatType;
    private double doubleType;
    private char charType;
    private Integer integerType;
    private BigInteger bigIntegerType;
    private BigDecimal bigDecimalType;
    private String stringType;
    private Double doublePackType;
    private int[] integerArray;
    private double[] doubleArray;
    private LongWeekend longWeekend;
    @Transient
    private int counter;



}
