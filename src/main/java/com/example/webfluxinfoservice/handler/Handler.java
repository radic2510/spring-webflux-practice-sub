package com.example.webfluxinfoservice.handler;

import com.example.webfluxinfoservice.model.Job;
import java.util.Optional;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Component;
import org.springframework.web.reactive.function.server.ServerRequest;
import org.springframework.web.reactive.function.server.ServerResponse;
import reactor.core.publisher.Mono;

@Component
public class Handler {

    public Mono<ServerResponse> getJobInfo(ServerRequest request) {

        Optional<String> query = request.queryParam("name");

        if (query.isPresent()) {
            String userJob = "Developer";
            Job jobInfo = new Job(userJob);

            return ServerResponse
                    .ok()
                    .contentType(MediaType.APPLICATION_JSON)
                    .bodyValue(jobInfo);
        }

        return ServerResponse.ok().build();
    }

}
