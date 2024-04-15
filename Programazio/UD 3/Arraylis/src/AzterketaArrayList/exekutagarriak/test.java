package AzterketaArrayList.exekutagarriak;

import AzterketaArrayList.model.Liburua;
public class test {
    public static void main(String[] args) {
        
        Liburua[] la= Liburua.getKatalogoa();
        System.out.println(Liburua.liburuaBilatu("ATX.OBA",la));
        

    }
}
