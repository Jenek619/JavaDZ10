package ru.netology.JavaDZ10.services;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class RadioTest {
    @Test
    public void shouldSetStation() {
        Radio stat = new Radio();
        stat.setCurrentStation(5);

        int expected = 5;
        int actual = stat.getCurrentStation();

        Assertions.assertEquals(expected, actual);

    }


    @Test
    public void shouldNextStation() {
        Radio stat = new Radio();
        stat.setCurrentStation(2);
        stat.nextStation();

        int expected = 3;
        int actual = stat.getCurrentStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldNextStationAfterMax() {
        Radio stat = new Radio();
        stat.setCurrentStation(9);
        stat.nextStation();

        int expected = 0;
        int actual = stat.getCurrentStation();

        Assertions.assertEquals(expected, actual);
    }


    @Test
    public void shouldPrevStation() {
        Radio stat = new Radio();
        stat.setCurrentStation(8);
        stat.prevStation();

        int expected = 7;
        int actual = stat.getCurrentStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldPrevStationBeforeMin() {
        Radio stat = new Radio();
        stat.setCurrentStation(0);
        stat.prevStation();

        int expected = 9;
        int actual = stat.getCurrentStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldStationAboveMax() {
        Radio stat = new Radio();
        stat.setCurrentStation(10);
        stat.nextStation();

        int expected = 1;
        int actual = stat.getCurrentStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldStationBelowMin() {
        Radio stat = new Radio();
        stat.setCurrentStation(-1);
        stat.prevStation();

        int expected = 9;
        int actual = stat.getCurrentStation();

        Assertions.assertEquals(expected, actual);
    }


    @Test
    public void shouldSetVolume() {
        Radio vol = new Radio();

        vol.setCurrentVolume(50);

        int expected = 50;
        int actual = vol.getCurrentVolume();

        Assertions.assertEquals(expected, actual);

    }


    @Test
    public void shouldIncreaseVolume() {
        Radio vol = new Radio();
        vol.setCurrentVolume(84);
        vol.increaseVolume();

        int expected = 85;
        int actual = vol.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldDecreaseVolume() {
        Radio vol = new Radio();
        vol.setCurrentVolume(51);
        vol.decreaseVolume();

        int expected = 50;
        int actual = vol.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldIncreaseVolumeMax() {
        Radio vol = new Radio();
        vol.setCurrentVolume(100);
        vol.increaseVolume();

        int expected = 100;
        int actual = vol.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldDecreaseVolumeMin() {
        Radio vol = new Radio();
        vol.setCurrentVolume(0);
        vol.decreaseVolume();

        int expected = 0;
        int actual = vol.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldIncreaseVolumeAboveMax() {
        Radio vol = new Radio();
        vol.setCurrentVolume(102);
        vol.increaseVolume();

        int expected = 100;
        int actual = vol.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldDecreaseVolumeBelowMin() {
        Radio vol = new Radio();
        vol.setCurrentVolume(-5);
        vol.decreaseVolume();

        int expected = 0;
        int actual = vol.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }


}










