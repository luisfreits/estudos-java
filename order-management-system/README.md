# Sistema de Gerenciamento de Pedidos Java

Este projeto Java demonstra a implementação de um sistema completo de gerenciamento de pedidos utilizando programação orientada a objetos. O sistema permite cadastrar clientes, criar pedidos com múltiplos itens e calcular totais, aplicando conceitos como composição, enumerações e formatação de datas com a API legada do Java.

## Como usar

1. Compile todos os arquivos:
```bash
javac -d bin src/application/Program.java src/entities/Client.java src/entities/Order.java src/entities/OrderItem.java src/entities/Product.java src/enums/OrderStatus.java
```

2. Execute o programa:
```bash
java -cp bin application.Program
```

3. Siga as instruções no terminal para inserir dados do cliente e itens do pedido.

## Estrutura

* `src/application/Program.java`: Classe principal com interface de usuário via console
* `src/entities/Client.java`: Entidade representando cliente com nome, email e data de nascimento
* `src/entities/Order.java`: Entidade do pedido com data, status, cliente e lista de itens
* `src/entities/OrderItem.java`: Item individual do pedido com produto, quantidade e preço
* `src/entities/Product.java`: Entidade produto com nome e preço
* `src/enums/OrderStatus.java`: Enumeração com status possíveis do pedido

## Exemplo de Uso

```
Enter cliente data:
Name: João Silva
Email: joao@email.com
Birth date (DD/MM/YYYY): 15/03/1990

Enter order data:
Status: PROCESSING
How many items to this order? 2

Enter #1 item data:
Product name: Notebook
Product price: 2500.00
Quantity: 1

Enter #2 item data:
Product name: Mouse
Product price: 50.00
Quantity: 2

ORDER SUMMARY:
Order moment: 20/07/2025 14:30:25
Order status: PROCESSING
Client: João Silva (15/03/1990) - joao@email.com
Order items:
Notebook, $2500.00, Quantity: 1, Subtotal: $2500.00
Mouse, $50.00, Quantity: 2, Subtotal: $100.00
Total price: $2600.00
```

## Conceitos Demonstrados

* **Composição**: Order possui Client e lista de OrderItems
* **Encapsulamento**: Atributos privados com getters e setters
* **Enumerações**: OrderStatus define estados válidos do pedido
* **Formatação**: SimpleDateFormat para datas em diferentes padrões
* **Collections**: ArrayList para gerenciar lista de itens
* **StringBuilder**: Construção eficiente de strings no toString()
* **Cálculos**: Método total() soma subtotais de todos os itens

## Notas Técnicas

* Utiliza java.util.Date e SimpleDateFormat (API legada anterior ao Java 8)
* Locale.US configurado para padronização de entrada numérica
* OrderStatus aceita valores: PENDING_PAYMENTS, PROCESSING, SHIPPED, DELIVERED
* Tratamento de entrada via Scanner com nextLine() para evitar problemas de buffer
* Formatação monetária com 2 casas decimais usando String.format()
* Data do pedido gerada automaticamente no momento da criação
* Cliente formatado exibe nome, data nascimento e email no toString()