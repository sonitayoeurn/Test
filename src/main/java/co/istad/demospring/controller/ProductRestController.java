package co.istad.demospring.controller;

import co.istad.demospring.model.Product;
import lombok.Data;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ProductRestController {
//   private Product product;
//   public ProductRestController(@Qualifier("samsung") Product product){
//       this.product = product;
//   }
    private Product product;
    @Autowired
    @Qualifier("samsung")
    public void setProduct(Product product) {
        this.product = product;
    }

    //Mapping URL
    @GetMapping("/products")
    Product getProduct(){
        return product;
    }
}
