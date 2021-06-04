package shijian10;
import java.util.*;
public  class Fenxi {
    public static double getTotalScore(String S){
        Scanner scanner=new Scanner(S);
        scanner.useDelimiter("[^0123456789.]+");
        double totalScore=0;
        while(scanner.hasNext()) {
            try {
                double score = scanner.nextDouble();
                totalScore = totalScore + score;
            }
            catch(InputMismatchException exp){
                String t=scanner.next();
            }
        }
        return  totalScore;
    }
}
