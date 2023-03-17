package org.example;

public class Droid{
    String name;
    int batteryLevel;

    public Droid(String droidName){
        name = droidName;
        batteryLevel = 100;
    }

    public void performTask(String task){
        System.out.println(name + " is performing task: " + task);

    }
    public  void dancingBatteryLevel() {
        batteryLevel = batteryLevel - 10;

    }
    public  void jumpingBatteryLevel() {
        batteryLevel = batteryLevel - 20;

    }

    public  void energyReport() {
        System.out.println("My battery level after prforming task is: " + batteryLevel + "%.");
    }

    public void energyTransfer(){

    }

    public String toString(){
        return "Hello, I’m the droid: " + name;
    }

    public static void main(String[]args){
        Droid codey = new Droid("Codey");
        System.out.println(codey);
        codey.performTask("dancing");
        codey.dancingBatteryLevel();
        System.out.println(codey.batteryLevel + "%.");
        codey.energyReport();
        System.out.println("");

        Droid demy = new Droid("Demy");
        System.out.println(demy);
        demy.performTask("jumping");
        demy.jumpingBatteryLevel();
        System.out.println(demy.batteryLevel + "%.");
        demy.energyReport();

    }

}


