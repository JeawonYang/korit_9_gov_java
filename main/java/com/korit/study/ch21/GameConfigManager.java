package com.korit.study.ch21;

import java.util.Objects;

public class GameConfigManager {
    private volatile static GameConfigManager instance;
    private int soundVolume = 50;
    private String resolution = "1280x720";

    private GameConfigManager() {

    }

    public static GameConfigManager getInstance() {
        if (Objects.isNull(instance)) {
            instance = new GameConfigManager();
        }
        return instance;
    }

    public void setSoundVolume(int volume) {
        if (volume >= 0 && volume <= 100) {
            this.soundVolume = volume;
        }
    }

    public int getSoundVolume() {
        return soundVolume;
    }

    public void setResolution(String resolution) {
        this.resolution = resolution;
    }

    public String getResolution() {
        return resolution;
    }

    public String getConfigInfo() {
        String format = String.format("Sound: %d, Resolution: %s",
                soundVolume, resolution);
        return format;
    }
}



