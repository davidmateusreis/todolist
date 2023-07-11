<h1 align="center">
  To Do List
</h1>

API para gerenciar tarefas (CRUD) que faz parte [desse desafio](https://github.com/simplify-liferay/desafio-junior-backend-simplify) para pessoas desenvolvedoras backend júnior que se candidatam para a Simplify.

## Tecnologias
 
- [Spring Boot](https://spring.io/projects/spring-boot)
- [Spring MVC](https://docs.spring.io/spring-framework/reference/web/webmvc.html)
- [Spring Data JPA](https://spring.io/projects/spring-data-jpa)
- [SpringDoc OpenAPI 3](https://springdoc.org/v2/#spring-webflux-support)
- [MySQL](https://dev.mysql.com/downloads/)

## Práticas adotadas

- SOLID, DRY, KISS, YAGNI
- API REST
- Consultas com Spring Data JPA
- Injeção de Dependências
- Geração automática do Swagger com a OpenAPI 3

## Como Executar

- Clonar repositório git
- Construir o projeto:
```
$ ./mvnw clean package
```
- Executar a aplicação:
```
$ java -jar target/todolist-0.0.1-SNAPSHOT.jar
```

A API poderá ser acessada em [localhost:8080](http://localhost:8080).
O Swagger poderá ser visualizado em [localhost:8080/swagger-ui.html](http://localhost:8080/swagger-ui.html)

## API Endpoints

Para fazer as requisições HTTP abaixo, foi utilizada a ferramenta [httpie](https://httpie.io):

- Criar Tarefa 
```
$ http POST :8080/todos nome="Study" descrição="Study" prioridade=1 realizado=true

[
  {
    "descricao": "Study",
    "id": 1,
    "nome": "Study",
    "prioridade": 1,
    "realizado": true
  }
]
```

- Listar Tarefas
```
$ http GET :8080/todos

[
  {
    "descricao": "Study",
    "id": 1,
    "nome": "Study",
    "prioridade": 1,
    "realizado": true
  }
]
```

- Atualizar Tarefa
```
$ http PUT :8080/todos id=1 nome="Study" descrição="Study" prioridade=2 realizado=true

[
  {
    "descricao": "Study",
    "id": 1,
    "nome": "Study",
    "prioridade": 2,
    "realizado": true
  }
]
```

- Remover Tarefa
```
http DELETE :8080/todos/1

[ ]
```