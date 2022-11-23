import java.util.Locale;
import java.util.Scanner;

import entities.Rectangle;

public class App {
    public static void main(String[] args) throws Exception {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        Rectangle retangle = new Rectangle();
        System.out.println("Enter rectangle width and height");
        System.out.print("Enter the width of the rectangle:");
        retangle.setWidth(sc.nextDouble());
        System.out.println();
        System.out.print("Enter the height of the retangle: ");
        retangle.setHeight(sc.nextDouble());
        System.out.println();
        System.out.println(retangle);
        sc.close();
    }
}
