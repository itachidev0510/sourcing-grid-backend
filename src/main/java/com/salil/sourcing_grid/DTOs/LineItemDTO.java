package com.salil.sourcing_grid.DTOs;

import com.salil.sourcing_grid.Modal.GridEntry;
import com.salil.sourcing_grid.Modal.Parentgrid;
import jakarta.persistence.CascadeType;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import lombok.Data;

import java.util.List;

@Data
public class LineItemDTO {

    private int id;

    private String NameOfLineItem;

    private List<GridEntryDTO> listofcategoryDTO;


}
