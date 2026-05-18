# Autoridade Formatador Nome

Projeto Java criado para o exercício de encapsulamento, acoplamento entre classes e interfaces.

## O que foi implementado

- Interface `FormatadorNome`
  - método `String formatarNome(String nome, String sobrenome)`
- Classe `Autoridade`
  - atributos `nome`, `sobrenome` e uma instância de `FormatadorNome`
  - método `getTratamento()` delegando a formatação para o `FormatadorNome`
- Implementações de `FormatadorNome`
  - `Informal`: retorna somente o primeiro nome
  - `Respeitoso`: recebe no construtor se é masculino ou feminino e retorna `Sr.` ou `Sra.` seguido do sobrenome
  - `ComTitulo`: recebe o título no construtor e retorna título + nome + sobrenome
- Testes unitários com JUnit 5 para a classe `Autoridade` usando cada implementação

## Como rodar os testes

```bash
mvn test
```
