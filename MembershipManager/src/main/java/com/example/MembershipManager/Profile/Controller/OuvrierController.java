package com.example.MembershipManager.Profile.Controller;


import com.example.MembershipManager.Profile.Model.Ouvrier;
import com.example.MembershipManager.Profile.Service.OuvrierService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping(path = "Ouvrier")
public class OuvrierController {

    private final OuvrierService ouvrierService;

    @Autowired
    public OuvrierController(OuvrierService ouvrierService) {
        this.ouvrierService = ouvrierService;
    }

    @PostMapping("/")
    public void AddOuvrier(@RequestBody Ouvrier ouvrier){

        ouvrierService.AddOuvrier(ouvrier);
    }

    @GetMapping("/")

    public List<Ouvrier> GetAllOuvrier(){

        return  ouvrierService.findAllOuvrier();
    }

    @GetMapping("/{id}")

    public Optional<Ouvrier> GetOuvrierById(@PathVariable Long id){

        return ouvrierService.GetOuvrierById(id);

    }



}
