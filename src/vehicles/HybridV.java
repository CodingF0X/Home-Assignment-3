package vehicles;

import engines.HybridEngine;

public class HybridV extends Vehicle{
   private HybridEngine hybridEngine;


   public HybridV(Manufacture manufacturer, HybridEngine engine) {
      super("Hybrid Vehicle", manufacturer, engine);
      hybridEngine = new HybridEngine(engine.getBatteryCapacity(), engine.getFeulConsumption(), engine.getTypeEngine(), engine.getEngineVolume());

   }
   

   public void showCharacteristics(){
      System.out.println("Vehicle type: " + getType());
      System.out.println("Characteristiccs :" );
      System.out.println("Make :" + getManufacturer().getMake() + "(" + getManufacturer().getCountry()+ ")");
      System.out.println("Model :" + getManufacturer().getModel());
      System.out.println("Year :" + getManufacturer().getYearOfManufacture());
      System.out.println("Color : " + getManufacturer().getColor());
      System.out.println("Price : " + getManufacturer().getPrice());
      System.out.println("Enginge type : " +  getEngine().getTypeEngine());
      System.out.println("Enigine Voluem : " + getEngine().getEngineVolume());
      System.out.println("Battery capacity : " +  hybridEngine.getBatteryCapacity() + " KWs / h");
      System.out.println("fuel consumption : " +  hybridEngine.getFeulConsumption() + " liters per 100 KMs");
      
  }

//    @Override
//    public String toString() {
//       return super.getType();
//    }
}
