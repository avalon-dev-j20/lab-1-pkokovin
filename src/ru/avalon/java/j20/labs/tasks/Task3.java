package ru.avalon.java.j20.labs.tasks;

import ru.avalon.java.j20.labs.Task;

import java.util.Iterator;
import ru.avalon.java.j20.labs.models.Fibonacci;
import ru.avalon.java.j20.labs.models.Numbers;

/**
 * Задание №3
 *
 * <p>Тема: "Изучение интерфейсов {@link Iterable} и {@link Iterator}".
 */
public class Task3 implements Task {
      
    
    // перенес метод sum принимающий Iterable в класс Numbers
    @Override
    public void run() {
        Iterable<Integer> numbers = new Fibonacci(20); 
        int summa = Numbers.sum(numbers);
        /*
         * Выполнено задание №3
         *
         * 1. Завершено описание класса Fibonacci так, чтобы класс
         *    возвращал заданное количество чисел последовательности
         *    Фибоначчи.
         *
         *    Количество чисел последовательности можно указывать
         *    при создании экземпляра класса.
         *
         *    Найдена сумма 20 первых чисел последовательности Фибоначчи:
         *
         * 2. Создан экземпляр класса Fibonacci так, чтобы он
         *    возвращал последовательность чисел Фибоначчи длиной
         *    в 20 элементов.
         *
         * 3. Найдена сумму полученных значений.
         *
         * 4. С использованием отладчика проверьте корректность
         *    выполнения задания.
         */
    }
}
