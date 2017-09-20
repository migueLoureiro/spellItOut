/**
 * Created by Jose.Loureiro on 2017/09/20.
 */
public class SpellItOut {
    public static void main(String args[]){
        int n = Integer.parseInt(args[0]);
        System.out.println(n);
        System.out.println("-------");
        int t1,t2,t3,t4,t5,t6;//temporary variables
        String r="";//string with the result;

        if (n == 1000000000) {
            System.out.println("one billion");
            return;
        }else{
            /* TODO thoudsands and millions*/

            if (n>999999){
                t1 = (n/1000)%1000000;
                System.out.println(t1);
                r += spellMillion(t1);
            }
            if (n>999) {
                t1 = n % 1000000;
                System.out.println(t1);
                r += spellThousand(t1);
            }
            t1 = n%1000;
            r += spellHundreds(t1);
        }
        System.out.println(r);
    }

    public static String spellMillion(int n){
        return spellOver1000(n, "million");
    }

    public static String spellThousand(int n){
        return spellOver1000(n, "thousand");
    }

    /**
     *
     * @param n number to be spelled over thousand
     * @param s unit: thousand, million, billion, etc...
     * @return The spelled part
     */
    public static String spellOver1000(int n, String s){
        int t = n/1000;
        String r = "";

        if (t < 10){
            r += " "+spellUnit(t);
        }else{
            if (t>100){
                r += " " + spellHundreds(t);
            }else {
                if (t < 20) {
                    r += " " + spellDozenUnder20(t);
                } else {
                    r += " " + spellDozenOver20(t);
                }
            }
        }
        r += " "+s;
        return r;
    }

    public static String spellHundreds(int n){
        //variables necessary
        String r="";
        int t1 = n/100;//1st number
        int t2 = (n/10)%10;//2nd number
        int t2under20 = n%100;//10-20 value
        int t3 = n%10;//3rd number

        //hundred level
        if (n>99){
            r += " "+spellUnit(t1);
            r += " hundred";
        }

        //dozen level
        if (t2==1){
            r += " "+spellDozenUnder20(t2under20);
        }else {
            r += " "+spellDozenOver20(t2under20);
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
        String r = "";
        switch (n/10){
            case 1:
                r += "";
                break;
            case 2:
                r += "twenty";
                break;
            case 3:
                r += "thirty";
                break;
            case 4:
                r += "fourty";
                break;
            case 5:
                r += "fifty";
                break;
            case 6:
                r += "sixty";
                break;
            case 7:
                r += "seventy";
                break;
            case 8:
                r += "eighty";
                break;
            case 9:
                r += "ninety";
                break;
            default://0 or value over 10 some error:
                r += "";
        }
        //unit level
        int t = n%10;
        //System.out.println(t);
        r += " " + spellUnit(t);
        System.out.println("-----------");
        System.out.println(r);
        System.out.println("-----------");
        return r;
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
