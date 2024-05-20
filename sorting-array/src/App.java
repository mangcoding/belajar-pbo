public class App {
    public static void main(String[] args) throws Exception {
        int[] arr = {64, 34, 25, 12, 22, 11, 90};
        bubbleSort(arr);
        System.out.println("\n1.BUBBLE SORT\nArray setelah diurutkan:");
        printArray(arr);

        int[] arr2 = {64, 34, 25, 12, 22, 11, 90};
        insertionSort(arr2,"asc");
        System.out.println("\n2.INSERTION SORT \nArray asc setelah diurutkan:");
        printArray(arr2);
        insertionSort(arr2,"desc");
        System.out.println("\nArray desc setelah diurutkan:");  
        printArray(arr2);

        int[] arr3 = {64, 34, 25, 12, 22, 100, 90};
        selectionSort(arr3);
        System.out.println("\n3.SELECTION SORT \nArray 3 setelah diurutkan:");
        printArray(arr3);
    }

    public static void insertionSort(int[] arr, String param) {
        int n = arr.length;
        for (int i = 1; i < n; i++) {
            int key = arr[i];
            int j = i - 1;
            while (j >= 0 && arr[j] > key) {
                arr[j + 1] = arr[j];
                j = j - 1;
            }
            arr[j + 1] = key;
        }
    }

    public static void selectionSort(int arr[]) 
    { 
        int pos;
        int temp;
        for (int i = 0; i < arr.length; i++) 
        { 
            pos = i; 
            for (int j = i+1; j < arr.length; j++) 
           {
                if (arr[j] < arr[pos])                  //find the index of the minimum element
                {
                    pos = j;
                }
            }

            temp = arr[pos];            //swap the current element with the minimum element
            arr[pos] = arr[i]; 
            arr[i] = temp; 
        } 
    } 

    public static void bubbleSort(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            int x = n - i - 1;
            System.out.print("Iterasi ke-" + x + ": ");
            for (int j = 0; j < x; j++) {
                if (arr[j] > arr[j + 1]) {
                    // Tukar elemen arr[j] dengan arr[j + 1]
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }

    public static void printArray(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
}
