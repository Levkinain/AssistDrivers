package ru.netcracker.Entity;

import org.springframework.stereotype.Component;

@Component
public class Car {
    public static String MODEL = "model";
    public static String COLOR = "color";
    public static String NUMBER_AUTO = "numberAuto";

    //модель автомобиля
    private String model;
    //цвет автомобиля
    private String color ;//скорее всего стринг
    //номер автомобиля
    private String numberAuto;

    /**
     * Конструктор по умолчанию
     */
    public Car(){
    }

    /**Конструктор с параметрами
     * @param model
     * Объект типа {@code String} содержащий название модели автомобиля
     * @param color
     * Объект типа {@code String} содержащий описание цвета автомобиля
     * @param numberAuto
     * Объект типа {@code String}, характеризующий номер автомобиля
     */
    public Car(String model, String color, String numberAuto){
        this.model = model;
        this.color = color;
        this.numberAuto = numberAuto;
    }

    /**Метод, возвращающий модель автомобиля
     * @return model
     * Объект типа {@code String} содержащий название модели автомобиля
     */
    public String getModel() {
        return model;
    }

    /**Метод выполняющий инициализацию  поля {@code model}, которое характеризует модель автомобиля
     * @param model
     * Объект типа {@code String} содержащий название модели автомобиля
     */
    public void setModel(String model) {
        this.model = model;
    }


    /**Метод, возвращающий объект типа {@code String}, характеризующий цвет автомобиля
     * @return color
     * Объект типа {@code String} содержащий описание цвета автомобиля
     */
    public String getColor() {
        return color;
    }

    /**Метод выполняющий инициализацию  поля {@code color}, которое характеризует цвет автомобиля
     * @param color
     * Объект типа {@code String} содержащий описание цвета автомобиля
     */
    public void setColor(String color) {
        this.color = color;
    }


    /**Метод, возвращающий объект типа {@code String}, характеризующий номер автомобиля
     * @return numberAuto
     *Объект типа {@code String}, характеризующий номер автомобиля
     */
    public String getNumberAuto() {
        return numberAuto;
    }

    /**Метод выполняющий инициализацию  поля {@code numberAuto}, которое характеризует номер автомобиля
     * @param numberAuto
     * Объект типа {@code String}, характеризующий номер автомобиля
     */
    public void setNumberAuto(String numberAuto) {
        this.numberAuto = numberAuto;
    }
}
