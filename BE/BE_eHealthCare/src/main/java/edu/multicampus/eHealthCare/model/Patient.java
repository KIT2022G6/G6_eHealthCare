package edu.multicampus.eHealthCare.model;

import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Entity
@Getter
@Setter
@ToString
public class Patient {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "patientID", unique = true)
    private Long patID;

    @Column(nullable = false)
    private String pFullName, pAddress, pPhone, pBloodtype;

    @Column(nullable = false)
    private Date pDob;

    @Column(nullable = false)
    private boolean pGender, pRhesus;

    @Column(columnDefinition = "INT(3) UNSIGNED ")
    private int pWeight, pHeight, pHeartrate;

    @ManyToOne
    @JoinColumn(name = "insuranceID")
    private Insurance insID;
}
