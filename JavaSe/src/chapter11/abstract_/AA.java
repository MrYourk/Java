package chapter11.abstract_;

public class AA extends Template{

    @Override
    public void job() {
        int num = 0;
        for (int i = 0; i < 8000; i++) {
            num += i;
        }
    }
}
