package tn.esprit.tic.Farah.Services;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import tn.esprit.tic.Farah.entities.Cours;
import tn.esprit.tic.Farah.Repositories.CoursRepository;

import java.util.List;
import java.util.Optional;
@Slf4j

@RequiredArgsConstructor
@Service
public class ICoursServiceImp implements ICoursService{
    private final CoursRepository coursRepository;
    @Override
    public List<Cours> retrieveAllCours() {
        return  coursRepository.findAll();
    }

    @Override
    public Cours addCours(Cours cours) {
        return coursRepository.save(cours);    }

    @Override
    public Cours updateCours(Cours cours) {
        return coursRepository.save(cours);    }

    @Override
    public Optional<Cours> retrieveCours(Long numCours) {
        return coursRepository.findById(numCours);
    }

    @Override
    public void removeCours(Long numCours) {
        log.info("in removeCours");
    coursRepository.deleteById(numCours);
    }
}
