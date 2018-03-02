package poo;

import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class TesteDeValidacao {

    @Test
    public void testarSoma(){
        Aritmetica p = new Aritmetica();
        assertEquals("erro na soma", 3, p.soma(1, 2));
        assertEquals("erro na soma", 0, p.soma(-2, 2));

        assertEquals("erro na divisão", (float) 1.0, p.div(2, 2));
        assertEquals("erro na soma", (float) 5, p.div(10, 2));
    }

}
