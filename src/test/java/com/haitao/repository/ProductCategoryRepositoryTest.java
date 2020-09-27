package com.haitao.repository;

import com.haitao.dataobject.ProductCategory;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class ProductCategoryRepositoryTest {

    @Autowired
    private ProductCategoryRepository repository;

    @Test
    public void findOneTest() {
        ProductCategory category = (repository.findOne(1));
        System.out.println(category.toString());
    }

    @Test
    public void saveTest() {
        ProductCategory productCategory = repository.findOne(3);
        productCategory.setCategoryType(13);


        repository.save(productCategory);
    }
}