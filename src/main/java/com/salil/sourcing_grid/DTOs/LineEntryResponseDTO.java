package com.salil.sourcing_grid.DTOs;

import java.util.List;

public class LineEntryResponseDTO {

    private List<GridEntryRequst> listofcategoryDTO;

    private String NameOfLineItem;

    private double totalCost;

    public List<GridEntryRequst> getListofcategoryDTO() {
        return listofcategoryDTO;
    }

    public void setListofcategoryDTO(List<GridEntryRequst> listofcategoryDTO) {
        this.listofcategoryDTO = listofcategoryDTO;
    }

    public String getNameOfLineItem() {
        return NameOfLineItem;
    }

    public void setNameOfLineItem(String nameOfLineItem) {
        NameOfLineItem = nameOfLineItem;
    }

    public double getTotalCost() {
        return totalCost;
    }

    public void setTotalCost(double totalCost) {
        this.totalCost = totalCost;
    }
}
