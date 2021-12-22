package ibagritsevich.lection_7.Cosmodrome;

public interface IStart {
    boolean PrelaunchCheck();
    void EngineStarting() throws InterruptedException;
    void Start();
}
