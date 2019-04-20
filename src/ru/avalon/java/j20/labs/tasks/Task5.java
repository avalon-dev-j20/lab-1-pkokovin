package ru.avalon.java.j20.labs.tasks;

import java.util.ArrayList;
import java.util.HashSet;
import ru.avalon.java.j20.labs.Task;
import ru.avalon.java.j20.labs.core.RandomArrayFactory;

import java.util.List;
import java.util.Set;

/**
 * Задание №5.
 *
 * <p>Тема: "Изучение отличия между списками и наборами".
 */
public class Task5 implements Task {

    /**
     * Фабрика, генерирующая массивы чисел случайного характера.
     */
    private final RandomArrayFactory arrayFactory = new RandomArrayFactory();

    /**
     * {@inheritDoc}
     */
    @Override
    public void run() {
        final int[] array = arrayFactory.getInstance(20);

        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < array.length; i++) {
            list.add(array[i]);
        }

        Set<Integer> set = new HashSet<>();
        for (int i = 0; i < array.length; i++) {
            set.add(array[i]);
            
        }

        /**
         * TODO(Студент): Выполните задание №5
         *
         * 1. Проинициализированы переменные list и set объектами
         *    подходящих классов.
         *
         * 2. В обе коллекции помещены элементы массива array.
         *
         * 3. С использованием отладчика проверена корректность
         *    выполнения задания.
         */
    }
}
