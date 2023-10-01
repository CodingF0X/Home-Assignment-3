package engines;

public class CombustionEngine extends Engine {
    public int  feulConsumption;

    public CombustionEngine(int fuelConsumption, String typeEngine, double engineVolume) {
        super(typeEngine, engineVolume);
        this.feulConsumption = fuelConsumption;
    }

    public int getFeulConsumption() {
        return feulConsumption;
    }
}
