package org.bike;

public class Ktm implements Bike {


@Override
public void cost() {
	System.out.println("the cost is 150000");
}

@Override
public void speed() {
	System.out.println("the speed is 140 kmph");
}
public static void main(String[] args) {
	Ktm a = new Ktm();
	a.cost();
	a.speed();
}
}
