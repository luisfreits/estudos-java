# Currency Conversion
Este projeto Java converte valores em dólares para reais aplicando uma taxa de IOF de 6% sobre o preço do dólar. Demonstra conceitos básicos de programação orientada a objetos, incluindo packages, classes e métodos estáticos.

## Como usar
1. Compile os arquivos:
   ```
   javac -d bin src/model/CurrencyConverter.java src/app/CurrencyConversion.java
   ```
2. Execute o programa:
   ```
   java -cp bin app.CurrencyConversion
   ```
3. Informe o preço do dólar e a quantidade de dólares a serem comprados quando solicitado.

## Estrutura
- `src/model/CurrencyConverter.java`: Classe utilitária com método estático para conversão de moedas.
- `src/app/CurrencyConversion.java`: Classe principal que interage com o usuário.

## Exemplo de Uso
```
What is the dollar price? 5.10
How many dollars will be bought? 200.00
Amount to be paid in reais = 1081.20
```

## Cálculo da Conversão
- **Fórmula**: (Preço do dólar × 1.06) × Quantidade de dólares
- **Taxa IOF**: 6% sobre o preço do dólar
- O valor final é apresentado em reais

## Notas Técnicas
- O projeto usa `Locale.setDefault(Locale.US)` para garantir que o separador decimal seja o ponto (.)
- Os valores são formatados com 2 casas decimais na saída
- Utiliza método estático para a conversão, não necessitando instanciar a classe