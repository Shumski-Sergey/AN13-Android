package ibagritsevich.lection_7.Cosmodrom;

public interface IStart {
    boolean PrelaunchCheck();
    void EngineStarting() throws InterruptedException;
    void Start();
}
