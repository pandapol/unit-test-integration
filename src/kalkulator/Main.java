package kalkulator;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Kalkulator kalkulator = new Kalkulator();
        Hasil jawab;
        String jalankan = "Y";

        while(jalankan.equals("Y") || jalankan.equals("y")){
            Scanner input1 = Main.getScannerObject();
            System.out.println("Masukkan nilai pertama: ");
            int nilai1 = input1.nextInt();

            Scanner input2 = Main.getScannerObject();
            System.out.println("Masukkan nilai kedua: ");
            int nilai2 = input2.nextInt();

            Scanner input3 = Main.getScannerObject();
            System.out.println("Pilih operasinya; 1. Pertambahan, 2. Pengurangan, 3. Perkalian, 4. Pembagian: ");
            int operator = input3.nextInt();

            if(operator == 1)
                jawab = kalkulator.pertambahan(nilai1, nilai2);
            else if(operator == 2)
                jawab = kalkulator.pengurangan(nilai1, nilai2);
            else if(operator == 3)
                jawab = kalkulator.perkalian(nilai1, nilai2);
            else
                jawab = kalkulator.pembagian(nilai1, nilai2);

            if(jawab.getJawab() == -1 && operator == 4)
                System.out.println(jawab.getPesanError());
            else
                System.out.println(jawab.getJawab());

            Scanner input = Main.getScannerObject();
            System.out.println("Mau nyobain lagi?(Y/N): ");
            jalankan = input.nextLine();
        }

    }

    private static Scanner getScannerObject(){
        return new Scanner(System.in);
    }
}
