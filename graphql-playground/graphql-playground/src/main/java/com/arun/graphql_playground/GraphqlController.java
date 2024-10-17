package com.arun.graphql_playground;

import org.springframework.graphql.data.method.annotation.Argument;
import org.springframework.graphql.data.method.annotation.QueryMapping;
import org.springframework.stereotype.Controller;
import reactor.core.publisher.Mono;

@Controller
public class GraphqlController {

    @QueryMapping("sayHello")
    public Mono<String> sayHello(){
        return Mono.just("Hello");
    }

    @QueryMapping("sayHelloTo")
    public Mono<String> sayHelloTo(@Argument String name){
        return Mono.fromSupplier(()->"Hello "+name);
        //return Mono.just("Hello "+name);
    }

}
