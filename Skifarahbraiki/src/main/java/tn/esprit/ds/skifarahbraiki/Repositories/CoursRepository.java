package tn.esprit.ds.skifarahbraiki.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import tn.esprit.ds.skifarahbraiki.Entities.Cours;

public interface CoursRepository extends JpaRepository<Cours,Long> {
}
