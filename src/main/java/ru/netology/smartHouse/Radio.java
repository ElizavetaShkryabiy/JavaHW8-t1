package ru.netology.smartHouse;

public class Radio {
    //   Station unit
    private String station;
    private int maxStation;
    private int minStation;
    private int currentStation;
    private String volume;
    private int maxVolume;
    private int minVolume;
    private int currentVolume;


    public Radio(String station, int maxStation, int currentStation) {
        this.station = station;
        this.maxStation = maxStation;
        this.minStation = 0;
        this.currentStation = currentStation;
    }

    public Radio(String station, int currentStation) {
        this.station = station;
        this.currentStation = currentStation;
        this.maxStation = 10;
        this.minStation = 0;
    }

    public Radio(int currentVolume) {
        this.maxVolume = 100;
        this.minVolume = 0;
        this.currentVolume = currentVolume;
    }

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

    public int nextStationWhenCurrentIsMax() {
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
    public int getCurrentVolume() {
        return currentVolume;
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

