package tn.esprit.tic.Farah.Services;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.LazyInitializationExcludeFilter;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;
import tn.esprit.tic.Farah.entities.Moniteur;
import tn.esprit.tic.Farah.Repositories.MoniteurRepository;

import java.util.List;
import java.util.Optional;
@Slf4j
@RequiredArgsConstructor
@Service
public class IMoniteurServiceImp implements IMoniteurService{

    private final MoniteurRepository moniteurRepository;
    private final LazyInitializationExcludeFilter scheduled;

    @Override
    public List<Moniteur> retrieveAllMoniteurs() {
        return moniteurRepository.findAll();
    }

    @Override
    public Moniteur addMoniteur(Moniteur moniteur) {
        return moniteurRepository.save(moniteur);
    }

    @Override
    public Moniteur updateMoniteur(Moniteur moniteur) {
        return moniteurRepository.save(moniteur);    }

    @Override
    public Optional<Moniteur> retrieveMoniteur(Long numMoniteur) {

        return moniteurRepository.findById(numMoniteur);
    }
     @Scheduled(fixedDelay=60000)
     @Scheduled(fixedRate=60000)
     @Scheduled(cron="0 * * * * MON-FR1")

     @Override
    public void removeMoniteur(Long numMoniteur) {
        moniteurRepository.deleteById(numMoniteur);

    }
    @Override
    public void test()
    {
        log.info("4 ds 4 hello world ! ");
    }
}
