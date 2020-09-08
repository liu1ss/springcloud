package ccc.service;

import com.aaa.entity.Product;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@FeignClient("Product")
public interface OrderService {
    @RequestMapping("finds")
    List<Product> getAllProduct();
}
