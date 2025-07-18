package com.salil.sourcing_grid.Mapper;

import com.salil.sourcing_grid.DTOs.GridEntryDTO;
import com.salil.sourcing_grid.Modal.GridEntry;

public class GrindEntryMapper {

    public static GridEntryDTO gridtoDto(GridEntry gridEntry){

        GridEntryDTO gridEntryDTO=new GridEntryDTO();

        gridEntryDTO.setId(gridEntry.getId());

        gridEntryDTO.setGridName(gridEntry.getGridName());

        gridEntryDTO.setCost(gridEntry.getCost());

        gridEntryDTO.setRate(gridEntry.getRate());

        gridEntryDTO.setQuantity(gridEntry.getQuantity());

        gridEntryDTO.setCostComponentName(gridEntry.getCostComponentName());

        return gridEntryDTO;
    }

    public static GridEntry gridtoEntity(GridEntryDTO gridEntryDTO){
        GridEntry gridEntry=new GridEntry();

        gridEntry.setCost(gridEntryDTO.getCost());

        gridEntry.setRate(gridEntryDTO.getRate());

        gridEntry.setQuantity(gridEntryDTO.getQuantity());

        gridEntry.setId(gridEntryDTO.getId());

        gridEntry.setGridName(gridEntryDTO.getGridName());

        gridEntry.setCostComponentName(gridEntryDTO.getCostComponentName());

        return gridEntry;
    }
}
