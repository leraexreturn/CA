package CA;

import java.util.ArrayList;

public class Shed
{
    private ArrayList<Farm> farm;


    public Shed(ArrayList<Farm> farm) {

        this.farm = farm;
    }

    @Override
    public String toString() {
        return "Shed{" +
                "farm=" + farm +
                '}';
    }


    public ArrayList<Farm> getFarm() {
        return farm;
    }



}
