/*
 * เขียนโปรแกรมรับค่าขนาดของ Array 1 มิติ จากแป้นพิมพ์ จากนั้นรับค่าจำนวนเต็มตามขนาดของ Array ที่ประกาศไว้ และแสดงผลลัพธ์แบบตามลำดับหน้าไปหลัง และตามลำดับหลังไปหน้า
 */
package array7;

import java.util.Scanner;

public class array7 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter an array size: ");
        int size = scanner.nextInt();
        int[] array = new int[size];
        for (int i = 0; i < size; i++) {
            System.out.print("Enter integer " + (i + 1) + ": ");
            array[i] = scanner.nextInt();
        }
        System.out.println("In order:");
        for (int i = 0; i < size; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println("\nReverse order:");
        for (int i = size - 1; i >= 0; i--) {
            System.out.print(array[i] + " ");
        }
        scanner.close();
    }
}
