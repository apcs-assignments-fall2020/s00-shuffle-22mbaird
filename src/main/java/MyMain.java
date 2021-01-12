public class MyMain {

    // Shuffles an array, using the perfect shuffle algorithm
    public static int[] perfectShuffle(int[] arr) { 
        int half = ((arr.length/2)-1);
        int[] arr1 = arr[0::half];
        int[] arr2 = arr[arr.length/2::arr.length];
        int[] arrshuffled;
        
        for (int i = 0; i<arr.length; i++)
        {
            if (i%2==0)
            {
                 arrshuffled[i] += arr1[i];
            }
            else
            {
                arrshuffled[i] += arr2[i];
            }
            
            
        }
    
        return arrshuffled;
    }

    // Shuffles an array, using the selection shuffle algorithm
    public static int[] selectionShuffle(int[] arr) { 
        int x = 0;
        for (int i = 0; i<arr.length; i++)
        {
            int ran = (int)(Math.random()*arr.length);
            x = arr[i];
            arr[i] = arr[ran];
            arr[ran] = x;
            
        }
        return arr;
    }


    public static void main(String[] args) {
        int[]arr = {1, 2, 3, 4, 5, 21, 22, 23, 24, 25};
        System.out.println(selectionShuffle(arr));
        System.out.println(perfectShuffle(arr));
    }
}
