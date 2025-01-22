package heroes;

import general.Personnage;

import java.util.Objects;

public abstract class Hero extends Personnage {
    public Hero() {
    }

    public Hero(int endurance, int force, int pointDeVie, int agility, int dexterity, int experience, int gold, int leather, int scales, int level) {
        super(endurance, force, pointDeVie, agility, dexterity, experience, gold, leather, scales, level);
    }
}
