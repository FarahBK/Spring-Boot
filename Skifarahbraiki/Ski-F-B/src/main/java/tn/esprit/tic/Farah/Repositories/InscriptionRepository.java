package tn.esprit.tic.Farah.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import tn.esprit.tic.Farah.entities.Inscription;

public interface InscriptionRepository extends JpaRepository<Inscription,Long > {
}
