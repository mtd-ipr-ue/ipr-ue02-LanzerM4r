import libraries.In;
import libraries.Out;

public class ue02_1 {
    public static void main(String[] args) {
        int numb1 = In.readInt();
        int numb2 = In.readInt();
        int numb3 = In.readInt();

        if(numb1 > numb2 && numb1 > numb3){
            Out.println("Zahl 1 ist das Maximum");
            Out.print(numb1);
        }
        else if (numb2 > numb1 && numb2 > numb3) {
            Out.println("Zahl 2 ist das Maximum");
            Out.print(numb2);

        }
        else if (numb3 > numb1 && numb3 > numb1) {
            Out.println("Zahl 3 ist das Maximum");
            Out.print(numb3);
        }
    }
}
