public class teest {
    public static void main(String[] args) {
        int height=5;
        for(int altu=height-1;altu>=1;altu--)
        {
            for(int spaces=1;spaces<=height-altu;spaces++)
            {
                System.out.print(" ");
            }
            for(int asterisco=1;asterisco<=altu*2-1;asterisco++)
            {
                System.out.print("*");
            }
        System.out.println(" ");
        }
        
    }

}