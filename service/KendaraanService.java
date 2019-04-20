package services;

import java.util.*;
import entity.*;

public class KendaraanService {

    private static List<Kendaraan> data = new LinkedList<Kendaraan>();

    public void tambahData(Kendaraan kdn) {
        data.add(kdn);
        System.out.println("data telah tersimpan");
    }

    public void ubahData(Kendaraan kdn) {
        int idx = data.indexOf(kdn);
        if(idx >= 0) {
            data.set(idx, kdn);
            System.out.println("data telah berubah");
        }
    }

    public void hapusData(String nomor) {
        int idx = data.indexOf(new Kendaraan(nomor, "", "", ""));
        if(idx >= 0) {
            data.remove(idx);
            System.out.println("data telah terhapus");
        }
    }

    public void tampilkanData() {
        System.out.println("\n--= Data Kendaraan =--");
        int urutan = 1;
        for (Kendaraan kdn : data){
            System.out.println("data ke-" + urutan++);
            System.out.println("  NOMOR : " + kdn.getnomor());
            System.out.println("  NAMA : " + kdn.getNama());
            System.out.println("  JENIS KENDARAAN : " + kdn.getJenis_kendaraan());
            System.out.println("  WARNA : " + kdn.getWarna());
        }
    }

}