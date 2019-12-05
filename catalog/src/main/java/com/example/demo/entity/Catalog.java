package com.example.demo.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.Set;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name="JPCATALOG")
public class Catalog {

    @Id
    private int catalogId;
    private String catalogName;

    @OneToMany( cascade = CascadeType.ALL)
    @JoinColumn(name="catalogId", nullable = false)
    private Set<Product> itemList;

}
