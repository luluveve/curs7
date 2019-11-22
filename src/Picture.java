import java.util.Scanner;

public class Picture {
    public static void main(String[] args) {
        Scanner reader = new Scanner (System.in);
        System.out.println("linii: ");
        int h = reader.nextInt();
        System.out.println("coloane: ");
        int w = reader.nextInt();
        for(int k=0; k<w+2; k++) {
            System.out.print("#");}
        System.out.println();
        for (int i =0; i<h; i++) {
            System.out.print("#");
            for (int j =0; j<w; j++){

                System.out.print("0");
            }
            System.out.println("#");
        }

    }
}
