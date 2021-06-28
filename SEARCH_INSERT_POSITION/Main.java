package SEARCH_INSERT_POSITION;

public class Main {
    public static void main(String[] args) {
        int[] arr = { 1, 3, 5 };
        int target = 3;
        int lengthOfArray = arr.length;
        int first = 0;
        int last = lengthOfArray - 1;

        while (last >= first) {
            int mid = ((first + (last)) / 2);
            if (arr[mid] == target) {
                System.out.println(first + " " + last);
                System.out.println("FOUND");
                return;
            } else if (arr[mid] < target) {
                first = mid + 1;
            } else if (arr[mid] > target) {
                last = mid - 1;

            }
        }
        System.out.print(first + " " + last);

        return;
    }
}
