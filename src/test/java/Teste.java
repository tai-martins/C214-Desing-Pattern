import br.inatel.cdg.observer.Observador;
import br.inatel.cdg.observer.Observavel;

import org.junit.Test;
import org.junit.Before;
import static org.junit.Assert.assertTrue;

public class Teste {

    @Test
    public void testRegistraObservador(){
        Observavel frase = new Observavel();
        Observador obs4 = new Observador(4);
        frase.registraObservador(obs4);
        assertTrue(!frase.getObservadores().isEmpty());
    }

    @Test
    public void testeRemoveObservador(){

    }

}