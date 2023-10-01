

import engines.CombustionEngine;
import engines.ElectricEngine;
import engines.HybridEngine;
import vehicles.BEV;
import vehicles.HybridV;
import vehicles.ICEV;
import vehicles.Manufacture;
import vehicles.Vehicle;

public class VehicleProgram {
    public static void main(String[] args) {
        //-- STARTS WITH THE ENGINGE --//
        CombustionEngine combustionEngine = new CombustionEngine(6,"Combustion Engine",4.0);
        ElectricEngine electricEngine = new ElectricEngine(2000,"Electric Engine",1.5);
        HybridEngine hybridEngine = new HybridEngine(20000,3,"Hybrid Engine",2.5);
        // -- THEN WITH THE MANUFACTURER --//
        Manufacture manufacturer1 = new Manufacture("UK","Aston Martin","Vantage",2008,"grey",120000);
        Manufacture manufacturer2 = new Manufacture("USA","Tesla","Model-S",2020,"White",88000.500);
        Manufacture manufacturer3 = new Manufacture("Germany","Porsche","Panamera",2020,"Red",90000.500);
        // -- THEN WITH THE VEHICLE TYPE --//
        ICEV icv = new ICEV(manufacturer1,combustionEngine);
        BEV bev = new BEV(manufacturer2, electricEngine);
        HybridV hybridV = new HybridV(manufacturer3, hybridEngine);

        Vehicle[] vehicles = {icv, bev, hybridV};

        for (Vehicle vehicle : vehicles) {  
            vehicle.showCharacteristics();
            System.out.println("----------------------------------------------------------------");
        }
    }
}   
