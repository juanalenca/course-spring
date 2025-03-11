package io.github.juanalenca.libraryapi;

import io.github.juanalenca.libraryapi.model.Autor;
import io.github.juanalenca.libraryapi.repository.AutorRepository;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.time.LocalDate;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		var context = SpringApplication.run(Application.class, args);
		AutorRepository repository = context.getBean(AutorRepository.class);
		exemploSalvarRegistro(repository);
	}

	public static void exemploSalvarRegistro(AutorRepository autorRepository){
		Autor autor = new Autor();
		autor.setNome("Juan Alencar de Barros");
		autor.setNacionalidade("Brasileiro");
		autor.setDataNascimento(LocalDate.of(2005, 1, 24));

		var autorSalvo = autorRepository.save(autor);
		System.out.println("Autor Salvo: " + autorSalvo);
	}

}
