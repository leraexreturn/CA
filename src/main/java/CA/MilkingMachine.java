package CA;

import java.net.SocketTimeoutException;

public class MilkingMachine extends DairyCow
{


    private double milked;
    private boolean avaiableMachines;


    public MilkingMachine(double milked, boolean avaiableMachines) {
        super(2000,true);
        this.milked = milked;
        this.avaiableMachines = avaiableMachines;
    }

    public double getMilked() {
        return milked;
    }

    public boolean isAvaiableMachines() {
        return avaiableMachines;
    }


    @Override
    public String toString() {
        return "MilkingMachine{" +
                "milked=" + milked +
                ", avaiableMachines=" + avaiableMachines +
                '}';
    }

    public void milkAnimal()
    {
        if(avaiableMachines == true)
        {
            milked = Math.random() * milked;
            System.out.println(milked + " was milked");


        }
        else
        {
            System.out.println("Theres is no avaiable machines to milk a cow");
            avaiableMachines = true;
        }

    }

    public double milkMachine() {
        milkAnimal();

        double milk = 0;
        if (milked > 0) {
            milk = getCustomCapacity() - milked;


        }

        return milk;
    }

}
