//This program shows how to print a multiplication table of a number in java

public class TableofaNumber {
    public static void main(String args[])
    {
        int number = 3;
        for(int i=1;i<=10;i++)
        {
            System.out.println(number+" * "+i+" = "+number * i);
        }

        System.out.println();

        //Another approach
        int number1 = 3;
        int n = 1;
        while(n<=10)
        {
            System.out.println(number1+" * "+n+" = "+number1 * n);
            n++;
        }
    }
}
