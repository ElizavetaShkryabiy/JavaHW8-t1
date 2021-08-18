package ru.netology.smartHouse;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

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
        station.setCheckCorrectCurrentStation(7);
        station.setCheckCorrectCurrentStation(10);
        int actual = station.getCurrentStation();
        assertEquals(7, actual);
    }

    @Test
    public void shouldCheckThatLessThenMinCurrentStationIsNotOkToSet() {
        Radio station = new Radio();
        station.setCheckCorrectCurrentStation(7);
        station.setCheckCorrectCurrentStation(0);
        int actual = station.getCurrentStation();
        assertEquals(7, actual);
    }

    @Test
    public void shouldGetCurrentStation() {
        Radio station = new Radio();
        station.setCheckCorrectCurrentStation(7);
        int actual = station.getCurrentStation();
        assertEquals(7, actual);
    }


    @Test
    public void shouldChangeToNextStation() {
        Radio station = new Radio();
        station.setCheckCorrectCurrentStation(7);
        int actual = station.nextStation();
        assertEquals(8, actual);

    }

    @Test
    public void shouldChangeToNextStationWhenCurrentIsMax() {
        Radio station = new Radio();
        station.setCheckCorrectCurrentStation(9);
        int actual = station.nextStation();
        assertEquals(1, actual);
    }


    @Test
    public void shouldChangeToPrevStation() {
        Radio station = new Radio();
        station.setCheckCorrectCurrentStation(7);
        int actual = station.prevStation();
        assertEquals(6, actual);
    }

    @Test
    public void shouldChangeToPrevStationWhenCurrentIsMin() {
        Radio station = new Radio();
        station.setCheckCorrectCurrentStation(1);
        int actual = station.prevStation();
        assertEquals(9, actual);
    }


    @Test
    public void shouldGetCurrentVolume() {
        Radio volume = new Radio();
        volume.setCheckCorrectCurrentVolume(5);
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
        volume.setCheckCorrectCurrentVolume(5);
        volume.setCheckCorrectCurrentVolume(12);
        int actual = volume.getCurrentVolume();
        assertEquals(5, actual);
    }

    @Test
    public void shouldNotSetCurrentVolumeLessThenMin() {
        Radio volume = new Radio();
        volume.setCheckCorrectCurrentVolume(5);
        volume.setCheckCorrectCurrentVolume(-1);
        int actual = volume.getCurrentVolume();
        assertEquals(5, actual);
    }

    @Test
    public void shouldIncreaseVolume() {
        Radio volume = new Radio();
        volume.setCheckCorrectCurrentVolume(5);
        int actual = volume.increaseVolume();
        assertEquals(6, actual);
    }

    @Test
    public void shouldIncreaseVolumeWhenCurrentIsMax() {
        Radio volume = new Radio();
        volume.setCheckCorrectCurrentVolume(10);
        int actual = volume.increaseVolume();
        assertEquals(10, actual);
    }

    @Test
    public void shouldDecreaseVolume() {
        Radio volume = new Radio();
        volume.setCheckCorrectCurrentVolume(5);
        int actual = volume.decreaseVolume();
        assertEquals(4, actual);
    }

    @Test
    public void shouldDecreaseVolumeWhenCurrentIsMin() {
        Radio volume = new Radio();
        volume.setCheckCorrectCurrentVolume(0);
        int actual = volume.decreaseVolume();
        assertEquals(0, actual);
    }

}
