
package Atividade_Testes;

import Codigo.CorrecaoRecuperacaoFosforo;
import java.text.DecimalFormat;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class Atividade_Testes {
    
    @Test
    public void CorrecaoRecuperacaoFosforo(){
        
        DecimalFormat format = new DecimalFormat("#.##");
        
        assertEquals(format.format(123.95), format.format(new CorrecaoRecuperacaoFosforo().CorrecaoRecuperacaoFosforo(12, 1, 70, 8.59)));
        assertEquals(format.format(12.4), format.format(new CorrecaoRecuperacaoFosforo().enxofreKgHectare(1)));
        assertEquals(format.format(34.71), format.format(new CorrecaoRecuperacaoFosforo().calcioKgHectare(1, 123.95)));
        assertEquals(format.format(156.18), format.format(new CorrecaoRecuperacaoFosforo().custoCorrecaoFosforo(1260.00, 123.95)));
    }
    
}
