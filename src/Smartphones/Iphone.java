package Smartphones;

import funcoes.AparelhoTelefonico;
import funcoes.NavegadorNaInternet;
import funcoes.ReprodutorMusical;

public class Iphone implements AparelhoTelefonico, NavegadorNaInternet, ReprodutorMusical {


    public void Ligar() {
        System.out.println("Ligado Iphone...");
    }

    public void Atender() {
        System.out.println("Atendendo ligação no Iphone...");
    }

    public void IniciaCorreioDeVoz() {
        System.out.println("Iniciando correio de voz no Iphone...");
    }

    public void ExibePagina() {
        System.out.println("Exibindo página de internet...");
    }

    public void AdicionaNovaAba() {
        System.out.println("Adicionando nova aba da página de internet...");
    }

    public void AtualizaPagina() {
        System.out.println("Atualizando página de internet...");
    }

    public void TocaMusica() {
        System.out.println("Tocando música...");
    }

    public void PausaMusica() {
        System.out.println("Parando música...");
    }

    public void SelecionaMusica() {
        System.out.println("Selecionando música...");
    }
}
