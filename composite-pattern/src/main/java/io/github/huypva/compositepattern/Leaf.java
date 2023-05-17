package io.github.huypva.compositepattern;

import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;

/**
 * @author huypva
 */
@Slf4j
@AllArgsConstructor
public class Leaf implements Component {

    String name;

    @Override
    public void operate() {
        log.info("Leaf {} operate!", name);
    }

}
