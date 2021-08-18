package ru.netology.smartHouse;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;

public class RadioTests {

    @Test
    public void shouldSetStringStation() {
        Radio station = new Radio("station", 100, 56);
        station.setStation("statio");
        String actual = station.getStation();
        assertEquals("statio", actual);
    }

    @Test
    public void shouldGetStringStation() {
        Radio station = new Radio("statio", 100, 56);

        String actual = station.getStation();
        assertEquals("statio", actual);
    }

    @Test
    public void shouldSetMaxStation() {
        Radio station = new Radio("station", 100, 56);
        station.setMaxStation(20);
        int actual = station.getMaxStation();
        assertEquals(20, actual);
    }

    @Test
    public void shouldGetMaxStation() {
        Radio station = new Radio("station", 100, 56);

        int actual = station.getMaxStation();
        assertEquals(100, actual);
    }

    @Test
    public void shouldGetMinStation() {
        Radio station = new Radio("station", 100, 56);

        int actual = station.getMinStation();
        assertEquals(0, actual);
    }

    @Test
    public void shouldSetMinStation() {
        Radio station = new Radio("station", 100, 56);
        station.setMinStation(1);
        int actual = station.getMinStation();
        assertEquals(1, actual);
    }

    @Test
    public void shouldJustSetCurrentStation() {
        Radio station = new Radio("station", 100, 56);
        station.setCurrentStation(54);
        int actual = station.getCurrentStation();
        assertEquals(54, actual);
    }

    @Test
    public void shouldSetCurrentVolume() {
        Radio volume = new Radio(50);
        volume.setCurrentVolume(10);
        int actual = volume.getCurrentVolume();
        assertEquals(10, actual);
    }

    @Test
    public void shouldSetMaxVolume() {
        Radio volume = new Radio(50);
        volume.setMaxVolume(10);
        int actual = volume.getMaxVolume();
        assertEquals(10, actual);
    }

    @Test
    public void shouldSetMinVolume() {
        Radio volume = new Radio(50);
        volume.setMinVolume(10);
        int actual = volume.getMinVolume();
        assertEquals(10, actual);
    }
    @Test
    public void shouldGetMinVolume() {
        Radio volume = new Radio(50);

        int actual = volume.getMinVolume();
        assertEquals(0, actual);
    }



//    tests with logic

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

        int actual = station.nextStation();
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
