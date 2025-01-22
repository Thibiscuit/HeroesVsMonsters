package utility;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public enum Dice {
    D4(4),
    D6(6),
    D100(100);

    private final int nbrFaces;

    Dice(int faces){
        this.nbrFaces = faces;
    }

    public int roll(){
        Random rand = new Random();
        return rand.nextInt(1, nbrFaces + 1);
    }

    public int roll(int nbrRoll){
        int sum = 0;
        for(int i = 0; i < nbrRoll; i++){
            sum = sum + this.roll();
        }
        return sum;
    }

    public int roll(int nbrRoll, int nbrToKeep){
        List<Integer> rolls = new ArrayList<>();
        for(int i = 0; i < nbrRoll; i++){
            rolls.add(this.roll());
        }
        return rolls.stream()
                .sorted((a,b) -> b - a)
                .limit(nbrToKeep)
                .mapToInt(it -> it)
                .sum();
    }
}
