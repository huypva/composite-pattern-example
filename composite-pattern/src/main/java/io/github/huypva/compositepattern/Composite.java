package io.github.huypva.compositepattern;

import java.util.ArrayList;
import java.util.List;

import lombok.extern.slf4j.Slf4j;

/**
 * @author huypva
 */
@Slf4j
public class Composite implements Component {

    String name;
    List<Component> components = new ArrayList<>();

    public Composite(String name) {
        this.name = name;
    }

    @Override
    public void operate() {
        log.info("Composite {} operate!", name);
        components.stream().forEach(component -> component.operate());
    }

    public void add(Component child) {
        components.add(child);
    }

    public void remove(Component child) {
        components.remove(child);
    }

    public List<Component> get() {
        return components;
    }
    
}
