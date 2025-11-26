package exercici1;

import java.util.Objects;

public class NoGenericMethods<T> {

    private T first;
    private T second;
    private T third;

    public NoGenericMethods(T first, T second, T third) {
        this.first = Objects.requireNonNull(first);
        this.second = Objects.requireNonNull(second);
        this.third = Objects.requireNonNull(third);
    }

    public T getFirst() {
        return first;
    }

    public T getSecond() {
        return second;
    }

    public T getThird() {
        return third;
    }

    public void setFirst(T first) {
        this.first = Objects.requireNonNull(first);
    }

    public void setSecond(T second) {
        this.second = Objects.requireNonNull(second);
    }

    public void setThird(T third) {
        this.third = Objects.requireNonNull(third);
    }

    @Override
    public String toString() {
        return "NoGenericMethods{" +
                "first=" + first +
                ", second=" + second +
                ", third=" + third +
                '}';
    }
}
