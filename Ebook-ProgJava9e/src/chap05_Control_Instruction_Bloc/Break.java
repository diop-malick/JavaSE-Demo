package chap05_Control_Instruction_Bloc;

public class Break {
    public static void main(String args[]) {
        int i;
        for (i = 1; i <= 10; i++) {
            System.out.println("debut tour " + i);
            System.out.println("bonjour");
            if (i == 3)
                break; // exit (escape) the for-loop, while-loop, switch-statement that you are currently executing
            System.out.println("fin tour  " + i);
        }
        System.out.println("apres la boucle");
    }
}
