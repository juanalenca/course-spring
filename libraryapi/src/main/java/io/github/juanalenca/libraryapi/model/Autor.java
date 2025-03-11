package io.github.juanalenca.libraryapi.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.time.LocalDate;
import java.util.List;
import java.util.UUID;

@Entity
@Table(name = "autor", schema = "public") //tem que ser exatamente o mesmo nome que está no banco
@Getter //essas duas anotação geram, em tempo de compilação, os getters e setters
@Setter
@ToString
public class Autor {
    @Id
    @Column(name = "id") //tem que ser exatamente o mesmo que está no banco
    @GeneratedValue(strategy = GenerationType.UUID) //gera o valor automaticamente
    private UUID id;

    @Column(name = "nome", length = 100, nullable = false)
    private String nome;

    @Column(name = "data_nascimento", nullable = false)
    private LocalDate dataNascimento;

    @Column(name = "nacionalidade", length = 50, nullable = false)
    private String nacionalidade;

    @OneToMany(mappedBy = "autor")
    private List<Livro> livros;
}
