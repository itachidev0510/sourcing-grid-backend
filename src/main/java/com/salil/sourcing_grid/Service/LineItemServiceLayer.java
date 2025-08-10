package com.salil.sourcing_grid.Service;

import com.salil.sourcing_grid.DTOs.*;
import com.salil.sourcing_grid.Mapper.LineItemMapper;
import com.salil.sourcing_grid.Modal.GridEntry;
import com.salil.sourcing_grid.Modal.LineItem;
import com.salil.sourcing_grid.Reps.LineItemImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class LineItemServiceLayer  {





    public double totalCost(List<GridEntry> GrindEntries) {
        if(GrindEntries==null|| GrindEntries.isEmpty())
        { return 0.0;}


        return GrindEntries.stream()
                .mapToDouble(e->{
                    int qty=e.getQuantity();
                    double rate=e.getRate()!=null?e.getRate():0.0;
                    double costofline=qty*rate;
                    e.setCost(costofline);

                    return costofline;
                })
                .sum();}


    @Autowired
    private  LineItemImpl lineItemimpl;

    @Autowired
    private LineItemMapper lineItemMapper;



    public LineEntryResponseDTO CreatelineItem(LineItemRequestDTO dto){

        LineItem line=new LineItem();


    double totalCost = 0.0;
    List<GridEntry> gridEntry=new ArrayList<>();


    for (GridEntryRequestDTO e:dto.getGridentries()){
        GridEntry entry = new GridEntry();
        entry.setGridName(e.getGridName());
        entry.setQuantity((int) e.getQty());
        entry.setRate(e.getRate());
        entry.setCostComponentName(e.getCostComponentName());

        double qty = e.getQty() ;
        double rate = e.getRate();

        double cost=qty*rate;
        entry.setCost(cost);

        entry.setLineItem(line);

        gridEntry.add(entry);

        totalCost += cost;

     

    }

    line.setNameOfLineItem(dto.getNameOfLineItem());
    line.setListofcategory(gridEntry);
    LineItem saved = lineItemimpl.save(line);


        LineEntryResponseDTO responseDTO = lineItemMapper.lineToResponseDTO(saved); //
    return responseDTO;


    }




    public LineEntryResponseDTO getByid(long id) {

        LineItem lineItem=lineItemimpl.findById(id).orElseThrow(()-> new RuntimeException("Line item is not found" + id));

        return lineItemMapper.lineToResponseDTO(lineItem);
    }

    public LineEntryResponseDTO updateLineItem(long id, LineItemRequestDTO lineItemRequestDTO) {

        LineItem lineItem=lineItemimpl.findById(id).orElseThrow(()-> new RuntimeException("Line item is not found" + id));

        lineItem.setNameOfLineItem(lineItemRequestDTO.getNameOfLineItem());

        double totalCost = 0.0;
        List<GridEntry> gridEntry=new ArrayList<>();


        for (GridEntryRequestDTO e:lineItemRequestDTO.getGridentries()){
            GridEntry entry = new GridEntry();
            entry.setGridName(e.getGridName());
            entry.setQuantity((int) e.getQty());
            entry.setRate(e.getRate());
            entry.setCostComponentName(e.getCostComponentName());




            entry.setLineItem(lineItem);

            gridEntry.add(entry);




        }

        double totalost=totalCost(gridEntry);

        lineItem.setNameOfLineItem(lineItemRequestDTO.getNameOfLineItem());



        lineItem.setListofcategory(gridEntry);

        LineItem saved = lineItemimpl.save(lineItem);


        LineEntryResponseDTO responseDTO = lineItemMapper.lineToResponseDTO(saved);
        return responseDTO;
    }
}

        /*
        * for (GridEntry entry : gridEntries) {
        double qty = entry.getQuantity() != null ? entry.getQuantity() : 0.0;
        double rate = entry.getRate() != null ? entry.getRate() : 0.0;
        total += qty * rate;
    }

    return total;
}
*/

