package monsters.classes;

import monsters.Monster;

public class Orc extends Monster {
    public Orc() {
        this.setForce(this.getForce() + 1);
        this.setGold(this.getFourDice().roll());
    }

    public Orc(int endurance, int force, int pointDeVie, int agility, int dexterity, int experience, int gold, int leather, int scales, int level) {
        super(endurance, force, pointDeVie, agility, dexterity, experience, gold, leather, scales, level);
    }
}
