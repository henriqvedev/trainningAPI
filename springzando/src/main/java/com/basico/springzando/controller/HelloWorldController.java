package com.basico.springzando.controller;


import com.basico.springzando.Service.HelloWorldService;
import com.basico.springzando.domain.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.StreamingHttpOutputMessage;
import org.springframework.web.bind.annotation.*;

@RestController      //indica que a classe é um controller REST
@RequestMapping("/HelloWorld")     //endpoint, classe que vai ta ouvindo/recebendo as requisiçoes e respondendo elas
public class HelloWorldController {   //classe indentificada como controller para que ela receba reuisiçoes e repostas http

    @Autowired
    private HelloWorldService helloWorldService;


    @GetMapping //faz nosso metodo escutar o endpoint http /helloworld no metodo GET
    public String helloWorld() {
        return helloWorldService.helloService("Henrique");
    }
    @PostMapping("")
    public String helloWorldPost(@RequestBody User body){ //O @RequestBody vai injetar no parâmetro ao lado dele (User) o que o Spring receber no body da requisição
        return "Hello Post" + body.getName() + body.getId();
    }
}

