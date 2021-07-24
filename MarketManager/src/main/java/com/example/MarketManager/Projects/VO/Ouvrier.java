package com.example.MarketManager.Projects.VO;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Ouvrier {

    private Long id;
    private String nom;
    private String prenom;
    private String dateNaissance;
    private String comptetence;
    private String zoneGeographique;
    private int tauxJournalier;


}
