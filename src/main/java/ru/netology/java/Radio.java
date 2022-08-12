package ru.netology.java;

public class Radio {
    //Текущие номер станции и уровень звука
    private int currentStation;
    private int currentVolume;

    // Актуальный номер станции
    public int getCurrentStation() {
        return currentStation;
    }

    //Установка текущего номера станции
    public void setCurrentStation(int currentStation) {
       // Номер станции не может быть больше 9
        if (currentStation > 9) {
            return;
        }
        //Номер станции не может быть меньше 0
        if (currentStation < 0) {
            return;
        }
        this.currentStation = currentStation;
    }
// Next station
    public void nextStation() {
        this.currentStation = currentStation + 1;
        if (currentStation > 9) {
            this.currentStation = 0;
        }
    }
    // Previous Station
    public void prevStation() {
        this.currentStation = currentStation -1;
        if (currentStation < 0) {
            this.currentStation = 9;
        }
    }

    //Задаем номер станции
    public void inputStation (int currentStation) {// Задать номер станции
        if (currentStation < 0) { // Не должно быть отрицательным
            return;
        }
        if (currentStation > 9) {// Не должно быть больше 9
            return;
        }
        this.currentStation = currentStation;
    }
    //Актуальный уровень звука
    public int getCurrentVolume() {
        return currentVolume;
    }
    //Установка текущего уровня звука
    public void setCurrentVolume(int currentVolume) {
        // Уровень звука не может быть больше 10
        if (currentVolume > 10) currentVolume = 10;
        //Уровень звука не может быть меньше 0
        if (currentVolume < 0) currentVolume = 0;
        this.currentVolume = currentVolume;
    }
    //Увелечение громкости до 10
    public void volumeUp() {
        this.currentVolume = currentVolume + 1;
        if (currentVolume >= 10) { //При достижении 10 далее уровень не прибавляется
            this.currentVolume = 10;
        }
    }
    //Понижение уровня громкости до 0
    public void volumeDown() {
        this.currentVolume = currentVolume -1;
        if (currentVolume <= 0) { //При достижении 0 далее уровень не убавляется
            this.currentVolume = 0;
        }
    }
}
