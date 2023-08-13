import java.util.ArrayList;
import java.util.List;

public class ShuttleNumbers {
    public static void main (String [] args) {
        // for (int i = 1; i <= 100 ; i++) {
        //  if( i % 10 != 4 && i % 10 !=9 && i/10 !=4 && i / 10 !=9){
        //      System.out.println( i);
        List<Integer> shuttleNumbers = new ArrayList<>();
        int number = 1;
        while (shuttleNumbers.size() < 100) {
            if (!countainsFourOrNine(number)) {
                shuttleNumbers.add(number);
            }
            number++;
        }
        System.out.println(shuttleNumbers);
    }
    private static boolean countainsFourOrNine(int number){
        String numberStr = String.valueOf(number);
        return
                numberStr.contains("4") || numberStr.contains("9");
    }

        }

