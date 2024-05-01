package ProyCrote3;

public class CalculadoraClass {
    
    private double num1;
    private double num2;

    public CalculadoraClass() {
    }

    public CalculadoraClass(double num1, double num2) {
        this.num1 = 0;
        this.num2 = 0;
    }

    public double getNum1() {
        return num1;
    }

    public void setNum1(double num1) {
        this.num1 = num1;
    }

    public double getNum2() {
        return num2;
    }

    public void setNum2(double num2) {
        this.num2 = num2;
    }
    
    public double suma(double num1, double num2){
        
        return num1 + num2;
        
    }
    
    public double resta(double num1, double num2){
        
        return num1 - num2;
        
    }
    
    public double multiplicacion(double num1, double num2){
        
        return num1 * num2;
        
    }
    
    public double division(double num1, double num2){
        
        if (num2 == 0) {
            
            throw new ArithmeticException("No se puede dividir por cero");
        
        }
        
        return num1 / num2;
        
    }
    
}
