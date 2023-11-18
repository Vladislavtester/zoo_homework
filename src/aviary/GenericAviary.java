package src.aviary;

import src.animals.Animals;
import src.animals.Carnivorous;
import src.animals.Herbivore;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;


public class GenericAviary <A extends Animals> {
        public GenericAviary() {
    }

    private Map<String,A > herbivoreGenericAviary = new HashMap<>();
    private Map<String, A > carnivorousGenericAviary = new HashMap<>();
    public void addToAviary (String name, A animal,EnumAviarySize aviarySize) {
                if (animal instanceof Carnivorous |
                     aviarySize.equals(EnumAviarySize.MEDIUM)&&
                            aviarySize.equals(EnumAviarySize.LARGE)){
                        carnivorousGenericAviary.put(name,animal);
                        System.out.println("Животное " + name + " добавлено, в вольер " + aviarySize + " к хищникам");
                    } else {
                    if (animal instanceof Herbivore |
                            ( aviarySize.equals(EnumAviarySize.SMALL)  &&
                                    aviarySize.equals(EnumAviarySize.LARGE))){
                        // вот это не трогать
                        herbivoreGenericAviary.put(name,animal);
                        System.out.println("Животное " + name + " добавлено, в вольер " + aviarySize + " к травоядным");
                    } else {
                    System.out.println("Животному " + name + " нужен другой размер вольера");
                    }
                }
    }
    public void removeFromAviary(String name){
        herbivoreGenericAviary.remove(name);
        carnivorousGenericAviary.remove(name);
        System.out.println("Животное " + name + " удалено из вольера");

    }
    public void getHerbivoreGenericAviary() {
        System.out.println("Вольер для травоядных содержит : " + herbivoreGenericAviary);
    }
    public void getCarnivorousGenericAviary() {
        System.out.println("Вольер для хищников содержит : " + carnivorousGenericAviary);
    }
}
