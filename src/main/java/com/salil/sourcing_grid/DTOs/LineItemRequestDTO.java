package com.salil.sourcing_grid.DTOs;

import java.util.List;

public class LineItemRequestDTO {

    private List<GridEntryRequestDTO> gridentries;

    private String NameOfLineItem;

    public void setGridentries(List<GridEntryRequestDTO> gridentries) {
        this.gridentries = gridentries;
    }

    public void setNameOfLineItem(String nameOfLineItem) {
        NameOfLineItem = nameOfLineItem;
    }

    public String getNameOfLineItem() {
        return NameOfLineItem;
    }

    public List<GridEntryRequestDTO> getGridentries() {
        return gridentries;
    }
}
