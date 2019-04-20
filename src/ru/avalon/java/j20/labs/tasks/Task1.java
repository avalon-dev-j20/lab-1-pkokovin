package ru.avalon.java.j20.labs.tasks;

import java.util.Arrays;
import ru.avalon.java.j20.labs.Task;
import ru.avalon.java.j20.labs.core.RandomArrayFactory;
import ru.avalon.java.j20.labs.models.Numbers;

/**
 * Задание №1.
 *
 * <p>Тема: "Создание обобщённых методов".
 *
 * <p>В рамках задания требуется описать и выполнить
 * несколько методов, обобщённых с указанной точностью.
 */
public class Task1 implements Task {

    /**
     * Фабрика, создающая массивы случайных чисел.
     */
    private final RandomArrayFactory arrayFactory = new RandomArrayFactory();
    
    /**
     * {@inheritDoc}
     */
    @Override
    public void run() {
        int[] array = arrayFactory.getInstance(20);
        int min = Numbers.min(array);
        int max = Numbers.max(array);
        
        double avg = Numbers.avg(convertInt(array));
        /*
         *  Выполнено задание №1
         *
         * 1. Обобщен метод поиск среднего арифметического
         *
         *    Выполнено обобщение метода с использованием шаблона так,
         *    чтобы метод мог выполнять поиск среднего арифметического
         *    в массивах любых чисел: целых и вещественных.
         *
         *    Возвращать необходимо значение типа double.
         *    Но, из-за того что обобщения не работают с примитивами пришлось
         *    добавить метод конвертирования int в Integer
         *
         * 2. Обобщен метод поиска максимального значения
         *
         *    Выполнено обобщение метода с использованием шаблона так,
         *    чтобы метод мог выполнять поиск максимального значения
         *    в массивах любых чисел: целых и вещественных.
         *
         * 3. Обобщен метод поиска минимального значения
         *
         *    Выполнено обобщение метода с использованием шаблона так,
         *    чтобы метод мог выполнять поиск минимального значения
         *    в массивах любых чисел: целых и вещественных.
         *
         * 4. С использованием отладчика проверена корректность
         *    выполнения задания.
         */
    }
    static Integer[] convertInt(int[] array){
        Integer[] converted = new Integer[array.length];
        for (int i = 0; i < converted.length; i++) {
            converted[i] = Integer.valueOf(array[i]);
        }
        return converted;
    }
}
