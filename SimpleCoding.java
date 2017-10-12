import java.util.Scanner;

public class SimpleCoding {
    public static void main(String[] args) throws java.io.IOException {
        int key=77;
        String encs="";
        String decs="";
        Scanner sc= new Scanner(System.in);
        String s;

        System.out.println("Введите строку которую вы хотите зашифровать: ");
        s=sc.nextLine();
        System.out.println(s);
        System.out.print("Иcxoднoe сообщение: ");
        System.out.println(s);
        // Шифрование сообщения из s
        for (int i=0;i<s.length();i++)
            encs=encs + (char) (s.charAt(i)^key);

        System.out.print("Зamифpoвaннoe сообщение: ");
        System.out.println(encs);

        // Дешифрование
        for (int i=0; i<s.length();i++)
            decs= decs + (char) (encs.charAt(i)^key);

        System.out.print("Дeшифpoвaннoe сообщение: ");
        System.out.println(decs);

    }
}
