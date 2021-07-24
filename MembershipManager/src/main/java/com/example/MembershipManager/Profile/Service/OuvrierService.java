package com.example.MembershipManager.Profile.Service;


import com.example.MembershipManager.Profile.Model.Ouvrier;
import com.example.MembershipManager.Profile.Repository.OuvrierRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;

@RestController
public class OuvrierService {

    private final OuvrierRepository ouvrierRepository;

    @Autowired
    public OuvrierService(OuvrierRepository ouvrierRepository) {
        this.ouvrierRepository = ouvrierRepository;
    }

    public void AddOuvrier(Ouvrier ouvrier) {

        ouvrierRepository.save(ouvrier);
    }

    public List<Ouvrier> findAllOuvrier() {

        return ouvrierRepository.findAll();
    }

    public Optional<Ouvrier> GetOuvrierById(Long id) {

       return ouvrierRepository.findById(id);
    }
}
