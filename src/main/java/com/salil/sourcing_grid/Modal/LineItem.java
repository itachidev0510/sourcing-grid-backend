package com.salil.sourcing_grid.Modal;

import com.salil.sourcing_grid.DTOs.GridEntryRequst;
import jakarta.persistence.*;

import java.util.List;
@Entity
public class LineItem {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private String NameOfLineItem;
    @ManyToOne
    @JoinColumn(name = "parent_id")
    private Parentgrid parentgrid;

    @OneToMany(mappedBy = "lineItem", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<GridEntry> listofcategory;

    public void setListofcategory(List<GridEntry> listofcategory) {
        this.listofcategory = listofcategory;
    }

    public List<GridEntry> getListofcategory() {
        return listofcategory;
    }

    /*
         will have logic service layer
            public double totalCost(){

                double total=0;

                if (listofcategory == null) return 0;
                return listofcategory.stream()
                        .mapToDouble(Category::costCalculation)
                        .sum();
            }
        */
    public void setId(int id) {
        this.id = id;
    }

    public void setParentgrid(Parentgrid parentgrid) {
        this.parentgrid = parentgrid;
    }

    public int getId() {
        return id;
    }

    public Parentgrid getParentgrid() {
        return parentgrid;
    }


    public void setNameOfLineItem(String nameOfLineItem) {
        NameOfLineItem = nameOfLineItem;
    }

    public String getNameOfLineItem() {
        return NameOfLineItem;
    }
}
