
/**
 * Write a description of class MainSquirrelJump here.
 * Tugas 2 PBO
 * @Faris Rasyid
 * @JumpSquirrel
 */
public class KotakAngka
{
    // instance variables - replace the example below with your own
    private int jumlahKotak;
    
    
    /**
     * Constructor for objects of class KotakAngka
     */
    public KotakAngka()
    {   
        this.jumlahKotak = 100;
        buatKotak();
    }
    public KotakAngka(int jumKotak)
    {   
        this.jumlahKotak = jumKotak;
        buatKotak();
    }

    private void buatKotak()
    {   
        for (int i = 1; i <= jumlahKotak; i++) {
        System.out.print(i);
        if(i%10 == 0) System.out.print("\n");
        else System.out.print("\t");
        }
    System.out.print("\n");
    }
    
}
