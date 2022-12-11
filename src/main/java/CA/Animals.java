package CA;

import java.util.ArrayList;

public class Animals extends ArrayList<Animals> {
    private int age;
    private String animal;
    private String name;
    private boolean isMilkable;
    private int id;

   // private ArrayList<Animals> animals;


  //  public ArrayList<Animals> getAnimals() {
    //    return animals;
    //}

    public Animals(int age, String animal, String name, boolean isMilkable, int id) {
        this.age = age;
        this.animal = animal;
        this.name = name;

        this.isMilkable = isMilkable;
        this.id = id;

    }

    public int getAge() {
        return age;
    }

    public String getAnimal() {
        return animal;
    }

    public String getName() {
        return name;
    }



    public boolean isMilkable() {
        return isMilkable;
    }

    public int getId() {
        return id;
    }


    @Override
    public String toString() {
        return "Animals{" +
                "age=" + age +
                ", animal='" + animal + '\'' +
                ", name='" + name + '\'' +

                ", isMilkable=" + isMilkable +
                ", id=" + id +
                '}';
    }
}
