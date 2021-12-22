package ibagritsevich.lection_7.Cosmodrome;

public class Cosmodrome  {

    private final IStart istart;

    public Cosmodrome(IStart istart){this.istart = istart;}

    public void Starting() throws InterruptedException {
        if (istart.PrelaunchCheck()){
            istart.EngineStarting();
            istart.Start();
        }
        else {
            System.out.println("Предстартовая проверка провалена\n");
        }
    }
}
