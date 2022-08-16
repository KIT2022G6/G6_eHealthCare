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
public class Profile {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "profileID", unique = true)
    private Long pProID;

    private String pDia;
    private Date pHis;

//    @OneToMany(mappedBy = "papID", cascade = CascadeType.ALL)
//    private Set<Paper> listPaper;


}
