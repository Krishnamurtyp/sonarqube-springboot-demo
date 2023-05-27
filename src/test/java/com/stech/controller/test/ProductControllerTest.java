package com.stech.controller.test;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import com.stech.controller.ProductController;

@ContextConfiguration(classes = {ProductController.class})
@ExtendWith(SpringExtension.class)
class ProductControllerTest {
 
    @Autowired
    public ProductController controller;
     
 
    @Test
     void testGetMessage() {
        String message = controller.getProducts();
        Assertions.assertNotNull(message);
       // System.out.println("Junit Success");
    }
     
}
