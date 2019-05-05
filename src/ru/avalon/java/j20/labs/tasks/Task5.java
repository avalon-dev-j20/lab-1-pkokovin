package ru.avalon.java.j20.labs.tasks;

import java.util.ArrayList;
import java.util.Collection;
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
        Set<Integer> set = new HashSet<>();
        
        list = collectionFill(list, array);
        set = collectionFill(set, array);
        
//        Вынес цикл в обобщенный метод
        /**
         *  Выполнено задание №5
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
    static <T extends Collection<Integer>> T collectionFill(T x, int[] y) {
        for (int i = 0; i < y.length; i++) {
            x.add(y[i]);
        }
        return x;
    }
}
