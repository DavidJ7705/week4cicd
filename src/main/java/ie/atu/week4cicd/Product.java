package ie.atu.week4cicd;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data //gets and sets
@AllArgsConstructor //all construc
@NoArgsConstructor // default constr
public class Product {
    private String id;
    private String name;
    private String category;
    private double price;
}
