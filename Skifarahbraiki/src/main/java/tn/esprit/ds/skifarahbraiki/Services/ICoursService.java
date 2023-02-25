package tn.esprit.ds.skifarahbraiki.Services;

import tn.esprit.ds.skifarahbraiki.Entities.Cours;

import java.util.List;

public interface ICoursService {
    List<Cours> retrieveAllCours();
    Cours addCours (Cours cours);
    void removeCours (Long numCours);
    Cours retrieveCours (Long numCours);
    Cours updateCours (Cours cours);
}
