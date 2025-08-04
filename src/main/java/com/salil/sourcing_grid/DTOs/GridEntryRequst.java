package com.salil.sourcing_grid.DTOs;

public class GridEntryRequst {

    private String gridName;
    private String costComponentName;
    private double gridTotalCost;
    private int qty;
    private double rate;

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

    public double getGridTotalCost() {
        return gridTotalCost;
    }

    public void setGridTotalCost(double gridTotalCost) {
        this.gridTotalCost = gridTotalCost;
    }

    public int getQty() {
        return qty;
    }

    public double getRate() {
        return rate;
    }

    public void setRate(double rate) {
        this.rate = rate;
    }

    public void setQty(int qty) {
        this.qty = qty;
    }
}
