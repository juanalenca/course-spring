package io.github.juanalenca.arquiteturaspring.todos;

import org.springframework.stereotype.Component;

@Component
public class MailSender {

    public void send(String mensagem) {
        System.out.println("Enviando email:" + mensagem);
    }

}
