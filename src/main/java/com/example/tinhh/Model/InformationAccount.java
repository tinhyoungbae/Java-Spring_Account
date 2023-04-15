package com.example.tinhh.Model;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
@Table(name = "InformationAccount")
public class InformationAccount {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idInformation")
    private int idInformation;
    @Column(name = "nameInformation")
    private String nameInformation;
    @Column(name = "sexInformation")
    private boolean sexInformation;
    @Column(name = "dateInformation")
    private String dateInformation;

    public InformationAccount(){

    }

    public InformationAccount(int idInformation, String nameInformation, boolean sexInformation, String dateInformation) {
        this.idInformation = idInformation;
        this.nameInformation = nameInformation;
        this.sexInformation = sexInformation;
        this.dateInformation = dateInformation;
    }

    public int getIdInformation() {
        return idInformation;
    }

    public void setIdInformation(int idInformation) {
        this.idInformation = idInformation;
    }

    public String getNameInformation() {
        return nameInformation;
    }

    public void setNameInformation(String nameInformation) {
        this.nameInformation = nameInformation;
    }

    public boolean isSexInformation() {
        return sexInformation;
    }

    public void setSexInformation(boolean sexInformation) {
        this.sexInformation = sexInformation;
    }

    public String getDateInformation() {
        return dateInformation;
    }

    public void setDateInformation(String dateInformation) {
        this.dateInformation = dateInformation;
    }
}
