package gradient;

import static java.lang.Math.pow;

public class Error {
    
    DataSet DS = new DataSet();
    
    double [] aux = DS.getMatrizx();
    double [] auy = DS.getMatrizy();
    
    double Error;
    
    public double Error(double b0, double b1){
        
        for(int i = 0; i < 9; i++){
            
            Error = pow((auy[i] - (b0 + b1 * aux[i])), 2);
            
        }//Fin for i
        
        Error = 1 * Error / 9;
        
        return Error;
        
    }//Fin public double Error
            
}//Fin public class Error
