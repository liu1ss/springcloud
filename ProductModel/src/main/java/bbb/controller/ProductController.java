package bbb.controller;

import bbb.service.ProductService;
import com.aaa.entity.Product;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;
//注解方式@FeignClient("Product")
@RestController
public class ProductController {
    @Resource
    private ProductService productService;
    @RequestMapping("finds")
    public List<Product> find()
    {
      return   productService.findAll();

    }
}
