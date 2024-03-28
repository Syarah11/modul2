import javax.swing.JOptionPane;
public class luas_bangun {
    public static double LuasPersegiPanjang (double panjang, double lebar) {
        return panjang * lebar;
        
    }
    
    public static double LuasSegitiga (double alas, double tinggi) {
        return 0.5 * tinggi;
        
    }
     
    public static double LuasLingkaran (double jari2) {
        return Math.PI * Math.pow(jari2, 2);
    
    }
    
    public static void main(String[] args) {
        
        double PanjangPersegiPanjang = Double.parseDouble(JOptionPane.showInputDialog("Masukkan Panjang Persegi Panjang:"));
        double LebarPersegiPanjang = Double.parseDouble(JOptionPane.showInputDialog("Masukkan Lebar Persegi Panjang:"));
        double LuasPersegiPanjang = LuasPersegiPanjang(PanjangPersegiPanjang, LebarPersegiPanjang);
        JOptionPane.showMessageDialog(null, "Luas Persegi Panjang:" + LuasPersegiPanjang);
        System.out.println("Luas Persegi Panjang:" + LuasPersegiPanjang);
        
        double alasSegitiga = Double.parseDouble(JOptionPane.showInputDialog("Masukkan alas Segitiga:"));
        double tinggiSegitiga = Double.parseDouble(JOptionPane.showInputDialog("Masukkan tinggi Segitiga:"));
        double LuasSegitiga = LuasSegitiga(alasSegitiga, tinggiSegitiga);
        JOptionPane.showMessageDialog(null, "Luas Segitiga:" + LuasSegitiga);
        System.out.println("Luas Segitiga:" + LuasSegitiga);
        
        double jari2Lingkaran = Double.parseDouble(JOptionPane.showInputDialog("Masukkan jari2 Lingkaran:"));
        double LuasLingkaran = LuasLingkaran(jari2Lingkaran);
        JOptionPane.showMessageDialog(null, "Luas Lingkaran:" + LuasLingkaran);
        System.out.println("Luas Lingkaran:" + LuasLingkaran);
        
        
        
        
    }
}
