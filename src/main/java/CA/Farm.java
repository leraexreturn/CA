package CA;

import java.util.ArrayList;

public class Farm
{
    private  ArrayList<Animals> animals;
    private String farmName;

    public Farm(ArrayList<Animals> animals, String farmName) {
        this.animals = animals;
        this.farmName = farmName;
    }


    public ArrayList<Animals> getAnimals() {
        return animals;
    }

    public String getFarmName() {
        return farmName;
    }


    @Override
    public String toString() {
        return "Farm{" +
                "animals=" + animals +
                ", farmName='" + farmName + '\'' +
                '}';
    }


    public void addAnimal(Animals animal)
    {

        animals.add(animal);

    }
}