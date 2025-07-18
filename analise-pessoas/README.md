# Sistema de Análise de Pessoas

Este projeto Java permite cadastrar dados de pessoas (nome, idade e altura) e calcula a altura média, percentual de menores de 16 anos e lista seus nomes. Demonstra conceitos de programação orientada a objetos, incluindo encapsulamento, arrays de objetos e cálculos estatísticos.

## Como usar

1. Compile os arquivos:
```
javac -d bin src/model/Pessoas.java src/app/Main.java
```

2. Execute o programa:
```
java -cp bin app.Main
```

3. Informe a quantidade de pessoas e digite os dados solicitados para cada pessoa (nome, idade e altura).

## Estrutura

* `src/model/Pessoas.java`: Classe que representa uma pessoa com atributos nome, idade e altura.
* `src/app/Main.java`: Classe principal que gerencia entrada de dados e cálculos estatísticos.

## Exemplo de Uso

```
Quantas pessoas serão digitadas? 3

Dados da 1a pessoa:
Nome: João
Idade: 14
Altura: 1.65

Dados da 2a pessoa:
Nome: Maria
Idade: 20
Altura: 1.70

Dados da 3a pessoa:
Nome: Pedro
Idade: 15
Altura: 1.60

Altura média: 1.65
Pessoas com menos de 16 anos: 66.67%
João
Pedro
```

## Funcionalidades

* **Cadastro**: Registra nome, idade e altura de cada pessoa
* **Altura média**: Calcula e exibe a média das alturas cadastradas
* **Percentual**: Calcula percentual de pessoas com menos de 16 anos
* **Lista**: Exibe nomes das pessoas menores de 16 anos

## Notas Técnicas

* O projeto usa `Locale.setDefault(Locale.US)` para padronizar o formato de números
* Utiliza array de objetos da classe Pessoas para armazenar os dados
* A classe Pessoas possui getters e setters para todos os atributos
* Cálculos exibidos com 2 casas decimais para melhor apresentação