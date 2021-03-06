package co.edu.eci.arsw.ParcialSegundoCorte.Model;

import java.io.Serializable;

public class Main implements Serializable{
    /**
     *
     */
    private static final long serialVersionUID = 1L;
    private double temp;
    private double feels_like;
    private double temp_min;
    private double temp_max;
    private int pressure;
    private int humidity;

    public Main(double temp, double feels_like, double temp_min, double temp_max, int pressure, int humidity){
        this.temp = temp;
        this.setFeels_like(feels_like);
        this.setTemp_min(temp_min);
        this.setTemp_max(temp_max);
        this.pressure = pressure;
        this.humidity = humidity;
    }

    public double getFeels_like() {
        return feels_like;
    }

    public void setFeels_like(double feels_like) {
        this.feels_like = feels_like;
    }

    public double getTemp_max() {
        return temp_max;
    }

    public void setTemp_max(double temp_max) {
        this.temp_max = temp_max;
    }

    public double getTemp_min() {
        return temp_min;
    }

    public void setTemp_min(double temp_min) {
        this.temp_min = temp_min;
    }

    public Main(){

    }

    public double getTemp(){
        return temp;
    }

    public void setTemp(double temp){
        this.temp = temp;
    }

    public int getPressure(){
        return pressure;
    }

    public void setPressure(int pressure){
        this.pressure = pressure;
    }

    public int getHumidity(){
        return humidity;
    }

    public void setHumidity(int humidity){
        this.humidity = humidity;
    }
}


