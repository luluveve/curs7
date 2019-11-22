import java.util.Scanner;

    public class Picture2 {
        public static void main(String[] args) {
            Scanner reader = new Scanner (System.in);
            System.out.println("linii: ");
            int h = reader.nextInt();
            System.out.println("coloane: ");
            int w = reader.nextInt();


            for (int i =0; i<h; i++) {
                for (int j =0; j<w; j++) {
                   if (i==0 || i==h-1 || j==0 || j==w-1) {
                       System.out.print("#");
                   } else {
                       System.out.print("0");
                   }

                }
                System.out.println();

            }

        }
    }



