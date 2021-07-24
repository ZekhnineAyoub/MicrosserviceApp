package com.example.MembershipManager.Profile.Model;



import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Data
@Entity
@AllArgsConstructor
@NoArgsConstructor
public class Ouvrier {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String nom;
    private String prenom;
    private String dateNaissance;
    private String comptetence;
    private String zoneGeographique;
    private int tauxJournalier;


    @Override
    public String toString() {
        return "ProfileOuvrier{" +
                "id=" + id +
                ", nom='" + nom + '\'' +
                ", prenom='" + prenom + '\'' +
                ", dateNaissance='" + dateNaissance + '\'' +
                ", comptetence='" + comptetence + '\'' +
                ", zoneGeographique='" + zoneGeographique + '\'' +
                ", tauxJournalier=" + tauxJournalier +
                '}';
    }

    public Ouvrier(String nom, String prenom, String dateNaissance, String comptetence, String zoneGeographique, int tauxJournalier) {
        this.nom = nom;
        this.prenom = prenom;
        this.dateNaissance = dateNaissance;
        this.comptetence = comptetence;
        this.zoneGeographique = zoneGeographique;
        this.tauxJournalier = tauxJournalier;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public String getDateNaissance() {
        return dateNaissance;
    }

    public void setDateNaissance(String dateNaissance) {
        this.dateNaissance = dateNaissance;
    }

    public String getComptetence() {
        return comptetence;
    }

    public void setComptetence(String comptetence) {
        this.comptetence = comptetence;
    }

    public String getZoneGeographique() {
        return zoneGeographique;
    }

    public void setZoneGeographique(String zoneGeographique) {
        this.zoneGeographique = zoneGeographique;
    }

    public int getTauxJournalier() {
        return tauxJournalier;
    }

    public void setTauxJournalier(int tauxJournalier) {
        this.tauxJournalier = tauxJournalier;
    }
}
