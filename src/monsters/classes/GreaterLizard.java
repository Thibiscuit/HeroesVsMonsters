package monsters.classes;

import monsters.Monster;
import utility.Dice;

public class GreaterLizard extends Monster {
    public GreaterLizard() {
        Dice sixDice = Dice.D6;
        if(this.getEndurance() < 5){
            this.setEndurance(this.getEndurance() + 4);
        } else if(this.getEndurance() < 10){
            this.setEndurance(this.getEndurance() + 3);
        } else {
            this.setEndurance(this.getEndurance() + 2);
        }
        baseLifePointCalculation(sixDice);
        this.setGold(this.getFourDice().roll() + 2);
        this.setLeather(this.getFourDice().roll() + 1);
        this.setScales(this.getFourDice().roll());
        if(this.getScales() >= 3){
            this.setScales(this.getScales() - 2);
        }
    }

    public GreaterLizard(int endurance, int force, int pointDeVie, int agility, int dexterity, int experience, int gold, int leather, int scales, int level) {
        super(endurance, force, pointDeVie, agility, dexterity, experience, gold, leather, scales, level);
    }
}
