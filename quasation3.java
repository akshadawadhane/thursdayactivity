import java.util.Scanner;
 
public class MainClass
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
         
        System.out.println("How many rows you want in this pattern?");
         
        int rows = sc.nextInt();
         
        System.out.println("Here is your pattern....!!!");

        for(int i=1;i< rows+1 ;i++)
        {
            for(int j=i; j < rows+1 ;j++)
            {
                System.out.print(j + " ");
            }
            for(int k=1; k < i ;k++)
            {
                System.out.print(k + " ");
            }
            System.out.println();
        }
        
        sc.close();
    }
}


