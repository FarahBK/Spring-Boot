package tn.esprit.tic.Farah.Services;

import tn.esprit.tic.Farah.entities.Abonnement;
import tn.esprit.tic.Farah.entities.TypeAbonnement;

import java.time.LocalDate;
import java.util.List;
import java.util.Optional;

public interface IAbonnementService {

    List<Abonnement> retrieveAllAbonnement();
    Abonnement addAbonnement(Abonnement abonnement);
    Abonnement updateAbonnement (Abonnement abonnement);
    Optional<Abonnement> retrieveAbonnement (Long numAbon);

    void removeAbonnement(Long numAbon);
    List<Abonnement> getSubscriptionByType(TypeAbonnement type);
    List<Abonnement> getSubscriptionByPrixAbonGreaterthan(float prixabon );
    List<Abonnement> retrieveSubscriptionsByDates(LocalDate startDate, LocalDate endDate);
}
