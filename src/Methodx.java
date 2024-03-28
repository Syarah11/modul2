
public class Methodx {
    public double luas_lingkaran (int diameter) {
        int jari2 = diameter / 2;
        double luas = Math.PI * Math.pow(jari2, 2);
        return luas;
        
        
    }
    
    public static void main(String[] args) {
        Methodx mt = new Methodx();
        System.out.println(mt.luas_lingkaran(20));
        System.exit(0);
    }
    
}
