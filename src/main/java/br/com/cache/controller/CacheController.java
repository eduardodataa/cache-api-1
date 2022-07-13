package br.com.cache.controller;

import org.springframework.cache.annotation.CacheEvict;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.cache.annotation.EnableCaching;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@EnableCaching
public class CacheController {

	@GetMapping("/hello")
	@Cacheable("hello")
	public String helloWord() {
		System.out.println("Sem cache");
		return "Hello World2";

	}

	@GetMapping("/cancel")
	@CacheEvict("hello")
	public String cancel() {
		System.out.println("Limpando Cache");
		return "Cache Cancelado";

	}
	
}
