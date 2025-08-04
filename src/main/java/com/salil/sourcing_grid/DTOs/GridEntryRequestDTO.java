package com.salil.sourcing_grid.DTOs;

public class GridEntryRequestDTO {

    private String gridName;
    private String costComponentName;
    //private double gridTotalCost;
    private double qty;
    private double rate;


    public double getQty() {
        return qty;
    }

    public void setQty(double qty) {
        this.qty = qty;
    }

    public String getGridName() {
        return gridName;
    }

    public void setGridName(String gridName) {
        this.gridName = gridName;
    }

    public String getCostComponentName() {
        return costComponentName;
    }

    public void setCostComponentName(String costComponentName) {
        this.costComponentName = costComponentName;
    }

    public double getRate() {
        return rate;
    }

    public void setRate(double rate) {
        this.rate = rate;
    }
}
