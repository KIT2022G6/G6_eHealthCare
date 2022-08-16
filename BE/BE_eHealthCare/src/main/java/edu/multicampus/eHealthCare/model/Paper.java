package edu.multicampus.eHealthCare.model;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.*;
import java.sql.Date;

@Entity
@Getter
@Setter
@ToString
public class Paper {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "paperID", unique = true)
    private Long papID;

    private int pOrd, pRoo;
    private Date pVsi;

    @ManyToOne
    @JoinColumn(name = "doctorID")
    private Doctor docID;

    @ManyToOne
    @JoinColumn(name = "patientID")
    private Patient patID;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "preID", nullable = false)
    private Prescription preID;

//    @OneToOne(mappedBy = "papID")
//    private Prescription preID;

    @ManyToOne
    @MapsId("papID")
    @JoinColumn(name = "papID")
    private Profile pProID;
}
