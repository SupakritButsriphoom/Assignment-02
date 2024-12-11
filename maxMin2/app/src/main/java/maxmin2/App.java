/*
 * 2) จงเขียนโปรแกรมเพื่อรับค่า 3 ค่าจากแป้นพิมพ์ในฟังก์ชันหลัก 
 * จากนั้นให้ใช้ฟังก์ชันในการหาว่าค่าใดมากที่สุด ค่าใดน้อยที่สุด 
 * ผลลัพธ์จากการนำค่ามากที่สุดบวกกับค่าน้อยที่สุด 
 * แล้วกลับมาแสดงผลตามตัวอย่างที่กำหนดให้ในฟังก์ชันหลัก 
 * โดยให้เขียนฟังก์ชันตามการประกาศฟังก์ชันดังนี้
mymax(int, int, int);
mymin(int, int, int);

 */
package maxmin2;

import java.util.Scanner;

public class App {
    public static int mymax(int a, int b, int c) {
        int max = a;
        if (b > max) {
            max = b;
        }
        if (c > max) {
            max = c;
        }
        return max;
    }

    public static int mymin(int a, int b, int c) {
        int min = a;
        if (b < min) {
            min = b;
        }
        if (c < min) {
            min = c;
        }
        return min;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter first number: ");
        int a = scanner.nextInt();
        System.out.print("Enter second number: ");
        int b = scanner.nextInt();
        System.out.print("Enter last number: ");
        int c = scanner.nextInt();
        int max = mymax(a, b, c);
        int min = mymin(a, b, c);
        int total = max + min;
        System.out.println("Max value: " + max + "\nMin value: " + min);
        System.out.print("Total Max plus Min is " + total);
        scanner.close();
    }
}
