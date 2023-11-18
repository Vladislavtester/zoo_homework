package src.unit;

import src.animals.*;
import src.aviary.EnumAviarySize;
import src.food.Food;
import src.food.WrongFoodException;

public class Duck extends Herbivore implements Fly, Swim, Voice {
    private String duckName ="Утка";
    private String type= "Herbivore";
    protected EnumAviarySize sizeAviaryDuck = EnumAviarySize.MEDIUM;

    @Override
    public EnumAviarySize setEnumAviarySize(EnumAviarySize enumAviarySize) {
        return super.setEnumAviarySize(enumAviarySize);
    }

    @Override
    public String getName() {
        return duckName;
    }
    @Override
   public void setName(String name) {
        this.name = duckName;
    }

    @Override
    public String getType() {
        return type;
    }

    @Override
    public void setType(String type) {
        this.type= type;
    }

    @Override
    public String fly() {
        return null;
    }

    @Override
    public String swim() {
        String duckSwim = "хлюп - хлюп";
        return duckSwim;
    }
    @Override
    public String voice() {
        String voice = "Утка издаёт звук: кря-кря";
        return voice;
    }
    @Override
    public void eat(Food food) throws WrongFoodException {
        System.out.print("Утка");
        super.eat(food);
    }
}