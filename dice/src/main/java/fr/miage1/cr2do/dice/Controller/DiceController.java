package fr.miage1.cr2do.dice.Controller;


import fr.miage1.cr2do.dice.Entity.DiceRollLog;
import fr.miage1.cr2do.dice.Repository.DiceRollLogRepository;
import fr.miage1.cr2do.dice.Service.DiceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class DiceController {

    DiceService diceService;
    DiceRollLogRepository diceRollLogRepository;

    @Autowired
    DiceController(DiceService diceService, DiceRollLogRepository diceRollLogRepository) {
        this.diceService = diceService;
        this.diceRollLogRepository = diceRollLogRepository;
    }

    @GetMapping("/rollDice")
    public List<Integer> rollDice() {
        return diceService.rollDice(1);
    }

    @GetMapping("/rollDices/{id}")
    public List<Integer> rollSpecificDice(@PathVariable("id") int id) {
        return diceService.rollDice(id);
    }

    @GetMapping("/diceLogs")
    public List<DiceRollLog>  diceLogs() {
        return diceRollLogRepository.findAll();
    }

}
