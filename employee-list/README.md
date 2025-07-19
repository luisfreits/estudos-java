# Employee Management System

Este projeto implementa um sistema de gerenciamento de funcionários que permite cadastrar empregados, validar IDs únicos e aplicar aumentos salariais por percentual. Demonstra conceitos de programação orientada a objetos, incluindo ArrayList, Stream API e validação de dados.

## Como usar

1. Compile os arquivos:
```
javac -d bin src/model/Employee.java src/application/Main.java
```

2. Execute o programa:
```
java -cp bin application.Main
```

3. Informe quantos funcionários serão cadastrados, forneça os dados de cada um e depois escolha um ID para aplicar aumento salarial.

## Estrutura

* `src/model/Employee.java`: Classe que representa um funcionário com nome, ID único e salário.
* `src/application/Main.java`: Classe principal que gerencia o cadastro, validação de IDs e aumentos salariais.

## Exemplo de Uso

```
How many employees will be registered? 2

Employee #1:
Id: 333
Name: Maria Brown
Salary: 4000.00

Employee #2:
Id: 536
Name: Alex Grey
Salary: 3000.00

Enter the employee id that will have salary increase: 333
Enter the percentage: 10.0

List of employees:
333, Maria Brown, 4400.00
536, Alex Grey, 3000.00
```

## Funcionamento

* **Cadastro**: Registra funcionários com ID único, nome e salário
* **Validação**: Impede cadastro de IDs duplicados com verificação automática
* **Busca**: Utiliza Stream API para localizar funcionário por ID
* **Aumento**: Aplica percentual de aumento sobre o salário atual
* **Listagem**: Exibe todos os funcionários com dados atualizados

## Notas Técnicas

* O projeto usa `Locale.setDefault(Locale.US)` para padronizar o formato de números
* Utiliza ArrayList para armazenamento dinâmico dos funcionários
* Stream API com `filter()` e `findFirst()` para busca eficiente por ID
* Método `hasID()` estático para validação de IDs duplicados
* Formatação de saída com 2 casas decimais para valores monetários