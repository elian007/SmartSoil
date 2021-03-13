    
package Codigo;

public class CorrecaoFosforo {
    
    public double CorrecaoFosforo(int valor, double temp){
        switch (valor) {
            case 1:
                return (temp * 0.28);
            case 2:
                return (temp * 0.2);
            case 3:
                return (temp * 0.09);
            case 4:
                return (temp * 0.16);
            case 5:
                return (temp * 0.28);
            case 6:
                return (temp * 0.52);
            case 7:
                return (temp * 0.52);
            case 8:
                return (temp * 0.45);
            case 9:
                return (temp * 0.28);
            case 10:
                return (temp * 0.44);
            case 11:
                return (temp * 0);
            case 12:
                return (temp * 0.18);
            default:
                return 0;
        }
    }
}
