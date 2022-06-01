package br.inatel.cdg.observer;

public interface iObservavel {

    public void registraObservador(Observador obs);
    public void removeObservador(Observador obs);
    public void notificaObservadores();
}
