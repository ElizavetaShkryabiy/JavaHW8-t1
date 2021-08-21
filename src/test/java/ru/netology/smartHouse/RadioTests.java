package ru.netology.smartHouse;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;

public class RadioTests {


    @Test
    public void shouldCheckThatCurrentStationIsOkToSetVariable() {
        Radio station = new Radio(100);
        station.setCheckCorrectCurrentStation(30);
        int actual = station.getCurrentStation();
        assertEquals(30, actual);
    }

    @Test
    public void shouldCheckThatMoreThenMaxCurrentStationIsNotOkToSetVariable() {
        Radio station = new Radio(100);
        station.setCurrentStation(2);
        station.setCheckCorrectCurrentStation(102);
        int actual = station.getCurrentStation();
        assertEquals(2, actual);
    }

    @Test
    public void shouldCheckThatLessThenMinCurrentStationIsNotOkToSet() {
        Radio station = new Radio();
        station.setCurrentStation(7);
        station.setCheckCorrectCurrentStation(-1);
        int actual = station.getCurrentStation();
        assertEquals(7, actual);
    }

    @Test
    public void shouldGetCurrentStation() {
        Radio station = new Radio();
        station.setCurrentStation(7);
        int actual = station.getCurrentStation();
        assertEquals(7, actual);
    }


    @Test
    public void shouldChangeToNextStation() {
        Radio station = new Radio();
        station.setCurrentStation(7);
        int actual = station.nextStation();
        assertEquals(8, actual);
    }

    @Test
    public void shouldChangeToNextStationWhenCurrentIsMaxVariable() {
        Radio station = new Radio(50);
        station.setCurrentStation(49);
        int actual = station.nextStation();
        assertEquals(0, actual);
    }


    @Test
    public void shouldChangeToPrevStation() {
        Radio station = new Radio();
        station.setCurrentStation(7);
        int actual = station.prevStation();
        assertEquals(6, actual);
    }

    @Test
    public void shouldChangeToPrevStationWhenCurrentIsMinVariable() {
        Radio station = new Radio(50);
        station.setCurrentStation(0);
        int actual = station.prevStation();
        assertEquals(49, actual);
    }


    @Test
    public void shouldGetCurrentVolume() {
        Radio volume = new Radio();
        volume.setCurrentVolume(50);
        int actual = volume.getCurrentVolume();
        assertEquals(50, actual);
    }


    @Test
    public void shouldIncreaseVolume() {
        Radio volume = new Radio();
        volume.setCurrentVolume(5);
        int actual = volume.increaseVolume();
        assertEquals(6, actual);
    }

    @Test
    public void shouldIncreaseVolumeWhenCurrentIsMax() {
        Radio volume = new Radio();
        volume.setCurrentVolume(100);
        int actual = volume.increaseVolume();
        assertEquals(100, actual);
    }

    @Test
    public void shouldDecreaseVolume() {
        Radio volume = new Radio();
        volume.setCurrentVolume(5);
        int actual = volume.decreaseVolume();
        assertEquals(4, actual);
    }

    @Test
    public void shouldDecreaseVolumeWhenCurrentIsMin() {
        Radio volume = new Radio();
        volume.setCurrentVolume(0);
        int actual = volume.decreaseVolume();
        assertEquals(0, actual);
    }

//


    @Test
    public void shouldCheckThatCurrentStationIsOkToSet() {
        Radio station = new Radio();
        station.setCurrentStation(7);
        station.setCheckCorrectCurrentStation(5);
        int actual = station.getCurrentStation();
        assertEquals(5, actual);
    }

    @Test
    public void shouldCheckThatMoreThenMaxCurrentStationIsNotOkToSet() {
        Radio station = new Radio();
        station.setCurrentStation(7);
        station.setCheckCorrectCurrentStation(10);
        int actual = station.getCurrentStation();
        assertEquals(7, actual);
    }

    @Test
    public void shouldCheckThatLessThenMinCurrentStationIsNotOkToSetVariable() {
        Radio station = new Radio(20);
        station.setCurrentStation(7);
        station.setCheckCorrectCurrentStation(-1);
        int actual = station.getCurrentStation();
        assertEquals(7, actual);
    }

    @Test
    public void shouldGetCurrentStationVariable() {
        Radio station = new Radio(19);
        station.setCurrentStation(7);
        int actual = station.getCurrentStation();
        assertEquals(7, actual);
    }


    @Test
    public void shouldChangeToNextStationVariable() {
        Radio station = new Radio( 30);
        station.setCurrentStation(7);
        int actual = station.nextStation();
        assertEquals(8, actual);
    }

    @Test
    public void shouldChangeToNextStationWhenCurrentIsMax() {
        Radio station = new Radio();
        station.setCurrentStation(9);
        int actual = station.nextStation();
        assertEquals(0, actual);
    }


    @Test
    public void shouldChangeToPrevStationVariable() {
        Radio station = new Radio( 40);
        station.setCurrentStation(7);
        int actual = station.prevStation();
        assertEquals(6, actual);
    }

    @Test
    public void shouldChangeToPrevStationWhenCurrentIsMin2Variables() {
        Radio station = new Radio();
        station.setCurrentStation(0);
        int actual = station.prevStation();
        assertEquals(9, actual);
    }
}
