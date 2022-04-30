package gradient;
import javax.swing.JOptionPane;

public class Gradient{
    MeanSquare MS = new MeanSquare();
    boolean alter = MS.MeanSquared();
    double b0 = MS.getB0();
    double b1 = MS.getB1();
    public void Error(){
        System.out.println("Error: " + String.format("%.7f", MS.getError()));
    }
    public double predict(){
        double Valor = Float.parseFloat(JOptionPane.showInputDialog("Ingresa El Valor a Predecir"));
        double predict = (Valor * b0) + b1;
        System.out.println("Predict: " + predict);
        return predict;
    }
//Imprimir betas
    public void Beta0(){
        
        System.out.println("B0: " + b0);
        
    }
    
    public void Beta1(){
        System.out.println("B1: " + b1);
    }
}