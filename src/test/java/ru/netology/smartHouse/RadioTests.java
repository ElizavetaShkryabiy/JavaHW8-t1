package ru.netology.smartHouse;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;

public class RadioTests {


    @Test
    public void shouldSetCurrentStation() {
        Radio station = new Radio("station", 100, 56);

        int actual = station.getCurrentStation();
        assertEquals(56, actual);
    }

    @Test
    public void shouldCheckThatCurrentStationIsOkToSet() {
        Radio station = new Radio("station", 100, 56);
        station.setCheckCorrectCurrentStation(30);
        int actual = station.getCurrentStation();
        assertEquals(30, actual);
    }

    @Test
    public void shouldCheckThatMoreThenMaxCurrentStationIsNotOkToSet() {
        Radio station = new Radio("station", 100, 2);
        station.setCheckCorrectCurrentStation(102);
        int actual = station.getCurrentStation();
        assertEquals(2, actual);
    }

    @Test
    public void shouldCheckThatLessThenMinCurrentStationIsNotOkToSet() {
        Radio station = new Radio("station", 7);
        station.setCheckCorrectCurrentStation(-1);
        int actual = station.getCurrentStation();
        assertEquals(7, actual);
    }

    @Test
    public void shouldGetCurrentStation() {
        Radio station = new Radio("station", 7);
        int actual = station.getCurrentStation();
        assertEquals(7, actual);
    }


    @Test
    public void shouldChangeToNextStation() {
        Radio station = new Radio("station", 7);
        int actual = station.nextStation();
        assertEquals(8, actual);
    }

    @Test
    public void shouldChangeToNextStationWhenCurrentIsMax() {
        Radio station = new Radio("station", 50, 50);

        int actual = station.nextStationWhenCurrentIsMax();
        assertEquals(0, actual);
    }


    @Test
    public void shouldChangeToPrevStation() {
        Radio station = new Radio("station", 7);
        int actual = station.prevStation();
        assertEquals(6, actual);
    }

    @Test
    public void shouldChangeToPrevStationWhenCurrentIsMin() {
        Radio station = new Radio("station", 50, 0);

        int actual = station.prevStationWhenCurrentIsMin();
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

        int actual = volume.increaseVolumeWhenCurrentIsMax();
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

        int actual = volume.decreaseVolumeWhenCurrentIsMin();
        assertEquals(0, actual);
    }

}
