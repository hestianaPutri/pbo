package week1;

public class volumeTabung {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 volume = phi * r * r * tinggi;
		 r = jari jari / radius
		 */
		double diameter = 5;
		double radius = diameter / 2;
		double tinggi = 10;
		double volume = Math.PI * radius * radius * tinggi;
		
		System.out.println("volume tabung dengan diameter 5 dan tinggi 10 adalah = " + volume);

	}

}
