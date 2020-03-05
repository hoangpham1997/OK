package com.Sapo.ex05.service.impl;

import com.Sapo.ex05.Entity.CategoryEntity;
import com.Sapo.ex05.Entity.ProductEntity;
import com.Sapo.ex05.Repository.CategoryRepository;
import com.Sapo.ex05.Repository.ProductRepository;
import com.Sapo.ex05.config.MapperConfig;
import com.Sapo.ex05.dto.ProductDTO;
import com.Sapo.ex05.service.IProductService;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductService implements IProductService {
    @Autowired
    ProductRepository productRepository;
    @Autowired
    CategoryRepository categoryRepository;
    @Autowired
    ModelMapper modelMapper;
    @Override
    public ProductDTO save(ProductDTO productDTO) {
        ProductEntity productEntity = modelMapper.map(productDTO,ProductEntity.class);
        CategoryEntity categoryEntity = categoryRepository.getOne(productDTO.getCategoryId());
        productEntity.setCategoryEntity(categoryEntity);
        productRepository.save(productEntity);
        return productDTO;
    }

    @Override
    public ProductDTO findById(Long id) {
        ProductEntity productEntity = productRepository.findById(id).get();
        ProductDTO productDTO1 = modelMapper.map(productEntity,ProductDTO.class);
        return productDTO1;
    }

    @Override
    public void deleteById(Long id) {
        //ProductEntity productEntity = productRepository.findById(id).get();
        productRepository.deleteById(id);
    }


}
