/**
 * Created by Rico on 12/6/2016.
 */
import java.util.Scanner;
public class ArrayMethodDemo {
    public static void main(String[] args)
    {
        int numberStorage[] = {5,2,4,7,19,3,22,2,3,13};
        displayInt(numberStorage);
        displayReverse(numberStorage);
        displaySum(numberStorage);
        displayLessThan(numberStorage);
        displayHigherThanAverage(numberStorage);
    }
    public static void displayInt(int array[])
    {
        for(int e : array)
        {
            System.out.print(e+" ");
        }
        System.out.println();
    }
    public static void displayReverse(int array[])
    {
        for(int f = array.length-1; f>=0; f--)
        {
            System.out.print(array[f]+" ");
        }
        System.out.println();
    }
    public static void displaySum(int array[])
    {
        int sum = 0;
        for(int e : array)
        {
            sum += e;
        }
        System.out.print(sum);
        System.out.println();
    }
    public static void displayLessThan(int array[])
    {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter the number");
        int userEntry = input.nextInt();
        for(int e: array)
        {
            if(e<userEntry)
            {
                System.out.print(e+ " ");
            }
        }
        System.out.println();
    }
    public static void displayHigherThanAverage(int array[])
    {
        int sum = 0;
        for(int e : array)
        {
            sum += e;
        }
        int avg = sum/array.length;
        for(int e : array)
        {
            if(e>avg)
            {
            System.out.print(e+" ");
            }
        }
    }

}
