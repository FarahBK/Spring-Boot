package tn.esprit.ds.skifarahbraiki.Services;

import tn.esprit.ds.skifarahbraiki.Entities.Piste;

import java.util.List;

public interface IPisteService {
    List<Piste> retrieveAllPistes();
    Piste addPiste (Piste piste);
    void removePiste (Long numPiste);
    Piste retrievePiste (Long numPiste);
    Piste updatePiste(Piste piste);
}
