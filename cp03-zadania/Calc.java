
public class Calc
{
    int x;
    int y;
    int sum;
    
    static int NumOfItems (int x, int y){
        
        if (x < 0){
            return(y - x);
        }
        else if ((x < 0) & (y < 0)){
            return(-x + y);
        }
        else {
            return (y - x);
        }
    }
    static int SumOfNum (int x, int y, int sum){
        
        int i;
        for (i = x; i <= y; i++){
            sum = sum + i;
        }
        return (sum);
    }
    static double AritMean (int x, int y, int sum){
        
        int i;
        
        for (i = x; i <= y; i++){
            sum = sum + i;
        }
        double mean = sum / (y-x);
        return (mean);
    }
    public static void main (String [] args){
        int x = 5;
        int y = 10;
        int sum = 0;
        System.out.println("Number of items: " + NumOfItems(x,y));
        System.out.println("Sum of numbers: "  + SumOfNum(x,y,sum));
        System.out.println("Arithmetic mean: " + AritMean(x,y,sum));
        
    }
}
