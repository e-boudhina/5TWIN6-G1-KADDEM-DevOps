package com.esprit.kaddem.services;

import com.esprit.kaddem.entities.*;
import com.esprit.kaddem.repositories.EtudiantRepository;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import javax.persistence.EntityNotFoundException;

import java.util.List;
import java.util.Optional;

@Service
@Slf4j
@AllArgsConstructor
public class IEtudiantServiceImpl implements IEtudiantService{

    EtudiantRepository etudiantRepository;
    @Override
    public List<Etudiant> retrieveAllEtudiants() {
        return etudiantRepository.findAll();
    }

    @Override
    public Etudiant addEtudiant(Etudiant e) {
        etudiantRepository.save(e);
        return e;
    }

    @Override
    public Etudiant updateEtudiant(Etudiant e) {
        etudiantRepository.save(e);
        return e;
    }

    @Override
    public Etudiant retrieveEtudiant(Integer idEtudiant) {
        Optional<Etudiant> etudiantOptional =  etudiantRepository.findById(idEtudiant);
        if (etudiantOptional.isPresent()) {
            return etudiantOptional.get();
        } else {
            // Handle the case where the value is not present, e.g., throw an exception or return a default value.
            throw new EntityNotFoundException("Etudiant not found with id: " + idEtudiant);
        }
    }

    @Override
    public void removeEtudiant(Integer idEtudiant) {
        etudiantRepository.deleteById(idEtudiant);
    }

}
