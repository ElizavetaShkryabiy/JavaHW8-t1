package ru.netology.smartHouse;

public class Radio {
    //   Station unit
    private String station;
    private int maxStation = 9;
    private int minStation = 1;
    private int currentStation = 7;


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


    public int NextStation() {
        if (currentStation < maxStation) {
            currentStation = currentStation + 1;
        }
        return currentStation;
    }

    public int NextStationWhenCurrentIsMax(int currentStation) {
        if (currentStation == 9) {
            this.currentStation = 1;
        }
        return this.currentStation;
    }

    public int PrevStation() {
        if (currentStation > minStation) {
            currentStation = currentStation - 1;
        }
        return currentStation;
    }

    public int PrevStationWhenCurrentIsMin(int currentStation) {

        if (currentStation == 1) {
            this.currentStation = 9;
        }
        return this.currentStation;
    }

    // Volume unit

    private String volume;
    private int maxVolume = 10;
    private int minVolume = 0;
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

    public int IncreaseVolume() {
        if (currentVolume < maxVolume) {
            currentVolume = currentVolume + 1;
        }
        return this.currentVolume;
    }

    public int IncreaseVolumeWhenCurrentIsMax(int currentVolume) {

        if (currentVolume == 10) {
            this.currentVolume = 10;
        }
        return this.currentVolume;
    }

    public int DecreaseVolume() {

        if (currentVolume > 0) {
            currentVolume = currentVolume - 1;
        }
        return currentVolume;
    }

    public int DecreaseVolumeWhenCurrentIsMin(int currentVolume) {

        if (currentVolume == 0) {
            this.currentVolume = 0;
        }
        return this.currentVolume;
    }
}

