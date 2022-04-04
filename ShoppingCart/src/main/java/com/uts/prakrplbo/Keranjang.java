package com.uts.prakrplbo;

import java.util.*;

public class Keranjang {
    private List<Buah> daftarBuah = new ArrayList<>();

    public void tambahProduk(Buah buah){
        daftarBuah.add(buah);
    }

    public void hapusProduk(Buah buah){
        daftarBuah.remove(0);
    }

    public void getKeranjang(){
        for (int i = 0; i < daftarBuah.size(); i++){
            System.out.println(daftarBuah.get(i));
        }
    }
}
