package fr.miage1.cr2do.dice.Repository;


import fr.miage1.cr2do.dice.Entity.DiceRollLog;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DiceRepository extends JpaRepository<DiceRollLog, Long> {

}
