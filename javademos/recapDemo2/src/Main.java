public class Main {
    public static void main(String[] args) {
        double[] myList = {2.5, 12.0, 3.5, 4.0};
        double total = 0;
        double max = myList[0];
        System.out.println("For");
        System.out.println("-----------------------------------");
        for (int i = 0; i < myList.length; i++) {
            if (max< myList[i]){
                max = myList[i];
            }
            total = total + myList[i];
            System.out.println(myList[i]);

        }
        System.out.println("En Büyük Sayı : "+max);
        System.out.println("Toplam : "+total);
        System.out.println("Foreach");
        System.out.println("-----------------------------------");
        total = 0;
        max = myList[0];
        for (double number : myList) {
            if (max<number){
                max = number;
            }
            total = total + number;
            System.out.println(number);
        }
        System.out.println("En Büyük Sayı : "+max);
        System.out.println("Toplam : "+total);
    }
}