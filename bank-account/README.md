# Bank Account System

Este projeto Java implementa um sistema simples de gerenciamento de conta bancária que permite criar contas, realizar depósitos e saques com taxas. Demonstra conceitos de programação orientada a objetos, incluindo construtores, encapsulamento e métodos.

## Como usar

1. Compile os arquivos:
```
javac -d bin src/model/AccountManager.java src/app/Main.java
```

2. Execute o programa:
```
java -cp bin app.Main
```

3. Siga as instruções no console para:
   - Informar número da conta e nome do titular
   - Escolher se deseja fazer depósito inicial
   - Realizar depósito adicional
   - Realizar saque

## Estrutura

* `src/model/AccountManager.java`: Classe que representa uma conta bancária com seus atributos e operações.
* `src/app/Main.java`: Classe principal que gerencia a interação com o usuário via console.

## Exemplo de Uso

```
Enter account number: 8532
Enter account holder: Alex Green
Is there an initial deposit (y/n)? y
Enter initial deposit value: 500.00

Account data:
Account 8532, Holder: Alex Green, Balance: $ 500.0

Enter a deposit value: 200.00
Updated account data:
Account 8532, Holder: Alex Green, Balance: $ 700.0

Enter a withdraw value: 300.00
Updated account data:
Account 8532, Holder: Alex Green, Balance: $ 395.0
```

## Operações Bancárias

* **Depósito**: Adiciona o valor integral ao saldo da conta
* **Saque**: Subtrai o valor solicitado + taxa fixa de $5.00
* **Consulta**: Exibe dados da conta (número, titular e saldo atual)

## Notas Técnicas

* O projeto usa `Locale.setDefault(Locale.US)` para padronizar o formato de números
* Possui dois construtores: um sem depósito inicial e outro com depósito inicial
* A taxa de saque de $5.00 é aplicada automaticamente em todas as operações de retirada
* O sistema não valida saldo insuficiente - permite saldo negativo