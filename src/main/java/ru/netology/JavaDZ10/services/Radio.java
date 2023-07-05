package ru.netology.JavaDZ10.services;
public class Radio {
    private int currentStation;

    public int getCurrentStation() {
        return currentStation;
    }

    public void setCurrentStation(int newCurrentStation) {
        currentStation = newCurrentStation;
    }

    public void setToMinStation(int newCurrentStation) {
        currentStation = newCurrentStation;
        if (currentStation < 0) {
            currentStation = 9;
        } else {
            currentStation = currentStation +1;
        }

    }

    public void setToMaxStation(int newCurrentStation) {
        currentStation = newCurrentStation;
        if (currentStation > 9) {
            currentStation = 0;
        } else {
            currentStation = currentStation - 1;
        }
    }

    public void setToNextStation(int newCurrentStation) {
        currentStation = newCurrentStation;
        if (currentStation >= 0) {
            currentStation++;
        } else {
            currentStation = 9;
        }
    }

    public void setToBackStation(int newCurrentStation) {
        currentStation = newCurrentStation;
        if (currentStation <= 9) {
            currentStation--;
        } else {
            currentStation = 0;
        }


    }


}

