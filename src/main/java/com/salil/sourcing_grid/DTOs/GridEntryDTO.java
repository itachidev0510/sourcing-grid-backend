package com.salil.sourcing_grid.DTOs;

import com.salil.sourcing_grid.Modal.LineItem;
import com.salil.sourcing_grid.Modal.Parentgrid;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import lombok.Data;

@Data
public class GridEntryDTO {

    private int id;

    private String gridName;

    private String costComponentName; // e.g., "Steel", "Aluminum"

    private int quantity;
    private Double rate;

    private Double cost;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public Double getRate() {
        return rate;
    }

    public void setRate(Double rate) {
        this.rate = rate;
    }

    public Double getCost() {
        return cost;
    }

    public void setCost(Double cost) {
        this.cost = cost;
    }
}
