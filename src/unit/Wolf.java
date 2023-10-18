package src.unit;

import src.animals.Carnivorous;
import src.animals.Run;
import src.animals.Voice;
import src.aviary.EnumAviarySize;
import src.food.Food;
import src.food.WrongFoodException;

public class Wolf extends Carnivorous implements Run, Voice {
    private String wolfName ="Волк";
    protected EnumAviarySize sizeAviaryWolf = EnumAviarySize.MEDIUM;
    private String type = "Carnivorous";
    public String getName() {
        return wolfName;
    }
    @Override
    public String run() {
        return null;
    }

    @Override
    public String voice() {
        String voice = "Волк издаёт звук: Аууу";
        return voice;
    }

    @Override
    public void eat(Food food) throws WrongFoodException {
        System.out.print("Волк");
        super.eat(food);
    }

    @Override
    public String getType() {
        return type;
    }

    @Override
    public void setType(String type) {
        this.type = type;
    }
}

