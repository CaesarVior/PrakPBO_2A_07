public class Buku {
    public String isbn, judul, penulis, penerbit;
    public int tahunTebrit;

    public void tampilInfoBuku(){
        System.out.println("ISBN          : " + isbn);
        System.out.println("Judul         : " + judul);
        System.out.println("Penulis       : " + penulis);
        System.out.println("Penerbit      : " + penerbit);
        System.out.println("Tahun Terbit  : " + tahunTebrit);
    }
    
}