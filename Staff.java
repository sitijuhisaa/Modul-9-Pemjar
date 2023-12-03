import java.io.*;

public class Staff implements Serializable
{
    String nama;
    String divisi;
    int umur;

    public Staff(String nama, String divisi, int umur)
    {
        this.nama=nama;
        this.divisi=divisi;
        this.umur=umur;
    }
    public void print()
    {
        System.out.println("Data Staff :");
        System.out.println("Nama : "+ nama);
        System.out.println("Divisi : "+divisi);
        System.out.println("Umur : " +umur);
    }
}
