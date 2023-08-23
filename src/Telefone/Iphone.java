package Telefone;

import Telefone.Internet.Navegador;
import Telefone.Reprodutor.ReprodutorMusical;
import Telefone.Telefonia.Telefone;

public class Iphone implements Navegador, Telefone, ReprodutorMusical {
    @Override
    public void navegadorExibirPagina() {
        System.out.println("exibindo pagina");
    }

    @Override
    public void navegadorAdicionarNovaAba(String link) {
        System.out.println("adicionando nova aba,Link: " + link);
    }

    @Override
    public void navegadorAtualizarPagina() {
        System.out.println("pagina atualizada");
    }

    @Override
    public void reprodutorTocar() {
        System.out.println("tocando Música");
    }

    @Override
    public void reprodutorPausar() {
        System.out.println("pausando Música");
    }

    @Override
    public void reprodutorSelecionarMusica(String musica) {
        System.out.println("selecionando nova Música: " + musica);
    }

    @Override
    public void telefoneLigar() {
        System.out.println("Chamada iniciada");
    }

    @Override
    public void telefoneAtender() {
        System.out.println("Chamada atendida");
    }

    @Override
    public void telefoneIniciarCorreioVoz() {
        System.out.println("Novo Correio de voz iniciado");
    }
}