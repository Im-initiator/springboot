package com.ngoclan.service;

import com.ngoclan.entity.ProductEntity;

public interface IProductService {
    ProductEntity save(ProductEntity productEntity,Long userId);
}
