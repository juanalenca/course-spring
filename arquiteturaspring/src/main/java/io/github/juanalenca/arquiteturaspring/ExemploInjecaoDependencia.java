package io.github.juanalenca.arquiteturaspring;

import io.github.juanalenca.arquiteturaspring.todos.*;
import jakarta.persistence.EntityManager;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

import javax.sql.DataSource;

public class ExemploInjecaoDependencia {
    public static void main(String[] args) throws Exception {
//        DataSource dataSource = new DriverManagerDataSource();
//        dataSource.setUrl("url");
//        dataSource.setUsername("root");
//        dataSource.SetPassword("123456");
//
//        Connection connection = dataSource.getConnection();
//
//        EntityManager entityManager = null;
//
//        TodoRepository repository = null; //new SimpleJavaRepository<TodoEntity, Integer>(null, null);
//        TodoValidator todoValidator = new TodoValidator(repository);
//        MailSender sender = new MailSender();
//
//        TodoService todoService = new TodoService(repository, todoValidator, sender);
    }
}
