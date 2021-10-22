import java.util.Scanner;
/**
 * Write a description of class MainSquirrelJump here.
 * Tugas 2 PBO
 * @Faris Rasyid
 * @JumpSquirrel
 */
public class MainSquirrelJump
{
    /**
     * Constructor for objects of class MainSquirrelJump
     */
    public MainSquirrelJump()
    {
        
    }
    
    public static void main(String[] args) 
    {    
        System.out.println("\t\t============Jump Squirrel, jump!============\n");   //menampilkan judul
        Scanner inputKotak = new Scanner(System.in);
        Scanner inputPemain = new Scanner(System.in);
        Scanner inputAnswer = new Scanner(System.in);
        int maxJump = 1;
        String answer;
    
        System.out.print("Masukkan nama Pemain: ");
        String nama = inputPemain.nextLine();
        Pemain p1 = new Pemain(nama);
        System.out.println("Selamat Datang " + p1.getNama() + " dan Selamat Bermain!");
    do{    
        System.out.print("Masukkan jumlah kotak papan permainan(angka finish): ");
        int jumKotak = inputKotak.nextInt();
        KotakAngka papan = new KotakAngka(jumKotak);
    
        p1.buatSquirrel(jumKotak);
        int kondisiAwal = p1.getNilai();
        int posisiAwal = p1.getNilai();
        System.out.println("Squirrel is at number: " + posisiAwal);
        int move;
        if (kondisiAwal <= jumKotak/2) {
            move = jumKotak/10 + 10;
            System.out.println("Kamu punya " + move + " kesempatan untuk melompat sampai fisnish!");
            for(maxJump = 1; maxJump <= move; maxJump = maxJump){
               if(posisiAwal == jumKotak){
                   System.out.println("Congratulations! Squirrel reaches its finish line at number " + jumKotak);
                   break;
               }
               System.out.print("Move to: ");
               String arah = inputPemain.nextLine();
               if ((jumKotak - posisiAwal) < 10){
                   if(arah.equalsIgnoreCase("bawah") == true){
                       arah = "salah";
                   }
               }
               p1.lompat(arah);
               if (p1.checkLangkah == true ){
                   posisiAwal = p1.getNilai();
                   maxJump++;
                   if(maxJump > move){
                       System.out.println("Your chance is over!");
                   }
               }
            }
        }
        if (kondisiAwal > jumKotak/2) {
            move = jumKotak/10 + 5;
            System.out.println("Kamu punya " + move + " kesempatan untuk melompat sampai fisnish!");
            for(maxJump = 1; maxJump <= move; maxJump = maxJump){
               if(posisiAwal == jumKotak){
                   System.out.println("Congratulations! Squirrel reaches its finish line at number " + jumKotak);
                   break;
               }
               System.out.print("Move to: ");
               String arah = inputPemain.nextLine();
               if ((jumKotak - posisiAwal) < 10){
                   if(arah.equalsIgnoreCase("bawah") == true){
                       arah = "salah";
                   }
               }
               p1.lompat(arah);
               if (p1.checkLangkah == true ){
                   posisiAwal = p1.getNilai();
                   maxJump++;
                   if(maxJump > move){
                       System.out.println("Your chance is over!");
                   }
               }
            }
        }
        System.out.print("Do you still want to play?(type Y/y to play the game): ");
        answer = inputAnswer.next();
    }while (answer.equalsIgnoreCase("y"));
    inputKotak.close();
    inputPemain.close();
    inputAnswer.close();
    System.out.println("\t\t===========COPYRIGHT BY FRISRSYD===========");
    }
}
