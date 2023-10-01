package engines;
public  class Engine {
    private String typeEngine;
    private double engineVolume ;
    // public double torque;
    // public int horsePower;
    // public int numberCylenders;
    // public String energyConsumption; // High or Low
    // public boolean reliability;

    public Engine(String typeEngine, double engineVolume){
        this.typeEngine = typeEngine;
        this.engineVolume = engineVolume;
    }

    public String getTypeEngine() {
        return typeEngine;
    }

    public double getEngineVolume() {
        return engineVolume;
    }


}
