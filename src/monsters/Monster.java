package monsters;

import general.Personnage;
import utility.Dice;

public abstract class Monster extends Personnage {
    private Dice fourDice = Dice.D4;

    public Monster() {
    }

    public Monster(int endurance, int force, int pointDeVie, int agility, int dexterity, int experience, int gold, int leather, int scales, int level) {
        super(endurance, force, pointDeVie, agility, dexterity, experience, gold, leather, scales, level);
    }

    public Dice getFourDice() {
        return fourDice;
    }

    public void setFourDice(Dice fourDice) {
        this.fourDice = fourDice;
    }
}
