package chapter11.abstract_;

public class BB extends Template{
    @Override
    public void job() {
        int num = 0;
        for (int i = 1; i <= 20000; i++) {
            num += i;
        }
    }
}
