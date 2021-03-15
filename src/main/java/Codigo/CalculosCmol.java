
package Codigo;

public class CalculosCmol {
        public double S_cmol(double potassio, double calcio, double magnesio){
            
            double soma = potassio + magnesio + calcio;
            
            return soma; 
        }
        
        public double CTC_cmol(double potassio, double calcio, double magnesio, double h_al){
            
            double soma = potassio + magnesio + calcio + h_al;
            
            return  soma;
        
        }
        
        public double V_atual (double potassio, double calcio, double magnesio, double h_al){
            
            double S_cmol = potassio + magnesio + calcio;
            double CTC_cmol = potassio + magnesio + calcio + h_al;
            double soma = 100 * S_cmol / CTC_cmol;
            
            return soma;
        
        }
    
}
