package com.example;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        System.out.println("=================================== \n" +
            "Basic Calculator using Java \n" +
            "=================================== \n" +
            "Silahkan pilih operasi perhitungan \n" +
            "1. Penjumlahan \n" +
            "2. Pengurangan \n" +
            "3. Perkalian \n" +
            "4. Pembagian \n"
        );

        Scanner myObj = new Scanner(System.in); // Scanner object
        System.out.print("Input operasi yang dipilih (berupa angka)  = ");
        int operasiPerhitungan = myObj.nextInt();
        System.out.print("Masukkan angka pertama = ");
        double angka1 = myObj.nextDouble();
        System.out.print("Masukkan angka kedua = ");
        double angka2 = myObj.nextDouble();

        if (operasiPerhitungan == 4 && angka2 == 0.0){
            System.out.println("Tidak bisa dibagi nol");
        }

        switch (operasiPerhitungan){
            case 1:
                double result  = angka1 + angka2;
                System.out.println("Hasil penjumlahan dari " + angka1 + " + " + angka2 + " = " + result);
                break;
            case 2:
                result = angka1 - angka2;
                System.out.println("Hasil pengurangan dari " + angka1 + " - " + angka2 + " = " + result);
                break;
            case 3 :
                result = angka1 * angka2;
                System.out.println("Hasil perkalian dari " + angka1 + " * " + angka2 + " = " + result);
                break;
            case 4 :
                result = angka1 / angka2;
                System.out.println("Hasil pembagian dari " + angka1 + " / " + angka2 + " = " + result);
                break;
            default:
                System.out.println("Operasi tidak sesuai");
        }
    }
}
