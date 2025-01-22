package monsters.classes;

import monsters.Monster;
import utility.Dice;

public class Wolf extends Monster {
    public Wolf() {
        this.setLeather(this.getFourDice().roll());
    }

    public Wolf(int endurance, int force, int pointDeVie, int agility, int dexterity, int experience, int gold, int leather, int scales, int level) {
        super(endurance, force, pointDeVie, agility, dexterity, experience, gold, leather, scales, level);
    }
}
