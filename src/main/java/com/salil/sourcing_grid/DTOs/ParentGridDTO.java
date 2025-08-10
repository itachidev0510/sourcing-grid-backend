package com.salil.sourcing_grid.DTOs;

import com.salil.sourcing_grid.Modal.GridEntry;
import com.salil.sourcing_grid.Modal.LineItem;
import jakarta.persistence.CascadeType;
import jakarta.persistence.OneToMany;
import lombok.Data;

import java.util.List;

@Data
public class ParentGridDTO {

    private int Id;

    private String GridName;

    private List<LineItemDTO> ItemsDTO;

    private double totalMaterialCost;

    public int getId() {
        return Id;
    }

    public void setId(int id) {
        Id = id;
    }

    public String getGridName() {
        return GridName;
    }

    public List<LineItemDTO> getItemsDTO() {
        return ItemsDTO;
    }

    public void setItemsDTO(List<LineItemDTO> itemsDTO) {
        ItemsDTO = itemsDTO;
    }

    public double getTotalMaterialCost() {
        return totalMaterialCost;
    }

    public void setTotalMaterialCost(double totalMaterialCost) {
        this.totalMaterialCost = totalMaterialCost;
    }

    public void setGridName(String gridName) {
        GridName = gridName;
    }
}
