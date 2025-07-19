package com.salil.sourcing_grid.Mapper;

import com.salil.sourcing_grid.DTOs.GridEntryDTO;
import com.salil.sourcing_grid.Modal.GridEntry;
import com.salil.sourcing_grid.Modal.LineItem;

public class GrindEntryMapper {

    public static GridEntryDTO gridtoDto(GridEntry gridEntry){

        GridEntryDTO gridEntryDTO=new GridEntryDTO();

        double rate= gridEntry.getRate()!=null? gridEntry.getRate():0;

        double qty=gridEntry.getQuantity()!=null?gridEntry.getQuantity():0;

        gridEntryDTO.setId(gridEntry.getId());

        gridEntryDTO.setGridName(gridEntry.getGridName());

        gridEntryDTO.setCost(rate*qty);

        gridEntryDTO.setRate(gridEntry.getRate());

        gridEntryDTO.setQuantity(gridEntry.getQuantity());

        gridEntryDTO.setCostComponentName(gridEntry.getCostComponentName());

        return gridEntryDTO;
    }

    public static GridEntry gridtoEntity(GridEntryDTO gridEntryDTO, LineItem lineitem){
        GridEntry gridEntry=new GridEntry();

        double rate= gridEntryDTO.getRate()!=null? gridEntry.getRate():0;

        double qty=gridEntryDTO.getQuantity()!=null?gridEntry.getQuantity():0;

        gridEntry.setCost(rate*qty);

        gridEntry.setRate(gridEntryDTO.getRate());

        gridEntry.setQuantity(gridEntryDTO.getQuantity());

        gridEntry.setId(gridEntryDTO.getId());

        gridEntry.setGridName(gridEntryDTO.getGridName());

        gridEntry.setCostComponentName(gridEntryDTO.getCostComponentName());

        gridEntry.setLineItem(lineitem);

        return gridEntry;
    }
}
