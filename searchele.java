class searchele{

        static int search(int arr[], int x) {
    
            // Your code here
            int N = arr.length;
             for(int i = 0; i < N; i++)
            {
                // check if array element is equal to x
                if(arr[i] == x)
                    return i;
            }
            
            // return -1 if x is not found in the array
            return -1;
        }
    }