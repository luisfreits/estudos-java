# Sistema de Cadastro de Funcionários

Este projeto demonstra o uso de arrays, métodos estáticos e encapsulamento em Java através de um sistema simples de cadastro de funcionários. O programa permite inserir dados de múltiplos funcionários, exibi-los formatados e calcular a média salarial do grupo, aplicando conceitos fundamentais de programação orientada a objetos e manipulação de arrays.

## Como usar

1. Compile os arquivos:
```bash
javac -d bin Main.java entities/Funcionario.java
```

2. Execute o programa:
```bash
java -cp bin Main
```

3. Insira o número de funcionários e os dados solicitados para cada um.

## Estrutura

* `Main.java`: Classe principal com interface de usuário e controle do sistema
* `entities/Funcionario.java`: Entidade funcionário com métodos estáticos para cálculos

## Exemplo de Uso

```
Quantos funcionarios deseja inserir 3
Funcionario 1:
Nome: João Silva
Idade: 35
Salário: 3500.00

Funcionario 2:
Nome: Maria Santos
Idade: 28
Salário: 4200.00

Funcionario 3:
Nome: Pedro Costa
Idade: 42
Salário: 2800.00

Funcionario{nome='João Silva', idade=35, salario=3500.0}
Funcionario{nome='Maria Santos', idade=28, salario=4200.0}
Funcionario{nome='Pedro Costa', idade=42, salario=2800.0}
Média salarial: 3500.0
```

## Conceitos Demonstrados

* **Arrays**: Armazenamento de múltiplos objetos Funcionario
* **Encapsulamento**: Atributos privados com getters e setters
* **Métodos Estáticos**: calcularMediaSalarial() e exibirFuncionarios()
* **Construtor**: Inicialização de objetos com parâmetros
* **toString()**: Sobrescrita para representação textual do objeto
* **Enhanced For Loop**: Iteração sobre array de funcionários
* **Scanner**: Entrada de dados via console com tratamento de buffer

## Notas Técnicas

* Array de tamanho fixo determinado pelo usuário na execução
* Métodos estáticos permitem operações sem instanciar a classe
* Scanner.nextLine() usado após nextInt()/nextDouble() para limpar buffer
* Cálculo da média salarial com divisão por length do array
* toString() formatado mostra todos os atributos do funcionário
* Construtor padrão vazio disponível para flexibilidade
* Uso de Integer wrapper class para idade (permite null)