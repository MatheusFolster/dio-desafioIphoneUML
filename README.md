# Projeto da DIO - iPhone UML

Este projeto tem como objetivo simular o funcionamento de um iPhone, utilizando a implementação de interfaces para funcionalidades como chamadas telefônicas, navegação na internet e reprodução de música.

## Descrição

O código é uma simulação de um iPhone, onde as funcionalidades foram divididas em interfaces, e a classe `Iphone` implementa essas interfaces. O projeto é estruturado para demonstrar como utilizar interfaces e a implementação de métodos que simulam as ações de um iPhone, como:

- **Aparelho Telefônico**: funcionalidades para ligar, atender e iniciar o correio de voz.
- **Navegador de Internet**: funcionalidades para exibir páginas, adicionar novas abas e atualizar páginas.
- **Reprodutor Musical**: funcionalidades para tocar, pausar e selecionar músicas.

## Estrutura do Projeto

O projeto é dividido em pacotes e interfaces:

- **Interfaces**:
  - `AparelhoTelefonico`: Define os métodos para um aparelho telefônico.
  - `NavegadorInternet`: Define os métodos para navegação na internet.
  - `ReprodutorMusical`: Define os métodos para reprodução de música.
  
- **Classe `Iphone`**:
  - Implementa todas as interfaces e suas funcionalidades.
  
- **Classe `Main`**:
  - Contém o código de teste para demonstrar o uso das funcionalidades do iPhone.

## Diagrama UML

Abaixo está o diagrama UML que representa a estrutura do projeto:

<img src="images/ClasseUML.png" width="500" />


## Como Executar

Para rodar este projeto, siga os passos abaixo:

1. **Clone o repositório**:
   ```bash
   git clone https://github.com/MatheusFolster/dio-desafioIphoneUML.git
