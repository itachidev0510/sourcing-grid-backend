package com.salil.sourcing_grid.Modal;

public class MachiningPrice extends Category{

    private double PricePerHour;

    public void setPricePerHour(double pricePerHour) {
        PricePerHour = pricePerHour;
    }

    public double getPricePerHour() {
        return PricePerHour;
    }

    @Override
    public double costCalculation() {

        double ManHour=getUnitCost();

        double childcalculation=ManHour*PricePerHour;
        return childcalculation;
    }
}
