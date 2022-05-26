package com.spring.crud.reactiveclient.runner;

import com.spring.crud.reactiveclient.model.Invoice;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;
import org.springframework.web.reactive.function.client.WebClient;
import reactor.core.publisher.Flux;

@Component
public class GetAllInvoicesRunner implements CommandLineRunner {
    @Override
    public void run(String... args) {
        WebClient client = WebClient.create("http://localhost:8080");
        Flux<Invoice> flux= client
                .get()
                .uri("/invoice/allInvoices")
                .retrieve()
                .bodyToFlux(Invoice.class);
        flux.doOnNext(System.out::println).blockLast();
    }
}
