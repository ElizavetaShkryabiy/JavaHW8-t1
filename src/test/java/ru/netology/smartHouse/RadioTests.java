package ru.netology.smartHouse;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;

public class RadioTests {


    @Test
    public void shouldGetCurrentStation () {
        Radio station = new Radio();
        int actual = station.getCurrentStation();
        assertEquals(7, actual);
    }

    @Test
    public void shouldSetCurrentStation () {
        Radio station = new Radio ();
        station.setCurrentStation(3);
        int actual = station.getCurrentStation();
        assertEquals(3, actual);
    }

    @Test
    public void shouldChangeToNextStation () {
        Radio station = new Radio();
        station.NextStation();
        int actual = station.NextStation();
        assertEquals(8,actual);
    }

    @Test
    public void shouldChangeToPrevStation () {
        Radio station = new Radio();
        station.PrevStation();
        int actual = station.getCurrentStation();
        assertEquals(6,actual);
    }



    @Test
    public void shouldGetCurrentVolume () {
        Radio volume = new Radio();
        int actual = volume.getCurrentVolume();
        assertEquals(4, actual);
    }

    @Test
    public void shouldSetCurrentVolume () {
        Radio volume = new Radio();
        volume.setCurrentVolume(5);
        int actual = volume.getCurrentVolume();
        assertEquals(5, actual);
    }

    @Test
    public void shouldIncreaseVolume () {
        Radio volume = new Radio();
        volume.IncreaseVolume();
        int actual = volume.getCurrentVolume();
        assertEquals(5,actual);
    }

    @Test
    public void shouldDecreaseVolume () {
        Radio volume = new Radio();
        volume.DecreaseVolume() ;
        int actual = volume.getCurrentVolume();
        assertEquals(3,actual);
    }

}
