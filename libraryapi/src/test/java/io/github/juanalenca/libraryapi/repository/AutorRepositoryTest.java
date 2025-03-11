package io.github.juanalenca.libraryapi.repository;

import io.github.juanalenca.libraryapi.model.Autor;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.time.LocalDate;
import java.util.Optional;
import java.util.UUID;

@SpringBootTest
public class AutorRepositoryTest {

    @Autowired
    AutorRepository repository;

    @Test
    public void salvarTest(){
        Autor autor = new Autor();
        autor.setNome("Maria");
        autor.setNacionalidade("Brasileiro");
        autor.setDataNascimento(LocalDate.of(2006, 6, 6));

        var autorSalvo = repository.save(autor);
        System.out.println("Autor Salvo: " + autorSalvo);
    }

    @Test
    public void atualizarTest(){
        var id = UUID.fromString("043cdd57-c293-4df8-b9be-4b130dfd4912");

        Optional<Autor> possivelAutor = repository.findById(id);
        
        if(possivelAutor.isPresent()){
            Autor autorEncontrado = possivelAutor.get();
            System.out.println("Dados do Autor: " + autorEncontrado);

            autorEncontrado.setDataNascimento(LocalDate.of(2000, 3, 3));

            repository.save(autorEncontrado);
        }
    }
}
