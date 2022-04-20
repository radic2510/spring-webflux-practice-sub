package com.example.webfluxinfoservice.router;

import com.example.webfluxinfoservice.handler.Handler;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.reactive.function.server.RouterFunction;
import org.springframework.web.reactive.function.server.RouterFunctions;
import org.springframework.web.reactive.function.server.ServerResponse;

@Configuration
public class Router {

    @Bean
    public RouterFunction<ServerResponse> jobRouter(Handler handler) {
        return RouterFunctions.route()
                .GET("/job", handler::getJobInfo)
                .build();
    }
}
