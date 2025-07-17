package com.salil.sourcing_grid.Modal;

import org.springframework.boot.autoconfigure.domain.EntityScan;
import jakarta.persistence.*;

import java.util.List;

@Entity
public class Parentgrid {

 @Id
 @GeneratedValue(strategy = GenerationType.IDENTITY)
   private int id;

   private String GridName;
    @OneToMany(mappedBy = "parentgrid", cascade = CascadeType.ALL, orphanRemoval = true)
  private List<LineItem>Items;

    @OneToMany(mappedBy = "parentgrid", cascade = CascadeType.ALL, orphanRemoval = true)
    private  List<GridEntry> gridEntries;
   private double totalMaterialCost;

    public void setGridEntries(List<GridEntry> gridEntries) {
        this.gridEntries = gridEntries;
    }

    public List<GridEntry> getGridEntries() {
        return gridEntries;
    }

    public void setGridName(String gridName) {
        GridName = gridName;
    }

    public String getGridName() {
        return GridName;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public void setTotalMaterialCost(double totalMaterialCost) {
        this.totalMaterialCost = totalMaterialCost;
    }

    public double getTotalMaterialCost() {
        return totalMaterialCost;
    }

    public void setItems(List<LineItem> items) {
        Items = items;
    }

    public List<LineItem> getItems() {
        return Items;
    }
}
