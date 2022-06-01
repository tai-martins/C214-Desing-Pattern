import br.inatel.cdg.observer.Observavel;
import br.inatel.cdg.observer.Observador;

public class Frase {

    public static void main(String[] args){

        Observavel frase = new Observavel();

        Observador obs1 = new Observador(1);
        Observador obs2 = new Observador(2);
        Observador obs3 = new Observador(3);

        frase.registraObservador(obs1);
        frase.registraObservador(obs2);
        frase.registraObservador(obs3);

        System.out.println("Notificando os observadores");
        frase.notificaObservadores();

        frase.removeObservador(obs2);
    }


}
