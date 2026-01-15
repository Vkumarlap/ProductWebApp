package com.Vkumar.ProductWebApp.Controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.Vkumar.ProductWebApp.Model.Product;
import com.Vkumar.ProductWebApp.Services.ProductServices;

import java.util.List;
@RestController
public class ProductController {
    @Autowired
    ProductServices service; 
    
    @GetMapping("/getproduct")
    public List<Product> getProducts()
    {
        return service.getProducts();
    }
    @GetMapping("/getproduct/{Pid}")
    public Product geProductById(@PathVariable int Pid)
    {
        return service.getProductById(Pid);
    }
    @PostMapping("/getproduct")
    public void addProduct(@RequestBody Product product){
        service.addProduct(product);

    }

}
