package com.ngoclan.service.impl;

import com.ngoclan.entity.ProductEntity;
import com.ngoclan.entity.UserEntity;
import com.ngoclan.repository.ProductRepository;
import com.ngoclan.repository.UserRepository;
import com.ngoclan.service.IProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProductService implements IProductService {

    @Autowired
    private ProductRepository productRepository;

    @Autowired
    private UserRepository userRepository;

    @Override
    public ProductEntity save(ProductEntity productEntity,Long userId) {
        UserEntity userEntity = userRepository.findOneById(userId);
        productEntity.setUsers(userEntity);
        return productRepository.save(productEntity);
    }
}
