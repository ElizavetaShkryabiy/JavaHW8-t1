package ru.netology.smartHouse;

import java.util.Collections;

public class Radio {
    //   Station unit

    private int maxStation = 9;
    private int minStation = 1;
    private int currentStation;

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

    public void NextStation() {
        if (currentStation == maxStation) {
            currentStation = minStation;
        } else {
            currentStation = currentStation + 1;
        }
    }

    public void PrevStation() {
        if (currentStation == minStation) {
            currentStation = maxStation;
        } else {
            currentStation = currentStation - 1;
        }
    }

    // Volume unit

    private int maxVolume = 10;
    private int minVolume = 0;
    private int currentVolume;

    public int getMaxVolume() {return maxVolume;}

    public int getMinVolume() {return minVolume;}

    public int getCurrentVolume() {return currentVolume;}

    public void setCurrentVolume(int currentVolume) {
        if (currentVolume > maxVolume) {
            currentVolume = maxVolume;
        }
        if (currentVolume < minVolume) {
            currentVolume = minVolume;
        }
        this.currentVolume = currentVolume;
    }

}

