package mrloiho.hust.file_io;

import java.util.Scanner;

/**
 *
 * @author Mr Loi Ho
 */
public class DemoSearch {

    private static int binarySearch1(int arr[], int target) {
        int min = 0;
        int max = arr.length - 1;
        int mid = 0;

        while (min <= max) {
            mid = (min + max) / 2;
            if (arr[mid] == target) {
                return mid;
            } else if (arr[mid] < target) {
                min = mid + 1;
            } else {
                max = mid - 1;
            }
        }

        return -1;
    }
//    private static int binarySearch(String arr[], String s) {
//        int min = 0;
//        int max = arr.length - 1;
//        int mid = 0;
//
//        while (min <= max) {
//            mid = (min + max) / 2;
//            if (arr[mid].indexOf(s)==1) {
//                return mid;
//            } else if (arr[mid] < target) {
//                min = mid + 1;
//            } else {
//                max = mid - 1;
//            }
//        }
//
//        return -1;
//    }

    public static void main(String[] args) {
        int searchNum = 0;
        int[] arr = {2, 3, 5, 7, 11, 13, 17, 19, 23, 27, 31, 37, 39, 41, 43, 47};
        Scanner sc = new Scanner(System.in);
        System.out.println("nhap so can tim");
        searchNum= sc.nextInt();
        System.out.println("Found 13 at index: " + binarySearch1(arr, searchNum));
    }
}
