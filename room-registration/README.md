# Room Registration Manager

Este projeto Java implementa um sistema de aluguel de quartos que permite registrar hóspedes em quartos específicos de uma pensão com 10 quartos disponíveis. Demonstra conceitos de programação orientada a objetos, incluindo arrays de objetos, encapsulamento e formatação de saída.

## Como usar

1. Compile os arquivos:
```
javac -d bin src/model/RoomManager.java src/app/Main.java
```

2. Execute o programa:
```
java -cp bin app.Main
```

3. Informe quantos quartos serão alugados e em seguida forneça os dados de cada hóspede (nome, email e número do quarto).

## Estrutura

* `src/model/RoomManager.java`: Classe que representa um registro de aluguel com dados do hóspede e número do quarto.
* `src/app/Main.java`: Classe principal que gerencia o cadastro de hóspedes e exibição dos quartos ocupados.

## Exemplo de Uso

```
How many rooms will be rented? 2

Rent #1:
Name: Maria Green
Email: maria@gmail.com
Room: 5

Rent #2:
Name: Marco Antonio
Email: marco@gmail.com
Room: 1

Busy rooms:
1: Marco Antonio, marco@gmail.com
5: Maria Green, maria@gmail.com
```

## Funcionamento

* **Capacidade**: Sistema para pensão com 10 quartos (índices 0-9)
* **Cadastro**: Registra nome, email e número do quarto escolhido pelo hóspede
* **Armazenamento**: Utiliza array onde cada posição representa um quarto
* **Exibição**: Mostra apenas os quartos ocupados em ordem numérica

## Notas Técnicas

* O projeto usa `Locale.setDefault(Locale.US)` para padronizar o formato de entrada
* Array de 10 posições representa os quartos disponíveis (0-9)
* Quartos não ocupados permanecem como `null` no array
* A classe RoomManager sobrescreve `toString()` para formatação personalizada da saída