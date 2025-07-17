# Grade System
Este projeto Java calcula a nota final de um estudante baseado em três notas trimestrais e determina se o aluno foi aprovado ou reprovado. Demonstra conceitos básicos de programação orientada a objetos, incluindo packages, classes e métodos.

## Como usar
1. Compile os arquivos:
   ```
   javac -d bin src/model/Grade.java src/app/Program.java
   ```
2. Execute o programa:
   ```
   java -cp bin app.Program
   ```
3. Informe o nome do estudante e as três notas trimestrais quando solicitado.

## Estrutura
- `src/model/Grade.java`: Classe que representa as notas do estudante e calcula a média final.
- `src/app/Program.java`: Classe principal que interage com o usuário.

## Exemplo de Uso
```
Enter student name: João Silva
Enter the 1st trimester grade: 27.00
Enter the 2nd trimester grade: 31.00
Enter the 3rd trimester grade: 32.00
FINAL GRADE = 90.00
PASSED
```

## Critério de Aprovação
- **Aprovado**: Nota final ≥ 60 pontos
- **Reprovado**: Nota final < 60 pontos (exibe quantos pontos faltaram)

## Notas Técnicas
- O projeto usa `Locale.setDefault(Locale.US)` para garantir que o separador decimal seja o ponto (.)
- Os valores são formatados com 2 casas decimais na saída
- A nota final é a soma das três notas trimestrais