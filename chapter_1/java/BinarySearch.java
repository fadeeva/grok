public class BinarySearch {
	
    public static int binarySearch(int[] arr, int item) {
        int low = 0;
        int mid = 0;
        int high = arr.length - 1;
        int guess = 0;
        
        while(low <= high) {
            mid = (low + high);
            guess = arr[mid];
            
            if(guess == item)
                return mid;
            
            if(guess > item)
                high = mid - 1;
            else
                low = mid + 1;
        }
        
        return -1;
    }
    
    public static void main(String[] args) {
		int arr[] = {1, 3, 5, 7, 9, 12, 13, 16, 19, 23, 56, 57, 59, 65, 66, 68, 98, 103};
		
		System.out.println(binarySearch(arr, 65));
	}
}