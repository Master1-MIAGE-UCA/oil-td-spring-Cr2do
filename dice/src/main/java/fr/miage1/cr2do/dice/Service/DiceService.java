package fr.miage1.cr2do.dice.Service;


import fr.miage1.cr2do.dice.Entity.DiceRollLog;
import fr.miage1.cr2do.dice.Repository.DiceRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class DiceService {

    private final DiceRepository diceRepository;

    @Autowired
    public DiceService(DiceRepository diceRepository) {
        this.diceRepository = diceRepository;
    }

    public DiceRollLog saveDice(DiceRollLog diceRollLog) {
        return diceRepository.save(diceRollLog);
    }

    public DiceRollLog getDiceRollLogById(Long id) {
        Optional<DiceRollLog> diceRollLog = diceRepository.findById(id);

        return diceRollLog.orElse(null);
    }

    public List<DiceRollLog> getAllDiceRollLogs() {
        return diceRepository.findAll();
    }

}
