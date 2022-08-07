import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Nhap do dai cua mang thu nhat");
        int arr1length=scanner.nextInt();
        int[] arr1=new int[arr1length];
        for (int i = 0; i < arr1.length; i++) {
            System.out.println("Nhap phan tu thu "+(i+1)+":");
            arr1[i]=scanner.nextInt();
        }
        System.out.println("Nhap do dai cua mang thu hai");
        int arr2length=scanner.nextInt();
        int[] arr2=new int[arr2length];
        for (int i = 0; i < arr2.length; i++) {
            System.out.println("Nhap phan tu thu "+(i+1)+":");
            arr2[i]=scanner.nextInt();
        }
        int[] arr3=new int[arr2length+arr1length];
        for (int i = 0; i < arr1.length; i++) {
            arr3[i]=arr1[i];

        }
        for (int i = 0; i < arr2.length; i++) {
            arr3[i+arr1length]=arr2[i];
        }
        System.out.println("Mang 1");
        for (int e:arr1
             ) {
            System.out.print(e+"\t");

        }
        System.out.println("\nMang 2");
        for (int e:arr2
             ) {
            System.out.print(e+"\t");

        }
        System.out.println("\nMang 3");
        for (int e:arr3
             ) {
            System.out.print(e+"\t");

        }
    }
}
