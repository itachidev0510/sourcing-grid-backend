package com.salil.sourcing_grid.Mapper;

import com.salil.sourcing_grid.DTOs.LineItemDTO;
import com.salil.sourcing_grid.DTOs.ParentGridDTO;
import com.salil.sourcing_grid.Modal.LineItem;
import com.salil.sourcing_grid.Modal.Parentgrid;

import java.util.ArrayList;
import java.util.List;

public class ParentGridMapper {

    public static ParentGridDTO ParenttoDTO(Parentgrid parentgrid){

        ParentGridDTO parentGridDTO=new ParentGridDTO();
        parentGridDTO.setId(parentgrid.getId());
        parentGridDTO.setGridName(parentgrid.getGridName());
        parentGridDTO.setTotalMaterialCost(parentgrid.getTotalMaterialCost());
        List<LineItemDTO>  linedto=new ArrayList<>();

        for(LineItem item : parentgrid.getItems()){

            LineItemDTO dto=LineItemMapper.linetoDTO(item);

            linedto.add(dto);



        }
        parentGridDTO.setItemsDTO(linedto);




        return parentGridDTO;
    }

    public static Parentgrid DTOtomodal (ParentGridDTO parentGridDTO){

        Parentgrid parentgrid=new Parentgrid();

        parentgrid.setId(parentGridDTO.getId());
        parentgrid.setGridName(parentGridDTO.getGridName());
        parentgrid.setTotalMaterialCost(parentGridDTO.getTotalMaterialCost());

        List<LineItem>items=new ArrayList<>();

        for(LineItemDTO dtosline : parentGridDTO.getItemsDTO()){

            LineItem dotsline=LineItemMapper.DTOtomodal(dtosline,parentgrid);
            items.add(dotsline);
        }
        parentgrid.setItems(items);



        return parentgrid;
    }
}
