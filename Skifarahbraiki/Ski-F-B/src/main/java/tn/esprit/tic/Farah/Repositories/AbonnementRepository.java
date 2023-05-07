package tn.esprit.tic.Farah.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import tn.esprit.tic.Farah.entities.Abonnement;
import tn.esprit.tic.Farah.entities.TypeAbonnement;

import java.time.LocalDate;
import java.util.List;

public interface AbonnementRepository extends JpaRepository<Abonnement,Long > {
    List<Abonnement> findByTypeAbonOrderByDateDebut(TypeAbonnement typeAbonnement);
    List<Abonnement> findByDateDebutAndDateFin(LocalDate startDate, LocalDate endDate);

    List<Abonnement> findByPrixabonGreaterThan(float prixabon);
}


