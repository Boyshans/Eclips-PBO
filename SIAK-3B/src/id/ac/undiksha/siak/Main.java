package id.ac.undiksha.siak;

import id.ac.undiksha.siak.people.Mahasiswa;
import id.ac.undiksha.siak.people.Dosen;

public class Main {
    public static void main(String[] args) {
      
        Mahasiswa ani = new Mahasiswa();
        ani.setNim("12345");
        ani.setNama("Ani");
        ani.setAlamat("Singaraja");
        ani.setTanggalLahir("1 Oktober 2004");
        ani.setJenisKelamin(true);
        ani.setProdi("Ilmu Komputer");

   
        System.out.println(ani.getNim());
        System.out.println(ani.getNama());
        System.out.println(ani.getAlamat());
        System.out.println(ani.getJenisKelamin());
        System.out.println(ani.getTanggalLahir());
        System.out.println(ani.getProdi());

     
        Dosen agus = new Dosen();
        agus.setNip("12345");
        agus.setNama_dosen("Agus");
        agus.setAlamat("Tabanan");
        agus.setBidang_keahlian("Teknologi Web");
        agus.setJenisKelamin(true);

        
        System.out.println(agus.getNip());
        System.out.println(agus.getNama_dosen());
        System.out.println(agus.getAlamat());
        System.out.println(agus.getJenisKelamin());
        System.out.println(agus.getBidang_keahlian());
    }
}
