import java.util.LinkedList;

public class Tugas3LinkedList {
    public static void main(String[] args) {
        LinkedList<String>nama = new LinkedList<String>();
        LinkedList<String>nim = new LinkedList<String>();
        LinkedList<String>alamat = new LinkedList<String>();

        System.out.println("......Biodata Mahasiwa......");
        nama.add(" Dini Arisandi ");
        nim.add(" 2111521012 ");
        alamat.add(" Bukittinggi ");
        
        System.out.println(" Nama Mahasiswa  : " +nama);
        System.out.println(" NIM             : " +nim);
        System.out.println(" Alamat          : " +alamat);
        System.out.println(" ");
     
        //Menambah biodata mahasiswa
        System.out.println("......Tambah Biodata Mahasiswa......");
        //nama
        nama.add(" Audrey S.");
        nama.add(" Putri Latifah");
        nama.add(" Farani Permata S.");
        //nim
        nim.add(" 2111511010 ");
        nim.add(" 2111521034 ");
        nim.add(" 2111523000 ");
        //alamat
        alamat.add(" Padang ");
        alamat.add(" Bukittinggi ");
        alamat.add(" Payakumbuh ");
        
        System.out.println(" Nama Mahasiswa  : " +nama);
        System.out.println(" NIM             : " +nim);
        System.out.println(" Alamat          : " +alamat);
        System.out.println(" ");
      
        //Mengubah Biodata Mahasiswa
        System.out.println("......Revisi Biodata Mahasiswa......");
        //nama
        nama.set(1," Audrey Salsabila ");
        nama.set(3," Farani Permata Sari ");
        //nim
        nim.set(1," 2111521010 ");
        //alamat
        alamat.set(2," Batusangkar ");
        
        System.out.println(" Nama Mahasiswa   : " +nama);
        System.out.println(" NIM              : " +nim);
        System.out.println(" Alamat           : " +alamat);
        System.out.println(" ");

        //Menghapus Biodata Mahasiswa
        System.out.println("......Hapus Biodata Mahasiswa......");
        //nama
        nama.removeFirst();
        //nim
        nim.removeFirst();
        //alamat
        alamat.removeFirst();
        
        System.out.println(" Nama Mahasiswa  : " +nama);
        System.out.println(" NIM             : " +nim);
        System.out.println(" Alamat          : " +alamat);
        System.out.println(" ");
        
        //Mengambil Biodata Mahasiswa 
        System.out.println("......Mengambil Biodata Mahasiswa......");
        System.out.println(" Nama Mahasiswa pada indeks awal : " +nama.getFirst());
        System.out.println(" NIM indeks ke-1                 : " +nim.get(1));
        System.out.println(" Alamat pada indeks akhir        : " +alamat.getLast());
        System.out.println(" ");
        
        //Ukuran Biodata Mahasiswa
        System.out.println("......Ukuran Biodata Mahasiswa......");
        System.out.println(" Ukuran Biodata Nama Mahasiswa   : " +nama.size());
        System.out.println(" Ukuran Biodata NIM              : " +nim.size());
        System.out.println(" Ukuran Biodata Alamat Mahasiswa : " +alamat.size());
      
    } 
    
}