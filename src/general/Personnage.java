package general;

import utility.Dice;

import java.util.Objects;

public abstract class Personnage {
    private int endurance;
    private int force;
    private int pointDeVie;
    private int agility;
    private int dexterity;
    private int experience;
    private int gold;
    private int leather;
    private int scales;
    private int level;

    public Personnage(){
        Dice sixDice = Dice.D6;
        baseLifePointCalculation(sixDice);
        this.endurance = sixDice.roll(4, 3);
        this.force = sixDice.roll(4, 3);
        this.agility = sixDice.roll(4, 3);
        this.dexterity = sixDice.roll(4, 3);
        this.gold = 0;
        this.leather = 0;
        this.experience = 0;
        this.scales = 0;
        this.level = 0;
    }

    public void baseLifePointCalculation(Dice sixDice){
        if(this.endurance < 5){
            this.pointDeVie = (this.endurance + 2)*2;
        } else if(this.endurance > 15){
            this.pointDeVie = (this.endurance - 2)*2;
        } else {
            this.pointDeVie = (this.endurance + 1)*2;
        }
    }

    public Personnage(int endurance, int force, int pointDeVie, int agility, int dexterity, int experience, int gold, int leather, int scales, int level) {
        this.endurance = endurance;
        this.force = force;
        this.pointDeVie = pointDeVie;
        this.agility = agility;
        this.dexterity = dexterity;
        this.experience = experience;
        this.gold = gold;
        this.leather = leather;
        this.scales = scales;
        this.level = level;
    }

    public int getEndurance() {
        return endurance;
    }

    public void setEndurance(int endurance) {
        this.endurance = endurance;
    }

    public int getForce() {
        return force;
    }

    public void setForce(int force) {
        this.force = force;
    }

    public int getPointDeVie() {
        return pointDeVie;
    }

    public void setPointDeVie(int pointDeVie) {
        this.pointDeVie = pointDeVie;
    }

    public int getAgility() {
        return agility;
    }

    public void setAgility(int agility) {
        this.agility = agility;
    }

    public int getDexterity() {
        return dexterity;
    }

    public void setDexterity(int dexterity) {
        this.dexterity = dexterity;
    }

    public int getExperience() {
        return experience;
    }

    public void setExperience(int experience) {
        this.experience = experience;
    }

    public int getGold() {
        return gold;
    }

    public void setGold(int gold) {
        this.gold = gold;
    }

    public int getLeather() {
        return leather;
    }

    public void setLeather(int leather) {
        this.leather = leather;
    }

    public int getScales() {
        return scales;
    }

    public void setScales(int scales) {
        this.scales = scales;
    }

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    public void attack(Personnage personnage){
        Dice hundredDice = Dice.D100;
        Dice fourDice = Dice.D4;
        int baseDamage = fourDice.roll() + (this.getForce() / 3);
        int finalDamage;
        int critChance = this.getDexterity() * 2;
        int dogdeChance =  personnage.getAgility() * 2;

        if( dogdeChance >= hundredDice.roll()) {
            System.out.println("Coup esquivé !");
        } else {
            if( critChance >= hundredDice.roll()){
                System.out.println("Coup critique !");
                finalDamage = baseDamage * 2;
            } else {
                finalDamage = baseDamage;
            }
            personnage.setPointDeVie(personnage.getPointDeVie() - finalDamage);
            System.out.println("Dégâts infligés : " + finalDamage);
            System.out.println("Vie restante de la cible : " + personnage.getPointDeVie());
        }
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Personnage that = (Personnage) o;
        return endurance == that.endurance && force == that.force && pointDeVie == that.pointDeVie && agility == that.agility && dexterity == that.dexterity && experience == that.experience && gold == that.gold && leather == that.leather && scales == that.scales && level == that.level;
    }

    @Override
    public int hashCode() {
        return Objects.hash(endurance, force, pointDeVie, agility, dexterity, experience, gold, leather, scales, level);
    }

    @Override
    public String toString() {
        return "Personnage{" +
                "endurance = " + endurance +
                ", force = " + force +
                ", pointDeVie = " + pointDeVie +
                ", agility = " + agility +
                ", dexterity = " + dexterity +
                ", experience = " + experience +
                ", gold = " + gold +
                ", leather = " + leather +
                ", scales = " + scales +
                ", level = " + level +
                '}';
    }
}
