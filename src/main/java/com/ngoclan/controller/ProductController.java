package com.ngoclan.controller;

import com.ngoclan.entity.ProductEntity;
import com.ngoclan.service.IProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
public class ProductController {

    @Autowired
    private IProductService productService;


    @PostMapping("/{id}/product")
    public ResponseEntity<ProductEntity> save(@RequestBody ProductEntity productEntity,@PathVariable("id") Long id){
        ProductEntity product =  productService.save(productEntity,id);
        return ResponseEntity.ok(product);
    }

}
