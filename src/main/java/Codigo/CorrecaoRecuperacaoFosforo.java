
package Codigo;

public class CorrecaoRecuperacaoFosforo {
    
    public double FontesFosforo(int fonteFosforo){
        switch (fonteFosforo) {
            case 1:
                return 18;
            case 2:
                return 41;
            case 3:
                return 48;
            case 4:
                return 45;
            case 5:
                return 18;
            case 6:
                return 33;
            case 7:
                return 29;
            case 8:
                return 32;
            case 9:
                return 24;
            case 10:
                return 18.5;
            case 11:
                return 52;
            case 12:
                return 18;
            default:
                return 0;
        }
    }
    
    public double CorrecaoRecuperacaoFosforo(double teorFosforo, int fonteFosforo, double eficienciaFosforo, double fosforoNoSolo){
        
        double calculo1 = (teorFosforo - fosforoNoSolo) * 2 * 2.29;
                
        double calculo2 = calculo1 * 100 / eficienciaFosforo / 100;
                
        double valor = calculo2 * 100 / FontesFosforo(fonteFosforo);
        
        return valor * 100; 
    }
    
}
