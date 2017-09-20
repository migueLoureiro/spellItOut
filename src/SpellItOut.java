/**
 * Created by Jose.Loureiro on 2017/09/20.
 */
public class SpellItOut {
    public static void main(String args[]){
        int n = Integer.parseInt(args[0]);
        int t1,t2,t3,t4,t5,t6;//temporary variables
        String r="";//string with the result;

        if (n == 1000000000) {
            System.out.println("one billion");
        }else{
            /* TODO thoudsands and millions*/
            r = spellHundreds(n);
        }
        System.out.println(r);
    }
    public static String spellHundreds(int n){
        /* TODO values under 100 */
        //variables necessary
        String r="";
        int t1 = n/100;//1st number
        int t2 = (n/10)%10;//2nd number
        int t2under20 = n%100;//10-20 value
        int t3 = n%10;//3rd number

        //hundread level
        r += " "+spellUnit(t1);
        r += " hundred";

        //dozen level
        if (t2==1){
            r += " "+spellDozenUnder20(t2under20);
        }else {
            r += " "+spellDozenOver20(t2);
            //unit level
            r += " " + spellUnit(t3);
        }
        return r;
    }

    public static String spellDozenUnder20(int n){
        switch (n){
            case 10:
                return "ten";
            case 11:
                return "eleven";
            case 12:
                return "twelve";
            case 13:
                return "thirteen";
            case 14:
                return "fourteen";
            case 15:
                return "fifteen";
            case 16:
                return "sixteen";
            case 17:
                return "seventeen";
            case 18:
                return "eighteen";
            case 19:
                return "nineteen";
            default://0 or value over 10 some error:
                return "";
        }
    }
    public static String spellDozenOver20(int n){
        switch (n){
            case 1:
                return "";
            case 2:
                return "twenty";
            case 3:
                return "thirty";
            case 4:
                return "fourty";
            case 5:
                return "fifty";
            case 6:
                return "sixty";
            case 7:
                return "seventy";
            case 8:
                return "eighty";
            case 9:
                return "ninety";
            default://0 or value over 10 some error:
                return "";
        }
    }

    public static String spellUnit(int n){
        switch (n){
            case 1:
                return "one";
            case 2:
                return "two";
            case 3:
                return "three";
            case 4:
                return "four";
            case 5:
                return "five";
            case 6:
                return "six";
            case 7:
                return "seven";
            case 8:
                return "eight";
            case 9:
                return "nine";
            default://0 or value over 10 some error:
                return "";
        }
    }//close main
}
