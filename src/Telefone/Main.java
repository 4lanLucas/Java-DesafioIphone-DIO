package Telefone;

public class Main {
    public static void main(String[] args) {
        Iphone iphone = new Iphone();

        iphone.telefoneLigar();
        iphone.telefoneAtender();
        iphone.telefoneIniciarCorreioVoz();

        iphone.reprodutorTocar();
        iphone.reprodutorSelecionarMusica("britinei lanças");
        iphone.reprodutorPausar();
    }
}