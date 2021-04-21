package socketServer;

import net.jcip.annotations.GuardedBy;
import net.jcip.annotations.NotThreadSafe;
import net.jcip.annotations.ThreadSafe;

import java.net.http.HttpClient;

@NotThreadSafe
class MutableInteger{


}

@ThreadSafe
class SynchronizedInteger{
    @GuardedBy("this") private int value;

    public synchronized int get(){
        return value;
    }

    public synchronized void setValue(int value) {
        this.value = value;
    }
}

public class Client {

    public static void main(String[] args) {

    }
}
