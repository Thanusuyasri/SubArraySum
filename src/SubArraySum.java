import java.util.Scanner;

public class SubArraySum {
    public static int sumSubarray(int[] array)
    {
        int sum=0;
        for(int i=0;i<array.length;i++)
        {
            for(int j=i;j<array.length;j++)
            {
                for(int k=i;k<=j;k++)
                {
                    sum+=array[k];
                }
            }
        }
        return sum;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int size = scanner.nextInt();
        int[] array = new int[size];
        for(int i=0;i<size;i++)
        {
            array[i]= scanner.nextInt();
        }
        System.out.println(sumSubarray(array));
    }
}
