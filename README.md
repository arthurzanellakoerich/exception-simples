📖 Sobre o projeto
Simulação de uma conta bancária simples onde o usuário informa os dados da conta e tenta realizar um saque. O sistema valida a operação e lança exceções personalizadas caso algo dê errado.

⚠️ O que estou aprendendo

Criar exceptions personalizadas (AccountException)
Usar blocos try/catch para tratar erros
Lançar exceções com throw
Separar responsabilidades entre classes (Account, Program)


🗂️ Estrutura do projeto
src/
├── application/
│   └── Program.java
├── entitites/
│   └── Account.java
└── exceptions/
    └── AccountException.java

⚙️ Como funciona

O usuário informa número, titular, saldo e limite de saque
O sistema tenta realizar o saque informado
Se o valor exceder o limite de saque ou o saldo disponível, uma exception é lançada com a mensagem de erro
