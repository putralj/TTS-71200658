package com.uts.prakrplbo;

public abstract class Buah {
    private String nama;
    private int jumlah, harga;

    public Buah() {
    }

//    public Buah(String nama, int jumlah, int harga) {
//        this.nama = nama;
//        this.jumlah = jumlah;
//        this.harga = harga;
//    }

    public String getNama() {
        return nama;
    }

    public int getJumlah() {
        return jumlah;
    }

    public int getHarga() {
        return harga;
    }

    public abstract void setHarga();

    public void setNama(String nama) {
        this.nama = nama;
    }

    public void setJumlah(int jumlah) {
        this.jumlah = jumlah;
    }

    public void setHarga(int harga) {
        this.harga = harga;
    }
}
