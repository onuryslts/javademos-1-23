public class Main {
    public static void main(String[] args) {
        char harf = 'A';

        switch (harf) {
            case 'A':
            case 'I':
            case 'O':
            case 'U':
            case 'a':
            case 'ı':
            case 'o':
            case 'u':
                System.out.println("Kalın Sesli Harf");
                break;
            default:
                System.out.println("İnce Sesli Harf");
        }
    }
}