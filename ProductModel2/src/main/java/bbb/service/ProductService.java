package bbb.service;

import com.aaa.entity.Product;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ProductService {
    public List<Product> findAll()
    {

        List<Product> p1=new ArrayList<Product>();
        Product p=new Product();
        p.setPid(1);
        p.setPname("文博");
        p.setPrice(12.1);
        p.setKc(1);
        p1.add(p);
     return p1;
    }
}
