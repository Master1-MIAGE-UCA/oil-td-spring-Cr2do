package fr.miage1.cr2do.dice.Controller;


import fr.miage1.cr2do.dice.Repository.DiceRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DiceController {

    DiceRepository diceRepository;


    @Autowired
    DiceController(DiceRepository diceRepository) {
        this.diceRepository = diceRepository;
    }

    @GetMapping("/rollDice")
    public void rollDice() {
        
    }

    @GetMapping("/rollDices/:id")
    public void rollSpecificDice() {

    }

}
