# Sistema de Gerenciamento de Funcionários

Este programa implementa um sistema básico de gerenciamento de funcionários usando programação orientada a objetos. Permite cadastrar funcionários, calcular salário líquido e aplicar aumentos salariais.

**Funcionalidades:**
- Cadastro de funcionário com nome, salário bruto e taxa de imposto
- Cálculo automático do salário líquido (salário bruto - imposto)
- Aplicação de aumento salarial por porcentagem
- Exibição formatada dos dados do funcionário

## Como usar

1. Compile os arquivos:
   ```bash
   javac Program.java Employee.java
   ```

2. Execute:
   ```bash
   java Program
   ```

3. Insira os dados solicitados (nome, salário bruto, taxa de imposto e porcentagem de aumento) e veja os resultados formatados.

## Exemplo de saída

```
Name: João Silva
Gross salary: 6000.00
Tax: 1000.00
Employee: João Silva, $ 5000.00
Which percentage to increase salary? 
10.0
Update data: João Silva, $ 5500.00
```