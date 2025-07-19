package com.salil.sourcing_grid.Mapper;

import com.salil.sourcing_grid.DTOs.GridEntryDTO;
import com.salil.sourcing_grid.DTOs.LineItemDTO;
import com.salil.sourcing_grid.Modal.GridEntry;
import com.salil.sourcing_grid.Modal.LineItem;

import java.util.ArrayList;
import java.util.List;

public class LineItemMapper {

    public static LineItemDTO linetoDTO(LineItem lineItem){
        LineItemDTO itmesline=new LineItemDTO();

        itmesline.setId(lineItem.getId());
        itmesline.setNameOfLineItem(lineItem.getNameOfLineItem());

        List<GridEntryDTO> griddto= new ArrayList<>();

        for(GridEntry gdto:lineItem.getListofcategory()){
            GridEntryDTO dtogrid=GrindEntryMapper.gridtoDto(gdto);

            griddto.add(dtogrid);
        }

        itmesline.setListofcategoryDTO(griddto);

        return itmesline;
    }
    public static LineItemDTO linetoDTO(LineItem lineItem,double cost){
        LineItemDTO itmesline=linetoDTO(lineItem);

        itmesline.setLineItemCost(cost);

        return itmesline;
    }

    public static LineItem DTOtomodal(LineItemDTO lineItemDTO){

        LineItem lineItem=new LineItem();

        lineItem.setId(lineItemDTO.getId());

        lineItem.setNameOfLineItem(lineItemDTO.getNameOfLineItem());

        List<GridEntry> togrid=new ArrayList<>();

        for (GridEntryDTO g : lineItemDTO.getListofcategoryDTO() ){
            GridEntry gmodal=GrindEntryMapper.gridtoEntity(g);

            togrid.add(gmodal);
        }
        lineItem.setListofcategory(togrid);

        return lineItem;
    }
}
