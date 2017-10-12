public class Avg {
    public static void main(String[] args) {
        double[] s=new double[10];
        double sum=0;
        for (int i=0;i<s.length;i++)
            s[i]=Math.random()*100;
        for (double i:s){
            sum+=i;
        }
        System.out.println("Среднее арифметическое = " + sum/s.length);

    }

}
