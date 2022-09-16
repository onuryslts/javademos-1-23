public class Main {
    public static void main(String[] args) {
        int[] sayilar = {1, 2, 5, 7, 9, 10};
        int aranacak = 1;
        boolean sayiVarMi = false;
        for (int i = 0; i < sayilar.length; i++) {
            if (aranacak == sayilar[i]) {
                sayiVarMi = true;
                break;
            }
        }
        if (sayiVarMi) {
            System.out.println(aranacak+" Sayısı var");
        } else {
            System.out.println(aranacak+" Sayısı Yok");


        }
    }
}