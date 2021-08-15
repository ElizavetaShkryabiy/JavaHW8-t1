package ru.netology.smartHouse;

public class Radio {
    //   Station unit
    private String station;
    private int maxStation = 9;
    private int minStation = 1;
    private int currentStation = 7;
    private String volume;
    private int maxVolume = 10;
    private int minVolume = 0;


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
        }
        return currentStation;
    }

    public int nextStationWhenCurrentIsMax () {
        if (currentStation == maxStation) {
            this.currentStation = minStation;
        }
        return this.currentStation;
    }

    public int prevStation() {
        if (currentStation > minStation) {
            currentStation = currentStation - 1;
        }
        return currentStation;
    }

    public int prevStationWhenCurrentIsMin() {

        if (currentStation == minStation) {
            this.currentStation = maxStation;
        }
        return this.currentStation;
    }

    // Volume unit

    private int currentVolume = 5;

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
        }
        return this.currentVolume;
    }

    public int increaseVolumeWhenCurrentIsMax() {

        if (currentVolume == maxVolume) {
            this.currentVolume = maxVolume;
        }
        return this.currentVolume;
    }

    public int decreaseVolume() {

        if (currentVolume > minVolume) {
            currentVolume = currentVolume - 1;
        }
        return currentVolume;
    }

    public int decreaseVolumeWhenCurrentIsMin() {

        if (currentVolume == minVolume) {
            this.currentVolume = minVolume;
        }
        return this.currentVolume;
    }
}

