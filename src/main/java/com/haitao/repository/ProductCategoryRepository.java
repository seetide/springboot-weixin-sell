package com.haitao.repository;

import com.haitao.dataobject.ProductCategory;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Component;


public interface ProductCategoryRepository extends JpaRepository<ProductCategory, Integer> {
}
