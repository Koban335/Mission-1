package com.company;
import java.io.*;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;
import java.util.Scanner;

public class Main {
    static  int summa = 0;
public static boolean flag = true;
    public static int fileContents;
   public  static String numberString;
    public static int obsh;
    public static void main(String[] args) throws IOException {
        // строка для записи
        while (flag == true) {
            List<String> lines = Files.readAllLines(Paths.get("BD.txt"), Charset.defaultCharset());
            fileContents = Integer.parseInt(lines.get(0));
            OsP();



            System.out.println("Хотите продолжить? [Y/n]");
            Scanner q = new Scanner(System.in);
            String something = q.nextLine();

            switch (something){
                case "N":
                    flag = false;
                    break;
                case "n":
                    flag = false;
                    break;
                case "Y":
                    flag = true;
                     summa = 0;
                    break;
                case "y":
                    flag = true;
                     summa = 0;
                    break;

            }
        }
        }



        public static void OsP () throws IOException {

    System.out.println("Введите целые числа.");
    System.out.println("Пример ввода:1 2 5 12");
    Scanner sc = new Scanner(System.in);
     numberString = sc.nextLine();


    for (String s : numberString.split(" "))
        summa += Integer.parseInt(s);
int obsh = summa + fileContents;
    System.out.println("Сумма ввдененных чисел сейчас: " + summa + " + " + "сумма введенных чисел в прошлый раз: " + fileContents + " = " + obsh);
            String text = String.valueOf(obsh);
            FileOutputStream fos = new FileOutputStream("BD.txt");
            byte[] buffer = text.getBytes();
            fos.write(buffer, 0, buffer.length);
    }

}











