package br.inatel.cdg.observer;

import java.util.ArrayList;
import java.util.List;

public class Observavel implements iObservavel{

    private List<Observador> observadores;

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

    public List<Observador> getObservadores() {
        return observadores;
    }

    public void setObservadores(List<Observador> observadores) {
        this.observadores = observadores;
    }
}
