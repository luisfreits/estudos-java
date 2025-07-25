# Sistema de Leitura de Funcionários de Arquivo

Este projeto demonstra a leitura e processamento de dados de funcionários a partir de arquivos de texto utilizando manipulação de arquivos em Java. O sistema carrega informações de nome e salário, ordena os funcionários e exibe os dados formatados, aplicando conceitos de I/O, Collections e interface Comparable.

## Como usar

1. Crie um arquivo de texto no caminho `C:\temp\in.txt` com o formato:
```
João Silva,3500.50
Maria Santos,4200.00
Pedro Costa,2800.75
```

2. Compile os arquivos:
```bash
javac -d bin application/Main.java entities/Employee.java
```

3. Execute o programa:
```bash
java -cp bin application.Main
```

4. Observe a lista de funcionários ordenada sendo exibida no console.

## Estrutura

* `application/Main.java`: Classe principal com leitura de arquivo e processamento
* `entities/Employee.java`: Entidade Employee implementando Comparable para ordenação

## Exemplo de Uso

**Arquivo de entrada (C:\temp\in.txt):**
```
João Silva,3500.50
Maria Santos,4200.00
Pedro Costa,2800.75
Ana Oliveira,3800.25
```

**Saída no console:**
```
Ana Oliveira, 3800.25
João Silva, 3500.50
Maria Santos, 4200.00
Pedro Costa, 2800.75
```

## Conceitos Demonstrados

* **Manipulação de Arquivos**: BufferedReader e FileReader para leitura eficiente
* **Try-with-resources**: Fechamento automático de recursos
* **String Processing**: split() para separar campos CSV
* **Type Conversion**: Double.parseDouble() para conversão de strings
* **Collections**: ArrayList para armazenamento dinâmico
* **Ordenação**: Collections.sort() com interface Comparable
* **Exception Handling**: Tratamento de IOException para erros de arquivo

## Notas Técnicas

* Utiliza BufferedReader para leitura eficiente de arquivos grandes
* Try-with-resources garante fechamento automático do arquivo
* Collections.sort() requer que Employee implemente Comparable
* Arquivo de texto deve estar no formato: nome,salário (sem espaços extras)
* Tratamento de exceções previne crashes por arquivos inexistentes
* Caminho do arquivo hardcoded em "C:\\temp\\in.txt"
* Ordenação alfabética por nome (assumindo implementação padrão do Comparable)