package hon_toki;


 // p.139

    // 逆ピラミッド表示

    import java.util.Scanner ;

    public class reverseDigitPyramid {


        public static void main ( String[] args ) {

            Scanner stdln  = new Scanner ( System.in) ;


            System.out.println ("ピラミッドを表示します") ;
            System.out.print ("段数は  :") ;
            int n = stdln.nextInt ( ) ;

            for (int i = 0 ; i < n ; i++ )  {
               for (int j = 1 ; j < i+1 ; j++ )

                 System.out.print(' ') ;

               for (int j = 1 ; j < (n-i)*2 ; j++ )
            //     System.out.print(i+1%10) ;
                System.out.print((i+1)%10) ;



           System.out.println() ;


              }

           }

       }



