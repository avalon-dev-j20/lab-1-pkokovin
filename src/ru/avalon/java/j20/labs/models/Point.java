package ru.avalon.java.j20.labs.models;

/**
 * Модель представления о точке.
 */
public class Point<E extends Number> {
    /**
     * Абсцисса точки.
     */
    private final E x;
    /**
     * Ордината точки.
     */
    private final E y;

    /**
     * Основной конструктор класса.
     *
     * @param x абсцисса точки
     * @param y ордината точки
     */
    public Point(E x, E y) {
        this.x = x;
        this.y = y;
    }

    /**
     * Возвращает абсциссу точки.
     *
     * @return x-координата точки.
     */
    public E getX() {
        return x;
    }

    /**
     * Возвращает ординату точки.
     *
     * @return y-координата точки.
     */
    public E getY() {
        return y;
    }

    /**
     * Возвращает дистанцию от точки до точки.
     *
     * @param point точка, до которой следует вычислить
     *              дистанцию.
     * @return дистанция между точками
     */
    public <E extends Number> double distanceTo(Point point) {
        float dx = x.floatValue() - point.x.floatValue();
        float dy = y.floatValue() - point.y.floatValue();
        return Math.sqrt(dx * dx + dy * dy);
    }
}
