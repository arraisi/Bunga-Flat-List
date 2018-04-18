/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package menghitungbungaefektif;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class ListBungaEfektif {
    public static void ListTabel() {
        /*List <Pinjaman> list = new ArrayList();
        
        Pinjaman pinjam = new Pinjaman();
        
        pinjam.setSisa();
        pinjam.Bunga();
        pinjam.setPokokAngs();
        pinjam.Angsuran();
        pinjam.JumlahAngsuran();
        pinjam.JumlahBunga();
        pinjam.JumlahPokok();
        
        
        list.add(pinjam);
        
        /*for(Pinjaman pinjaman : list){
            System.out.println("|     "+"    Rp. "+pinjaman.getSisa()+"     |    " + "Rp.  "+ pinjaman.getPokokAngsuran()+"        |" + "Rp.  "+pinjaman.getBunga() +"   |"+ "Rp.  "+pinjaman.getAngsuran()+"    |");
            System.out.println("==================================================================================================");
   
            }}
    public static void jumlah(){ 
        List <Pinjaman> list = new ArrayList();
        
        Pinjaman pinjam = new Pinjaman();
        
        pinjam.setSisa();
        pinjam.Bunga();
        pinjam.setPokokAngs();
        pinjam.Angsuran();
        pinjam.JumlahAngsuran();
        pinjam.JumlahBunga();
        pinjam.JumlahPokok();
        
        
        list.add(pinjam);
        
        
            System.out.println("|       Jumlah      |"+"                |"+"Rp.   "+pinjam.getJumlahPokok()+"       |"+"Rp. "+pinjam.getJumlahBunga()+"     |"+"Rp. "+pinjam.getJumlahAngsuran()+"      |");
            System.out.println("==============================================+====================================================");
        */
    }



    public static void main(String[] args) {
        // TODO code application logic here
        List<MenghitungBungaEfektif> listBunga =new ArrayList<>();
       
        Scanner input = new Scanner(System.in);
        
        System.out.print("Masukan Besar Pinjaman    : ");
        long pinjaman = input.nextLong();
        System.out.print("Masukan Banyak Angsuran   : ");
        float kali = input.nextFloat();
        System.out.print("Masukan Berapa Bunga      : ");
        float sukuBunga = input.nextFloat();
        
      float jumlah  = pinjaman;
        
        for(Integer i = 0 ; i < kali ; i++){
            MenghitungBungaEfektif bunga = new MenghitungBungaEfektif();
            bunga.setPinjaman(pinjaman);
            bunga.setKali(kali);
            bunga.setSukuBunga(sukuBunga);
            bunga.JumlahAngsuran();
            bunga.Angsuran();
            bunga.Bunga();
            bunga.setPokokAngs();
            bunga.inSisa();
            bunga.setSisa();
            
            //long Jumlah = (long) (Jumlah - pinjaman/kali);
            
            listBunga.add(bunga);
        }
        
        for(MenghitungBungaEfektif bunga : listBunga){
            System.out.println("|     "+"    Rp. "+bunga.getSisa()+"     |    " + "Rp.  "+ bunga.getPokokAngsuran()+"        |" + "Rp.  "+bunga.getBunga() +"   |"+ "Rp.  "+bunga.getAngsuran()+"    |");
            System.out.println("==================================================================================================");
        }
        
    }
    
   
}
