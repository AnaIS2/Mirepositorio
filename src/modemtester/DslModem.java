package modemtester;

public class DslModem extends Modem {

    String method = "Dsl";

    public void connect (){

        System.out.println (method);
}
}
