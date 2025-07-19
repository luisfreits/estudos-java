# Exemplos Calendar Legacy Java

Este código demonstra o uso das classes Calendar, Date e SimpleDateFormat (API legada anterior ao Java 8) para manipulação e cálculos com data e hora. Implementa exemplos práticos de conversão, formatação, operações aritméticas e extração de componentes para fixação de conteúdo das APIs antigas.

## Como usar

1. Compile o arquivo:
```
javac Main.java
```

2. Execute o programa:
```
java Main
```

3. Observe os exemplos de manipulação com Calendar sendo executados automaticamente.

## Estrutura

* `Main.java`: Classe única que demonstra operações com Calendar, incluindo conversões, cálculos e extração de dados.

## Exemplo de Uso

```
25/06/2018 12:42:07
Minutes: 42
Month: 6
```

## Conceitos Demonstrados

* **Conversão**: Date.from(Instant) para integração entre APIs nova e legada
* **Formatação**: SimpleDateFormat com padrão personalizado "dd/MM/yyyy HH:mm:ss"
* **Manipulação**: Calendar.getInstance() e setTime() para configurar data
* **Cálculos**: Calendar.add() para adicionar 4 horas à data original
* **Extração**: Calendar.get() para obter minutos e mês específicos

## Notas Técnicas

* Utiliza a API Calendar legada (anterior ao Java 8)
* Demonstra integração entre Instant (Java 8+) e Date/Calendar (legado)
* Calendar.MONTH retorna valores 0-11, necessário somar 1 para mês real
* Calendar.add() permite operações aritméticas com diferentes unidades de tempo
* SimpleDateFormat para formatação customizada de saída