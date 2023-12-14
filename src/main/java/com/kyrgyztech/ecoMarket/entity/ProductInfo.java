package com.kyrgyztech.ecoMarket.entity;


import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Table(name = "product_info")
public class ProductInfo {

    @SequenceGenerator(
            name = "productInfo_sequence",
            sequenceName = "productInfo_sequence",
            allocationSize = 1
    )
    @Id
    @GeneratedValue(
            strategy = GenerationType.SEQUENCE,
            generator = "productInfo_sequence"
    )
    private Long id;
    @JsonIgnore
    @OneToOne(mappedBy = "productInfo")
    private Product product;

    private String descriptions;
}
