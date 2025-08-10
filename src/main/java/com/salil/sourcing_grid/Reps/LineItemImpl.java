package com.salil.sourcing_grid.Reps;

import com.salil.sourcing_grid.Modal.LineItem;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface LineItemImpl extends JpaRepository<LineItem,Long> {


}
