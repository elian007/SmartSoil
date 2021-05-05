
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
                
        double calculo2 = (calculo1 * 100 / eficienciaFosforo / 100) * 100 / FontesFosforo(fonteFosforo);
                       
        return calculo2 * 100; 
    }
    
    double custoCorrecaoFosforo(double valorTonelada, double qtdFosforoKg){
        return valorTonelada * (qtdFosforoKg/1000);
    }
    
    
    double enxofreKgHectare(int fonte) {
        double enxofre;
        double fosforoKgHectare = CorrecaoRecuperacaoFosforo(12.0, 1, 70.0, 8.59);
        double alqueire = fosforoKgHectare * 2.42;

        switch (fonte) {
            case 1:
                enxofre = (alqueire * 0.1)/2.42;
                return enxofre;
            case 5:
                enxofre = fosforoKgHectare * 0.15;
                return enxofre;
            case 12:
                enxofre = (alqueire * 0.11)/2.42;
                return enxofre;
            default:
                enxofre = 0.0;
                return enxofre;
        }
    }
    
    double calcioKgHectare(int fonte, double fosforoKgHectare){
        
        double valorCalcio = FontesFosforo(1);
        double calcioKgHectare = fosforoKgHectare * valorCalcio;
        return calcioKgHectare;
    }
    
}
