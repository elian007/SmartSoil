
package Codigo;

public class CalculosCmol {
        public float S_cmol(float potassio, float calcio, float magnesio){
            
            float soma = potassio + magnesio + calcio;
            
            return soma; 
        }
        
        public float CTC_cmol(float potassio, float calcio, float magnesio, float h_al){
            
            float soma = potassio + magnesio + calcio + h_al;
            
            return  soma;
        
        }
        
        public float V_atual (float potassio, float calcio, float magnesio, float h_al){
            
            float S_cmol = potassio + magnesio + calcio;
            float CTC_cmol = potassio + magnesio + calcio + h_al;
            float soma = 100 * S_cmol / CTC_cmol;
            
            return soma;
        
        }
    
}
