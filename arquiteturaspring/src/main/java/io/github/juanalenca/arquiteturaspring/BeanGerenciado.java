package io.github.juanalenca.arquiteturaspring;

import io.github.juanalenca.arquiteturaspring.todos.TodoEntity;
import io.github.juanalenca.arquiteturaspring.todos.TodoValidator;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

/*
 * Escopo Singleton - Padrão do Spring:
 * O padrão Singleton garante que apenas uma única instância do objeto seja criada e compartilhada
 * por toda a aplicação. Esse padrão é útil quando se deseja manter um estado global ou evitar
 * a criação desnecessária de múltiplas instâncias do mesmo objeto.
 *
 * Outros escopos disponíveis no Spring:
 * - request: Criado e utilizado apenas durante o ciclo de vida de uma única requisição HTTP.
 * - session: Atrelado à sessão do usuário, permanecendo ativo enquanto a sessão existir.
 * - application: Compartilhado em toda a aplicação, similar ao singleton, mas gerenciado de forma diferente.
 */
@Component
@Scope("singleton")
public class BeanGerenciado {

    //injeção via propriedada sem precisar de um construtor
    //Menos recomendado - não é obrigatorio nem opcional e a instancia não pode ser mudada
    @Autowired
    private TodoValidator validator;

    //injeção via constructor (mais recomendado - obrigatoriedade)
    @Autowired
    public BeanGerenciado(TodoValidator validator) {
        this.validator = validator;
    }

    public void utilizar(){
        var todo = new TodoEntity();
        validator.validar(todo);
    }

    //injeção via setter (opcional)
    @Autowired
    public void setValidator(TodoValidator validator){
        this.validator = validator;
    }

}
