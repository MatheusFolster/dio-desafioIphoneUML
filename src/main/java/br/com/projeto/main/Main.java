package br.com.projeto.main;

import br.com.projeto.iphone.Iphone;

public class Main {
    public static void main (String[] args) {
        Iphone meuIphone = new Iphone();

        // Testando o ReprodutorMusical;
        meuIphone.tocar();
        meuIphone.selecionarMusica("November Rain - Guns n Roses");
        meuIphone.pausar();

        // Testando o AparelhoTelefonico
        meuIphone.ligar("21999990000");
        meuIphone.atender();
        meuIphone.iniciarCorreioVoz();

        // Testando NavegadorInternet
        meuIphone.exibirPagina("https://www.google.com");
        meuIphone.adicionarNovaAba();
        meuIphone.atualizarPagina();

    }
}
