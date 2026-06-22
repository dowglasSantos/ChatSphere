# 💬 ChatSphere

> Uma releitura moderna do MSN Messenger, desenvolvida com foco em aprendizado de desenvolvimento Backend e integração com Frontend.

## 📖 Sobre o projeto

O **ChatSphere** é um projeto de estudos inspirado no clássico **MSN Messenger**, criado pela Microsoft. O objetivo é recriar as principais funcionalidades da plataforma utilizando tecnologias modernas, aplicando conceitos de desenvolvimento Backend, APIs REST e integração com aplicações Frontend.

Este projeto não possui fins comerciais. Seu propósito é servir como laboratório para estudar arquitetura de aplicações, autenticação, autorização, persistência de dados e comunicação entre cliente e servidor.

---

## 🎯 Objetivos

Durante o desenvolvimento do ChatSphere, os principais objetivos são:

- Aprender a construir APIs REST seguindo boas práticas;
- Compreender a comunicação entre Backend e Frontend;
- Implementar autenticação e autorização utilizando JWT;
- Desenvolver um sistema seguro de gerenciamento de usuários;
- Aplicar validações de dados tanto na entrada quanto nas regras de negócio;
- Trabalhar com persistência de dados utilizando banco de dados relacional;
- Estruturar um projeto seguindo padrões utilizados no mercado.

---

## 🚀 Funcionalidades

### 👤 Sistema de Usuários

- Cadastro de usuários
- Login com autenticação JWT
- Criptografia de senhas
- Atualização de perfil
- Exclusão de conta
- Controle de autenticação

### 🤝 Sistema Social

- Lista de amigos
- Solicitações de amizade
- Aceitar ou recusar solicitações
- Sistema de seguidores
- Remoção de amigos
- Bloqueio de usuários *(planejado)*

### 💬 Chat

- Conversas privadas
- Histórico de mensagens
- Envio de mensagens em tempo real *(planejado)*
- Status online/offline *(planejado)*
- Indicador de digitação *(planejado)*

### 🔒 Segurança

- Autenticação via JWT
- Hash de senhas utilizando BCrypt
- Controle de acesso por usuário autenticado
- Validação de permissões
- Proteção de endpoints privados

---

## 🏗️ Arquitetura

O projeto segue uma arquitetura em camadas para manter a organização do código.

```
Controller
     │
     ▼
Service
     │
     ▼
Repository
     │
     ▼
Banco de Dados
```

Cada camada possui uma responsabilidade específica, facilitando manutenção, testes e escalabilidade.

---

## 📚 Tecnologias utilizadas

### Backend

- Java
- Spring Boot
- Spring Web
- Spring Security
- Spring Data JPA
- Hibernate
- JWT
- BCrypt
- Maven

### Banco de Dados

- PostgreSQL

### Ferramentas

- Postman
- Git
- GitHub
- IntelliJ IDEA

---

## 📌 Conceitos estudados

Durante o desenvolvimento do projeto são praticados conceitos como:

- APIs REST
- CRUD
- DTOs
- Injeção de Dependência
- Inversão de Controle (IoC)
- Spring Security
- JWT Authentication
- BCrypt Password Encoder
- Tratamento de Exceções
- Validação de Dados
- Relacionamentos JPA
- Arquitetura em Camadas
- Boas práticas REST
- Versionamento com Git

---

## 📅 Roadmap

- [x] Cadastro de usuários
- [x] Login com JWT
- [x] Criptografia de senhas
- [x] Autenticação de usuários
- [ ] Perfil do usuário
- [ ] Sistema de amizades
- [ ] Sistema de seguidores
- [ ] Conversas privadas
- [ ] Mensagens em tempo real (WebSocket)
- [ ] Status online/offline
- [ ] Upload de foto de perfil
- [ ] Pesquisa de usuários
- [ ] Notificações
- [ ] Grupos de conversa
- [ ] Chamadas de voz *(estudo futuro)*

---

## 🎓 Objetivo Educacional

Este projeto foi desenvolvido exclusivamente para fins de estudo.

A proposta é compreender, na prática, como um sistema de mensagens funciona internamente, desde o gerenciamento de usuários até a autenticação, autorização, comunicação entre cliente e servidor e organização de uma aplicação Backend moderna.

Além disso, o ChatSphere serve como ambiente para experimentar novas tecnologias, testar arquiteturas e aplicar boas práticas de desenvolvimento de software.

---

## 📈 Status do Projeto

🚧 Em desenvolvimento

Novas funcionalidades serão implementadas conforme o avanço dos estudos e da evolução do projeto.

---

## 👨‍💻 Autor

**Douglas Santos**

Desenvolvedor Backend Java apaixonado por tecnologia, desenvolvimento de software e resolução de problemas através da programação.
