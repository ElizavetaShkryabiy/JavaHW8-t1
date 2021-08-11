package ru.netology.smartHouse;

public class Radio {
    //   Station unit
    private String station;
    private int maxStation = 9;
    private int minStation = 1;
    private int currentStation;


    public String getStation() {
        return station;
    }

    public void setStation(String station) {
        this.station = station;
    }

    public int getMaxStation() {
        return maxStation;
    }

    public int getMinStation() {
        return minStation;
    }

    public int getCurrentStation() {
        return currentStation;
    }

    public void setCurrentStation(int currentStation) {
        if (currentStation > maxStation) {
            return;
        }
        if (currentStation < minStation) {
            return;
        }
        this.currentStation = currentStation;
    }

    public int ReturnToStart(int currentStation) {
        if (currentStation == maxStation) {
            return minStation;
        } else {
            return currentStation = currentStation + 1;
        }
    }

    public int ReturnToEnd(int currentStation) {
        if (currentStation == minStation) {
            return maxStation;
        } else {
            return currentStation = currentStation - 1;
        }
    }

    // Volume unit
    private String volume;
    private int maxVolume = 10;
    private int minVolume = 0;
    private int currentVolume;

    public String getVolume() {
        return volume;
    }

    public void setVolume(String station) {
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

    public int StopWhenMaxVolume(int currentVolume) {
        if (currentVolume >= maxVolume) {
            currentVolume = maxVolume;
        }
        return currentVolume;
    }

    public int StopWhenMinVolume(int currentVolume) {
        if (currentVolume <= minVolume) {
            currentVolume = minVolume;
        }
        return currentVolume;
    }

}

