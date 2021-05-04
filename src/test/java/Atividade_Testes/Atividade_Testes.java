
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
    
    }
    
}
