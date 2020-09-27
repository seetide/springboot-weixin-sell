package com.haitao.service;

import com.haitao.dataobject.ProductCategory;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public interface CategoryService {

    ProductCategory findOne(Integer categoryId);

    List<ProductCategory> findAll();

    List<ProductCategory> findByCategoryTypeIn(List<Integer> categoryTypeList);

    ProductCategory save(ProductCategory productCategory);



}
