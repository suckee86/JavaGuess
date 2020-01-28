import java.util.Random;
import java.util.Scanner;
public class talaldki{

    public static void main(String[] args) {
        Scanner valami = new Scanner(System.in);
        String minden;
        Random szam = new Random();
        int talalos = szam.nextInt(10);
        System.out.println(talalos);

        String eredmeny = String.valueOf(talalos);
        System.out.println("Gondoltam egy számra (0-99 között).");
        
        do {
            System.out.print("Mire tippelsz? ");
            minden = valami.next();
            int i = Integer.parseInt(minden);
            int j = Integer.parseInt(eredmeny);
            if (i > j) {
                System.out.println("Kisebbet írj be.");
            }
            if (i < j) {
                System.out.println("Nagyobbat írj be.");
            }
        } 
        while (!minden.equals(eredmeny));
        
        System.out.println("Nyertél, ez volt az. :)");
        valami.close();
        
}
}
