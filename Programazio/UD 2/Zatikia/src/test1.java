public class test1 {
    public static void main(String[] args){

              // Puedes cambiar este valor para probar con diferentes números
            int[] factores = Zatikia.faktorizatu(14);
            System.out.print("[");
            for (int i = 0; i < factores.length && factores[i]!=0; i++) {
                System.out.print(factores[i] + " ");
        } 
        System.out.print("]");  
        System.out.println(Zatikia.zkh(140,90));
    }
}

