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
    public void shouldMinStation() {
        Radio stat = new Radio();

        stat.setToMinStation(-1);

        int expected = 9;
        int actual = stat.getCurrentStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldMinUpStation() {
        Radio stat = new Radio();

        stat.setToMinStation(0);

        int expected = 1;
        int actual = stat.getCurrentStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldMaxStation() {
        Radio stat = new Radio();

        stat.setToMaxStation(10);

        int expected = 0;
        int actual = stat.getCurrentStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldUnderMaxStation() {
        Radio stat = new Radio();

        stat.setToMaxStation(9);
        int expected = 8;
        int actual = stat.getCurrentStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldNextStation() {
        Radio stat = new Radio();

        stat.setToNextStation(2);

        int expected = 3;
        int actual = stat.getCurrentStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void ShouldUnderNextStation() {
        Radio stat = new Radio();

        stat.setToNextStation(-1);

        int expected = 9;
        int actual = stat.getCurrentStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldBackStation() {
        Radio stat = new Radio();

        stat.setToBackStation(8);

        int expected = 7;
        int actual = stat.getCurrentStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldBackUpStation() {
        Radio stat = new Radio();

        stat.setToBackStation(10);

        int expected = 0;
        int actual = stat.getCurrentStation();

        Assertions.assertEquals(expected, actual);
    }


}




