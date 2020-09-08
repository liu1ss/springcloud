package ccc.controller;

import ccc.service.OrderService;
import com.aaa.entity.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;


@RestController
public class orederController {
    private int i=0;
    @Autowired
    private OrderService orderService;
    @RequestMapping("orderfinds")
    public List<Product> orederTest()
    {

        return  orderService.getAllProduct();
    }
    @RequestMapping("test1")
    public String test1()
    {

        return "test1";

    }
    @RequestMapping("test2")
    public String test2()
    {
        return "test1";
    }
}
