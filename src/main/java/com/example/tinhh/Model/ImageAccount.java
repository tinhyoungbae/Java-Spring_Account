package com.example.tinhh.Model;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
@Table (name = "ImageAccount")
public class ImageAccount {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idImage")
    private int idImage;
    @Column(name = "urlImage")
    private String urlImage;

    public ImageAccount(){

    }

    public ImageAccount(int idImage, String urlImage) {
        this.idImage = idImage;
        this.urlImage = urlImage;
    }

    public int getIdImage() {
        return idImage;
    }

    public void setIdImage(int idImage) {
        this.idImage = idImage;
    }

    public String getUrlImage() {
        return urlImage;
    }

    public void setUrlImage(String urlImage) {
        this.urlImage = urlImage;
    }
}
