package hon_core_p286omikuji;

import java.io.BufferedReader ;
import java.io.IOException ;
import java.io.InputStreamReader;



public class game {

    public static void main(String[] args) throws IOException {


        //  キーボードから入力
        BufferedReader a = new BufferedReader (new InputStreamReader (
        System.in)) ;


          System.out.println("おみくじを引きますか？ 【はい→y  / いいえ→ｎ】") ;

          String name = a.readLine() ;   //入力された文字を name 変数に代入

          if (name.equals("y")) {

              System.out.println("名前を入力してください。");



          name = a.readLine() ;
            System.out.println (name + "さんの  おみくじの結果は ・・・") ;

            int tera = (int)(Math.random () * 7) ; // 0から6までの乱数を作る
            String omikuji  = " "  ;  // おみくじの結果を格納する


            switch  (tera) {
              case 0 :
                  omikuji = "大吉" ;
                  break ;

              case 1 :
                  omikuji = "中吉" ;
                  break ;

              case 2 :
                  omikuji = "小吉" ;
                  break ;


              case 3 :
                  omikuji = "吉" ;
                  break ;


              case 4 :
                  omikuji = "凶" ;
                  break ;


              case 5 :
                  omikuji = "大凶" ;
                  break ;


           default :

               System.out.println("入力が正しくありません。") ;
               break ;

            }

               System.out.println (omikuji + "です") ;


            }  else if (name.equals("n")) {

                System.out.println("また次回に引いてくださいね。") ;

            }  else {

                System.out.println ("y か ｎ を入力してください。") ;

               }
             }
           }

