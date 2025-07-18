# Filtro de Números Negativos

Este projeto Java permite ao usuário inserir uma quantidade de números e filtra apenas os números negativos para exibição. Demonstra conceitos básicos de programação orientada a objetos, incluindo arrays de objetos, encapsulamento e iteração.

## Como usar

1. Compile os arquivos:
```
javac -d bin src/model/Numeros.java src/app/Main.java
```

2. Execute o programa:
```
java -cp bin app.Main
```

3. Informe a quantidade de números que deseja digitar e em seguida digite cada número quando solicitado.

## Estrutura

* `src/model/Numeros.java`: Classe que encapsula um valor numérico com getter para acesso.
* `src/app/Main.java`: Classe principal que gerencia a entrada de dados e filtragem dos números negativos.

## Exemplo de Uso

```
Quantos números você vai digitar? 6
Digite um número: 8.0
Digite um número: -2.0
Digite um número: 9.0
Digite um número: 10.0
Digite um número: -3.0
Digite um número: -7.0

NÚMEROS NEGATIVOS:
-2.0
-3.0
-7.0
```

## Funcionamento

* **Entrada**: Solicita a quantidade de números e cada valor individual
* **Processamento**: Armazena os números em um array de objetos da classe Numeros
* **Filtro**: Percorre o array e identifica apenas os valores negativos
* **Saída**: Exibe todos os números negativos encontrados

## Notas Técnicas

* O projeto usa `Locale.setDefault(Locale.US)` para padronizar o formato de números
* Utiliza array de objetos para armazenar os valores numéricos
* A classe Numeros encapsula o valor com acesso via getter
* Aceita números decimais (tipo double) para maior flexibilidade