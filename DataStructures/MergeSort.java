package DataStructures;
import java.util.Scanner;

class MergeSort{

    public static void MergeSortExample(int arr[]){
        if(arr==null){
            return;
        }
        if(arr.length>1){
            int mid=arr.length/2;
            int left[]=new int[mid];
            for(int i=0;i<mid;i++){
                left[i]=arr[i];
            }
            int right[]=new int[arr.length-mid];
            for(int i=mid;i<arr.length;i++){
                right[i-mid]=arr[i];
            }
            MergeSortExample(left);
            MergeSortExample(right);
            int i=0;int j=0;int k=0;
            while(i<left.length && j<right.length){
                if(left[i]<right[j]){
                    arr[k]=left[i];
                    i++;
                }
                else{
                    arr[k]=right[j];
                    j++;
                }
                k++;
            }
            while(i<left.length){
                arr[k]=left[i];
                i++;
                k++;
            }
             while(j<right.length){
                arr[k]=right[j];
                j++;
                k++;
            }
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of array");
        int size=sc.nextInt();
        int arr[]=new int[size];
        System.out.println("Enter the elements");
        for(int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }
        MergeSortExample(arr);
        System.out.println("Array Elements are:");
        for(int i=0;i<arr.length;i++){
            System.out.println(arr[i]);
        }
    }
}














// import java.util.Scanner;


// public class MergeSort {
//     static void divide(int arr[], int si,int ei){
//     int mid=(si+(ei-si))/2;
//     if(si<ei){
//     divide(arr, si, mid);
//     divide(arr, mid+1, ei);
//     merge(arr,si,mid,ei);
//     }
// }
// static void merge(int arr[],int si,int mid,int ei){
//     int mg[]=new int[arr.length];
//     int mg1[]=new int[arr.length];
//     int idx1=ei;
//     int idx2=mid+1;
//     int x=0;
//     while(idx1<=mid && idx2<=ei){
//         if(mg[idx1]<mg1[idx2]){
//             arr[x++]=mg[idx1];
//         }else{
//             arr[x++]=mg1[idx2];
//         }
//         x++;
//     }
//     while(idx1<mid){
//         arr[x++]=mg[idx1];
//         idx1++;
//         x++;
//     }
//     while(idx2<ei){
//         arr[x++]=mg1[idx2];
//         idx2++;
//         x++;
//     }
//     for(int i=0;i<mg.length;i++)
//     {
//        System.out.println(mg[i]);
//     }
// }
//     public static void main(String[] args) {
//         Scanner sc=new Scanner(System.in);
//         System.out.println("Enter the size of array");
//         int size=sc.nextInt();
//         int arr[]=new int[size];
//         System.out.println("Enter the elements");
//         for(int i=0;i<arr.length;i++){
//             arr[i]=sc.nextInt();
//         }
//         int si=0;
//         int ei=size;
//         divide(arr,si,ei);
//     }
// }
