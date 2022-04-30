package gradient;

public class DataSet {
    
    double [] x = {1,2,3,4,5,6,7,8,9};
    double [] y = {3,6,9,12,15,18,21,24,27};
    
    double b0 = 0;
    double b1 = 0;
    double a = 0.003;
    double error = 0;
    
    public double[] getMatrizx(){
            
            return x;
            
    }//Fin public int[] getMatrizx
        
    public double[] getMatrizy(){
            
        return y;
            
    }//Fin public int[] getMatrizy
    
    public double getB0(){
        
        return b0;
        
    }//Fin public double getB0
    
    public double getB1(){
        
        return b1;
        
    }//Fin public double getB1
    
    public double getA(){
        
        return a;
        
    }//Fin public double getA
    
    public double getError(){
        
        return error;
        
    }//Fin public double getError
    
}//Fin public class DataSet
