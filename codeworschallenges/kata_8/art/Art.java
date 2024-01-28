package codeworschallenges.kata_8.art;

public class Art {
        public static boolean amShibe = true;
        public static String greet() {

            if(amShibe){
                String shibe =
                        "                Y.                      _             \n" +
                                "                YiL                   .```.           \n" +
                                "   much world   Yii;                .; .;;`.          \n" +
                                "                YY;ii._           .;`.;;;; :          \n" +
                                " such hello     iiYYYYYYiiiii;;;;i` ;;::;;;;          \n" +
                                "            _.;YYYYYYiiiiiiYYYii  .;;.   ;;;          \n" +
                                "         .YYYYYYYYYYiiYYYYYYYYYYYYii;`  ;;;;          \n" +
                                "       .YYYYYYY$$YYiiYY$$$$iiiYYYYYY;.ii;`..          \n" +
                                "      :YYY$!.  TYiiYY$$$$$YYYYYYYiiYYYYiYYii.         \n" +
                                "      Y$MM$:   :YYYYYY$! `` 4YYYYYiiiYYYYiiYY.        \n" +
                                "   `. :MM$$b.,dYY$$Yii  :'   :YYYYllYiiYYYiYY         \n" +
                                "_.._ :`4MM$!YYYYYYYYYii,.__.diii$$YYYYYYYYYYY         \n" +
                                ".,._ $b`P`      4$$$$$iiiiiiii$$$$YY$$$$$$YiY;        \n" +
                                "   `,.`$:       :$$$$$$$$$YYYYY$$$$$$$$$YYiiYYL       \n" +
                                "     `;$$.    .;PPb$`.,.``T$$YY$$$$YYYYYYiiiYYU:      \n" +
                                "    ;$P$;;: ;;;;i$y$ !Y$$$b;$$$Y$YY$$YYYiiiYYiYY      \n" +
                                "    $Fi$$ .. ``:iii.`- :YYYYY$$YY$$$$$YYYiiYiYYY      \n" +
                                "    :Y$$rb ````  `_..;;i;YYY$YY$$$$$$$YYYYYYYiYY:     \n" +
                                "     :$$$$$i;;iiiiidYYYYYYYYYY$$$$$$YYYYYYYiiYYYY.    \n" +
                                "      `$$$$$$$YYYYYYYYYYYYY$$$$$$YYYYYYYYiiiYYYYYY    \n" +
                                "      .i!$$$$$$YYYYYYYYY$$$$$$YYY$$YYiiiiiiYYYYYYY    \n" +
                                "     :YYiii$$$$$$$YYYYYYY$$$$YY$$$$YYiiiiiYYYYYYi'    ";

                return shibe;
            }

            return "hello world!";
        }

    public static void main(String[] args) {
        System.out.println( Art.greet());
    }
}
