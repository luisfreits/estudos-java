# Sistema de Pagamento de Funcionários

Este projeto demonstra a implementação de um sistema de cálculo de pagamentos para funcionários utilizando conceitos fundamentais da Programação Orientada a Objetos como herança, polimorfismo e sobrescrita de métodos. O sistema diferencia funcionários regulares de terceirizados, aplicando regras específicas de cálculo para cada tipo.

## Como usar

1. Compile os arquivos:
```bash
javac -d bin src/Main.java src/entities/Employee.java src/entities/OutsourcedEmployee.java
```

2. Execute o programa:
```bash
java -cp bin Main
```

3. Insira o número de funcionários e os dados solicitados para cada um.

## Estrutura

* `src/Main.java`: Classe principal com interface de usuário e controle do sistema
* `src/entities/Employee.java`: Classe base representando funcionário comum
* `src/entities/OutsourcedEmployee.java`: Classe filha para funcionários terceirizados

## Exemplo de Uso

```
Enter the number of employees: 2
Employee #1 data:
Outsourced (y/n)? n
Name: Maria Silva
Hours: 40
Value per hour: 25.00

Employee #2 data:
Outsourced (y/n)? y
Name: João Santos
Hours: 35
Value per hour: 30.00
Additional charge: 200.00

PAYMENTS:
Maria Silva - $ 1000.00
João Santos - $ 1270.00
```

## Conceitos Demonstrados

* **Herança**: OutsourcedEmployee herda de Employee
* **Polimorfismo**: Lista de Employee pode conter objetos de subclasses
* **Sobrescrita**: Método payment() redefinido na classe filha
* **Encapsulamento**: Atributos privados com getters e setters
* **Construtor**: Chamada super() para reutilizar construtor da superclasse
* **Collections**: ArrayList para armazenar diferentes tipos de funcionários
* **Formatação**: String.format() para valores monetários com 2 decimais

## Notas Técnicas

* Funcionários regulares: pagamento = horas × valor por hora
* Funcionários terceirizados: pagamento = (horas × valor por hora) + (taxa adicional × 1.1)
* Uso de polimorfismo permite tratar ambos os tipos uniformemente na lista
* Método payment() demonstra polimorfismo em tempo de execução
* Construtor padrão vazio disponível para flexibilidade de instanciação
* Locale.US configurado para padronização de entrada numérica
* Tratamento adequado do buffer do Scanner com nextLine()