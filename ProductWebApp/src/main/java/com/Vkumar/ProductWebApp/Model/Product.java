package com.Vkumar.ProductWebApp.Model;

// import javax.swing.Spring;
// import org.springframework.boot.webmvc.autoconfigure.WebMvcProperties.Apiversion.Use;

import org.springframework.stereotype.Component;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Component
@Entity
public class Product {
    @Id
    private int Price;
    private String Pname;
    private int Pid;

   Product(){

   } 
   
public Product(int Pid ,int Price,String Pname)
{
    this.Price=Price;
    this.Pid=Pid;
    this.Pname=Pname;
}




// Frameworks like:
// Spring Framework
// Use getters/setters to:
// Convert objects to JSON
// Bind request data
// Map database columns

// Without getters/setters:
// JSON may not serialize
//  ORM may fail
public int getPid() {
    return Pid;
}
public void setPid(int Pid) {
    this.Pid = Pid;
}

public void setPrice(int Price) {
    this.Price = Price;
}
public int getPrice() {
    return Price;
}

public String getPname() {
    return Pname;
}
public void setPname(String Pname) {
    this.Pname = Pname;
}



    
}
