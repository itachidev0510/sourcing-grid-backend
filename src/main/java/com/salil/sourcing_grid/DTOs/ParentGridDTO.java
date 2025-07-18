package com.salil.sourcing_grid.DTOs;

import com.salil.sourcing_grid.Modal.GridEntry;
import com.salil.sourcing_grid.Modal.LineItem;
import jakarta.persistence.CascadeType;
import jakarta.persistence.OneToMany;
import lombok.Data;

import java.util.List;

@Data
public class ParentGridDTO {

    private int Id;

    private String GridName;

    private List<LineItemDTO> ItemsDTO;

    private double totalMaterialCost;



}
