package ru.netology.javaqa;

public class Radio{

    public int currentVolume;
    public int currentRadioStation;

    public int getCurrentVolume() {
        return currentVolume;
    }

    public void increaseVolume() {
        if (currentVolume < 10) {
            currentVolume = currentVolume + 1;
        }
    }

    public void maxVolume() {
        if (currentVolume == 10) {
           return currentVolume;
        }
    }

    public void minVolume() {
        if (currentVolume == 0) {
            return currentVolume;
        }
    }

    private int currentStation;

    private final int minStation, maxStation;

    public Radio(int currentStation, int minStation, int maxStation) {
        this.currentStation = currentStation;
        this.minStation = minStation;
        this.maxStation = maxStation;
    }

    public int prev () {
        if (currentStation == minStation) {
            return maxStation;
        } else return --currentStation;
        //currentStation = currentStation <= minStation ? maxStation : --currentStation;
        //return currentStation;
    }

    public int next() {
        if (currentStation == maxStation) {
            return minStation;
        } else return ++currentStation;
        //currentStation = currentStation >= maxStation ? minStation : ++currentStation;
        //return currentStation;
    }

    public int getCurrentStation() {
        return currentStation;
    }

}
}