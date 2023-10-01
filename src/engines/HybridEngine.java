package engines;

public class HybridEngine extends Engine{
    private int batteryCapacity;
    private int feulConsumption;

    public HybridEngine(int batteryCapacity, int feulConsumption, String typeEngine, double engineVolume) {
        super(typeEngine, engineVolume);
        this.batteryCapacity = batteryCapacity;
        this.feulConsumption = feulConsumption;
    }

    public int getBatteryCapacity() {
        return batteryCapacity;
    }

    public int getFeulConsumption() {
        return feulConsumption;
    }



    // @Override
    // public String toString() {
    //     return "HybridEngine{" + "engineVolume=" + engineVolume + ", horsePower=" + horsePower + ", numberCylenders=" + numberCylenders + ", torque=" + torque + ", energyConsumption=" + energyConsumption + ", reliability=" + reliability + '}';
    // }

}
