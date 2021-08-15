package ru.netology.smartHouse;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;

public class RadioTests {




    @Test
    public void shouldCheckThatCurrentStationIsOkToSet() {
        Radio station = new Radio();
        station.setCheckCorrectCurrentStation(8);
        int actual = station.getCurrentStation();
        assertEquals(8, actual);
    }
    @Test
    public void shouldCheckThatMoreThenMaxCurrentStationIsNotOkToSet() {
        Radio station = new Radio();
        station.setCheckCorrectCurrentStation(10);
        int actual = station.getCurrentStation();
        assertEquals(7, actual);
    }
    @Test
    public void shouldCheckThatLessThenMinCurrentStationIsNotOkToSet() {
        Radio station = new Radio();
        station.setCheckCorrectCurrentStation(0);
        int actual = station.getCurrentStation();
        assertEquals(7, actual);
    }

    @Test
    public void shouldGetCurrentStation() {
        Radio station = new Radio();
        int actual = station.getCurrentStation();
        assertEquals(7, actual);
    }

    @Test
    public void shouldSetCurrentStationLessThenMin() {
        Radio station = new Radio();
        station.setCheckCorrectCurrentStation(0);
        int actual = station.getCurrentStation();
        assertEquals(7, actual);
    }

    @Test
    public void shouldSetCurrentStationMoreThenMax() {
        Radio station = new Radio();
        station.setCheckCorrectCurrentStation(11);
        int actual = station.getCurrentStation();
        assertEquals(7, actual);
    }

    @Test
    public void shouldChangeToNextStation() {
        Radio station = new Radio();
        int actual = station.nextStation();
        assertEquals(8, actual);
    }

    @Test
    public void shouldChangeToNextStationWhenCurrentIsMax() {
        Radio station = new Radio();
        station.nextStation();
        int actual = station.nextStationWhenCurrentIsMax(9);
        assertEquals(1, actual);
    }


    @Test
    public void shouldChangeToPrevStation() {
        Radio station = new Radio();
        int actual = station.prevStation();
        assertEquals(6, actual);
    }

    @Test
    public void shouldChangeToPrevStationWhenCurrentIsMin() {
        Radio station = new Radio();
        station.prevStation();
        int actual = station.prevStationWhenCurrentIsMin(1);
        assertEquals(9, actual);
    }


    @Test
    public void shouldGetCurrentVolume() {
        Radio volume = new Radio();
        int actual = volume.getCurrentVolume();
        assertEquals(5, actual);
    }


    @Test
    public void shouldSetCorrectCurrentVolume() {
        Radio volume = new Radio();
        volume.setCheckCorrectCurrentVolume(6);
        int actual = volume.getCurrentVolume();
        assertEquals(6, actual);
    }

    @Test
    public void shouldNotSetCurrentVolumeMoreThenMax() {
        Radio volume = new Radio();
        volume.setCheckCorrectCurrentVolume(12);
        int actual = volume.getCurrentVolume();
        assertEquals(5, actual);
    }

    @Test
    public void shouldNotSetCurrentVolumeLessThenMin() {
        Radio volume = new Radio();
        volume.setCheckCorrectCurrentVolume(-1);
        int actual = volume.getCurrentVolume();
        assertEquals(5, actual);
    }

    @Test
    public void shouldIncreaseVolume() {
        Radio volume = new Radio();
        int actual = volume.increaseVolume();
        assertEquals(6, actual);
    }

    @Test
    public void shouldIncreaseVolumeWhenCurrentIsMax() {
        Radio volume = new Radio();
        int actual = volume.increaseVolumeWhenCurrentIsMax(10);
        assertEquals(10, actual);
    }

    @Test
    public void shouldDecreaseVolume() {
        Radio volume = new Radio();
        int actual = volume.decreaseVolume();
        assertEquals(4, actual);
    }

    @Test
    public void shouldDecreaseVolumeWhenCurrentIsMin() {
        Radio volume = new Radio();
        int actual = volume.decreaseVolumeWhenCurrentIsMin(0);
        assertEquals(0, actual);
    }

}
