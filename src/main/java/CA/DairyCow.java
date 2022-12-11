package CA;

public class DairyCow extends MilkTank
{

    private int cowMilked;
    private int milkTankCapacity;
    private boolean isMilkable;


    public DairyCow( int milkTankCapacity, boolean isMilkable) {
        super(2000);
        this.cowMilked = 0;
        this.milkTankCapacity = getCustomCapacity();
        this.isMilkable = isMilkable;
    }


    public int getCowMilked() {
        return cowMilked;
    }

    public int getMilkTankCapacity() {
        return milkTankCapacity;
    }

    public boolean isMilkable() {
        return isMilkable;
    }

    @Override
    public String toString() {
        return "DairyCow{" +
                "cowMilked=" + cowMilked +
                ", milkTankCapacity=" + milkTankCapacity +
                ", isMilkable=" + isMilkable +
                '}';
    }


}
