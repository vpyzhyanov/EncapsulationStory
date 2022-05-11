package ru.naumen.encapsulation;

/**
 * <h1>Сказ о том, как программист истинную инкапсуляцию искал</h1>
 * <h2>Том 2. В поисках настоящей инкапсуляции</h2>
 *
 * <b>1. Задача</b><br>
 * Пусть у нас есть класс Документ, у которого есть название.<br>
 * Нужно напечатать на экран название этого документа.<br>
 * <p>
 * Следующая страница: {@link SomeDocumentService}
 */
public class Document {
    private final String title;

    public Document(String title) {
        this.title = title;
    }

    public String getTitle() {
        return title;
    }
}
