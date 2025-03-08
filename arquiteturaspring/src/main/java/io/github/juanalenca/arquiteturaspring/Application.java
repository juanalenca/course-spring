package io.github.juanalenca.arquiteturaspring;

import org.springframework.boot.Banner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		//SpringApplication.run(Application.class, args);

		SpringApplicationBuilder biulder = new SpringApplicationBuilder(Application.class);
		biulder.bannerMode(Banner.Mode.OFF); //Tira o banner do spring
		biulder.profiles("producao");

		biulder.run(args);

		//COntexot da aplicação já iniciada:
		ConfigurableApplicationContext applicationContext = biulder.context();
//		var produtoRepository = applicationContext.getBean("produtoRepository");
	}

}
