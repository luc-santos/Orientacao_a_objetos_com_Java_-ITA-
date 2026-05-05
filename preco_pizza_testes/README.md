# Pizzaria JUnit

Projeto Java com Maven contendo as classes `Pizza` e `CarrinhoDeCompras`, além dos testes unitários com JUnit 5.

## Estrutura

```text
pizzaria-junit/
├── pom.xml
└── src/
    ├── main/
    │   └── java/
    │       ├── Pizza.java
    │       └── CarrinhoDeCompras.java
    └── test/
        └── java/
            ├── PizzaTest.java
            └── CarrinhoDeComprasTest.java
```

## Como rodar os testes

Na raiz do projeto, execute:

```bash
mvn test
```

## O que os testes verificam

- Preço da pizza com até 2 ingredientes.
- Preço da pizza com 3 a 5 ingredientes.
- Preço da pizza com mais de 5 ingredientes.
- Registro de ingrediente adicionado.
- Registro do mesmo ingrediente em pizzas diferentes.
- Soma dos valores no carrinho.
- Bloqueio de pizza sem ingredientes no carrinho.
