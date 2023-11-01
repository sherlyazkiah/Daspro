public class MidQuestion2 {
    public static void main(String[] args) {
        double sum = 0.0; 
        double i = 0.0, j = 0.0;
        
        for(i=1.0;i<=99;i++){
            sum += i;
        }
        for(j=2.5;j<i;j++){
            sum += j;
        }
        System.out.println(sum);
    }
}
