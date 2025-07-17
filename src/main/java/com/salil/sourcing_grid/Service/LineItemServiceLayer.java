package com.salil.sourcing_grid.Service;

import com.salil.sourcing_grid.Modal.GridEntry;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class LineItemServiceLayer {




    public double totalCost(List<GridEntry> GrindEntries) {
        if(GrindEntries==null|| GrindEntries.isEmpty())
            return 0.0;
        else
        return GrindEntries.stream()
                .mapToDouble(e->{
                    double qty=e.getQuantity()!=null?e.getQuantity():0.0;
                    double rate=e.getRate()!=null?e.getRate():0.0;
                    double costofline=qty*rate;
                    e.setCost(costofline);

                    return costofline;
                })
                .sum();

        /*
        * for (GridEntry entry : gridEntries) {
        double qty = entry.getQuantity() != null ? entry.getQuantity() : 0.0;
        double rate = entry.getRate() != null ? entry.getRate() : 0.0;
        total += qty * rate;
    }

    return total;
}
*/
    }
}
