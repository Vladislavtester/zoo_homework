package src.unit;

import src.animals.Animals;
import src.animals.Carnivorous;
import src.animals.Herbivore;
import src.food.Food;
import src.food.Grass;
import src.food.Meat;

public class Worker {
    public void getVoice(Animals animal) {
         if (animal.voice()==null) {
             System.out.println("У класса " + animal.getName() + " нет голоса");
            } else { System.out.println(animal.voice());
         }
    }
    public void feed(Food food, Animals animal) {
        if (food instanceof Meat) {
            if (animal instanceof Herbivore) {
                System.out.println(animal.getName() + " не ест мясо");}
        } else if (food instanceof Grass) {
                if (animal instanceof Carnivorous) {
                    System.out.println(animal.getName() + " не ест траву");}
                else {
                    System.out.println(animal.getName()+" кушает еду");
                }
            }
        }
    public void feed(Food food1, Food food2, Animals animal) {
        if (food1  instanceof Meat) {
            if (food2 instanceof Meat) {
                if(animal instanceof Carnivorous)
                System.out.println(animal.getName() + " Как много мяса. Ням ");
            } else {
                System.out.println(animal.getName() +" ест ТОЛЬКО мясо");}
            if (food1 instanceof Grass){
                if (food2 instanceof Grass){
                    if (animal instanceof Herbivore)
                        System.out.println(animal.getName() +" Любимая трава");
                    } else {
                    System.out.println(animal.getName() +" ест ТОЛЬКО траву");
                    }
                }
             }
        }
    }