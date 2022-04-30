package gradient;

class HelperAritmetic{

    DataSet DS = new DataSet();
    
    double [] aux = DS.getMatrizx();
    double [] auy = DS.getMatrizy();
    double CalculateB0;
    double CalculateB1;
    
    public double CalculateB0(double b0, double b1){
        for(int i = 0; i < 9; i++){
            CalculateB0 = (auy[i] - (b0 + b1 * aux[i]));
        }
        CalculateB0 = -2 * CalculateB0 / 9;
        return CalculateB0;
    }
    
    public double CalculateB1(double b0, double b1){
        for(int i = 0; i < 9; i++){
            CalculateB1 = (auy[i] - (b0 + b1 * aux[i]));
        }
        CalculateB1 = -2 * CalculateB1 / 9;
        return CalculateB1;
    }
    
}