/*Scrivi un programma che contenga un metodo che prende in ingresso un valore numerico e 
restituisca il nome del giorno della settimana come stringa o una stringa di errore nel 
caso di valore maggiore di 7 o minore di 1.*/


public class myClass{
    public static void main(String[] args){
        
        int num = 0;
        weekday(num);
    }
    
    
    public static void weekday(int a){
        switch (a){
            case 1: 
                System.out.print("Monday");
                break;
            case 2: 
                System.out.print("Tuesday");
                break;
            case 3: 
                System.out.print("Wednesday");
                break;
            case 4: 
                System.out.print("Thursday");
                break;
            case 5: 
                System.out.print("Friday");
                break;
            case 6: 
                System.out.print("Saturday");  
                break;
            case 7: 
                System.out.print("Sunday");
                break;
            default: 
                System.out.print("Error");
        }
    }
    
}