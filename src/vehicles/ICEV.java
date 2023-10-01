package vehicles;

import engines.CombustionEngine;

public class ICEV extends Vehicle{
    private CombustionEngine cEngine;

    public ICEV(Manufacture manufacture, CombustionEngine engine) {
        super("Combustion engine Vehicle", manufacture, engine );
        cEngine = new CombustionEngine(engine.getFeulConsumption(),engine.getTypeEngine(),engine.getEngineVolume());
    }
     
    @Override
    public void showCharacteristics(){
    System.out.println("Vehicle type : " +  getType());
    System.out.println("Vehicle characteristics:");
    System.out.println("Make : "+ getManufacturer().getMake()+ "(" + getManufacturer().getCountry()+ ")");
    System.out.println("Model : " +  getManufacturer().getModel() );
    System.out.println("Year : " +  getManufacturer().getYearOfManufacture() );
    System.out.println("Color : " +  getManufacturer().getColor() );
    System.out.println("Price : " +  getManufacturer().getPrice() );
    System.out.println("Engine type : " +  getEngine().getTypeEngine() );
    System.out.println("Engine Volueme : " + getEngine().getEngineVolume()+"L");
    System.out.println("Feul consumption "+ cEngine.feulConsumption + " Litres per 100 KMs");

    

    }
}
