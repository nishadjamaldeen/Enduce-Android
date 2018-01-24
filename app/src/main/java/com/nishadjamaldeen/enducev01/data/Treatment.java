package com.nishadjamaldeen.enducev01.data;

/**
 * Created by anjam_000 on 2018-01-23.
 */

public class Treatment {
    private int frequency;
    private int intensity;
    private int duration;
    private String name;

    public Treatment (String name, int frequency, int intensity, int duration){
        this.frequency = frequency;
        this.intensity = intensity;
        this.duration = duration;
        this.name = name;
    }

    public int getFrequency(){
        return frequency;
    }

    public int getDuration() {
        return duration;
    }

    public int getIntensity() {
        return intensity;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }

    public void setFrequency(int frequency) {
        this.frequency = frequency;
    }

    public void setIntensity(int intensity) {
        this.intensity = intensity;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
