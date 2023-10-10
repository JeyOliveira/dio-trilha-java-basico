package componente;

import equipamentos.AparelhoTelefonico;
import equipamentos.NavegadorInternet;
import equipamentos.ReprodutorMusical;

public class Iphone implements AparelhoTelefonico, NavegadorInternet, ReprodutorMusical {
    @Override
    public void ligar() {
        System.out.println("Fazendo ligação telefônica via Iphone.");

    }

    @Override
    public void atender() {
        System.out.println("Atendendo ligação telefônica via Iphone.");

    }

    @Override
    public void iniciarCorreioVoz() {
        System.out.println("Iniciando correio de voz via Iphone.");

    }

    @Override
    public void exibirPagina() {
        System.out.println("Exibindo página da web via Iphone.");

    }

    @Override
    public void atualizarPagina() {
        System.out.println("Atualizando página da web via Iphone.");

    }

    @Override
    public void adicionarNovaAba() {
        System.out.println("Adiciona nova aba no navegador via Iphone.");

    }

    @Override
    public void tocar() {
        System.out.println("Toca a música via Iphone.");

    }

    @Override
    public void pausar() {
        System.out.println("Pausa a música via Iphone");

    }

    @Override
    public void selecionarMusica() {
        System.out.println("Seleciona a música via Iphone.");

    }
}
