package edu.multicampus.eHealthCare.model;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.*;

@Entity
@Getter
@Setter
@ToString
public class MedInvoice {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "medInvoiceID", nullable = false)
    private Long mediID;


    @ManyToOne
    @JoinColumn(name = "preID")
    private Prescription preID;

    @ManyToOne
    @JoinColumn(name = "medID")
    private Medicine medID;

}
