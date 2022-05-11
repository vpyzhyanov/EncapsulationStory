package ru.naumen;

import ru.naumen.example.*;
import ru.naumen.extra.HackedLink;

/**
 * <h1>Сказ о том, как программист истинную инкапсуляцию искал</h1>
 * <h2>Том 1. Чем отличаются приватные поля от публичных</h2>
 * Каждая глава имеет ссылку на следующую главу, а конце этого тома ссылка на следующий том.
 */
public class EncapsulationStory
{
    /**
     * 1. Чем отличается публичное поле от геттера по этому же полю?<br>
     *    Ответ: публичное поле можно изменить вне самого класса, а это нарушает инкапсуляцию.<br>
     * Следующая глава: {@link #privateFieldExample()}
     */
    void publicFieldExample() {
        PublicFieldExample example = new PublicFieldExample(new Link());
        // есть разница?
        example.link.doSomething();
        example.getLink().doSomething();

        // Можно легко изменить поле
        example.link = new HackedLink();
    }

    /**
     * 2. Сделали поле приватным и добавили простой сеттер. Получилась инкапсуляция?<br>
     *    Ответ: Нет, мы можем изменить поле через сеттер, а это нарушает инкапсуляцию.<br>
     * Следующая глава: {@link #publicFinalFieldExample()}
     */
    void privateFieldExample() {
        PrivateFieldExample example = new PrivateFieldExample(new Link());
        // Так обратиться уже нельзя:
//        example.link.doSomething();
        example.getLink().doSomething();

        // Зато можно сделать так:
        example.setLink(new HackedLink());
    }

    /**
     * 3. Поменяли поле на final, сделали его публичным и убрали сеттер. Что изменилось?<br>
     *    Ответ: Хоть теперь подменить ссылку уже нельзя, но обращение через поле теперь
     *           ничем не отличается от обращения через геттер.<br>
     *    Вывод: Если запретить изменения, то оказывается нет никакой разницы между
     *           публичным полем и геттером.<br>
     *    Неприятный эффект: мы теперь вообще не можем изменить ссылку, даже внутри
     *           самого класса. А если задача требует менять ссылку, как тогда быть?<br>
     *
     * Следующая глава: {@link #conclusions()}
     */
    void publicFinalFieldExample() {
        PublicFinalFieldExample example = new PublicFinalFieldExample(new Link());
        // Стало можно обращаться так, как в первом случае. Есть разница между вызовами?
        example.link.doSomething();
        example.getLink().doSomething();

        // Подменить ссылку уже нельзя:
//        example.link = new HackedLink();
//        example.setLink(new HackedLink());
        // Только никакой разницы между приватным и публичным полем тут нет.
    }

    /**
     * Выводы:<br>
     * 1) Если у поля есть геттер или поле публичное, то никакой инкапсуляции тут нет!<br>
     * 2) Делать поле private и создавать сеттеры и геттеры - это не более чем конвенция разработчиков,
     *    просто так договорились<br>
     * 3) Некоторые фреймворки и библиотеки работают только с геттерами и сеттерами,
     *    соответственно они требуют их создания<br>
     * 4) Геттеры или сеттеры могут быть частью интерфейса, например {@link ru.naumen.extra.User}<br>
     *
     * Следующий том: {@link ru.naumen.encapsulation.Document}
     */
    public void conclusions() {
    }
}
