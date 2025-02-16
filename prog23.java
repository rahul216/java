public class prog23 {
    public static void main(String[] args) {
        String[] strings = {"banana", "apple", "cherry", "mango", "grape"};
        
        // Sorting the array of strings manually (Bubble Sort)
        for (int i = 0; i < strings.length - 1; i++) {
            for (int j = 0; j < strings.length - 1 - i; j++) {
                if (strings[j].compareTo(strings[j + 1]) > 0) {
                    // Swap strings[j] and strings[j + 1]
                    String temp = strings[j];
                    strings[j] = strings[j + 1];
                    strings[j + 1] = temp;
                }
            }
        }
        
        // Displaying the sorted array
        System.out.println("Sorted strings in ascending order:");
        for (String str : strings) {
            System.out.println(str);
        }
    }
}
// note: use compareToIgnorecase() instead of compareTo() if we want the sorting case-insensitive (treats "Banana" and "banana" the same).