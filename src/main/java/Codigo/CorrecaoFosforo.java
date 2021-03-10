    
package Codigo;

public class CorrecaoFosforo {
    
    public double CorrecaoFosforo(int valor, double temp){
        if(valor == 1){
            return (temp * 0.28);

        }else if(valor == 2){
            return (temp * 0.2);
            
        }else if(valor == 3){
            return (temp * 0.09);
            
        }else if(valor == 4){
            return (temp * 0.16);
            
        }else if(valor == 5){ 
            return (temp * 0.28);
            
        }else if(valor == 6){
            return (temp * 0.52);
            
        }else if(valor == 7){            
            return (temp * 0.52);
             
        }else if(valor == 8){            
            return (temp * 0.45);
             
        }else if(valor == 9){            
            return (temp * 0.28);
             
        }else if(valor == 10){            
            return (temp * 0.44);
             
        }else if(valor == 11){            
            return (temp * 0);
             
        }else if(valor == 12){            
            return (temp * 0.18);
             
        }else{
            return 0;
        }
    }
}
