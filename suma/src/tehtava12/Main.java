package tehtava12;

import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {
		
		ArrayList<Image> valokuvakansio = new ArrayList<>();
		
		Image image1 = new ProxyImage("HiRes_10MB_Photo1");
		Image image2 = new ProxyImage("HiRes_10MB_Photo2");
		Image image3 = new ProxyImage("HiRes_10MB_Photo3");
		Image image4 = new ProxyImage("HiRes_10MB_Photo4");
		Image image5 = new ProxyImage("HiRes_10MB_Photo5");
		
		valokuvakansio.add(image1);
		valokuvakansio.add(image2);
		valokuvakansio.add(image3);
		valokuvakansio.add(image4);
		valokuvakansio.add(image5);
		
		for (Image image : valokuvakansio) {
			image.showData();
		}
		
		System.out.println();
		
		for (Image image : valokuvakansio) {
			image.displayImage();
		}

		

		/*
		image1.displayImage(); // loading necessary
		image1.displayImage(); // loading unnecessary
		image2.displayImage(); // loading necessary
		image2.displayImage(); // loading unnecessary
		image1.displayImage(); // loading unnecessary
		*/
	}

}
