package src;

import src.animals.Animals;
import src.animals.Carnivorous;
import src.animals.Herbivore;
import src.aviary.EnumAviarySize;
import src.aviary.GenericAviary;
import src.food.Grass;
import src.food.Meat;
import src.food.WrongFoodException;
import src.unit.*;

import java.util.HashMap;
import java.util.Map;

public class Zoo {
    public static void main(String[] args) {
       try {
           Grass grass = new Grass("Трава");
           Meat meat = new Meat("Мясо");
           Meat chickenMeat = new Meat("Курица");
           Worker pit = new Worker();
           Duck duck = new Duck();
           Wolf greyWolf = new Wolf();
           greyWolf.eat(chickenMeat);
           duck.eat(grass);
           pit.getVoice(greyWolf);
           pit.getVoice(duck);
           Lion leo = new Lion();
           pit.getVoice(leo);
           Fish fish = new Fish();
           pit.getVoice(fish);
           duck.swim();
           fish.swim();
           pit.feed(grass, duck);
           pit.feed(grass, greyWolf);
           pit.feed(meat, grass, greyWolf);
           pit.feed(chickenMeat, meat, duck);



        String [] lake = new String [2] ;
        lake[0]= duck.swim();
        lake[1]= fish.swim();
        for ( int i = 0 ; i < lake.length ; i++ )
        { System.out.println( "Утка плавает: " +  lake[0] + "\n" + "Рыба плавает: " +  lake[1]) ;}


        GenericAviary herbivore = new GenericAviary<>();
        GenericAviary carnivorous = new GenericAviary<>();
        herbivore.addToAviary("Утка",new Duck(),EnumAviarySize.SMALL);
        carnivorous.addToAviary("Волкер",new Wolf(),EnumAviarySize.LARGE);
        herbivore.addToAviary("Джамбо",new Elephant(),EnumAviarySize.MEDIUM);
        herbivore.addToAviary("Рыба",new Fish(),EnumAviarySize.LARGE);
        carnivorous.addToAviary("Лев",new Lion(),EnumAviarySize.MEDIUM);
        carnivorous.addToAviary("Леопард",new Leopard(),EnumAviarySize.LARGE);


        herbivore.getHerbivoreGenericAviary();
        carnivorous.getCarnivorousGenericAviary();

       }
       catch (WrongFoodException ex){
           System.err.println(ex.getMessage());
       }
    }
}