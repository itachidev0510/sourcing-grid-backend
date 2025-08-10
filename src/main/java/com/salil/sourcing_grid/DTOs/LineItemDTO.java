package com.salil.sourcing_grid.DTOs;

import com.salil.sourcing_grid.Modal.GridEntry;
import com.salil.sourcing_grid.Modal.Parentgrid;
import jakarta.persistence.CascadeType;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import lombok.Data;

import java.util.List;

@Data
public class LineItemDTO {

    private int id;

    private String NameOfLineItem;

    private List<GridEntryDTO> listofcategoryDTO;

    private double LineItemCost;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNameOfLineItem() {
        return NameOfLineItem;
    }

    public void setNameOfLineItem(String nameOfLineItem) {
        NameOfLineItem = nameOfLineItem;
    }

    public List<GridEntryDTO> getListofcategoryDTO() {
        return listofcategoryDTO;
    }

    public void setListofcategoryDTO(List<GridEntryDTO> listofcategoryDTO) {
        this.listofcategoryDTO = listofcategoryDTO;
    }

    public double getLineItemCost() {
        return LineItemCost;
    }

    public void setLineItemCost(double lineItemCost) {
        LineItemCost = lineItemCost;
    }
}
