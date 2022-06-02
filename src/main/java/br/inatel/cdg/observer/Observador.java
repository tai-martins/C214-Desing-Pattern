package br.inatel.cdg.observer;

public class Observador implements iObservador {

    private String frase;
    int id;

    public Observador(int id) {
        this.id = id;
    }

    String teste = "Testando Observer para a tarefa de engenharia de software";

    @Override
    public void update(Observavel frase){

    }

}
