🎉 Tech Events Manager - Backend

Este projeto é um backend desenvolvido em Java com Spring Boot para gerenciar eventos de tecnologia.
O sistema permite cadastro, listagem, filtragem e detalhamento de eventos, além da associação de cupons de desconto aos eventos.

🚀 Objetivo do Projeto

O objetivo principal é oferecer uma API REST organizada e escalável para servir como base de uma aplicação de gerenciamento de eventos, que pode futuramente ser integrada a um frontend web ou mobile.

⚙️ Funcionalidades

✅ Cadastro de eventos

✅ Listagem de eventos

✅ Filtragem de eventos (por data, categoria, etc.)

✅ Detalhamento de um evento específico

✅ Associação de cupons de desconto aos eventos

🛠️ Tecnologias Utilizadas

Java 17+

Spring Boot (Web, JPA, Validation)

Maven ou Gradle

Banco de Dados: H2 (em memória) ou PostgreSQL/MySQL (dependendo da config)

Spring Data JPA

Lombok (para reduzir boilerplate)

Swagger/OpenAPI (documentação da API)

📂 Estrutura do Projeto
src
 └── main
      ├── java/com/seuprojeto
      │     ├── controller   # Endpoints REST
      │     ├── service      # Regras de negócio
      │     ├── repository   # Acesso ao banco de dados
      │     └── model        # Entidades (Event, Coupon, etc.)
      └── resources
            ├── application.properties # Configurações do projeto

▶️ Como Executar o Projeto
Pré-requisitos:

Java 17+ instalado

Maven ou Gradle configurado

Git para clonar o repositório

Passos:
# Clonar o repositório
git clone https://github.com/IanPedr/backend-springboot/tree/main

# Entrar na pasta do projeto
cd seu-repositorio

# Rodar o projeto
./mvnw spring-boot:run


O backend estará rodando em:
👉 http://localhost:8080

📖 Documentação da API

Se o Swagger/OpenAPI estiver habilitado, acesse:
👉 http://localhost:8080/swagger-ui.html
