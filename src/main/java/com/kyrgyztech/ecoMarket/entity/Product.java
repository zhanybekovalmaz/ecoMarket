package com.kyrgyztech.ecoMarket.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "products")
public class Product {
    @SequenceGenerator(
            name = "product_sequence",
            sequenceName = "product_sequence",
            allocationSize = 1
    )
    @Id
    @GeneratedValue(
            strategy = GenerationType.SEQUENCE,
            generator = "product_sequence"
    )
    private Long id;

    private String photo;

    private String name;

    private int price;

    @ManyToOne
    @JoinColumn(name = "category_id")
    private Category category;

    @Transient
    private Long categoryId;

    @ManyToOne
    @JoinColumn(name = "cart_id")
    private Cart cart;

    @Transient
    private Long cartId;

    @OneToOne(cascade = CascadeType.ALL)
    private ProductInfo productInfo;
}

