package com.salil.sourcing_grid.Controller;

import com.salil.sourcing_grid.DTOs.LineEntryResponseDTO;
import com.salil.sourcing_grid.DTOs.LineItemRequestDTO;
import com.salil.sourcing_grid.Modal.LineItem;
import com.salil.sourcing_grid.Service.LineItemServiceLayer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController

@RequestMapping("/api/line_item")

public class LineItemController {

   /* @PostMapping

    public ResponseEntity<String>CreatelineItem(@RequestBody LineItem lineItem) {

        double totalCosts = lineItem.Cost();

        System.out.println("Received LineItem: " + lineItem);

        return ResponseEntity.ok(" Line Item Created. Total Cost: ₹" + totalCosts);

    }

    */

    @Autowired
    private LineItemServiceLayer lineItemServiceLayer;

    @PostMapping


    public ResponseEntity<LineEntryResponseDTO>CreatelineItem(@RequestBody LineItemRequestDTO lineItemDTO) {

        LineEntryResponseDTO response=new LineEntryResponseDTO();
        response= lineItemServiceLayer.CreatelineItem(lineItemDTO);


        return ResponseEntity.status(HttpStatus.CREATED).body(response);
    }
    }


