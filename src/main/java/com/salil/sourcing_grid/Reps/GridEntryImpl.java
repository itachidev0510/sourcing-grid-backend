package com.salil.sourcing_grid.Reps;

import com.salil.sourcing_grid.Modal.GridEntry;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface GridEntryImpl extends JpaRepository<GridEntry,Integer> {
}
