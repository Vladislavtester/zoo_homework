package src.unit;

import src.animals.Herbivore;
import src.animals.Run;
import src.animals.Voice;
import src.aviary.EnumAviarySize;
import src.food.Food;
import src.food.WrongFoodException;

public class Elephant extends Herbivore implements Run, Voice {
    private String elephantName ="Слон";
    private String type = "Herbivore";
    protected EnumAviarySize sizeAviaryElephant = EnumAviarySize.LARGE;
    @Override
    public String getName() {
        return elephantName;
    }

    @Override
    public String run() {
        return null;
    }

    @Override
    public String voice() {
        String voice = "Слон издаёт звук: Странные звуки";
        return voice;
    }

    @Override
    public void eat(Food food) throws WrongFoodException {
        System.out.print("Слон");
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
