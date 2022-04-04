package com.uts.prakrplbo;

import java.util.*;

public class Keranjang {
    private List<Buah> daftarBuah = new ArrayList<>();

    public void tambahProduk(Buah buah) {
        daftarBuah.add(buah);
        System.out.println(buah.getNama() + " telah ditambahkan ke keranjang!");
    }

        public void hapusProduk(Buah buah){
            boolean state;
            if (daftarBuah.contains(buah)) {
                daftarBuah.remove(buah);
            } else {
                System.out.println(buah.getNama() + " sudah tidak ada di dalam keranjang!");
            }
        }

        public void getKeranjang () {
//            for (int i = 0; i < daftarBuah.size(); i++) {
//                System.out.println(daftarBuah.get(i));
//            }
        }


    }
//}
