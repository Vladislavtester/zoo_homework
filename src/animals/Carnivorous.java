package src.animals;

import src.aviary.EnumAviarySize;
import src.food.Food;
import src.food.Meat;
import src.food.WrongFoodException;

public  class Carnivorous extends Animals {

    public EnumAviarySize setEnumAviarySize(EnumAviarySize enumAviarySize) {
        this.enumAviarySize = enumAviarySize;
        return enumAviarySize;
    }
    @Override
    public String getName() {
        System.out.print(name);
        return name;
    }

    @Override
    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String getType() {
        System.out.print(type);
        return type;
    }

    @Override
    public void setType(String type) {
        this.type = type;
    }
    public void eat(Food food) throws WrongFoodException {
        if (food instanceof Meat) {
            System.out.println(" ест мясо");
        } else throw new WrongFoodException (" Эта еда не подходит животному.");
    }
    @Override
    public void getVoice(Animals animal) {
    }

    @Override
    public String voice() {
        return null;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((name == null) ? 0 : name.hashCode());
        return result;
    }
    @Override
    public boolean equals(Object obj) {
        if (obj == this.type) {
            return true;
        }
        else if (obj == null || obj.getClass() != this.getClass()) {
        }
        return false;
    }
}

