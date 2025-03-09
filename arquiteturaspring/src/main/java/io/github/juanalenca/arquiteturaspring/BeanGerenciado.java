package io.github.juanalenca.arquiteturaspring;

import io.github.juanalenca.arquiteturaspring.todos.TodoEntity;
import io.github.juanalenca.arquiteturaspring.todos.TodoValidator;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
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
