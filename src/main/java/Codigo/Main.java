
package Codigo;

public class Main {
    
    public static void main(String[] args) {
        //-----------Teste ideais---------------------
        CalculosIdeais ideais = new CalculosIdeais(); 
        
        //Teste System.out.println(ideais.Enxofre(1));
        //Teste System.out.println(ideais.Magnesio(1));
        
        //--------------------------------------------
        //-----------Teste cmol---------------------
        CalculosCmol cmol = new CalculosCmol(); 
        
        //System.out.println(cmol.S_cmol((float)0.15,(float)5.76,(float)1.63));
        //System.out.println(cmol.CTC_cmol((float)0.15,(float)5.76,(float)1.63, (float)5.35));
        //System.out.println(cmol.V_atual(0.15,5.76,1.63, 5.35));
       
        //--------------------------------------------
        //-----------Teste Correção/Recuperação Fósforo---------------------
        CorrecaoRecuperacaoFosforo  crf = new CorrecaoRecuperacaoFosforo();
        System.out.println(crf.CorrecaoRecuperacaoFosforo(70, 3, 70, 8.59));
        
    }
    
}
