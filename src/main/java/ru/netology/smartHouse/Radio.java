package ru.netology.smartHouse;

public class Radio {
    //   Station unit
    private String station;
    private int maxStation = 9;
    private int minStation = 1;
    private int currentStation;
    private String volume;
    private int maxVolume = 10;
    private int minVolume = 0;
    private int currentVolume;
    private int[] stations = {1, 2, 3, 4, 5, 6, 7, 8, 9};


    public int getCurrentStation() {
        return currentStation;
    }


    public void setCheckCorrectCurrentStation(int currentStation) {
        if (currentStation > maxStation) {
            return;
        }
        if (currentStation < minStation) {
            return;
        }
        this.currentStation = currentStation;

    }


    public int nextStation() {
        if (currentStation < maxStation) {
            currentStation = currentStation + 1;
        } else {
            currentStation = minStation;
        }
        return currentStation;
    }


    public int prevStation() {
        if (currentStation > minStation) {
            currentStation = currentStation - 1;

        } else {
            currentStation = maxStation;
        }
        return currentStation;
    }

    // Volume unit


    public int getCurrentVolume() {
        return currentVolume;
    }


    public void setCheckCorrectCurrentVolume(int currentVolume) {
        if (currentVolume > maxVolume) {
            return;
        }
        if (currentVolume < minVolume) {
            return;
        }
        this.currentVolume = currentVolume;
    }

    public int increaseVolume() {
        if (currentVolume < maxVolume) {
            currentVolume = currentVolume + 1;
        } else {
            currentVolume = maxVolume;
        }
        return this.currentVolume;
    }

    public int decreaseVolume() {

        if (currentVolume > minVolume) {
            currentVolume = currentVolume - 1;
        }else{
            currentVolume = minVolume;
        }
        return currentVolume;
    }
}

