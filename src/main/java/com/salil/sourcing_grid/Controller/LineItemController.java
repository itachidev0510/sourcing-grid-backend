package com.salil.sourcing_grid.Controller;

import com.salil.sourcing_grid.DTOs.LineEntryResponseDTO;
import com.salil.sourcing_grid.DTOs.LineItemRequestDTO;
import com.salil.sourcing_grid.Modal.LineItem;
import com.salil.sourcing_grid.Service.LineItemServiceLayer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

@RestController

@RequestMapping("/api/line_item")

public class LineItemController {



    @Autowired
    private LineItemServiceLayer lineItemServiceLayer;

    @PostMapping("/line-items")


    public ResponseEntity<LineEntryResponseDTO>CreatelineItem(@RequestBody LineItemRequestDTO lineItemDTO) {

        LineEntryResponseDTO response=lineItemServiceLayer.CreatelineItem(lineItemDTO);

        //response= lineItemServiceLayer.CreatelineItem(lineItemDTO);


        return ResponseEntity.status(HttpStatus.CREATED).body(response);
    }

    @GetMapping("/line-items/{id}")

    public ResponseEntity<LineEntryResponseDTO>getlineItem(@PathVariable long id)
    {
        LineEntryResponseDTO response= lineItemServiceLayer.getByid(id);
        //response= lineItemServiceLayer.getByid(id);
        return ResponseEntity.ok(response);
    }

    @PutMapping("/line-items/{id}")

    public ResponseEntity<LineEntryResponseDTO>updatetheline(@PathVariable long id, @Validated @RequestBody LineItemRequestDTO  lineItemRequestDTO){
        LineEntryResponseDTO response=lineItemServiceLayer.updateLineItem(id,lineItemRequestDTO);
        return ResponseEntity.ok(response);

    }

    @DeleteMapping("/line-items/{id}")

    public ResponseEntity<LineEntryResponseDTO>deletetheline(@PathVariable long id){

        LineEntryResponseDTO response=lineItemServiceLayer.deletebyid(id);
        return ResponseEntity.status(HttpStatus.OK).body(response);
    }
    }

      /* @PostMapping

    public ResponseEntity<String>CreatelineItem(@RequestBody LineItem lineItem) {

        double totalCosts = lineItem.Cost();

        System.out.println("Received LineItem: " + lineItem);

        return ResponseEntity.ok(" Line Item Created. Total Cost: ₹" + totalCosts);

    }

    */


