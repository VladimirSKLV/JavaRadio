package ru.netology.java;

public class Radio {
    private int maxStation;
    private int minStation = 0;
    //Текущие номер станции и уровень звука
    private int currentStation;
    private int maxVolume = 100;
    private int minVolume = 0;
    private int currentVolume;

    public Radio() {
        this.maxStation = 9;
    }

    public Radio(int sumStation) {
        this.maxStation = sumStation - 1;
    }

    // Актуальный номер станции
    public int getCurrentStation() {
        return currentStation;
    }

    //Установка текущего номера станции
    public void setCurrentStation(int currentStation) {
        // Номер станции не может быть больше MAX
        if (currentStation > maxStation) {
            return;
        }
        //Номер станции не может быть меньше MIN
        if (currentStation < minStation) {
            return;
        }
        this.currentStation = currentStation;
    }

    // Next station
    public void nextStation() {
        this.currentStation = currentStation + 1;
        if (currentStation > maxStation) {
            this.currentStation = 0;
        }
    }

    // Previous Station
    public void prevStation() {
        this.currentStation = currentStation - 1;
        if (currentStation < minStation) {
            this.currentStation = 9;
        }
    }



    //Актуальный уровень звука
    public int getCurrentVolume() {
        return currentVolume;
    }

    //Установка текущего уровня звука
    public void setCurrentVolume(int currentVolume) {
        // Уровень звука не может быть больше MAX
        if (currentVolume > maxVolume) return;
        //Уровень звука не может быть меньше MIN
        if (currentVolume < minVolume) return;
        this.currentVolume = currentVolume;
    }

    //Увелечение громкости до MAX
    public void volumeUp() {
        if (currentVolume == maxVolume) { //При достижении MAX далее уровень не прибавляется
            return;
        }
        this.currentVolume = currentVolume + 1;
    }

    //Понижение уровня громкости до MIN
    public void volumeDown() {
        if (currentVolume == minVolume) { //При достижении MIN далее уровень не убавляется
            return;
        }
        this.currentVolume = currentVolume - 1;
    }
}
