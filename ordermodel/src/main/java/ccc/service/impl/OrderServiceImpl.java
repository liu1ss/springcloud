//package ccc.service.impl;
//
//import ccc.service.OrderService;
//import com.aaa.entity.Product;
//
//import org.springframework.stereotype.Service;
//import org.springframework.web.client.RestTemplate;
//
//import javax.annotation.Resource;
//import java.util.List;
//@Service
//public class OrderServiceImpl implements OrderService {
//    @Resource
//    private RestTemplate restTemplate;
//    @Override
//    public List<Product> getAllProduct() {
//
//        //                                                     微服务的名字
//        List<Product> productList=restTemplate.getForObject("http://localhost:8472/finds",List.class);
//
//
//        return productList;
//    }
//}
