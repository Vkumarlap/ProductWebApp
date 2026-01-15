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

public void UpDateProduct(Product product)
{
    int index =0;
    for(int i=0;i<products.size();i++)
        if(products.get(i).getPid()==product.getPid())
            index=i;

    products.set(index,product);
}

public void deleteProduct(int productid)
{
    int index=0;
    for(int i=0;i<products.size();i++)
    if(products.get(i).getPid()==(productid))
        index=i;
    products.remove(index);

}

}
