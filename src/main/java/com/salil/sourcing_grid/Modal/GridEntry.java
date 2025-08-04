package com.salil.sourcing_grid.Modal;

import jakarta.persistence.*;

@Entity
public class GridEntry {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private String gridName;

    private String costComponentName; // e.g., "Steel", "Aluminum"

    private Double quantity;
    private Double rate;

    private Double cost;


@ManyToOne
@JoinColumn(name = "line_item_id")
    private LineItem lineItem;

@ManyToOne
private Parentgrid parentgrid;
    public void setGridName(String gridName) {
        this.gridName = gridName;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setCost(Double cost) {
        this.cost = cost;
    }

    public void setRate(Double rate) {
        this.rate = rate;
    }

    public void setQuantity(Double quantity) {
        this.quantity = quantity;
    }

    public int getId() {
        return id;
    }



    public Double getCost() {
        return cost;
    }

    public int getQuantity() {
        return quantity;
    }

    public Double getRate() {
        return rate;
    }

    public void setCostComponentName(String costComponentName) {
        this.costComponentName = costComponentName;
    }

    public void setLineItem(LineItem lineItem) {
        this.lineItem = lineItem;
    }

    public String getCostComponentName() {
        return costComponentName;
    }

    public Parentgrid getParentgrid() {
        return parentgrid;
    }

    public void setParentgrid(Parentgrid parentgrid) {
        this.parentgrid = parentgrid;
    }

    public String getGridName() {
        return gridName;
    }

    public LineItem getLineItem() {
        return lineItem;
    }
}
