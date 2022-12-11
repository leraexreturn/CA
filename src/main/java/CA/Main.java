package CA;

public class Main
{
    //Theres a chance I will need to delete cows as there is cows, sheep and goats
    //will need to find a way to connect each of them for the inputs in methods


    public static void main(String[] args) {


        Animals animal = new Animals(5,"Cow","Jess",true,0001);
        Farm farm = new Farm(animal,"Pinkman Factory");

        farm.addAnimal(animal);

        System.out.println(farm);


        Sheep sheep = new Sheep(1,"Sheep","Jelly",true,2922,55,"Whatever it is");

        farm.addAnimal(sheep);


        farm.toString();
        System.out.println(farm);

        Goat goat = new Goat(2,"Goat","Deez",true,2112,43,"mountain goat");

        Cows cows = new Cows("Daisy",true);

        MilkTank milktank = new MilkTank(2000);

        MilkingMachine milkingMaching = new MilkingMachine(200,true);


        DairyCow dairycow = new DairyCow(2000,true);




    }
}
