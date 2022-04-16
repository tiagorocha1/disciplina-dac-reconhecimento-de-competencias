# Projeto para obtenção de reconhecimento de competências

## IFPB - Campus Monteiro    
<strong> Curso: </strong> Análise e Desenvolvimento de Sistemas </br>
<strong> Disciplina: </strong> Desenvolvimento de Aplicações Corporativas </br>
<strong> Professor: </strong> Elenilson Vieira </br>
<strong> Aluno: </strong> Tiago Rocha </br>
<strong> Período: </strong> 2022.1 </br>
  
 ## Instalação
 
 ### 1) Executar o script para configuração inicial do Banco - Banco de dados MySQL
 Usuário padrão <strong>admin</strong> com  senha <strong>123</strong>
   
    INSERT INTO `profile` (`id`, `name`) VALUES (1, 'ROLE_ALUNO');
    INSERT INTO `profile` (`id`, `name`) VALUES (2, 'ROLE_ADMINISTRADOR');
    
    INSERT INTO `user` (`id`, `email`, `name`, `password`) VALUES (1, 'admin', 'admin', '$2a$10$.fE23/l3rJnjIK05biQFUuqqLuhbN5BnzHZ25vdh5kl9dmxdIKgBC');
    
    INSERT INTO `user_profiles` (`user_id`, `profiles_id`) VALUES (1, 2);
    INSERT INTO `category` (`id`, `name`) VALUES (1, 'SUPORTE USUARIO');
    INSERT INTO `category` (`id`, `name`) VALUES (2, 'SUPORTE LABORATORIO');
    INSERT INTO `category` (`id`, `name`) VALUES (3, 'CRIACAO CONTEUDO DIGITAL');
    INSERT INTO `category` (`id`, `name`) VALUES (4, 'MANUTENCAO PC');
    INSERT INTO `category` (`id`, `name`) VALUES (5, 'MANUTENCAO REDE');
    
### 2) Deploy BackEnd

### 3) Deply FronEnd


    
