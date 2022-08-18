package edu.multicampus.eHealthCare.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.*;
import java.sql.Date;
import java.util.Set;

@Entity
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
    @JsonIgnore
    private Set<MedInvoice> listMedInvoice;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getMedicineID() {
        return medicineID;
    }

    public void setMedicineID(String medicineID) {
        this.medicineID = medicineID;
    }

    public String getmName() {
        return mName;
    }

    public void setmName(String mName) {
        this.mName = mName;
    }

    public Date getmExp() {
        return mExp;
    }

    public void setmExp(Date mExp) {
        this.mExp = mExp;
    }

    public int getmSto() {
        return mSto;
    }

    public void setmSto(int mSto) {
        this.mSto = mSto;
    }

    public int getmPri() {
        return mPri;
    }

    public void setmPri(int mPri) {
        this.mPri = mPri;
    }

    public Set<MedInvoice> getListMedInvoice() {
        return listMedInvoice;
    }

    public void setListMedInvoice(Set<MedInvoice> listMedInvoice) {
        this.listMedInvoice = listMedInvoice;
    }

    public Medicine() {
    }

    public Medicine(String medicineID, String mName, Date mExp, int mSto, int mPri, Set<MedInvoice> listMedInvoice) {
        this.medicineID = medicineID;
        this.mName = mName;
        this.mExp = mExp;
        this.mSto = mSto;
        this.mPri = mPri;
        this.listMedInvoice = listMedInvoice;
    }
}
