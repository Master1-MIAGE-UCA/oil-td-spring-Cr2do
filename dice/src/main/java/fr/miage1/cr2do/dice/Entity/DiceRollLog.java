package fr.miage1.cr2do.dice.Entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.CreationTimestamp;

import java.time.LocalDate;
import java.util.List;

@Entity
@Getter @Setter
public class DiceRollLog {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    private int diceCount;

    @ElementCollection
    private List<String> results;

    @CreationTimestamp
    private LocalDate timestamp;

}
