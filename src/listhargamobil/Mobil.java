/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package listhargamobil;


public class Mobil implements java.io.Serializable{
    private String merk;
    private String nama;
    private double harga;
    private String kode;
    
   public Mobil(){
   }
   public Mobil(String merk, String nama, double harga, String kode) {
        this.merk = merk;
        this.nama = nama;
        this.harga = harga;
        this.kode = kode;
    }
    public String getMerk() {
        return merk;
    }

    public void setMerk(String merk) {
        this.merk = merk;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public double getHarga() {
        return harga;
    }

    public void setHarga(double harga) {
        this.harga = harga;
    }

    public String getKode() {
        return kode;
    }

    public void setKode(String kode) {
        this.kode = kode;
    }
     public boolean validasiHarga(String harga){
        for(char c: harga.toCharArray()){
            if(!Character.isDigit(c)){
                return false;
        }
    }
        return true;
  }
 @Override
    public String toString(){
        return "Mobil <code:"+kode+", merk: "+merk+", nama: "+nama+",harga: "+String.valueOf(harga)+">";
    }
    
}
