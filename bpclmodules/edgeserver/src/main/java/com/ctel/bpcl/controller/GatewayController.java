package com.ctel.bpcl.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import reactor.core.publisher.Mono;

@RestController
public class GatewayController {

	@GetMapping("/fallback")
	public Mono<String> fallback() {
		return Mono.just("API is taking too long to respond or is down. Please try again later");
	}

	@GetMapping("health")
	public Mono<String> status() {
		return Mono.just("UP");
	}

	@GetMapping
	public Mono<String> home() {
		return Mono.just("Hello World!!!");
	}

}