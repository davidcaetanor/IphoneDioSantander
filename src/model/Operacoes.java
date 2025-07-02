package model;

import interfaces.AparelhoTelefonico;
import interfaces.NavegadorInternet;
import interfaces.ReprodutorMusical;


public class Operacoes  implements AparelhoTelefonico, NavegadorInternet, ReprodutorMusical{

    private String music;

    public Operacoes() {
    }

    @Override
    public void startCall(String call) {
        System.out.println("Chamando " + call + "...");
        int valor = (int) (Math.random() * 4) + 1;

        boolean atendida = (valor <= 2);

        if (atendida) {
            System.out.println("Chamada Atendida!");
        } else {
            System.out.println("Chamada sem resposta.");
        }

    }

    @Override
    public void endCall() {
        System.out.println("Chamada finalizada!");
    }

    @Override
    public void answer() {
        System.out.println("Chamada atendida!");
    }

    @Override
    public void newTab() {
        System.out.println("Nova Aba!");
    }

    @Override
    public void refreshPage() {
        System.out.println("Pagina Atualizada");
    }

    @Override
    public void playMusic(String music) {
        System.out.println("Tocando " + music + "...");
    }

    @Override
    public void stopMusic() {
        System.out.println("Musica parada!");
    }

    @Override
    public void changeMusic() {
        System.out.println("Trocando de Musica...");
    }

}
