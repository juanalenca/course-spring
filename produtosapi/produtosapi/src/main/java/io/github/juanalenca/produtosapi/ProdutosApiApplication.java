package io.github.juanalenca.produtosapi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ProdutosApiApplication {

	/*serve para mapear o retorno deste método para um chamada Get
	@GetMapping("/hello-world")
	public String helloWorld(){
		return "Hello, World!";
	}*/

	public static void main(String[] args) {
		SpringApplication.run(ProdutosApiApplication.class, args);
		
	}

}
