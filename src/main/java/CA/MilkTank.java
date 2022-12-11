package CA;

public class MilkTank
{

    private int customCapacity;
    private int currentCapacity;

    public MilkTank(int customCapacity) {
        this.customCapacity = customCapacity;
    }

    public MilkTank()
    {
        this.customCapacity = 2000;

    }


    public int getCustomCapacity() {
        return customCapacity;
    }

    @Override
    public String toString() {
        return "MilkTank{" +
                "customCapacity=" + customCapacity +
                '}';
    }

    public  double freeSpace(double theTank)
    {
        if(customCapacity > theTank)
        {
            return customCapacity;
        }
        return theTank;
    }

    public void addToTank(double amount)
    {
        //havent figured out how to implement current to the main
        if(currentCapacity > customCapacity || currentCapacity == customCapacity)
        {
            System.out.println("Theres is no more space to add " + amount);

        } else if (currentCapacity <= customCapacity)
        {
            System.out.println("There is space to add " + amount);
            currentCapacity += amount;
        }


    }

    public double getFromTank(double amount)
    {
        if(customCapacity > amount)
        {
            System.out.println("Theres is not enough to extract");
            return 0;
        }

        System.out.println("Removed " + amount + " from the tank");
        return customCapacity - amount;

    }




}
