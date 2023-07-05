package ru.netology.JavaDZ10.services;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class VolumeTest {


    @Test
    public void shouldSetVolume() {
        Volume vol = new Volume();

        vol.setCurrentVolume(50);

        int expected = 50;
        int actual = vol.getCurrentVolume();

        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void shouldMinVolume() {
        Volume vol = new Volume();

        vol.setToMinVolume(0);

        int expected = 0;
        int actual = vol.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldUnderMinVolume() {
        Volume vol = new Volume();

        vol.setToMinVolume(-1);

        int expected = 0;
        int actual = vol.getCurrentVolume();

        Assertions.assertEquals(expected,actual);
    }


    @Test
    public void shouldMaxVolume() {
        Volume vol = new Volume();

        vol.setToMaxVolume(100);

        int expected = 100;
        int actual = vol.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldUpMaxVolume() {
        Volume vol = new Volume();

        vol.setToMaxVolume(101);

        int expected = 100;
        int actual = vol.getCurrentVolume();

        Assertions.assertEquals(expected,actual);
    }

    @Test
    public void shouldNextVolume() {
        Volume vol = new Volume();

        vol.setToNextVolume(84);

        int expected = 85;
        int actual = vol.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldUpNextVolume() {
        Volume vol = new Volume();

        vol.setToNextVolume(-1);

        int expected =0;
        int actual = vol.getCurrentVolume();

        Assertions.assertEquals(expected,actual);
    }

    @Test
    public void shouldBackVolume() {
        Volume vol = new Volume();

        vol.setToBackVolume(81);

        int expected = 80;
        int actual = vol.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldUnderBackVolume() {
        Volume vol = new Volume();

        vol.setToBackVolume(101);

        int expected = 100;
        int actual = vol.getCurrentVolume();

        Assertions.assertEquals(expected,actual);
    }



}



