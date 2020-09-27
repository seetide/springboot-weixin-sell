package com.haitao.service.impl;

import com.haitao.SellApplication;
import com.haitao.dataobject.ProductInfo;
import com.haitao.enums.ProductStatusEnum;
import com.haitao.service.ProductService;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.test.context.junit4.SpringRunner;

import java.math.BigDecimal;
import java.util.List;

import static org.junit.Assert.*;
@RunWith(SpringRunner.class)
@SpringBootTest
public class ProductServiceImplTest {

    @Autowired
    private ProductServiceImpl productService;
    @Test
    public void findOne() {
        ProductInfo productInfo = productService.findOne("654321");
        Assert.assertNotNull(productInfo);
    }

    @Test
    public void findUpAll() {
        List<ProductInfo> productInfos = productService.findUpAll();
        Assert.assertEquals(3, productInfos.size());
    }

    @Test
    public void findAll() throws Exception{
        PageRequest request = new PageRequest(0, 2);
        Page<ProductInfo> pages = productService.findAll(request);
        Assert.assertEquals(5, pages.getTotalElements());

    }

    @Test
    public void save() {
        ProductInfo productInfo = new ProductInfo();
        productInfo.setProductId("6543217");
        productInfo.setProductName("皮皮虾");
        productInfo.setProductPrice(new BigDecimal(10));
        productInfo.setProductStock(100);
        productInfo.setProductDescription("有味道");
        productInfo.setProductIcon("http://xxxxx.jpg");
        productInfo.setProductStatus(ProductStatusEnum.DOWN.getCode());
        productInfo.setCategoryType(2);

        productService.save(productInfo);
        Assert.assertNotNull(productInfo);
    }
}