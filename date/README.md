# Exemplos Date Legacy Java

Este código demonstra o uso da classe Date e SimpleDateFormat (API legada anterior ao Java 8) para manipulação de data e hora. Implementa exemplos práticos de instanciação, parsing, formatação e conversão entre fusos horários para fixação de conteúdo das APIs antigas.

## Como usar

1. Compile o arquivo:
```
javac Main.java
```

2. Execute o programa:
```
java Main
```

3. Observe os diferentes exemplos de manipulação de Date sendo executados automaticamente com formatação local e GMT.

## Estrutura

* `Main.java`: Classe única que contém todos os exemplos práticos da API Date legada organizados por tipo de operação.

## Exemplo de Uso

```
-------------------------
x1: 19/07/2024 14:30:45
x2: 19/07/2024 14:30:45
x3: 01/01/1970 00:00:00
x4: 01/01/1970 05:00:00
y1: 25/06/2018 00:00:00
y2: 25/06/2018 15:42:07
y3: 25/06/2018 15:42:07
-------------------------
x1: 19/07/2024 17:30:45
x2: 19/07/2024 17:30:45
x3: 01/01/1970 00:00:00
x4: 01/01/1970 05:00:00
y1: 25/06/2018 03:00:00
y2: 25/06/2018 18:42:07
y3: 25/06/2018 15:42:07
-------------------------
```

## Conceitos Demonstrados

* **Instanciação**: new Date(), Date(timestamp), Date.from(Instant)
* **Formatação**: SimpleDateFormat com padrões personalizados
* **Parsing**: Conversão de string para Date usando parse()
* **Fusos Horários**: Comparação entre horário local e GMT
* **Timestamp**: Uso de milissegundos desde epoch (1970-01-01)

## Notas Técnicas

* Utiliza a API Date legada (anterior ao Java 8)
* SimpleDateFormat para formatação e parsing de datas
* Demonstra diferenças entre fuso horário local e GMT
* Uso de timestamp em milissegundos para criar datas específicas
* Conversão entre Instant (Java 8+) e Date (legado) com Date.from()