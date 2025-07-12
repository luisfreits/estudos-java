# Cálculo de Imposto de Renda

Este programa calcula o imposto de renda baseado na renda mensal inserida pelo usuário, seguindo a tabela progressiva de alíquotas:

- **R$ 0,00 até R$ 2.000,00**: Isento
- **R$ 2.000,01 até R$ 3.000,00**: 8%
- **R$ 3.000,01 até R$ 4.500,00**: 18%
- **Acima de R$ 4.500,00**: 28%

## Como usar

1. Compile o programa:
   ```bash
   javac CalculoImpostoRenda.java
   ```

2. Execute:
   ```bash
   java CalculoImpostoRenda
   ```

3. Insira a renda mensal (aceita vírgula ou ponto como separador decimal) e veja o cálculo do imposto formatado com duas casas decimais.

## Exemplo de saída

```
                 CÁLCULO DE IMPOSTO POR RENDA

            Renda              |  Imposto de Renda
 de 0,00 até R$ 2000,00        |       Isento
 de R$ 2000,01 até R$ 3000,00  |          8%
 de R$ 3000,01 até R$ 4500,00  |         18%
 acima de R$ 4500,00           |         28%

Insira a renda mensal:
3500,00
Imposto sobre renda igual a R$170,00
```