package net.runnerdave.model;

import org.springframework.stereotype.Component;

/**
 * Created by runnerdave on 24/06/17.
 */
@Component
public class DummyForSetter {

    private String name;

    @Override
    public String toString() {
        return "DummyForSetter{" +
                "name='" + name + '\'' +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
