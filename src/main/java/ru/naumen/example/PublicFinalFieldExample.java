package ru.naumen.example;

import ru.naumen.Link;

/**
 * Поле link приватное и final
 */
public class PublicFinalFieldExample {
    public final Link link;

    public PublicFinalFieldExample(Link link) {
        this.link = link;
    }

    public Link getLink() {
        return link;
    }
}
