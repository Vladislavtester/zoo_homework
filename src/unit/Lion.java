package src.unit;

import src.animals.Carnivorous;
import src.animals.Run;
import src.animals.Voice;
import src.aviary.EnumAviarySize;
import src.food.Food;
import src.food.WrongFoodException;

public class Lion extends Carnivorous implements Run, Voice {
    private String lionName ="Лев";
    protected EnumAviarySize sizeAviaryLion = EnumAviarySize.LARGE;
    public String getName() {
        return lionName;
    }
    @Override
    public String run() {
        return null;
    }

    @Override
    public String voice() {
        String voice = "Лев издаёт звук: РРР";
        return voice;
    }

    @Override
    public void eat(Food food) throws WrongFoodException {
        System.out.print("Лев");
        super.eat(food);
    }
}
