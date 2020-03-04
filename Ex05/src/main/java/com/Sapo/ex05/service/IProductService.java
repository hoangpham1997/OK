package com.Sapo.ex05.service;

import com.Sapo.ex05.dto.ProductDTO;

public interface IProductService {
    ProductDTO save(ProductDTO productDTO);//api post
    ProductDTO findById(Long id);////get by id
    void deleteById(Long id);
}
