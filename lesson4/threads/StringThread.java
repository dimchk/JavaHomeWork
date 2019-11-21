package lesson4.threads;

public class StringThread extends Thread {
    StringProducer st;
    public StringThread(StringProducer st, String message) {
        st.printMsg(message);
    }

}
