import model.Herriak;

public class App {
    
    public static void main(String[] args) throws Exception {
    Herriak taula = new Herriak();
    
    taula.irakurriDatuBakarra();

    taula.txertatu("Saldibar");
    taula.irakurriDatuBakarra();

    taula.irakuriiDatuAnitzak();
    
    taula.aldatu("Saldibar","Zaldibar");
    taula.irakuriiDatuAnitzak();

    taula.ezabatu("Zaldibar");
    taula.irakuriiDatuAnitzak();
}
}
