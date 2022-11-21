package Herritage;

public class Arme {
    private String name;
    private String type;
    private String manufacturer;
    private double portee;

    public Arme(String name, String type, String manufacture, double portee) {
        this.name = name;
        this.type = type;
        this.manufacturer = manufacturer;
        this.portee = portee;
    }

    public String getName() {
        return name;
    }

    public String getType() {
        return type;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public double getPortee() {
        return portee;
    }

    @Override
    public String toString() {
        return "Arme{" +
                "name='" + name + '\'' +
                ", type='" + type + '\'' +
                ", manufacturer='" + manufacturer + '\'' +
                ", portee=" + portee +
                '}';
    }
}
