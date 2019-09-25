/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.latihan3;
    import java.util.Scanner;

/**
 *
 * @author Tendy
 * NAMA     : Tendy Hermansyah
 * KELAS    : PBO2
 * NIM      : 10118083
 * Deskripsi Program : Memasukan Nilai Dari Keyboard
 */
public class Input {
    public static void main(String[] args){
        System.out.println("Masukan nama anda: = ");
        Scanner scanner = new Scanner(System.in);
        
        String nama = scanner.next();
        System.out.println("Nama anda adalah "+ nama);
    }
}
