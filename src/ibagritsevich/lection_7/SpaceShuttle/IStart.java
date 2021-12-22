package ibagritsevich.lection_7.SpaceShuttle;

public interface IStart {
    boolean PrelaunchCheck();
    void EngineStarting() throws InterruptedException;
    void Start();
}
