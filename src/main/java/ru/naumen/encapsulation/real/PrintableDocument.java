package ru.naumen.encapsulation.real;

/**
 * <b>2. Истинная инкапсуляция</b><br>
 * <br>
 * 1) Создадим интерфейс Printable с единственным методом print()<br>
 * 2) Создадим новый класс PrintableDocument, в котором реализуем интерфейс Printable<br>
 * 3) Разумеется, поле title в новом документе будет private<br>
 * 4) Но геттера в нём не будет, т.е. <b>никто не сможет узнать о существовании этого поля</b><br>
 * 5) Теперь документ сам умеет себя печатать. Никакие изменения в документе не скажутся на других сервисах.
 * Вот она истинная инкапсуляция!!! Как я давно тебя искал!!!<br>
 * <br>
 * P.S. Разумеется вы можете возразить, что может понадобиться обращаться к названию документа.
 * Конечно, такое может быть, но вы должны понимать, что инкапсуляции в этом случае уже не будет.
 * Это лишь упрощённый пример<br>
 * <br>
 * Вернуться назад: {@link ru.naumen.encapsulation.SomeDocumentService}
 */
public class PrintableDocument implements Printable {
    private final String title;

    public PrintableDocument(String title) {
        this.title = title;
    }

    @Override
    public void print() {
        System.out.println("Title is " + title);
    }
}
