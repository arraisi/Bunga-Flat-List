package menghitungbungaefektif;

import java.util.Scanner;

public class MenghitungBungaEfektif {

    long Pinjaman, Sisa, JumlahAngsuran, JumlahBunga, JumlahPokok;
    float Angsuran, Bunga, PokokAngsuran, kali, sukuBunga;

    public void JumlahAngsuran() {
        JumlahAngsuran += Angsuran;
    }

    public void JumlahPokok() {
        JumlahPokok = (long) (PokokAngsuran * kali);
    }

    public void JumlahBunga() {
        JumlahBunga += Bunga;
    }

    public void setPinjaman(long Pinjaman) {
        this.Pinjaman = Pinjaman;
    }

    public void inSisa() {
        this.Sisa = Pinjaman;
    }

    public void setKali(float kali) {
        this.kali = kali;
    }

    public void setSukuBunga(float sukuBunga) {
        this.sukuBunga = sukuBunga;
    }

    public void setSisa() {
        Sisa = (long) (Sisa - (Pinjaman / kali));
    }

    public void Bunga() {
        Bunga = Sisa * (((float) sukuBunga / 100) / 12);
    }

    public void Angsuran() {
        Angsuran = Bunga + (Pinjaman / kali);
    }

    public void setPokokAngs() {
        PokokAngsuran = Pinjaman / kali;
    }

   //---------------------------------------------------------

    public long getSisa() {
        return Sisa;
    }

    public void setSisa(long Sisa) {
        this.Sisa = Sisa;
    }

    public long getJumlahAngsuran() {
        return JumlahAngsuran;
    }

    public void setJumlahAngsuran(long JumlahAngsuran) {
        this.JumlahAngsuran = JumlahAngsuran;
    }

    public long getJumlahBunga() {
        return JumlahBunga;
    }

    public void setJumlahBunga(long JumlahBunga) {
        this.JumlahBunga = JumlahBunga;
    }

    public long getJumlahPokok() {
        return JumlahPokok;
    }

    public void setJumlahPokok(long JumlahPokok) {
        this.JumlahPokok = JumlahPokok;
    }

    public float getAngsuran() {
        return Angsuran;
    }

    public void setAngsuran(float Angsuran) {
        this.Angsuran = Angsuran;
    }

    public float getBunga() {
        return Bunga;
    }

    public void setBunga(float Bunga) {
        this.Bunga = Bunga;
    }

    public float getPokokAngsuran() {
        return PokokAngsuran;
    }

    public void setPokokAngsuran(float PokokAngsuran) {
        this.PokokAngsuran = PokokAngsuran;
    }
    

}
