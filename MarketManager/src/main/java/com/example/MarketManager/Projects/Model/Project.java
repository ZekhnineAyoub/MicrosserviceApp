package com.example.MarketManager.Projects.Model;


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
public class Project {


    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long  Id;
    private String metier;
    private String competence;
    private String localisation;
    private Long  tauxJournaliers;
    private String dureeEngagement;



    public Project(String metier, String competence, String localisation, Long tauxJournaliers, String dureeEngagement) {
        this.metier = metier;
        this.competence = competence;
        this.localisation = localisation;
        this.tauxJournaliers = tauxJournaliers;
        this.dureeEngagement = dureeEngagement;
    }

    public Long getId() {
        return Id;
    }

    public void setId(Long id) {
        Id = id;
    }

    public String getMetier() {
        return metier;
    }

    public void setMetier(String metier) {
        this.metier = metier;
    }

    public String getCompetence() {
        return competence;
    }

    public void setCompetence(String competence) {
        this.competence = competence;
    }

    public String getLocalisation() {
        return localisation;
    }

    public void setLocalisation(String localisation) {
        this.localisation = localisation;
    }

    public Long getTauxJournaliers() {
        return tauxJournaliers;
    }

    public void setTauxJournaliers(Long tauxJournaliers) {
        this.tauxJournaliers = tauxJournaliers;
    }

    public String getDureeEngagement() {
        return dureeEngagement;
    }

    public void setDureeEngagement(String dureeEngagement) {
        this.dureeEngagement = dureeEngagement;
    }
}
