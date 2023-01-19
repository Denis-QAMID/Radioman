package ru.netology.Radioman;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TestRadio {


    @Test
    public void shouldSetDefaultRadioStationNumber() {
        Radio radio = new Radio();

        int expected = 10;
        int actual = radio.radioStationNumber;

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetRadioStationNumber() {
        Radio radio = new Radio(5);

        int expected = 5;
        int actual = radio.radioStationNumber;

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetMoreThanDefaultRadioStationNumber() {
        Radio radio = new Radio(15);

        int expected = 14;
        int actual = radio.maxRadioStationNumber;

        Assertions.assertEquals(expected, actual);
    }


    @Test
    public void shouldSetRadioStationNumberZero() {
        Radio radio = new Radio();

        radio.setCurrentRadioStation(0);

        int expected = 0;
        int actual = radio.currentRadioStationNumber;

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetRadioStationNumberOne() {
        Radio radio = new Radio();

        radio.setCurrentRadioStation(1);

        int expected = 1;
        int actual = radio.currentRadioStationNumber;

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetRadioStationNumberEight() {
        Radio radio = new Radio();

        radio.setCurrentRadioStation(8);

        int expected = 8;
        int actual = radio.currentRadioStationNumber;

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetRadioStationNumberNine() {
        Radio radio = new Radio();

        radio.setCurrentRadioStation(9);

        int expected = 9;
        int actual = radio.currentRadioStationNumber;

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetRadioStationNumberTen() {
        Radio radio = new Radio();

        radio.setCurrentRadioStation(10);

        int expected = 0;
        int actual = radio.currentRadioStationNumber;

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetRadioStationNextFromMiddle() {
        Radio radio = new Radio();
        radio.setCurrentRadioStation(5);

        radio.next();

        int expected = 6;
        int actual = radio.currentRadioStationNumber;

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetRadioStationNextFromEnd() {
        Radio radio = new Radio();
        radio.setCurrentRadioStation(9);

        radio.next();

        int expected = 0;
        int actual = radio.currentRadioStationNumber;

        Assertions.assertEquals(expected, actual);
    }


    @Test
    public void shouldSetRadioStationPrevFromMiddle() {
        Radio radio = new Radio();
        radio.setCurrentRadioStation(5);

        radio.prev();

        int expected = 4;
        int actual = radio.currentRadioStationNumber;

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetRadioStationPrevFromStart() {
        Radio radio = new Radio();
        radio.setCurrentRadioStation(0);

        radio.prev();

        int expected = 9;
        int actual = radio.currentRadioStationNumber;

        Assertions.assertEquals(expected, actual);
    }


    @Test
    public void shouldIncreaseVolumeFromMiddle() {
        Radio radio = new Radio();
        radio.currentVolume = 5;

        radio.increaseVolume();

        int expected = 6;
        int actual = radio.currentVolume;

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldIncreaseVolumeFromEnd() {
        Radio radio = new Radio();
        radio.currentVolume = 100;

        radio.increaseVolume();

        int expected = 100;
        int actual = radio.currentVolume;

        Assertions.assertEquals(expected, actual);
    }


    @Test
    public void shouldDecreaseVolumeFromMiddle() {
        Radio radio = new Radio();
        radio.currentVolume = 5;

        radio.decreaseVolume();

        int expected = 4;
        int actual = radio.currentVolume;

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldDecreaseVolumeFromStart() {
        Radio radio = new Radio();
        radio.currentVolume = 0;

        radio.decreaseVolume();

        int expected = 0;
        int actual = radio.currentVolume;

        Assertions.assertEquals(expected, actual);
    }
}