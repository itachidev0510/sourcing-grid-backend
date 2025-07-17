package com.salil.sourcing_grid.Reps;

import com.salil.sourcing_grid.Modal.Parentgrid;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ParentGridImp extends JpaRepository<Parentgrid,Long> {
}
