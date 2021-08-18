package ru.netology.smartHouse;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;

public class RadioTests {


    @Test
    public void shouldCheckThatCurrentStationIsOkToSet3Variables() {
        Radio station = new Radio("station", 100, 56);
        station.setCheckCorrectCurrentStation(30);
        int actual = station.getCurrentStation();
        assertEquals(30, actual);
    }

    @Test
    public void shouldCheckThatMoreThenMaxCurrentStationIsNotOkToSet3Variables() {
        Radio station = new Radio("station", 100, 2);
        station.setCheckCorrectCurrentStation(102);
        int actual = station.getCurrentStation();
        assertEquals(2, actual);
    }

    @Test
    public void shouldCheckThatLessThenMinCurrentStationIsNotOkToSet2Variables() {
        Radio station = new Radio("station", 7);
        station.setCheckCorrectCurrentStation(-1);
        int actual = station.getCurrentStation();
        assertEquals(7, actual);
    }

    @Test
    public void shouldGetCurrentStation2Variables() {
        Radio station = new Radio("station", 7);
        int actual = station.getCurrentStation();
        assertEquals(7, actual);
    }


    @Test
    public void shouldChangeToNextStation2Variables() {
        Radio station = new Radio("station", 7);
        int actual = station.nextStation();
        assertEquals(8, actual);
    }

    @Test
    public void shouldChangeToNextStationWhenCurrentIsMax3Variables() {
        Radio station = new Radio("station", 50, 50);

        int actual = station.nextStation();
        assertEquals(0, actual);
    }


    @Test
    public void shouldChangeToPrevStation2Variables() {
        Radio station = new Radio("station", 7);
        int actual = station.prevStation();
        assertEquals(6, actual);
    }

    @Test
    public void shouldChangeToPrevStationWhenCurrentIsMin3Variables() {
        Radio station = new Radio("station", 50, 0);

        int actual = station.prevStation();
        assertEquals(50, actual);
    }


    @Test
    public void shouldGetCurrentVolume() {
        Radio volume = new Radio(50);
        int actual = volume.getCurrentVolume();
        assertEquals(50, actual);
    }


    @Test
    public void shouldIncreaseVolume() {
        Radio volume = new Radio(5);
        int actual = volume.increaseVolume();
        assertEquals(6, actual);
    }

    @Test
    public void shouldIncreaseVolumeWhenCurrentIsMax() {
        Radio volume = new Radio(100);

        int actual = volume.increaseVolume();
        assertEquals(100, actual);
    }

    @Test
    public void shouldDecreaseVolume() {
        Radio volume = new Radio(5);
        int actual = volume.decreaseVolume();
        assertEquals(4, actual);
    }

    @Test
    public void shouldDecreaseVolumeWhenCurrentIsMin() {
        Radio volume = new Radio(0);

        int actual = volume.decreaseVolume();
        assertEquals(0, actual);
    }

//


    @Test
    public void shouldCheckThatCurrentStationIsOkToSet2Variables() {
        Radio station = new Radio("station", 9);
        station.setCheckCorrectCurrentStation(5);
        int actual = station.getCurrentStation();
        assertEquals(5, actual);
    }

    @Test
    public void shouldCheckThatMoreThenMaxCurrentStationIsNotOkToSet2Variables() {
        Radio station = new Radio("station", 2);
        station.setCheckCorrectCurrentStation(10);
        int actual = station.getCurrentStation();
        assertEquals(2, actual);
    }

    @Test
    public void shouldCheckThatLessThenMinCurrentStationIsNotOkToSet3Variables() {
        Radio station = new Radio("station", 20, 7);
        station.setCheckCorrectCurrentStation(-1);
        int actual = station.getCurrentStation();
        assertEquals(7, actual);
    }

    @Test
    public void shouldGetCurrentStation3Variables() {
        Radio station = new Radio("station", 19, 7);
        int actual = station.getCurrentStation();
        assertEquals(7, actual);
    }


    @Test
    public void shouldChangeToNextStation3Variables() {
        Radio station = new Radio("station", 30, 7);
        int actual = station.nextStation();
        assertEquals(8, actual);
    }

    @Test
    public void shouldChangeToNextStationWhenCurrentIsMax2Variables() {
        Radio station = new Radio("station", 9);

        int actual = station.nextStation();
        assertEquals(0, actual);
    }


    @Test
    public void shouldChangeToPrevStation3Variables() {
        Radio station = new Radio("station", 40, 7);
        int actual = station.prevStation();
        assertEquals(6, actual);
    }

    @Test
    public void shouldChangeToPrevStationWhenCurrentIsMin2Variables() {
        Radio station = new Radio("station", 0);

        int actual = station.prevStation();
        assertEquals(9, actual);
    }
}
