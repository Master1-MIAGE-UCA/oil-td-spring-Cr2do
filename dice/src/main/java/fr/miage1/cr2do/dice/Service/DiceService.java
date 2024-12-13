package fr.miage1.cr2do.dice.Service;


import fr.miage1.cr2do.dice.Dice;
import fr.miage1.cr2do.dice.Entity.DiceRollLog;
import fr.miage1.cr2do.dice.Repository.DiceRollLogRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

@Service
public class DiceService {

    private final DiceRollLogRepository diceRepository;
    private final Dice dice;

    @Autowired
    public DiceService(DiceRollLogRepository diceRepository, Dice dice) {
        this.diceRepository = diceRepository;
        this.dice = dice;
    }


    public List<Integer> rollDice(int nbRoll) {



        List<Integer> results = IntStream.range(0, nbRoll)
                .mapToObj(i -> dice.roll())
                .collect(Collectors.toList());



        DiceRollLog diceRollLog = new DiceRollLog();

        diceRollLog.setDiceCount(nbRoll);

        diceRollLog.setResults(results.stream().map(String::valueOf).collect(Collectors.toList()));

        diceRepository.save(diceRollLog);

        return results;
    }

}
