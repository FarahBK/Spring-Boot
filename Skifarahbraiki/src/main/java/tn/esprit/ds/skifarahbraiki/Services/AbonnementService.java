package tn.esprit.ds.skifarahbraiki.Services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tn.esprit.ds.skifarahbraiki.Entities.Abonnement;
import tn.esprit.ds.skifarahbraiki.Repositories.AbonnementRepository;

import java.util.List;

@Service
public class AbonnementService implements IAbonnementService{
    @Autowired
    AbonnementRepository abonnementRepository;
    @Override
    public List<Abonnement> retrieveAllAbonnements() {
        return abonnementRepository.findAll();
    }

    @Override
    public Abonnement addAbonnement(Abonnement abonnement) {
        return abonnementRepository.save(abonnement);
    }

    @Override
    public void removeAbonnement(Long numAbon) {
        abonnementRepository.deleteById(numAbon);
    }

    @Override
    public Abonnement retrieveAbonnement(Long numAbon) {
        return abonnementRepository.findById(numAbon).orElse(null);
    }
    @Override
    public Abonnement updateAbonnement(Abonnement abonnement){
        return abonnementRepository.save(abonnement);
    }
}
