
package Codigo;

public class CalculosIdeais {
    
    public double Fosforo(int TexturadeSolo){
        
        switch (TexturadeSolo) {
            case 1:
                return 9.0;
            case 2:
                return 12.0;
            default:
                return 0;
        }
        
    }
    
    public double Potassio(int TexturadeSolo){
        
        switch (TexturadeSolo) {
            case 1:
                return 0.35;
            case 2:
                return 0.25;
            default:
                return 0;
        }
    }
        
    public double Calcio(int TexturadeSolo){
        
        switch (TexturadeSolo) {
            case 1:
                return 6.0;
            case 2:
                return 4.0;
            default:
                return 0;
        }
    }
            
    public double Magnesio(int TexturadeSolo){
        
        switch (TexturadeSolo) {
            case 1:
                return 1.5;
            case 2:
                return 1.0;
            default:
                return 0;
        }
    }
                
    public double Enxofre(int TexturadeSolo){
        
        switch (TexturadeSolo) {
            case 1:
                return  9.0;
            case 2:
                return  6.0;
            default:
                return 0;
        }
    }
                    
    public double Aluminio(double valor){
        
        return 0;
    }
    public double HAL(double valor){
        
        return 0;
    }                
    
}
