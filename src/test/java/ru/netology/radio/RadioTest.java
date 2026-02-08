package ru.netology.radio;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class RadioTest {

        @Test
        public void shouldSetStationWhenValid() {
            Radio radio = new Radio();
            radio.setCurrentStation(5);
            assertEquals(5, radio.getCurrentStation());
        }

        @Test
        public void shouldNotSetStationWhenBelowZero() {
            Radio radio = new Radio();
            radio.setCurrentStation(5);
            radio.setCurrentStation(-1);
            assertEquals(5, radio.getCurrentStation());
        }

        @Test
        public void shouldNotSetStationWhenAboveNine() {
            Radio radio = new Radio();
            radio.setCurrentStation(5);
            radio.setCurrentStation(10);
            assertEquals(5, radio.getCurrentStation());
        }

        @Test
        public void shouldNextFromEightToNine() {
            Radio radio = new Radio();
            radio.setCurrentStation(8);
            radio.next();
            assertEquals(9, radio.getCurrentStation());
        }

        @Test
        public void shouldNextFromNineToZero() {
            Radio radio = new Radio();
            radio.setCurrentStation(9);
            radio.next();
            assertEquals(0, radio.getCurrentStation());
        }

        @Test
        public void shouldPrevFromOneToZero() {
            Radio radio = new Radio();
            radio.setCurrentStation(1);
            radio.prev();
            assertEquals(0, radio.getCurrentStation());
        }

        @Test
        public void shouldPrevFromZeroToNine() {
            Radio radio = new Radio();
            radio.setCurrentStation(0);
            radio.prev();
            assertEquals(9, radio.getCurrentStation());
        }

        @Test
        public void shouldSetVolumeWhenValid() {
            Radio radio = new Radio();
            radio.setCurrentVolume(50);
            assertEquals(50, radio.getCurrentVolume());
        }

        @Test
        public void shouldNotSetVolumeWhenBelowZero() {
            Radio radio = new Radio();
            radio.setCurrentVolume(50);
            radio.setCurrentVolume(-1);
            assertEquals(50, radio.getCurrentVolume());
        }

        @Test
        public void shouldNotSetVolumeWhenAboveHundred() {
            Radio radio = new Radio();
            radio.setCurrentVolume(50);
            radio.setCurrentVolume(101);
            assertEquals(50, radio.getCurrentVolume());
        }

        @Test
        public void shouldIncreaseVolumeWhenBelowMax() {
            Radio radio = new Radio();
            radio.setCurrentVolume(99);
            radio.increaseVolume();
            assertEquals(100, radio.getCurrentVolume());
        }

        @Test
        public void shouldNotIncreaseVolumeWhenAtMax() {
            Radio radio = new Radio();
            radio.setCurrentVolume(100);
            radio.increaseVolume();
            assertEquals(100, radio.getCurrentVolume());
        }

        @Test
        public void shouldDecreaseVolumeWhenAboveMin() {
            Radio radio = new Radio();
            radio.setCurrentVolume(1);
            radio.decreaseVolume();
            assertEquals(0, radio.getCurrentVolume());
        }

        @Test
        public void shouldNotDecreaseVolumeWhenAtMin() {
            Radio radio = new Radio();
            radio.setCurrentVolume(0);
            radio.decreaseVolume();
            assertEquals(0, radio.getCurrentVolume());
        }
    }

