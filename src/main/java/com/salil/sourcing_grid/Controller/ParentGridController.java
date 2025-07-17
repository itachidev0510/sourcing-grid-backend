package com.salil.sourcing_grid.Controller;

import com.salil.sourcing_grid.Modal.Parentgrid;
import com.salil.sourcing_grid.Reps.ParentGridImp;
import com.salil.sourcing_grid.Service.ParentGridLayer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController

@RequestMapping("/api/line_ite")
public class ParentGridController {
@Autowired
private ParentGridLayer Parentgrids;

@Autowired
private ParentGridImp repository;


    @PostMapping
    public ResponseEntity<String> save(@RequestBody Parentgrid parent) {

        double totalCost=Parentgrids.ParentCalculation(parent);
        repository.save(parent);
        return ResponseEntity.ok("Parent Grid saved to DB successfully. Total Cost: ₹" + totalCost);
    }

}
