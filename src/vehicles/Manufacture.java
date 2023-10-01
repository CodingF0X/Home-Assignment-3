package vehicles;
public class Manufacture {
    private String make;
    private String country;
    private String model;
    private int yearOfManufacture;
    private String color;
    private double price;

    public Manufacture(String country, String make, String model, int yearOfManufacture, String color, double price) {
        this.country = country;
        this.make = make;
        this.model = model;
        this.yearOfManufacture = yearOfManufacture;
        this.color = color;
        this.price = price;
    }

   public String getMake() {
        return make;
    }

    public String getCountry() {
        return country;
    }

    public String getModel() {
        return model;
    }

    public int getYearOfManufacture() {
        return yearOfManufacture;
    }

    public String getColor() {
        return color;
    }

    public double getPrice() {
        return price;
    }
}
