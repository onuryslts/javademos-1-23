public class Main {
    public static void main(String[] args) {
        String[] ogrenciler = {"Onur", "Engin", "Salih"};
        System.out.println("For Döngüsü");
        for (int i = 0; i < ogrenciler.length; i++) {
            System.out.println(ogrenciler[i]);
        }
        System.out.println("Foreach Döngüsü");
        for (String ogrenci : ogrenciler) {
            System.out.println(ogrenci);
        }

    }
}