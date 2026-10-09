package problem1;
import java.util.Scanner;
public class Sales
{
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        //final int SALESPEOPLE = 5;
        System.out.println("Enter the number of sales : ");
        int SALESPEOPLE = scan.nextInt();
        int[] sales = new int[SALESPEOPLE];
        int sum;
        for (int i=0; i<sales.length; i++)
        {
            System.out.print("Enter sales for salesperson " + (i + 1)+ ": ");
            sales[i] = scan.nextInt();
        }
        System.out.println("\nSalesperson Sales");
        System.out.println("--------------------");
        sum = 0;
        int maxSale = sales[0];
        int maxSaleId = 1;
        int minSale = sales[0];
        int minSaleId = 1;
        for (int i=0; i<sales.length; i++)
        {
            System.out.println(" " + (i + 1) + " " + sales[i]);
            sum += sales[i];
            if(maxSale <= sales[i]){
                maxSale = sales[i];
                maxSaleId = i + 1;
            }
            if(minSale >= sales[i]){
                minSale = sales[i];
                minSaleId = i + 1;
            }
        }
        double average = (double) sum / sales.length;
        System.out.println("Total sales: " + sum);
        System.out.println("average: " + average);
        System.out.println("Salesperson " + maxSaleId + " had the highest sale with $" + maxSale + ".");
        System.out.println("Salesperson " + minSaleId + " had the lowest sale with $" + minSale + ".");
        System.out.print("Enter a value: ");
        int userValue = scan.nextInt();
        System.out.println("the salespeople whose sales exceeded the value " + userValue + " are: ");
        int countValue = 0;
        for(int i = 0; i < sales.length; i++){
            if(sales[i] > userValue){
                System.out.println((i + 1) + " : " + sales[i]);
                countValue++;
            }
        }
        System.out.println("the number of the salespeople whose sales exceeded the value : " + userValue + " is " + countValue);
    }
}