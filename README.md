# Documentação do Projeto Microserviço Atlas-Project-Service

Esta documentação oferece uma visão geral completa e técnica do projeto **Atlas-Project-Service**, um microserviço desenvolvido com foco na gestão de projetos dentro da plataforma Atlas. A seguir, são abordados aspectos gerais, arquitetura, principais funcionalidades, dependências e configuração do ambiente.

---

## Sumário

- [Visão Geral](#visão-geral)
- [Arquitetura do Sistema](#arquitetura-do-sistema)
- [Tecnologias Utilizadas](#tecnologias-utilizadas)
- [Funcionalidades Principais](#funcionalidades-principais)
- [Estrutura do Código](#estrutura-do-código)
- [Configuração do Ambiente](#configuração-do-ambiente)
- [Endpoints da API](#endpoints-da-api)
- [Considerações Finais](#considerações-finais)

---

## Visão Geral

O **Atlas-Project-Service** é um microserviço responsável pelo gerenciamento de projetos na plataforma Atlas. Ele permite criar, atualizar, consultar, e gerenciar o status de projetos, além de facilitar integrações com outros microsserviços via Spring Cloud Eureka e OAuth2 para segurança.

---

## Arquitetura do Sistema

A arquitetura segue o padrão de microsserviços, organizado com as seguintes camadas:

- **Controller**: Responsável pela exposição dos endpoints REST.
- **Service**: Regras de negócio e manipulação de dados.
- **Repository**: Interface com o banco de dados utilizando Spring Data JPA.
- **Model**: Entidades e enums que representam os dados do domínio.

A comunicação é protegida por OAuth2, integrando-se ao servidor de autenticação, e utiliza Eureka para service discovery.

---

## Tecnologias Utilizadas

- **Spring Boot 3.4.5**  
- **Spring Data JPA**  
- **Spring Security + OAuth2**  
- **Spring Cloud Eureka Client**  
- **SpringDoc OpenAPI (v2.3.0)** para documentação da API  
- **PostgreSQL** como banco de dados relacional  
- **Lombok** para redução de boilerplate  
- **Java 24**

---

## Funcionalidades Principais

### Gestão de Projetos

- **Criar projeto**  
- **Consultar projeto por ID ou status**  
- **Atualizar informações do projeto**  
- **Alterar status do projeto** (como aguardando análise, em andamento, finalizado, recusado)

### Enum ProjectStatus

Representa os diferentes estados do projeto:

---

## Estrutura do Código

### 1. Modelo

- `Project`: entidade que representa um projeto
- `ProjectStatus`: enum dos estados do projeto

### 2. Repositório

- Interface que estende `JpaRepository`, responsável pela comunicação com o banco de dados

### 3. Serviço

- Implementa a lógica de negócios, validações e manipulação dos dados

### 4. Controlador

- Define os endpoints REST para operação do sistema

### 5. Configuração

- Configurações do Spring Boot, autenticação OAuth2, Eureka client, conexão com PostgreSQL

---

## Configuração do Ambiente

### Pré-requisitos

- Java 24 SDK instalado
- PostgreSQL instalado e configurado
- Maven para gerenciamento de dependências

### Arquivo `application.yml` (exemplo de configuração)

### Execução

---

## Endpoints da API (Exemplo)

| Método  | Rota                  | Descrição                                  |
|---------|-----------------------|--------------------------------------------|
| GET     | /projects            | Lista todos os projetos                     |
| POST    | /projects            | Cria um novo projeto                        |
| GET     | /projects/{id}       | Consulta projeto por ID                     |
| PUT     | /projects/{id}       | Atualiza projeto                            |
| PATCH   | /projects/{id}/status| Atualiza o status do projeto               |

---

## Considerações Finais

Este microserviço é peça fundamental na gestão de projetos do sistema Atlas, garantindo operações seguras e eficientes, integrando-se com outros componentes via Eureka e OAuth2. A estrutura modular facilita manutenção e escalabilidade, atendendo às necessidades atuais e futuras do sistema.

Para mais detalhes ou dúvidas, consulte a documentação completa ou o repositório do projeto.
