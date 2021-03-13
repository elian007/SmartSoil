
package Codigo;

public class CalculosIdeais {
    
    public float Fosforo(int TexturadeSolo){
        
        switch (TexturadeSolo) {
            case 1:
                return (float) 9.0;
            case 2:
                return (float) 12.0;
            default:
                return 0;
        }
        
    }
    
    public float Potassio(int TexturadeSolo){
        
        switch (TexturadeSolo) {
            case 1:
                return (float) 0.35;
            case 2:
                return (float) 0.25;
            default:
                return 0;
        }
    }
        
    public float Calcio(int TexturadeSolo){
        
        switch (TexturadeSolo) {
            case 1:
                return (float) 6.0;
            case 2:
                return (float) 4.0;
            default:
                return 0;
        }
    }
            
    public float Magnesio(int TexturadeSolo){
        
        switch (TexturadeSolo) {
            case 1:
                return (float) 1.5;
            case 2:
                return (float) 1.0;
            default:
                return 0;
        }
    }
                
    public float Enxofre(int TexturadeSolo){
        
        switch (TexturadeSolo) {
            case 1:
                return (float) 9.0;
            case 2:
                return (float) 6.0;
            default:
                return 0;
        }
    }
                    
    public float Aluminio(float valor){
        
        return 0;
    }
    public float HAL(float valor){
        
        return 0;
    }                
    
}
