package src.unit;

import src.animals.Carnivorous;
import src.animals.Run;
import src.animals.Voice;
import src.aviary.EnumAviarySize;
import src.food.Food;
import src.food.WrongFoodException;

public class Leopard extends Carnivorous implements Run, Voice {
    private String leoName ="Леопард";
    protected EnumAviarySize sizeAviaryLeo = EnumAviarySize.LARGE;
    public String getName() {
        return leoName;
    }
    @Override
    public String run() {
        return null;
    }

    @Override
    public String voice() {
        String voice = "Леопард издаёт звук: Мауф";
        return voice;
    }

    @Override
    public void eat(Food food) throws WrongFoodException {
        System.out.print("Леопард");
        super.eat(food);
    }
}
