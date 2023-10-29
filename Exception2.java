import java.util.Scanner;

public class Exception2 {
    public static void main(String args[]){
        int arr1[] = new int[10];
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 10 elements one by one");
        for (int i = 0; i < 10; i++){
            arr1[i] = sc.nextInt();
        }

        try {
            System.out.println("Array element at 11 position" + arr1[11]);
        }
        catch(ArrayIndexOutOfBoundsException e) {
            System.out.println(e.getMessage());
        }
    }
}
