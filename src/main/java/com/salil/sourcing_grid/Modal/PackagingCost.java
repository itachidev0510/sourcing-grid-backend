package com.salil.sourcing_grid.Modal;

public class PackagingCost extends Category{



    public double costCalculation(){
        double PackingCOst=getUnitCost();
        double childcalculate= PackingCOst*getQTY();

        return childcalculate;
    }
}
