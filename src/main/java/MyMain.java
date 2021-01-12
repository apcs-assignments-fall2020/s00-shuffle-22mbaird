public class MyMain {

    // Shuffles an array, using the perfect shuffle algorithm
    public static int[] perfectShuffle(int[] arr) { 
        int half = (arr.length/2);
        int[] arr1 = new int[half];//list for first half
        int[] arr2 = new int[half];//list for second half
        int[] arrshuffled = new int[arr.length];//final list
        for (int i = 0; i<half; i++)//go thru first half of arr setting values to arr1
        {
            arr1[i] = arr[i];
        }
        for (int i = half;  i<arr.length; i++)//go thru second half of arr setting values to arr2
        {
            arr2[i-half] = arr[i];
        }
        for (int i = 0; i<arr.length; i++)// for loop to check if position is even or odd and appending values depending on whether it is even or odd
        {
            if (i%2==0)
            {
                 arrshuffled[i] = arr1[i/2];
            }
            else
            {
                arrshuffled[i] = arr2[i/2];
            }
            
            
        }
    
        return arrshuffled;
    }

    // Shuffles an array, using the selection shuffle algorithm
    public static int[] selectionShuffle(int[] arr) { 
        int x = 0;
        for (int i = 0; i<arr.length; i++)//loop through list and switch positions with randomly generated values
        {
            int ran = (int)(Math.random()*arr.length);//random value generated for swap
            x = arr[i];
            arr[i] = arr[ran];//swap positions
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
