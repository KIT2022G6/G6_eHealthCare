package edu.multicampus.eHealthCare.model;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.*;
import java.sql.Date;
import java.util.Set;

@Entity
@Getter
@Setter
@ToString
public class Medicine {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "medicineID", unique = true)
    private Long medID;

    private String mName;

    private Date mExp;
    private int mSto, mPri;


    @OneToMany(mappedBy = "medID", cascade = CascadeType.ALL)
    private Set<MedInvoice> listMedInvoice;
}
