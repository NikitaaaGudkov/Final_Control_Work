package Models;

public class Counter implements AutoCloseable{
    private static Integer count = 0;

    public void add() {
        ++count;
    }

    public Integer getCount() {
        return count;
    }

    @Override
    public void close() throws Exception {
        System.out.println("Counter closed");
    }
}
