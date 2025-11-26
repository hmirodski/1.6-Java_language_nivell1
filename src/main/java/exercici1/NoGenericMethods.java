package exercici1;

import java.util.Objects;

public class NoGenericMethods {

    private final Object first;
    private final Object second;
    private final Object third;

    public NoGenericMethods(Object first, Object second, Object third) {
        this.first = Objects.requireNonNull(first);
        this.second = Objects.requireNonNull(second);
        this.third = Objects.requireNonNull(third);
    }

    public Object getFirst() {
        return first;
    }

    public Object getSecond() {
        return second;
    }

    public Object getThird() {
        return third;
    }

    @Override
    public String toString() {
        return "NoGenericMethods{" +
                "arg1=" + first +
                ", arg2=" + second +
                ", arg3=" + third +
                '}';
    }
}
