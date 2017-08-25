/**
 * Created by KanTLovE on 8/25/2017.
 */

import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner keyboard = new Scanner(System.in);
        System.out.print("Type width");
        int width = Integer.parseInt(keyboard.nextLine());
        System.out.print("Type height");
        int height = Integer.parseInt(keyboard.nextLine());
        System.out.print(width*height);
    }
}
