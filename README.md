# Sistema de Autenticação Java

Este repositório contém um sistema de autenticação básico construído em Java. O sistema é dividido em duas principais componentes: `LoginScreen` para a lógica de autenticação e `LoginScreenTest` para a validação dessa lógica através de testes automatizados.

## Componentes do Sistema

### Classe `LoginScreen`

Essencialmente, a `LoginScreen` é responsável pela gestão de autenticações e registros de usuários. Abaixo estão as funcionalidades chave:

- **Autenticação de Usuários:** Permite a verificação das credenciais dos usuários.
- **Registro de Usuários:** Facilita a adição de novos usuários ao sistema.

O armazenamento dos usuários é feito através de um `HashMap`, onde os usernames são as chaves e as senhas são os valores associados.

### Classe `LoginScreenTest`

A `LoginScreenTest` utiliza o framework JUnit para conduzir testes que asseguram a integridade das funcionalidades da `LoginScreen`. Os testes incluem:

- **Teste de Login bem-sucedido:** Confirma se o sistema autentica um usuário com as credenciais corretas.
- **Teste de Falha no Login:** Verifica se o sistema rejeita adequadamente um login com credenciais erradas.
- **Teste de Adição de Usuário:** Testa a adição de um novo usuário e sua subsequente capacidade de login.

## Configuração e Execução

### Pré-requisitos

Assegure-se de que Java e JUnit estão instalados e configurados em seu ambiente de desenvolvimento.

### Executando os Testes

Os testes podem ser executados através de qualquer IDE que suporte Java e JUnit, ou via linha de comando, garantindo uma cobertura de teste completa.
