/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pboif2.pkg10118070.latihan33.userlogin;

/**
 *
 * @author Ailyasha
 * Nama : Aufa Ilyasha
 * Nim : 10118070
 * Kelas : IF-2
 * Nama kelas : Pemrograman Berbasis OO
 */
public class User {
     private final String username = "AufaIlyasha";
    private final String password = "terbaikselalu";
    private boolean statusAkun;
    
    private boolean cekAkun(String parUserName, String parPassword) {
        return (username.equals(parUserName) && parPassword.equals(password));
    }
    
    private void hasilLogin(boolean status, String parUserName) {
        System.out.println("");
        
        if(status) {
            System.out.println("******HALLO "+parUserName+"******");
            System.out.println("Selamat Datang di Aplikasi ini");
        }
        else
            System.out.println("Ooops, Username atau Password anda salah");
    }
    
    public void pengecekkanLogin(String parUserName, String parPassword) {
        statusAkun = cekAkun(parUserName, parPassword);
        hasilLogin(statusAkun ,parUserName);
        System.out.println("(Developed by : Aufa Ilyasha)");
    
}
}
