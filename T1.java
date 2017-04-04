/**
 * Created by Jaicky.Kumar on 4/1/2017.
 */
public class T1 implements Runnable {
    Player m;
    String[] s1 = { "Hi", "How are you ?", "I am also doing fine!" };

    public T1(Player m1) {
        this.m = m1;
        new Thread(this, "Question").start();
    }

    public void run() {
        for (int i = 0; i < s1.length; i++) {
            m.Question(s1[i]);
        }
    }
}

