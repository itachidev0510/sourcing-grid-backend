package com.salil.sourcing_grid.Service;

import com.salil.sourcing_grid.Modal.LineItem;
import com.salil.sourcing_grid.Modal.Parentgrid;
import com.salil.sourcing_grid.Reps.ParentGridImp;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ParentGridLayer {

 @Autowired
   private LineItemServiceLayer lineItem;

    @Autowired
    private ParentGridImp repository;


    public double ParentCalculation(Parentgrid parentgrid){
         double total = 0;

         if(parentgrid.getItems() ==null)
             return 0.0;

         else
             for(LineItem p:parentgrid.getItems()){
                 total+= lineItem.totalCost(p.getListofcategory());
             }
             parentgrid.setTotalMaterialCost(total);

           repository.save(parentgrid);
             return total;
    }
}
