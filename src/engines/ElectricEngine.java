package engines;

public class ElectricEngine extends Engine {
    private int batteryCapacity ;

    public ElectricEngine (int batteryCapacity, String typeEngine, double engineVoluem) {
        super(typeEngine, engineVoluem);
        this.batteryCapacity = batteryCapacity;
        
    }

    public int getBatteryCapacity() {
        return batteryCapacity;
    }

}
