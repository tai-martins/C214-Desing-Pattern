package br.inatel.cdg.observer;

import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class Observavel implements iObservavel{

    private List<Observador> observadores;
    private String frase;
    private String separando[];

    public Observavel(){
        observadores = new ArrayList<Observador>();
    }

    @Override
    public void registraObservador(Observador obs){
        observadores.add(obs);
    }

    @Override
    public void removeObservador(Observador obs) {
        if(observadores.contains(obs))
            observadores.remove(obs);
    }

    @Override
    public void notificaObservadores() {
        for (Observador observador : observadores) {
                observador.update(this);
        }
    }

    private void novasMedidas(){
        notificaObservadores();
    }

    public int qtdpalavras() {
        String myString = this.frase;
        StringTokenizer stringTokenizer1 = new StringTokenizer(myString);
        int cont  = stringTokenizer1.countTokens();
        return Integer.valueOf(cont);
    }

    public String[] separando() {
        String myStr = this.frase;
        String[] palavras = myStr.split(" ");
        return palavras;
    }

    public List<Observador> getObservadores() {
        return observadores;
    }

    public void setObservadores(List<Observador> observadores) {
        this.observadores = observadores;
    }

    public String getFrase() {
        return frase;
    }

    public void setFrase(String frase) {
        this.frase = frase;
    }

    public String[] getSeparando() {
        return separando;
    }

    public void setSeparando(String[] separando) {
        this.separando = separando;
    }
}
