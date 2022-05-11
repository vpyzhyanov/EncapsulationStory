package ru.naumen.example;

import ru.naumen.Link;

/**
 * Поле link публичное
 */
public class PublicFieldExample {
    public Link link;

    public PublicFieldExample(Link link) {
        this.link = link;
    }

    public Link getLink() {
        return link;
    }
}
