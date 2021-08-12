package ru.netology.smartHouse;

public class Radio {
    //   Station unit
    private String station;
    private int maxStation = 9;
    private int minStation = 1;
    private int currentStation = 7;



    public int setCurrentStation(int currentStation) {
        if (currentStation > maxStation) {
            return currentStation;
        }
        if (currentStation < minStation) {
            return currentStation;
        }
        this.currentStation = currentStation;
        return currentStation;
    }

    public int getCurrentStation() {
        return currentStation;
    }

    public int NextStation() {
        int nextStation = getCurrentStation() ;
        if (currentStation == 9) {
            nextStation = 1;
        } else {
            nextStation = currentStation + 1;
        }
        return nextStation;
    }

    public void PrevStation() {
        if (currentStation == 1) {
            currentStation = 9;
        } else {
            currentStation = currentStation - 1;
        }
    }

    // Volume unit

    private String volume;
    private int maxVolume = 10;
    private int minVolume = 0;
    private int currentVolume = 4;

    public String getVolumeName() {
        return volume;
    }

    public void setVolumeName(String name) {
        this.volume = volume;
    }

    public int getMaxVolume() {
        return maxVolume;
    }

    public int getMinVolume() {
        return minVolume;
    }

    public int getCurrentVolume() {
        return currentVolume;
    }

    public void setCurrentVolume(int currentVolume) {
        if (currentVolume > maxVolume) {
            return;
        }
        if (currentVolume < minVolume) {
            return;
        }
        this.currentVolume = currentVolume;
    }

    public void IncreaseVolume() {

        if (currentVolume > 10) {
            currentVolume = 10;
        } else {
            currentVolume = currentVolume + 1;
        }
//        return currentVolume;
    }

    public void DecreaseVolume() {
        if (currentVolume < 0) {
            currentVolume = 0;
        } else {
            currentVolume = currentVolume - 1;
        }
//        return currentVolume;

    }

}

