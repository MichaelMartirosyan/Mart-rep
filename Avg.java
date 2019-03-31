public class Avg {
    public static void main(String[] args) {
        //создаем массив
        double[] s=new double[10];
        double sum=0;
        //заполнение массива значениями
        for (int i=0;i<s.length;i++)
            s[i]=Math.random()*100;
        //находим сумму всех элементов массива
        for (double i:s){
            sum+=i;
        }
        System.out.println("Среднее арифметическое = " + sum/s.length);
		
		//just for test

    }
    
}
