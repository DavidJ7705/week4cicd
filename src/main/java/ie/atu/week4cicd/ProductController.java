package ie.atu.week4cicd;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("product")
public class ProductController {
    private List<Product> productList = new ArrayList<>();
    public ProductController() {
        productList.add(new Product("100","Tv", "Electric ", 349));
        productList.add(new Product("101","Radio", "Electric ", 99));

    }

    @GetMapping("/getProducts")
    public List<Product> getProduct()
    {
        return productList;
    }

}
