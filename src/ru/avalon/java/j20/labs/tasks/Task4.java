package ru.avalon.java.j20.labs.tasks;

import ru.avalon.java.j20.labs.Task;
import ru.avalon.java.j20.labs.models.Person;

/**
 * Задание №4.
 *
 * <p>Тема: "Методы класса {@link Object}".
 */
public class Task4 implements Task {

    /**
     * {@inheritDoc}
     */
    @Override
    public void run() {
        Person a = new Person("Иван", "Иванов");
        Person b = new Person("Иван", "Иванов");
        boolean isEqual = a.equals(b);
        /*
         * Выполнено задание №4
         *
         * 1. С использованием отладчика проверено, что
         *    сравнение объектов класса Person выполняется
         *    некорректно (это два разных объекта, следовательно при сравнении методом класса Object они не равны)
         *
         * 2. Переопределены в классе Person методы equals и
         *    hashCode.
         *
         * 3. С использованием отладчика проверено что сравнение
         *    объектов типа Person выполняется корректно.
         */
    }
}
