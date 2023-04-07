package co.istad.demospring.config;

//spring configuration class

import co.istad.demospring.model.Product;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

@Configuration
public class ProductConfig {
    //create bean configuration class
    @Bean("iPhone")
    public Product iPhone(){
        Product product = new Product();
        product.setModel("iPhone");
        return product;
    }
    @Bean("samsung")
    @Primary
    public Product samsung(){
        Product product = new Product();
        product.setModel("samsung");
        return product;
    }

}
