package buscador;

import com.google.gson.Gson;


import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;


public class ConsultaCep {
    public Endereco buscaEndereco(String cep){
        String endereco = "https://viacep.com.br/ws/"+ cep + "/json/";


        // 2. Constrói a requisição HTTP.
        // Substitua "SUA_URL_AQUI" pela URL da API que você deseja consultar.
        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create(endereco)) // <-- Substitua esta URL
                .build();

        // 3. Envia a requisição e obtém a resposta como String.

        try {
            HttpResponse<String> response = HttpClient
                    .newHttpClient()
                    .send(request, HttpResponse.BodyHandlers.ofString());
            return new Gson().fromJson(response.body(), Endereco.class);
        } catch (Exception e) {
            throw new RuntimeException("Não consegui obter o endereço a partir desse CEP.");
        }


    }
}
