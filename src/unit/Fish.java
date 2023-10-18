package src.unit;

import src.animals.*;
import src.aviary.EnumAviarySize;
import src.food.Food;
import src.food.WrongFoodException;

public class Fish extends Herbivore implements Swim {
    private String fishName ="Рыба";
    protected EnumAviarySize sizeAviaryFish = EnumAviarySize.SMALL;
    @Override
    public String getName() {
        return fishName;
    }

    @Override
    public String swim() {
        String fishSwim = "буль - буль";
        return fishSwim;
    }

    @Override
    public String voice() {
        return null;
    }

    public Fish() {

    }

    @Override
    public void eat(Food food) throws WrongFoodException {
        System.out.print("Рыба");
        super.eat(food);
    }
}
