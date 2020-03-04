package com.Sapo.ex05.api;

import com.Sapo.ex05.dto.ProductDTO;
import com.Sapo.ex05.service.impl.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class ProductAPI {
    @Autowired
    ProductService productService;

    @PostMapping(value = "/admin/products")
    public ProductDTO createProduct(@RequestBody ProductDTO model) {
        return productService.save(model);
    }

    @GetMapping(value = "/admin/products/{id}")
    public ProductDTO getProduct(@PathVariable("id") Long id) {
        return productService.findById(id);
    }
    @DeleteMapping(value = "/admin/products/{id}")
    public String deleteProduct(@PathVariable("id") Long id) {
        productService.deleteById(id);
        return "Da xoa";
    }
}


