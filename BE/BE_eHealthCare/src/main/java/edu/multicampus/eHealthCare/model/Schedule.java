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
public class Schedule {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "scheduleID", unique = true)
    private Long schID;

    private String sWor, sShi;

    @OneToMany(mappedBy = "schID", cascade = CascadeType.ALL)
    private Set<Doctor> listDoctor;
}
