import libraries.In;
import libraries.Out;

public class ue02_2 {
    public static void main(String[] args) {
        int year = In.readInt();
        int numbOfMonth = In.readInt();
        int days;
        boolean NoLeapYear;

        if(year % 4 == 0){
                if(year % 100 == 0){
                    if(year % 400 == 0){
                        //leapyear
                        NoLeapYear = false;
                    }
                    else{
                    //no leapyear
                    NoLeapYear = true;
                    }
                }
                else{
                    //leapyear
                    NoLeapYear = false;
                }
        }
        else{
                //no leapyear
                NoLeapYear = true;
        }


        if(numbOfMonth >= 1 && numbOfMonth <= 12){
            switch(numbOfMonth){
                case 1, 3, 5, 7, 8, 10, 12 -> {
                    days = 31;
                    Out.print(days);
                }
                case 4, 6, 9, 11 -> {
                    days = 30;
                    Out.print(days);
                }
                case 2 -> {
                    if (NoLeapYear) {
                        days = 28;
                        Out.print(days); 
                    } else {
                        days = 29;
                        Out.print(days);
                    }
                }
               
                default -> Out.println("Error");
             }
        }
        else{
            Out.println("Error");
        }

       
    }
}
