# 📦 Buscador de Endereços via CEP (Java + ViaCEP API)

Este projeto é uma aplicação Java que realiza a busca de endereços a partir de um **CEP informado pelo usuário**, utilizando a **API pública ViaCEP**. O resultado da consulta é exibido no console e salvo automaticamente em um arquivo `.json`.

## 🚀 Funcionalidades

- Solicita um CEP ao usuário via terminal.
- Consulta o endereço correspondente na API ViaCEP.
- Exibe o endereço formatado no console.
- Salva o resultado da consulta em um arquivo `.json` com o nome do CEP.

## 🛠️ Tecnologias e Bibliotecas

- Java 17+
- `java.net.http.HttpClient` (requisições HTTP)
- `com.google.gson.Gson` (serialização JSON)
- API pública ViaCEP: [https://viacep.com.br](https://viacep.com.br)

## 📁 Estrutura de Arquivos

- `ConsultaCep.java` – Classe responsável por fazer a requisição à API e tratar a resposta.
- `Endereco.java` – Classe `record` que representa os dados retornados da API.
- `GeradorDeArquivo.java` – Responsável por salvar o endereço em um arquivo `.json`.
- `Principal.java` – Classe principal com o método `main` que integra todas as funcionalidades.
- `01001-000.json` – Exemplo de arquivo gerado a partir de uma consulta.

## 📌 Exemplo de uso

Digite o número do CEP que deseja consultar:  
**01001-000**

### Saída no console:
Endereco[cep=01001-000, logradouro=Praça da Sé, ...]

Arquivo gerado: `01001-000.json`
  

## ▶️ Como executar

1. Clone o repositório:
   ```bash
   git clone https://github.com/seu-usuario/buscador-cep-java.git

## 🧠 Sobre o Projeto

Este projeto foi desenvolvido como parte dos estudos sobre **API REST**, **requisições HTTP** e **manipulação de JSON com Gson em Java**.


## 👨‍💻 Autor

Feito por **Petterson Oliveira**  
Aluno do programa **Oracle Next Education - ONE** 🚀  

🔗 [LinkedIn](https://www.linkedin.com/in/pettersonoliveirati/)  
📁 [GitHub](https://github.com/PettersonnOliveira)



  
