/* write a program to check the key is avalable in arrays or not 
 * like key =4 and arr{1,2,3,4,5}
 * output is= index(3)
 */

public class FirstOccure {
    public static int First(int arr[],int key){
        for(int i=0;i<arr.length;i++){
            if(arr[i]==key){
                return i;
            }
        }
        
        return -1;
    }


    public static void main(String[] args) {
        int arr[]={1,2,3,4,5};
        int key=0;
        System.out.println(First(arr, key));

    }
    
}
