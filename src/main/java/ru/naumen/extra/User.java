package ru.naumen.extra;

import ru.naumen.EncapsulationStory;

/**
 * Геттеры или сеттеры могут быть частью интерфейса
 *
 * Вернуться назад: {@link EncapsulationStory#conclusions()}
 * Следующий том: {@link ru.naumen.encapsulation.Document}
 */
public class User implements Nameable
{
    private final String name;

    public User(String name)
    {
        this.name = name;
    }

    @Override
    public String getName()
    {
        return name;
    }
}
