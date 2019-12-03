package lesson7;

import lesson5.Lists;

import java.util.List;

public class Description {
    private List<String> descs;

    public Description(List<String> descs) {
        this.descs = descs;
    }

    @Override
    public String toString() {
        return "Description{" +
                "descs=" + descs +
                '}';
    }

    public List<String> getDescs() {
        return descs;
    }
}
