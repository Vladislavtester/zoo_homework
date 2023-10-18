package src.food;

import src.animals.Animals;
import src.animals.Carnivorous;
import src.animals.Herbivore;

public class WrongFoodException extends Exception {
    String message= "Это не та еда ";
       public WrongFoodException(String message) {
        super(message);
        this.message=message;
    }
}
