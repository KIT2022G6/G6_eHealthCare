package edu.multicampus.eHealthCare.model;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.*;
import java.util.Set;

@Entity
@Getter
@Setter
@ToString
public class Prescription {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "prescriptionID", unique = true)
    private Long preID;

    private int pAmo, pDos;
    private String pDet;

//    @OneToOne(cascade = CascadeType.ALL)
//    @JoinColumn(name = "preID", nullable = false)
//    private Paper papID;

    @OneToMany(mappedBy = "preID", cascade = CascadeType.ALL)
    private Set<MedInvoice> listMedInvoice;

}
