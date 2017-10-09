public class Symbol {
    public static void main (String[] args) throws java.io.IOException {
        char ch;
        int upper=0,lower=0;
        do {
            ch = (char) System.in.read();
            if ((ch >= 65) & (ch <= 90)) {
                upper++;
                ch += 32;}

            else
                if ((ch >= 97) & (ch <= 122)){
                lower++;
                ch -= 32;
            }
            System.out.println(ch);
            if (ch!='.'){
                System.out.println(upper);
                System.out.println(lower);
            }
        }
        while (ch!='.');


    }
}
