# Spring Boot Authentication API

![Java](https://img.shields.io/badge/java-%23ED8B00.svg?style=for-the-badge&logo=openjdk&logoColor=white)
![Spring](https://img.shields.io/badge/spring-%236DB33F.svg?style=for-the-badge&logo=spring&logoColor=white)
![Postgres](https://img.shields.io/badge/postgres-%23316192.svg?style=for-the-badge&logo=postgresql&logoColor=white)
![JWT](https://img.shields.io/badge/JWT-black?style=for-the-badge&logo=JSON%20web%20tokens)

Este projeto é uma API construída usando **Java, Java Spring, Flyway Migrations, PostgresSQL como banco de dados e Spring Security e JWT para controle de autenticação.**

Este projeto foi desenvolvido com base no [Tutorial do YouTube](https://www.youtube.com/watch?v=5w-YCcOjPD0), para demonstrar como configurar autenticação e autorização em aplicativos Spring usando Spring Security.

## Versões
- [OpenJDK 21](https://adoptium.net/download/)
- Spring Boot 3.3.1

## Conteúdo

- [Instalação](#instalação)
- [Uso](#uso)
- [API Endpoints](#api-endpoints)
- [Autenticação](#autenticação)
- [Banco de dados](#banco-de-dados)

## Instalação

1. Clone o repositório:

```bash
git clone https://github.com/Fernanda-Kipper/auth-api.git
```

2. Instale dependências com Maven
3. Instale o [PostgresSQL](https://www.postgresql.org/)

## Uso

1. Inicie o aplicativo com Maven
2. A API estará acessível em http://localhost:8080

## API Endpoints
A API fornece os seguintes endpoints:

```markdown
GET /product - Recuperar uma lista de todos os produtos. (todos os usuários autenticados)

POST /product - Registre um novo produto (é necessário acesso de ADMIN)

POST /auth/login - Login

POST /auth/register - Registra novo usuário
```

Na pasta do projeto há um arquivo que pode ser importado no Insomnia para testar os endpoints.

## Autenticação
A API usa Spring Security para controle de autenticação. As seguintes funções estão disponíveis:

```
USER -> Função de usuário padrão para usuários logados
ADMIN -> Função administrativa para sócios-gerentes
```

Para acessar endpoints protegidos como usuário ADMIN, forneça as credenciais de autenticação apropriadas no cabeçalho da solicitação.

## Banco de dados
O projeto utiliza [PostgresSQL](https://www.postgresql.org/) como banco de dados. As migrações de banco de dados necessárias são gerenciadas usando Flyway.