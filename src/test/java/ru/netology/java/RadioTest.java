package ru.netology.java;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class RadioTest {

    @Test
        //Проверка: номер станции больше 9
    public void maxLimStation() {
        Radio radio = new Radio();
        radio.setCurrentStation(10);
        int expected = 0;
        int actual = radio.getCurrentStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    //Проверка: номер станции меньше 0
    public void minLimStation() {
        Radio radio = new Radio();
        radio.setCurrentStation(-1);
        int expected = 0;
        int actual = radio.getCurrentStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
        //Проверка: после 9 станции идет 0-ая станция
    public void stationNextFirst() {
        Radio radio = new Radio();
        radio.setCurrentStation(9);
        radio.nextStation();
        int expected = 0;
        int actual = radio.getCurrentStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
        //Проверка: после 0 станции идет 1-ая станция
    public void stationNextTwo() {
        Radio radio = new Radio();
        radio.setCurrentStation(0);
        radio.nextStation();
        int expected = 1;
        int actual = radio.getCurrentStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    //Проверка: после 0 станции идет 9-ая
    public void prevStationFirst() {
        Radio radio = new Radio();
        radio.setCurrentStation(0);
        radio.prevStation();
        int expected = 9;
        int actual = radio.getCurrentStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    //Проверка: назад с 9 станции на 8-ую
    public void prevStationTwo() {
        Radio radio = new Radio();
        radio.setCurrentStation(9);
        radio.prevStation();
        int expected = 8;
        int actual = radio.getCurrentStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    //Зададим номер станции входящий в диапазоне 0-9
    public void inputStationCorrect () {
        Radio radio = new Radio();
        int currentStation = 6;
        radio.inputStation(currentStation);
        int expected = 6;
        int actual = radio.getCurrentStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    // Зададим номер станции больше 9
    public void inputStationOver() {
        Radio radio = new Radio();
        int currentStation = 10;
        radio.inputStation(currentStation);
        int expected = 0;
        int actual = radio.getCurrentStation();
        Assertions.assertEquals(expected, actual);
    }
    @Test
    //зададим номер станции меньше 0
    public void inputStationLess() {
        Radio radio = new Radio();
        int currentStation = -1;
        radio.inputStation(currentStation);
        int expected = 0;
        int actual = radio.getCurrentStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    //Задать уровень звука
    public void currentVolume() {
        Radio radio = new Radio();
        int expected = 0;
        radio.getCurrentVolume();
        int actual = radio.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test
//Задать уровень выше лимита
    public void volumeOverLim() {
        Radio radio = new Radio();
        radio.setCurrentVolume(11);
        int expected = 10;
        int actual = radio.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }
    @Test
    //задать уровень меньше лимита
    public void volumeLessLim() {
        Radio radio = new Radio();
        radio.setCurrentVolume(-1);
        int expected = 0;
        int actual = radio.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    //Уровень звука 2+1
    public void volumeUpFirst () {
        Radio radio = new Radio();
        radio.setCurrentVolume(2);
        radio.volumeUp();
        int expected = 3;
        int actual = radio.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }
    @Test
    //Уровень звука 5-1
    public void volumeDownFirst () {
        Radio radio = new Radio();
        radio.setCurrentVolume(5);
        radio.volumeDown();
        int expected = 4;
        int actual = radio.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    //Уровень звука больше 10
    public void volumeUpOverLimit () {
        Radio radio = new Radio();
        radio.setCurrentVolume(11);
        radio.volumeUp();
        int expected = 10;
        int actual = radio.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    //Уровень звука меньше 0
    public void volumeDownLim() {
        Radio radio = new Radio();
        radio.setCurrentVolume(-1);
        radio.volumeDown();
        int expected = 0;
        int actual = radio.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }
}
