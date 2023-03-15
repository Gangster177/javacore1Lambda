package lecture.onDone;

public class Test {
    private OnDoneListener<String> callback;

    public Test(OnDoneListener<String> callback) {
        this.callback = callback;
    }

    public void execute() {
        //какая-либо длительная операция
        callback.onDone("complete");
    }
}

@FunctionalInterface
interface OnDoneListener<T> {
    void onDone(T v);
}
