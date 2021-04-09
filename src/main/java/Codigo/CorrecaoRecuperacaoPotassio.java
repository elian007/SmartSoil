
package Codigo;


public class CorrecaoRecuperacaoPotassio {
    
    public double tipoPotacio(int numero){
            
        switch(numero){
            case 1: 
                return 58;
            case 2:
                return 52;
            case 3: 
                return 22;
            case 4:
                return 44;
                
            default: 
                return 0;          
        }
    }
    
    public double CorrecaoRecuperacaoPotassio(int tipoFonte, double potassioDesejado, double calcio, double magnesio, double potassio, double h_al){
            
        
        double tipoPotacio = tipoPotacio(tipoFonte);
        
        
                
        double soma1 = calcio + magnesio + potassio + h_al;
        
        
        double soma2 = potassio / soma1 * 100;
        
        double soma3 = (potassio * potassioDesejado / soma2) - potassio;
        
        double soma4 = soma3 * 39.1 * 10;
        
        double soma5 = soma4 * 2;
        
        double soma6 = soma5 * 1.2;
        
        double soma7 = soma6  * 100 / 85 / 100;
        
        double soma8 = soma7 * 100 / tipoPotacio; 
            
        return soma8 * 100;
    }
    
}
