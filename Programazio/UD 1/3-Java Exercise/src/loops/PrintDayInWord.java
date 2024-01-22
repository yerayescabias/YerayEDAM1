package loops;
public class PrintDayInWord  {
    public static void main(String[] args) {
        int day =6;
        if(day==0){
            System.out.println("MONDAY");
        } else if( day==1){
                System.out.println("TUESDAY");
                 } else if( day==2){
                    System.out.println("WEDNESDAY");
                        } else if( day==3){
                            System.out.println("THURSDAY");
                         } else if( day==4){
                                System.out.println("FRIDAY");
                            } else if(day==5){
                                System.out.println("SATURDAY");
                             } else if(day==6){ 
                                System.out.println("SUNDAY");
                            } else {
                                System.out.println("Not a valid day");
                            }
        
    }
}