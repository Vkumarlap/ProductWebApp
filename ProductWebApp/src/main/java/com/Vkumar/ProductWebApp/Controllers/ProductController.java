package com.Vkumar.ProductWebApp.Controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.Vkumar.ProductWebApp.Model.Product;
import com.Vkumar.ProductWebApp.Services.ProductServices;

import java.util.List;
@RestController
public class ProductController {
    @Autowired
    ProductServices service; 
    
    @RequestMapping("/getproduct")
    public List<Product> getProduct()
    {
        return service.getProduct();
    }
}
