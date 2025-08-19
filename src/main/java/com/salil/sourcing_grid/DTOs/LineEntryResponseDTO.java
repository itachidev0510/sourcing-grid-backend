package com.salil.sourcing_grid.DTOs;

import java.util.List;

public class LineEntryResponseDTO {

   private int id;

   private String message;


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

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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

    public void setMessage(String message) {
        this.message = message;
    }

    public String getMessage() {
        return message;
    }
}
