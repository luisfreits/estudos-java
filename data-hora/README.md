# Exemplos Práticos de DateTime

Este código demonstra as principais operações com data e hora usando a API Java Time (Java 8+). Implementa exemplos práticos de instanciação, formatação, conversão, extração de dados e cálculos com LocalDate, LocalDateTime e Instant para fixação de conteúdo.

## Como usar

1. Compile o arquivo:
```
javac Main.java
```

2. Execute o programa:
```
java Main
```

3. Observe os diferentes exemplos de manipulação de data/hora sendo executados automaticamente.

## Estrutura

* `Main.java`: Classe única que contém todos os exemplos práticos organizados por categoria de operação.

## Exemplo de Uso

```
INSTANCIANDO DATA-HORA:
d01:  2024-07-19
d02:  2024-07-19T14:30:45.123
d03:  2024-07-19T17:30:45.123Z
d04:  2022-07-20
d05:  2022-07-20T01:30:26
...

CONVERTENDO DATA-HORA P/ TEXTO
d04 = 2022-07-20
d04 = 20/07/2022
...

CONVERTENDO DATA-HORA GLOBAL PARA LOCAL:
r1 = 2022-07-19
r2 = 2022-07-20
...

CÁLCULOS COM DATA-HORA
pastWeekLocalDate: 2022-07-13
nextWeekLocalDate: 2022-07-27
t1 dias = 7
```

## Conceitos Demonstrados

* **Instanciação**: LocalDate.now(), LocalDateTime.parse(), Instant.parse(), LocalDate.of()
* **Formatação**: DateTimeFormatter com padrões personalizados e ISO
* **Conversão**: Transformação entre tipos de data/hora e fusos horários
* **Extração**: Obtenção de componentes individuais (dia, mês, ano, hora)
* **Cálculos**: Operações de adição/subtração e cálculo de durações

## Notas Técnicas

* Utiliza a API Java Time introduzida no Java 8
* Demonstra diferenças entre LocalDate, LocalDateTime e Instant
* Mostra conversões entre fusos horários usando ZoneId
* Exemplifica cálculos de duração com Duration e ChronoUnit
* Formatadores personalizados e padrões ISO para diferentes necessidades