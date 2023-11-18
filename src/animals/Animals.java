package src.animals;
import src.aviary.EnumAviarySize;
import src.food.Food;
import src.food.WrongFoodException;

import java.util.Objects;

public abstract class Animals {
    protected String name;
    protected String type;

    protected EnumAviarySize enumAviarySize;
    public abstract EnumAviarySize setEnumAviarySize(EnumAviarySize enumAviarySize);
    public abstract String getName();
    public abstract void setName(String name);
    public abstract String getType();
    public abstract void setType(String type);
    public abstract void eat (Food food) throws WrongFoodException;
    public abstract void getVoice(Animals animal);
    public abstract String voice();

}
