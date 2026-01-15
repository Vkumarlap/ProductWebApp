package com.Vkumar.ProductWebApp.Services;
import java.util.ArrayList;

import java.util.*;
import org.springframework.stereotype.Service;
import com.Vkumar.ProductWebApp.Model.Product;


@Service
public class ProductServices {

    List<Product> products=new ArrayList<>(Arrays.asList(new Product(101,300,"light"),new Product(102,500,"charger")));
    
public List<Product> getProducts(){

   return products;
}

public Product getProductById(int Pid)
{  

    return products.stream()
    .filter(p-> p.getPid()==Pid)
    .findFirst().get();
}

public void addProduct(Product product)
{
     products.add(product);
}

}
