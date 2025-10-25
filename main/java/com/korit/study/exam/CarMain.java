package com.korit.study.exam;

class CarInterface {
    private String color;
    private String brand;
    private int speed;

    public CarInterface(String color, String brand, int speed) {
        this.color = color;
        this.brand = brand;
        this.speed = speed;
    }

    public void acclerate() {
        speed += 10;
        System.out.println("속도가 10 증가했습니다. 현재속도 : " + speed);
    }
    public void brake() {
        if (speed >= 10) speed -= 10;
        else speed = 0;
        System.out.println("속도가 10 감소했습니다. 현재 속도: " + speed);
    }

    @Override
    public String toString() {
        return "CarInterface{" +
                "color='" + color + '\'' +
                ", brand='" + brand + '\'' +
                ", speed=" + speed +
                '}';
    }
}

public class CarMain {
    public static void main(String[] args) {
        CarInterface c1 = new CarInterface("빨강", "현대", 10);
        System.out.println(c1);
        c1.acclerate();
        c1.brake();
    }
}
