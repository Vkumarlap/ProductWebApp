package com.Vkumar.ProductWebApp.Services;
import java.util.Arrays;
import java.util.List;
import org.springframework.stereotype.Service;
import com.Vkumar.ProductWebApp.Model.Product;


@Service
public class ProductServices {

    List<Product> products=Arrays.asList(new Product(101,300,"light"),new Product(102,500,"charger"));
    
public List<Product> getProduct(){

   return products;
}

}
