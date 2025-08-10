package com.salil.sourcing_grid.Mapper;

import com.salil.sourcing_grid.DTOs.GridEntryDTO;
import com.salil.sourcing_grid.DTOs.GridEntryRequst;
import com.salil.sourcing_grid.DTOs.LineEntryResponseDTO;
import com.salil.sourcing_grid.DTOs.LineItemDTO;
import com.salil.sourcing_grid.Modal.GridEntry;
import com.salil.sourcing_grid.Modal.LineItem;
import com.salil.sourcing_grid.Modal.Parentgrid;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;


@Component
public class LineItemMapper {



    public static LineItemDTO linetoDTO(LineItem lineItem){
        LineItemDTO itmesline=new LineItemDTO();

        itmesline.setId(lineItem.getId());
        itmesline.setNameOfLineItem(lineItem.getNameOfLineItem());


        List<GridEntryDTO> griddto= new ArrayList<>();

        double totalcost=0.0;

        if(lineItem.getListofcategory()!=null)

        for(GridEntry gdto:lineItem.getListofcategory()){
            GridEntryDTO dtogrid=GrindEntryMapper.gridtoDto(gdto);

            totalcost+= dtogrid.getCost();

            griddto.add(dtogrid);
        }

        itmesline.setListofcategoryDTO(griddto);

        itmesline.setLineItemCost(totalcost);




        return itmesline;
    }
    /*public static LineItemDTO linetoDTOcost(LineItem lineItem,double cost){
        LineItemDTO itmesline=linetoDTO(lineItem);

        itmesline.setLineItemCost(cost);

        return itmesline;
    }
*/
    public static LineItem DTOtomodal(LineItemDTO lineItemDTO, Parentgrid parentgrid){

        LineItem lineItem=new LineItem();

        lineItem.setId(lineItemDTO.getId());

        lineItem.setNameOfLineItem(lineItemDTO.getNameOfLineItem());

        List<GridEntry> togrid=new ArrayList<>();

        for (GridEntryDTO g : lineItemDTO.getListofcategoryDTO() ){
            GridEntry gmodal=GrindEntryMapper.gridtoEntity(g,lineItem);

            togrid.add(gmodal);
        }
        lineItem.setListofcategory(togrid);

        lineItem.setParentgrid(lineItem.getParentgrid());

        lineItem.setParentgrid(parentgrid);

        return lineItem;
    }







    public LineEntryResponseDTO lineToResponseDTO(LineItem lineItem) {

        LineEntryResponseDTO response = new LineEntryResponseDTO();
        response.setNameOfLineItem(lineItem.getNameOfLineItem());

        List<GridEntryRequst> dtos=new ArrayList<>();

        double totalcost=0.00;

        for(GridEntry entry: lineItem.getListofcategory()){
            GridEntryRequst dto=new GridEntryRequst();

            dto.setGridName(entry.getGridName());

            dto.setCostComponentName(entry.getCostComponentName());


            double cost= entry.getQuantity()* entry.getRate();

            dto.setGridTotalCost(cost);

            dto.setRate(entry.getRate());
            dto.setQty(entry.getQuantity());

            totalcost+=cost;

            dtos.add(dto);



        }
        response.setListofcategoryDTO(dtos);
        response.setTotalCost(totalcost);
        /*
        response.setListofcategoryDTO(
                lineItem.getListofcategory().stream().map(entry -> {
                    GridEntryRequst dto = new GridEntryRequst();
                    dto.setQty(entry.getQuantity());
                    dto.setRate(entry.getRate());
                    return dto;
                }).toList()

        );
        */


        return response;
    }
}
