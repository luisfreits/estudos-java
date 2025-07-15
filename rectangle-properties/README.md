# Rectangle Properties

Este projeto Java calcula as propriedades de um retângulo (área, perímetro e diagonal) e demonstra conceitos básicos de programação orientada a objetos, incluindo packages, classes e métodos.

## Como usar

1. Compile os arquivos:
   ```
   javac -d bin src/model/Rectangle.java src/app/RectangleProperties.java
   ```

2. Execute o programa:
   ```
   java -cp bin app.RectangleProperties
   ```

3. Informe a largura (width) e altura (height) do retângulo quando solicitado.

## Estrutura

- `src/model/Rectangle.java`: Classe que representa o retângulo e calcula suas propriedades.
- `src/app/RectangleProperties.java`: Classe principal que interage com o usuário.

## Exemplo de Uso

```
Enter rectangle width and height:
Width:
3.00
Height:
4.00
Area: 12.00
Perimeter: 14.00
Diagonal: 5.00
```
## Notas Técnicas

- O projeto usa `Locale.setDefault(Locale.US)` para garantir que o separador decimal seja o ponto (.)
- Os valores são formatados com 2 casas decimais na saída