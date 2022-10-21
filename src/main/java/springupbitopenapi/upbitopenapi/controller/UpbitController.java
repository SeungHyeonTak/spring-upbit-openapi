package springupbitopenapi.upbitopenapi.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class UpbitController {

    @GetMapping("/upbit/market/all")
    public String urlRequest(){
        final String uri = "https://api.upbit.com/v1/market/all";

        RestTemplate restTemplate = new RestTemplate();
        String result = restTemplate.getForObject(uri, String.class);

        System.out.println(result);
        System.out.println(result.getClass().getName());

        return result;
    }
}
