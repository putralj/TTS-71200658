package com.uts.prakrplbo;

public class Mangga extends Buah{
    private int harga;

    @Override
    public void setHarga() {
        this.setHarga(2000);
    }

    @Override
    public void setNama(String nama) {
        super.setNama("Mangga");
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
