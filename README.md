# 🕹️ PlayCollector API

[![License: MIT](https://img.shields.io/badge/License-MIT-green.svg)](https://github.com/yourusername/PlayCollector/blob/main/LICENSE)
[![Spring Boot](https://img.shields.io/badge/Spring%20Boot-3.5+-6DB33F?logo=spring)](https://spring.io/projects/spring-boot)
[![Java](https://img.shields.io/badge/Java-17+-007396?logo=java)](https://www.oracle.com/java/)
[![Docker](https://img.shields.io/badge/Docker-Compose-blue?logo=docker)](https://www.docker.com/)

---

## 📘 Sobre o Projeto

**PlayCollector API** é uma aplicação backend construída com **Java 17** e **Spring Boot 3.5+**, desenvolvida durante o *Intensivão Java Spring* promovido pela **DevSuperior**.  
Seu principal objetivo é oferecer uma interface RESTful para o gerenciamento de coleções de jogos.

---

## 🧠 Funcionalidades

- ✅ Cadastro de jogos  
- ✅ Organização de jogos em listas personalizadas  
- ✅ Reordenação de jogos dentro das listas  
- ✅ Consulta por listas e detalhes de jogos  
- ✅ Tratamento centralizado de erros  
- ✅ Arquitetura em camadas (Controller → Service → Repository)


---

## 🧩 Modelo de Domínio

- **Game**: representa os dados de um jogo (título, gênero, plataforma, score, etc).  
- **GameList**: representa listas personalizadas de jogos.  
- **Belonging**: entidade de associação que vincula jogos a listas e permite ordenação.

> ![Domain Model DSList](https://raw.githubusercontent.com/devsuperior/java-spring-dslist/main/resources/dslist-model.png)


---

## 🚀 Tecnologias Utilizadas

| Tecnologia              | Descrição                             |
|-------------------------|----------------------------------------|
| Java 17+                | Linguagem de programação principal     |
| Spring Boot 3.5+        | Framework para criação da API          |
| Spring Data JPA         | Persistência de dados com ORM          |
| H2 / PostgreSQL         | Banco de dados (dev/teste)             |
| Docker & Docker Compose | Containerização e ambiente isolado     |
| Maven                   | Gerenciamento de dependências          |

---

## 🌐 Endpoints REST

| Método | Endpoint                         | Descrição                                  |
|--------|----------------------------------|--------------------------------------------|
| GET    | `/games`                         | Lista todos os jogos                       |
| GET    | `/games/{id}`                    | Detalhes de um jogo específico             |
| GET    | `/lists`                         | Lista todas as listas de jogos             |
| GET    | `/lists/{listId}/games`          | Lista os jogos de uma lista específica     |
| POST   | `/lists/{listId}/replacement`    | Reordena um jogo na lista                  |

---
## 👨‍💻 Autor
Thiago Linares de Abreu

[![GitHub](https://img.shields.io/badge/GitHub-181717?logo=github)](https://github.com/yourusername)  
