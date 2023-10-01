package vehicles;

import engines.ElectricEngine;

public class BEV extends Vehicle {
    private ElectricEngine eEngine;
    public BEV(Manufacture manufacturer, ElectricEngine engine) {
    super("Electric Engine Vehicle", manufacturer, engine);
    eEngine = new ElectricEngine(engine.getBatteryCapacity(), engine.getTypeEngine(), engine.getEngineVolume());
    }
    

    public void showCharacteristics(){
        System.out.println("Vehicle type: " + this.getType());
        System.out.println("Characteristiccs :" );
        System.out.println("Make : " +  getManufacturer().getMake()+ "(" + getManufacturer().getCountry()+ ")");
        System.out.println("Model : " +  getManufacturer().getModel());
        System.out.println("Year : " +  getManufacturer().getYearOfManufacture());
        System.out.println("Color : " +  getManufacturer().getColor());
        System.out.println("Price : " +  getManufacturer().getPrice()+" Millions USD");
    
        System.out.println("Enginge type : " +  eEngine.getTypeEngine());
        System.out.println("Battery Capacity : " + eEngine.getBatteryCapacity());
        System.out.println("Enigine Voluem : " + eEngine.getEngineVolume());

    }
}
