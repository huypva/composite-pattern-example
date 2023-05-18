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
    List<Component> children = new ArrayList<>();

    public Composite(String name) {
        this.name = name;
    }

    @Override
    public void operate() {
        log.info("Composite {} operate!", name);
        children.stream().forEach(component -> component.operate());
    }

    public void add(Component child) {
        children.add(child);
    }

    public void remove(Component child) {
        children.remove(child);
    }

    public List<Component> getChildren() {
        return children;
    }
    
}
