package CA;

public class Cows
{

    private String cowsName;
    private static int cowsId = 0;
    private int id;
    private boolean isFemale;
    private boolean isMilked;



    public Cows(String cowsName, boolean isFemale)
    {
        this.cowsName = cowsName;
        this.id = ++cowsId;
        this.isFemale = isFemale;

    }

    public String getCowsName() {
        return cowsName;
    }


    public int getId() {
        return id;
    }

    public boolean isFemale() {
        return isFemale;
    }

    public boolean isMilked() {
        return isMilked;
    }

    @Override
    public String toString() {
        return "Cows{" +
                "cowsName='" + cowsName + '\'' +
                ", id=" + id +
                ", isFemale=" + isFemale +
                ", isMilked=" + isMilked +
                '}';
    }

    public boolean milkedCow()
    {
        if(isMilked == true )
        {
            isMilked = false;
        }
        return isMilked;
    }



}
