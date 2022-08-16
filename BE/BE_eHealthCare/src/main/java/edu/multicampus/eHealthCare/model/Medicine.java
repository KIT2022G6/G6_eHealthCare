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
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    
    @Id
    @Column(name = "medicineID", unique = true)
    private String medicineID;

    private String mName;

    private Date mExp;
    private int mSto, mPri;


    @OneToMany(mappedBy = "medicineID", cascade = CascadeType.ALL)
    private Set<MedInvoice> listMedInvoice;
}
