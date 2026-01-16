package com.Vkumar.ProductWebApp.Controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
// import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.Vkumar.ProductWebApp.Model.Product;
import com.Vkumar.ProductWebApp.Services.ProductServices;

import java.util.List;
@RestController
public class ProductController {
    @Autowired
    ProductServices service; 
    
    @GetMapping("/getproduct")
    public List<Product> getProducts(){return service.getProducts();}

    
    @GetMapping("/getproduct/{Pid}") // getting product by id
    public Product getProductById(@PathVariable int Pid)      {return service.getProductById(Pid);}

    @PostMapping("/getproduct") // adding product
    public void addProduct(@RequestBody Product product)      {service.addProduct(product);}

    @PutMapping("/getproduct")
    public void UpDateProduct(@RequestBody Product product)   {service.UpDateProduct(product);}

    @DeleteMapping("/getproduct/{productid}")
    public void deleteProduct(@PathVariable int productid)    {service.deleteProduct(productid);}

}
