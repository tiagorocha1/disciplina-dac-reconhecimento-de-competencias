# Projeto para obtenção de reconhecimento de competências

## IFPB - Campus Monteiro    
<strong> Curso: </strong> Análise e Desenvolvimento de Sistemas </br>
<strong> Disciplina: </strong> Desenvolvimento de Aplicações Corporativas </br>
<strong> Professor: </strong> Elenilson Vieira </br>
<strong> Aluno: </strong> Tiago Rocha </br>
<strong> Período: </strong> 2022.1 </br>

##

### Avaliação - Requisitos

  Tema livre:
 - Deve envolver ao menos 2 entidades
 - Algo útil
 
  É necessário utilizar as tecnologias da disciplina:
  - Backend (Java + Spring + Spring Boot + Spring Data JPA + Spring MVC + Spring Tool Suite + MySQL)
  - Frontend (ReactJS)
  - Deve fazer uso de Autenticação Controle de versão
  - GIT
  
  Entrega:
  - Link do GIT
  - Vídeo explicativo do código e demonstração do funcionamento
  - Manual para continuação do desenvolvimento (passo a passo para baixar o projeto e fazê-lo rodar)
  - Apresentação (20 minutos)

## Screenshots

![page01](https://user-images.githubusercontent.com/8715162/163701535-da1ae346-9693-468f-abeb-ef14b03f6107.PNG)

![page02](https://user-images.githubusercontent.com/8715162/163701538-051b71c8-3d93-47bd-bf5c-c6ae56544434.PNG)

![page3](https://user-images.githubusercontent.com/8715162/163701546-3951a868-07d5-4f30-a233-50b34339b6a5.PNG)

 ### Trainee Tasks
_A system for recording tasks_

![N|Solid](https://pivotal.gallerycdn.vsassets.io/extensions/pivotal/vscode-boot-dev-pack/0.1.0/1629148309593/Microsoft.VisualStudio.Services.Icons.Default)
![N|Solid](https://raw.githubusercontent.com/GozAttila/GozAttila/main/assets/4_React.png)



[![Build Status](https://travis-ci.org/joemccann/dillinger.svg?branch=master)](https://travis-ci.org/joemccann/dillinger)

##
 ### Instalação
 
 #### 1) Executar o script para configuração inicial do Banco - Banco de dados MySQL
 Usuário padrão <strong>admin</strong> com  senha <strong>123</strong>
   
    CREATE DATABASE trainee
    
    INSERT INTO `profile` (`id`, `name`) VALUES (1, 'ROLE_ALUNO');
    INSERT INTO `profile` (`id`, `name`) VALUES (2, 'ROLE_ADMINISTRADOR');
    
    INSERT INTO `user` (`id`, `email`, `name`, `password`) VALUES (1, 'admin@task', 'admin', '$2a$10$.fE23/l3rJnjIK05biQFUuqqLuhbN5BnzHZ25vdh5kl9dmxdIKgBC');
    
    INSERT INTO `user_profiles` (`user_id`, `profiles_id`) VALUES (1, 2);
    INSERT INTO `category` (`id`, `name`) VALUES (1, 'SUPORTE USUARIO');
    INSERT INTO `category` (`id`, `name`) VALUES (2, 'SUPORTE LABORATORIO');
    INSERT INTO `category` (`id`, `name`) VALUES (3, 'CRIACAO CONTEUDO DIGITAL');
    INSERT INTO `category` (`id`, `name`) VALUES (4, 'MANUTENCAO PC');
    INSERT INTO `category` (`id`, `name`) VALUES (5, 'MANUTENCAO REDE');
    
#### 2) Deploy BackEnd
Importar o projeto na sua IDE de preferência, no Spring Tools Suite:</br>
<strong> File -> Import -> Git -> Project from Git (with smart import). </strong> </br>
Finalizada a importação,  no STS, clicar com o botão direito: run as -> Java Application. 

    https://github.com/tiagorocha1/disciplina-dac-reconhecimento-de-competencias.git


#### 3) Deply FronEnd
  1) Instalar o node.js (https://nodejs.org/en/download/)
  2) Clonar o projeto 
  3) Entrar na pasta FrontEnd
  4) Executar o comando npm install (instala todas as dependências configuradas no arquivos package.json)
  5) Executar o comando npm run dev (roda o projeto na porta 8081 --> http://localhost:8081/?#/tasks ) 


    
