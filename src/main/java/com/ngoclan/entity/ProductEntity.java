package com.ngoclan.entity;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Table(name = "tb_product")
@Data
public class ProductEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column
    private String name;
    @Column
    private String thumbnail;

    @ManyToOne(fetch = FetchType.LAZY)
    private UserEntity users;
}
