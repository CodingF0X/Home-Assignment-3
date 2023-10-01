package vehicles;
import engines.Engine;

public abstract class Vehicle  {
    private String type ;
    private Manufacture manufacturer;
    private Engine engine;

    public abstract void showCharacteristics();

    public Vehicle(String type, Manufacture manufacturer, Engine engine) {
        this.type = type;
        this.manufacturer = manufacturer;
        this.engine = engine;
    }
    
    public String getType (){
        return type;
    }

    public Manufacture getManufacturer() {
        return manufacturer;
    }
    
    public Engine getEngine() {
        return engine;
    }
}
