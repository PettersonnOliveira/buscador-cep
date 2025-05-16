package buscador;

import com.google.gson.Gson;

import java.io.IOException;
import java.util.Scanner;


public class Principal {
    public static void main(String[] args) throws IOException{
        Scanner leitor = new Scanner(System.in);
        System.out.println("Digite o numero do CEP que deseja consultar: ");
        String busca = leitor.nextLine();

        ConsultaCep consultaCep = new ConsultaCep();
        try {
            Endereco novoEndereco = consultaCep.buscaEndereco(busca);
            System.out.println(novoEndereco);
            GeradorDeArquivo gerador = new GeradorDeArquivo();
            gerador.salvaJson(novoEndereco);
        } catch (RuntimeException e){
            System.out.println(e.getMessage());
            System.out.println("Finalizando a Aplicação");
        }











    }
    }

