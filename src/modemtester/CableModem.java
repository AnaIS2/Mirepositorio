package modemtester;

public class CableModem extends Modem {
    String method = "cable";
    
    public void connect() {
    System.out.println (method);
}
}
