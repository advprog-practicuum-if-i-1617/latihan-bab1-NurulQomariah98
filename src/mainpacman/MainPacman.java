package mainpacman;
import java.util.Scanner;

/**
 *
 * @author Compaq
 */
public class MainPacman {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        String arah;
        int nyawa = 10;
        pacman no1 = new pacman();
        
        for (int i=0;i<=9;i++){
            no1.displayMessage();
            System.out.println("Sisa langkah dari pacman : "+nyawa--);
            System.out.print("Masukkan arah pacman (w,a,s,d) : ");
            arah=input.nextLine();
            switch (arah) {
                case "w":
                    no1.up();break;
                case "a":
                    no1.left();break;
                case "s":
                    no1.down();break;
                case "d":
                    no1.right();break;
                default:
                    System.out.println("Masukan salah. Nyawa pacman berkurang.");
            }
            if(nyawa==0){
                System.out.println("Nyawa pacman habis. Anda kalah.");
            }
        }
    }
}