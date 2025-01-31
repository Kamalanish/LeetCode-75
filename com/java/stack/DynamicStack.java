public class DynamicStack<T> extends ArrayStack<T> {

    public DynamicStack() {
        super();
    }

    public DynamicStack(int size) {
        super(size);
    }

    @Override
    @SuppressWarnings("all")
    public boolean push(T item) {
        if (this.isFull()) {

            T[] temp = (T[]) new Object[data.length * 2];

            for (int i = 0; i < data.length; i++) {
                temp[i] = data[i];
            }

            data = temp;
        }

        return super.push(item);
    }
}
