
package oop;

/**
 *
 * @author WIN10
 */
public class Data {
    
    private String nama;
    private String nim;
    private String prodi; 
    private String alamat;

    public Data() {
        nama = "";
        nim = "";
        prodi = "";
        alamat = "";
    }

    public Data(String nama, String nim, String prodi, String alamat) {
        this.nama = nama;
        this.nim = nim;
        this.prodi = prodi;
        this.alamat = alamat;
    }

    public void setNama(String nama) { this.nama = nama; }

    public void setNim(String nim) { this.nim = nim; }

    public void setProdi(String prodi) { this.prodi = prodi; }

    public void setAlamat(String alamat) { this.prodi = prodi; }

    public String getNama() { return nama; }

    public String getNim() { return nim; }

    public String getProdi() { return prodi; }
    
    public String getAlamat() { return alamat; }

}
