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


    @Test
    void salvarAutorELivroTest(){
        Livro livro = new Livro();
        livro.setIsbn("39646-28850");
        livro.setPreco(BigDecimal.valueOf(50));
        livro.setGenero(GeneroLivro.FANTASIA);
        livro.setTitulo("The Two Towers (Lord of the Rings, Part Two)");
        livro.setDataPublicacao(LocalDate.of(1954, 11, 11));

        Autor autor = new Autor();
        autor.setNome("Fulano");
        autor.setNacionalidade("Sul-Africano");
        autor.setDataNascimento(LocalDate.of(1892, 1, 3));

        autorRepository.save(autor);

        livro.setAutor(autor);

        repository.save(livro);
    }


    @Test
    void salvarCascateTest(){
        Livro livro = new Livro();
        livro.setIsbn("95417-04513");
        livro.setPreco(BigDecimal.valueOf(60));
        livro.setGenero(GeneroLivro.FANTASIA);
        livro.setTitulo("Game of Thrones");
        livro.setDataPublicacao(LocalDate.of(1996, 8, 6));

        Autor autor = new Autor();
        autor.setNome("George R. R. Martin");
        autor.setNacionalidade("Americano");
        autor.setDataNascimento(LocalDate.of(1948, 9, 20));

        livro.setAutor(autor);

        repository.save(livro);
    }


    @Test
    void atualizarAutorDoLivro(){
        UUID idLivro = UUID.fromString("f9c8fbb0-a805-4471-a843-d71001bc9460");
        Livro livroParaAtualizar = repository.findById(idLivro).orElse(null);

        if (livroParaAtualizar != null) {
            UUID idAutor = UUID.fromString("7ac08269-bd9c-4144-8151-2829dad1e293");
            Autor tolkien = autorRepository.findById(idAutor).orElse(null);

            livroParaAtualizar.setAutor(tolkien);

            repository.save(livroParaAtualizar);
        } else {
            fail("Livro não encontrado para atualização.");
        }
    }

    @Test
    void deletar(){
        UUID idLivro = UUID.fromString("f9c8fbb0-a805-4471-a843-d71001bc9460");
        repository.deleteById(idLivro);
    }

}