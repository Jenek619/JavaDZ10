package ru.netology.JavaDZ10.services;

public class Radio {
    private int currentStation;
    private int currentVolume;

    public int getCurrentStation() {
        return currentStation;
    }

    public void setCurrentStation(int newCurrentStation) {
        if (newCurrentStation < 0) {
            return;
        }
        if (newCurrentStation > 9) {
            return;
        }
        currentStation = newCurrentStation;
    }


    public void nextStation() {
        if (currentStation < 9) {
            currentStation = currentStation + 1;
        } else {
            currentStation = 0;
        }
    }

    public void prevStation() {
        if (currentStation > 0) {
            currentStation = currentStation - 1;
        } else {
            currentStation = 9;
        }


    }


    public int getCurrentVolume() {

        return currentVolume;
    }

    public void setCurrentVolume(int newCurrentVolume) {
        if (newCurrentVolume < 0) {
            newCurrentVolume = 0;
        }
        if (newCurrentVolume > 100) {
            newCurrentVolume = 100;
        }
        currentVolume = newCurrentVolume;
    }


    public void increaseVolume() {
        if (currentVolume < 100) {
            currentVolume = currentVolume + 1;
        }

    }

    public void decreaseVolume() {
        if (currentVolume > 0) {
            currentVolume = currentVolume - 1;
        }


    }
}




