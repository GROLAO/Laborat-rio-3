# Laborat-rio-3
# Nome dos Desenvolvedores:
Gabriel Grola

# Descrição do projeto

Propósito: O projeto visa desenvolver um sistema robusto de gerenciamento de loja, utilizando o framework Spring Boot para proporcionar uma arquitetura eficiente e escalável. A aplicação tem como objetivo principal facilitar o controle de clientes e pedidos, oferecendo uma solução integrada para a administração de uma loja.

Público-Alvo: O público-alvo desta aplicação são proprietários e gestores de lojas, especialmente aqueles que buscam uma ferramenta intuitiva e eficaz para gerenciar o cadastro de clientes, além de controlar os pedidos realizados. A aplicação destina-se a pequenos e médios negócios que buscam uma solução acessível e personalizável para suas operações diárias.

Cadastro de Clientes: Permite o cadastro completo de clientes, incluindo informações como nome, endereço, número de telefone e e-mail.
Possibilita a consulta e edição dos dados dos clientes, proporcionando uma visão consolidada das informações.

Controle de Pedidos: Sistema de criação e acompanhamento de pedidos, vinculando clientes e produtos.
Status dos pedidos (pendente, em andamento, concluído) para monitoramento eficiente.

Integração com Banco de Dados: Utilização de um banco de dados relacional para armazenar de forma persistente as informações dos clientes, produtos e pedidos.

# Tecnologia Empregada

Linguagem de Programação - Java:
Justificativa: Java é uma escolha sólida e amplamente adotada para o desenvolvimento empresarial. Sua portabilidade, robustez e vasta comunidade de desenvolvedores são fatores que contribuem para a escolha. Além disso, a orientação a objetos nativa em Java se alinha bem com os princípios da POO.

Framework - Spring Boot:
Justificativa: Spring Boot oferece uma estrutura poderosa para o desenvolvimento de aplicativos Java, facilitando a configuração, o desenvolvimento rápido e a modularidade. Sua abordagem de Convenção sobre Configuração (CoC) simplifica o desenvolvimento, enquanto seus módulos (Spring MVC, Spring Data, Spring Security) permitem uma arquitetura robusta e escalável.

Banco de Dados Relacional - (Ex: MySQL):
Justificativa: Bancos de dados relacionais são escolhas comuns, proporcionando consistência e integridade de dados. A escolha específica entre MySQL depende das necessidades específicas do projeto, como escalabilidade, suporte a transações ou recursos específicos do banco de dados.

Spring Data JPA (Java Persistence API):
Justificativa: Facilita a integração do aplicativo Java com o banco de dados relacional. A abstração fornecida pelo Spring Data JPA simplifica as operações de persistência, reduzindo a quantidade de código boilerplate e promovendo uma implementação eficiente de consultas e atualizações no banco de dados.


# Descrição da Arquitetura

A arquitetura do sistema é construída com base nos princípios sólidos da Programação Orientada a Objetos (POO), buscando modularidade, reusabilidade e flexibilidade. O uso do framework Spring Boot oferece uma estrutura coesa para a implementação desses conceitos. Aqui estão os principais elementos da arquitetura:

Camada de Controle (Controller): Utiliza controladores Spring Boot para gerenciar as interações do usuário.
Implementa lógica de controle para direcionar solicitações da interface de usuário para os serviços correspondentes.

Camada de Serviço (Service): Contém a lógica de negócios da aplicação.
Implementa serviços como Cadastro de Clientes, Gestão de Produtos e Controle de Pedidos.
Usa conceitos de POO, como encapsulamento e abstração, para garantir que a lógica de negócios seja modular e reutilizável.

Camada de Persistência (Repository): Responsável pela interação com o banco de dados relacional.
Utiliza o padrão de Repositório do Spring Data para abstrair a camada de persistência.
Mapeamento objeto-relacional (ORM) para representar objetos de domínio como entidades do banco de dados.

A arquitetura do sistema, centrada em torno dos princípios da POO, oferece uma estrutura modular e flexível que facilita a manutenção, extensão e evolução do sistema de gerenciamento de loja em Spring Boot. O uso eficiente dos conceitos de POO contribui para a criação de um sistema coeso, compreensível e adaptável às mudanças nos requisitos do negócio.

# Documentação

Há comentários nos códigos para facilitar a compreenssão. As classes clientes e pedidos são cadastros e controles.
Classe Faixas contém o sistema de uma loja, Backend.
O backend foi escrito em Java, ultilizando o Spring Boot como framework e o MySQL como banco de dados.
