package io.github.juanalenca.libraryapi.repository;

import io.github.juanalenca.libraryapi.model.Autor;
import io.github.juanalenca.libraryapi.model.GeneroLivro;
import io.github.juanalenca.libraryapi.model.Livro;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.UUID;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class LivroRepositoryTest {

    @Autowired
    LivroRepository repository;

    @Autowired
    AutorRepository autorRepository;

    @Test
    void salvarTest(){
        Livro livro = new Livro();
        livro.setIsbn("90887-84874");
        livro.setPreco(BigDecimal.valueOf(100));
        livro.setGenero(GeneroLivro.CIENCIA_FICCAO);
        livro.setTitulo("The Martian");
        livro.setDataPublicacao(LocalDate.of(2014, 2, 11));

        Autor autor = autorRepository
                .findById(UUID.fromString("de006325-8688-495e-9cc1-a92cab6a55e1"))
                .orElse(null);

        livro.setAutor(autor);

        repository.save(livro);
    }

}