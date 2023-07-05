package ru.netology.JavaDZ10.services;
public class Volume {

    private int currentVolume;

    public int getCurrentVolume() {
        return currentVolume;
    }

    public void setCurrentVolume(int newCurrentVolume) {
        currentVolume = newCurrentVolume;
    }

    public void setToMinVolume(int newCurrentVolume) {
        currentVolume = newCurrentVolume;
        if (currentVolume == 0) {
            currentVolume = 0;
        } else {
            currentVolume++;
        }

    }

    public void setToMaxVolume(int newCurrentVolume) {
        currentVolume = newCurrentVolume;
        if (currentVolume == 100) {
            currentVolume = 100;
        } else {
            currentVolume--;
        }
    }

    public void setToNextVolume(int newCurrentVolume) {
        currentVolume = newCurrentVolume;
        if (currentVolume >= 0) {
            currentVolume++;
        } else {
            currentVolume = 0;
        }
    }

    public void setToBackVolume(int newCurrentVolume) {
        currentVolume = newCurrentVolume;
        if (currentVolume <= 100) {
            currentVolume--;
        } else {
            currentVolume = 100;
        }


    }
}
