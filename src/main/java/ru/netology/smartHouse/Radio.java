package ru.netology.smartHouse;

public class Radio {
    //   Station unit

    private int stationAmount;
    private int maxStation = stationAmount - 1;
    private int minStation = 0;
    private int currentStation;

    private int maxVolume = 100;
    private int minVolume = 0;
    private int currentVolume;


    public Radio(int stationAmount) {

        this.maxStation = stationAmount -1;

    }

    public Radio() {
        stationAmount = 10;
        this.maxStation = stationAmount -1;

    }

    public int getCurrentStation() {
        return currentStation;
    }

    public int setCurrentStation (int current){return this.currentStation = current;}


    public void setCheckCorrectCurrentStation(int currentStation) {
        if (currentStation >= maxStation) {
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

    public int setCurrentVolume (int currentVolume){return this.currentVolume = currentVolume;}


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
        } else {
            currentVolume = minVolume;
        }
        return currentVolume;
    }

}

