# AxiomHealth

Integrantes :


*Gilberto Moreira : 88682*

*Marcio Yukio : 86662*

*Felipe Nunes : 88254*

# Instruções para rodar o serviço
*Requisitos* : DOCKER.

*O Script do banco esta na pasta resources/data.sql.*

*O projeto está utlizando HIBERNATE para executar automaticamente o script de create e insert.*

*Com o docker instalado.*

<b>1º Clone este repositorio para a sua maquina local</b>

<b>2º Abre o terminal e navegue ate a pasta raiz do projeto.</b>

*Exemplo*:

	C:\Users\junin\Documents\Downloads\AxiomHealth

<b>3º Execute o comando.</b>

*Obs: deve rodar o comando na pasta raiz do projeto que está o arquivo dockerfile e docker-compose.*

	docker build -t axiomhealth/cliente:1.1 .

Com esse comando será criado uma imagem axiomhealth na versão 1.1

4º Execute o comando para subir um container docker dos serviços.

	docker-compose up --build

 *Com isso será montado um container com a aplicação(AxiomHealth), mysql(Banco de dados), e phpsysadmin(SGBD)*

 Após isso, aguarde a subida dos serviços.
 
 Pode ocorrer da subida da aplicação(AxiomHealth) falhar na primeira tentativa. apenas starta novamente a subida no container docker.

<h3>Endpoints disponiveis : </h3>

*Utilize essas url no postman*

Lista de Objetivos ODS

	localhost:8080/objetivos
Lista de Indicadores ODS

	localhost:8080/indicador/3.1.1

Acesse o phpsysAdmin(SGBD) para consultar os dados

	 http://localhost:8000/index.php

 Usuario : root
 
 Senha : bp1234

 Para consultar os dados, acesse o banco <b> cliente_db </b>
 
<h1>Códigos de Resposta</h1>

200 OK: Dados encontrados.

204 No Content: Dados não encontrados.

404 Not Found: Endereço não encontrado.

500 Internal Server Error: Erro de processamento.

<h1>Tecnologias : </h1>

Mysql (Banco de dados)
PhpSysAdmin (SGBD)
Aplicação (Java)

*Link da imagem no dockerhub*
	
	https://hub.docker.com/r/gg3t/axiomhealthcliente/

*Obrigado pela atenção*


	
