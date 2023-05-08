package ua.com.hrv;

public class Helm {
    private int diameter;
    private String material;

    public Helm(int diameter, String material) {
        this.diameter = diameter;
        this.material = material;
    }

    public int getDiameter() {
        return diameter;
    }

    public void setDiameter(int diameter) {
        this.diameter = diameter;
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    @Override
    public String toString() {
        return "Helm{" +
                "diameter=" + diameter +
                ", material='" + material + '\'' +
                '}';
    }
}
