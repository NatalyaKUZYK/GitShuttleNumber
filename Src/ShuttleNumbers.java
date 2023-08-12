public class ShuttleNumbers {
    public static void main (String [] args){
        for (int i = 1; i <= 100 ; i++) {
            if( i % 10 != 4 && i % 10 !=9 && i/10 !=4 && i / 10 !=9){
                System.out.println( i);
            }

        }
    }
}
