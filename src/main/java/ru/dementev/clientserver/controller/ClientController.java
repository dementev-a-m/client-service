package ru.dementev.clientserver.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import ru.dementev.clientserver.entity.Client;

@RestController
public class ClientController {

    @Value("${hello-world:Hello World}")
    private String helloWorld;

    @RequestMapping("/client")
    public Client clientById(@RequestBody Long id){

        return Client.builder().id(1L).firstName("Тест").build();
    }

    @RequestMapping("/hello-world")
    public String helloWorld(){

        return helloWorld;
    }

}
