package com.Vkumar.ProductWebApp.Services;
//import java.util.ArrayList;

import java.util.*;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.Vkumar.ProductWebApp.Model.Product;
import com.Vkumar.ProductWebApp.Repository.ProductRepo;


@Service
public class ProductServices {

    // List<Product> products=new ArrayList<>(Arrays.asList(new Product(101,300,"light"),new Product(102,500,"charger")));
    @Autowired
    ProductRepo productRepo;

public List<Product> getProducts()          {return productRepo.findAll();}

public Product getProductById(int Pid)      {return productRepo.findById(Pid).orElse(new Product(Pid, Pid, null));}

public void addProduct(Product product)     {productRepo.save(product);}

public void UpDateProduct(Product product)  {productRepo.save(product);}

public void deleteProduct(int productid)    {productRepo.deleteById(productid);}

}
