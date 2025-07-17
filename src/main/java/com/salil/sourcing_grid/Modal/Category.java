package com.salil.sourcing_grid.Modal;

import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;

@JsonTypeInfo(
        use = JsonTypeInfo.Id.NAME,
        include = JsonTypeInfo.As.PROPERTY,
        property = "type"  // the field to distinguish child class
)
@JsonSubTypes({
        @JsonSubTypes.Type(value = RawMaterial.class, name = "RawMaterial"),
        @JsonSubTypes.Type(value = MachiningPrice.class, name = "MachiningPrice"),
        @JsonSubTypes.Type(value = PackagingCost.class, name = "PackagingCost")
})
public abstract class Category {
    private String Name;

    private double UnitCost;

    private int QTY;

    public void setName(String name) {
        Name = name;
    }

    public void setQTY(int QTY) {
        this.QTY = QTY;
    }

    public void setUnitCost(double unitCost) {
        UnitCost = unitCost;
    }

    public double getUnitCost() {
        return UnitCost;
    }

    public int getQTY() {
        return QTY;
    }

    public String getName() {
        return Name;
    }

    public abstract double costCalculation();
}
