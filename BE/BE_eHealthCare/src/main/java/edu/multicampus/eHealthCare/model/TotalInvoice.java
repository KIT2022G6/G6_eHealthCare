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
public class TotalInvoice {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "InvoiceID", unique = true)
    private Long iInvID;

    private Long papID, mediID;
    private Date tPri;
}
