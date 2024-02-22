# Aplicação Bancária Simples

Esta é uma aplicação simples que permite ao usuário criar uma conta bancária fornecendo informações como número da conta, agência, nome do cliente e saldo. A aplicação utiliza as classes `ContaTerminal` e `App` para interagir com o usuário e exibir uma mensagem de boas-vindas com os detalhes da conta criada.

## Classes

### `ContaTerminal`

A classe `ContaTerminal` representa uma conta em um terminal bancário, contendo os seguintes atributos:

- `Numero`: Número da conta.
- `Agencia`: Agência da conta.
- `NomeCliente`: Nome do cliente associado à conta.
- `Saldo`: Saldo atual da conta.

A classe possui dois construtores, um padrão e outro parametrizado, para criar instâncias da conta com ou sem valores iniciais.

### `App`

A classe `App` é a aplicação principal que interage com a classe `ContaTerminal`. No método `main`, a aplicação solicita ao usuário as informações necessárias para criar uma conta e, em seguida, exibe uma mensagem de boas-vindas com os detalhes da conta criada.

## Utilização

1. Execute a aplicação.
2. Siga as instruções para fornecer o número da conta, agência, nome do cliente e saldo.
3. A aplicação exibirá uma mensagem de boas-vindas com os detalhes da conta criada.

```bash
Por favor, digite o número da Conta !
123456
Por favor, digite o número da Agência !
7890
Por favor, digite o nome do Cliente  !
João da Silva
Por favor, digite seu Saldo !
1000.50
Olá João da Silva, obrigado por criar uma conta em nosso banco, sua agência é 7890, conta 123456 e seu saldo: R$1000.50 já está disponível para saque.

