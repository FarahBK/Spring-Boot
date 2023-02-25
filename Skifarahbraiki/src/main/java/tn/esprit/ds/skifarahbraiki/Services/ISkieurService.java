package tn.esprit.ds.skifarahbraiki.Services;

import tn.esprit.ds.skifarahbraiki.Entities.Skieur;

import java.util.List;

public interface ISkieurService{
    List<Skieur> retrieveAllSkieurs();
    Skieur addSkieur(Skieur skieur);
    void removeSkieur (Long numSkieur);
    Skieur retrieveSkieur (Long numSkieur);
    Skieur updateSkieur(Skieur skieur);
    Skieur assignSkierToPiste(Long numSkieur, Long numPiste);
    Skieur AssignSkierToSubscription(long numSkieur, long numAbon);
}
