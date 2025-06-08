package streams;

public class CaseInsensitiveQuickSort {
    public static void main(String[] args) {
    	
    	long startTime = System.nanoTime();
    	
    	
        String[] names = {"Vishal", "jain", "ramesh", "suresh", "arun"};

        quickSort(names, 0, names.length - 1);

        // Print sorted array
        for (String name : names) {
            System.out.println(name);
        }
        long endTime = System.nanoTime();
        long timetaken = endTime - startTime;
    	System.out.println("timetaken -> " + timetaken);
    }

    // QuickSort algorithm
    public static void quickSort(String[] arr, int low, int high) {
        if (low < high) {
            int pi = partition(arr, low, high);

            // Recursively sort left and right parts
            quickSort(arr, low, pi - 1);
            quickSort(arr, pi + 1, high);
        }
    }

    // Partition method (Lomuto partition scheme)
    public static int partition(String[] arr, int low, int high) {
        String pivot = arr[high];
        int i = low - 1;

        for (int j = low; j < high; j++) {
            if (arr[j].compareToIgnoreCase(pivot) <= 0) {
                i++;
                swap(arr, i, j);
            }
        }

        swap(arr, i + 1, high);
        return i + 1;
    }

    // Swap utility
    public static void swap(String[] arr, int i, int j) {
        String temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
