package com.uts.prakrplbo;

public class Apel extends Buah{
    private int harga;

    @Override
    public void setNama(String nama) {
        super.setNama("Apel");
    }

    @Override
    public void setHarga() {
        this.setHarga(3000);
    }

    @Override
    public String getNama() {
        return super.getNama();
    }

    @Override
    public int getHarga() {
        return harga;
    }
}
