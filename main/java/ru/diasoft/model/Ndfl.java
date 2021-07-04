package ru.diasoft.model;

import lombok.*;
import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.*;
import java.text.DateFormat;
import java.util.Date;
import java.util.UUID;

@EqualsAndHashCode(of = "id")
@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "ndfl")
public class Ndfl {
    @Id
    @GeneratedValue(generator = "uuid")
    @Column(name = "id")
    private UUID id;
    @Column(name = "firstName")
    private String firstName;
    @Column(name = "surname")
    private String surname;
    @Column(name = "patronymic")
    private String patronymic;
    @Column(name = "inn")
    private String inn;
    @Column(name = "kpp")
    private String kpp;
    @Column(name = "list")
    private String list;
    @Column(name = "infAdjNum")
    private String infAdjNum;
    @Column(name = "innInRF")
    private String innInRF;
    @Column(name = "theTaxpayerStatus")
    private String theTaxpayerStatus;
    @Column(name = "dateBirthday")
    private String dateBirthday;
    @Column(name = "countryCodeId")
    private String countryCodeId;
    @Column(name = "documentCode")
    private String documentCode;
    @Column(name = "serialOfDocument")
    private String serialOfDocument;
    @Column(name = "numberOfDocument")
    private String numberOfDocument;
    @Column(name = "sumSalary")
    private String sumSalary;
    @Column(name = "taxBase")
    private String taxBase;
    @Column(name = "taxAmount")
    private String taxAmount;
    @Column(name = "taxTrans")
    private String taxTrans;
    @Column(name = "taxAmountCalculated")
    private String taxAmountCalculated;
    @Column(name = "taxAmountWithheld")
    private String taxAmountWithheld;
    @Column(name = "sumSalaryNotWithHeld")
    private String sumSalaryNotWithHeld;
    @Column(name = "sumSalaryNonDex")
    private String sumSalaryNonDex;
}
