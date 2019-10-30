import java.util.Scanner;

public class addElement {
    public static void main(String[] args) {
        int arr[] = {1,4,6,3,7,2,9};
        Scanner scanner=new Scanner(System.in);
        System.out.println("Nhap so can chen : ");
        int x=scanner.nextInt();

        System.out.println("Nhap vao vi tri can chen");
        int index=scanner.nextInt();
        if( index<=1||index>=arr.length-1){
            System.out.println("Kho  chen duoc phan tu vao mang");
        }
        for (int i=arr.length-1;i>index;i--){
            arr[i]=arr[i-1];
        }
        arr[index]=x;
        for (int a:arr){
            System.out.println(a);
        }


    }
}
