package ru.naumen.example;

import ru.naumen.Link;

/**
 * Поле link приватное и есть простой сеттер
 */
public class PrivateFieldExample {
    private Link link;

    public PrivateFieldExample(Link link) {
        this.link = link;
    }

    public Link getLink() {
        return link;
    }

    public void setLink(Link link) {
        this.link = link;
    }
}
