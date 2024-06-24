package static1.ex;

public class MathArrayUtils {

    private MathArrayUtils(){

    }

    public static int sum(int[] values){
        int sum = 0;
        for(int i = 0 ; i <values.length ; i++){
            sum += values[i];

        }
        return sum;
    }

    public static double average(int[] values){
        int sum = sum(values);
        return (double)  sum/values.length;

    }

    public static int min(int[] values){
        int minValue = values[0];
        for(int i = 0; i < values.length; i++) {
          if(minValue > values[i] ){
              minValue = values[i];
          }
        }
        return minValue;
    }

    public static int max(int[] values){
        int maxValue = values[0];
        for(int vales : values){
            if(vales > maxValue){
                maxValue = vales;
            }
        }
        return maxValue;
    }
}
