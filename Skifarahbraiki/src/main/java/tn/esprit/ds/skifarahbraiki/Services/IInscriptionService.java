package tn.esprit.ds.skifarahbraiki.Services;

import tn.esprit.ds.skifarahbraiki.Entities.Inscription;

import java.util.List;

public interface IInscriptionService {
    List<Inscription> retrieveAllInscriptions();
    Inscription addInscription (Inscription inscription);
    void removeInscription (Long numInscription);
    Inscription retrieveInscription (Long numInscription);
    Inscription updateInscription(Inscription inscription);
}
