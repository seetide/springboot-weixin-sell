package com.haitao.repository;

import com.haitao.dataobject.ProductCategory;
import com.haitao.dataobject.ProductInfo;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.math.BigDecimal;
import java.util.List;

import static org.junit.Assert.*;

@RunWith(SpringRunner.class)
@SpringBootTest
public class ProductInfoRepositoryTest {

    @Autowired
    private ProductInfoRepository repository;

    @Test
    public void saveTest() {
        ProductInfo productInfo = new ProductInfo();
        productInfo.setProductId("654321");
        productInfo.setProductName("羊蝎子");
        productInfo.setProductPrice(new BigDecimal(30));
        productInfo.setProductStock(100);
        productInfo.setProductDescription("有味道");
        productInfo.setProductIcon("http://xxxxx.jpg");
        productInfo.setProductStatus(0);
        productInfo.setCategoryType(2);

        repository.save(productInfo);
        Assert.assertNotNull(productInfo);
    }
    @Test
    public void findByProductStatus() {
        List<ProductInfo> productInfoList = repository.findByProductStatus(0);

        Assert.assertNotEquals(0, productInfoList);
    }
}