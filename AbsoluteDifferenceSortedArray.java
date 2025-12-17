import java.util.*;

public class AbsoluteDifferenceSortedArray {
    public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the no of elements in array:");
    int n =  sc.nextInt(); 
     int[] arr = new int[n];
     for(int i=0;i<n;i++){
        System.out.println("enter the element: "+(i+1));
        arr[i] = sc.nextInt();
     }
     Arrays.sort(arr);
     int target;
     System.out.println("Enter the target varaible: ");
     target = sc.nextInt();
     int min = Math.abs(arr[0]-target);
     for(int i=1;i<arr.length;i++){
        
        if(target>=arr[i]){            
            if(target-arr[i]<min){
                min = target-arr[i];
            }}
        else{
             if(arr[i]-target<min){
                min = arr[i]-target;
            }
        }

        }
        System.out.println(min);
        sc.close();
     }
    
}
