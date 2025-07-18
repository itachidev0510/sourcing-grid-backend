package com.salil.sourcing_grid.DTOs;

import com.salil.sourcing_grid.Modal.LineItem;
import com.salil.sourcing_grid.Modal.Parentgrid;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import lombok.Data;

@Data
public class GridEntryDTO {

    private int id;

    private String gridName;

    private String costComponentName; // e.g., "Steel", "Aluminum"

    private Double quantity;
    private Double rate;

    private Double cost;

}
