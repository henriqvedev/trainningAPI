package com.basico.springzando.Service;


import org.springframework.stereotype.Service;

@Service   //indica pro spring  que  é uma classe de serviço, depois qualquer outra classe que pedir instanccia dessa, o spring vai injetar a dependencia la pra nos
public class HelloWorldService {
    public String helloService( String name){
        return "Hello Service" + name;

    }
}
