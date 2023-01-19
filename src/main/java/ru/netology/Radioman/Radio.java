package ru.netology.Radioman;
public class Radio {

        public int currentRadioStationNumber;
        public int radioStationNumber = 10;
        public int minRadioStationNumber = 0;
        public int maxRadioStationNumber = 9;
        public int currentVolume = 50;
        public int minVolume = 0;
        public int maxVolume = 100;

        public Radio(int number) {
            this.radioStationNumber = number;
            this.maxRadioStationNumber = number - 1;
        }

        public Radio() {

        }

        public void setCurrentRadioStation(int newCurrentRadioStationNumber) {
            if (newCurrentRadioStationNumber < minRadioStationNumber) {
                currentRadioStationNumber = maxRadioStationNumber;
                return;
            }
            if (newCurrentRadioStationNumber > maxRadioStationNumber) {
                currentRadioStationNumber = minRadioStationNumber;
                return;
            }
            currentRadioStationNumber = newCurrentRadioStationNumber;
        }

        public void next() {
            setCurrentRadioStation(currentRadioStationNumber + 1);
        }

        public void prev() {
            setCurrentRadioStation(currentRadioStationNumber - 1);
        }

        public void increaseVolume() {
            if (currentVolume < maxVolume) {
                currentVolume = currentVolume + 1;
            }
        }

        public void decreaseVolume() {
            if (currentVolume > minVolume) {
                currentVolume = currentVolume - 1;
            }
        }
    }

