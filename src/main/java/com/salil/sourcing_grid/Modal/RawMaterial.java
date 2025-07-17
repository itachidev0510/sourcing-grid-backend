package com.salil.sourcing_grid.Modal;

public class RawMaterial extends Category{
    @Override
    public double costCalculation(){
        double childcalculation=getQTY() *getUnitCost();

        return childcalculation;
    }
}
