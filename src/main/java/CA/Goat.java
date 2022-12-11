package CA;

public class Goat extends Animals
{
    private int weight;
    private String pedigree;

    public Goat(int age, String animal, String name, boolean isMilkable, int id, int weight, String pedigree) {
        super(age, animal, name, isMilkable, id);
        this.weight = weight;
        this.pedigree = pedigree;
    }


    public int getWeight() {
        return weight;
    }

    public String getPedigree() {
        return pedigree;
    }

    @Override
    public String toString() {
        return "Goat{" +
                "weight=" + weight +
                ", pedigree='" + pedigree + '\'' +
                '}';
    }
}
