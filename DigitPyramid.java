package hon_toki;

 // p.121

 // ピラミッド表示

 import java.util.Scanner ;


 public class DigitPyramid {

     public static void main ( String[] args ) {

         Scanner stdln  = new Scanner ( System.in) ;


         System.out.println ("ピラミッドを表示します") ;
         System.out.print ("段数は  :") ;
         int n = stdln.nextInt ( ) ;

         for (int i = 1 ; i <= n ; i++ )  {
            for (int j = 1 ; j <= n - i ; j++ )

              System.out.print(' ') ;

            for (int j = 1 ; j <= 2 * i - 1 ; j++ )
              System.out.print(i%10) ;

        System.out.println() ;


           }

        }

    }





