package com.syntax.HomeWork11;

public class Phone {
	/*
	 * Create a Class ?Phone?. Create 3 Objects of it: iPhone, Google Pixel, Nokia
	 * with specific attributes and behaviors.
	 */
	String name; //attributes/properties
	String model;
	String color;
	String audio; 
	int yearBuilt;
	String video; 
	
	void videoRecording() {
		System.out.println(name+" "+model+" "+color+" provides "+video+" for recording videos");
	}
	void audioCalling() {
		System.out.println(name+" "+model+" "+color+" " +yearBuilt+" has "+audio);
	}
		public static void main(String[]args) {
//type of var     //var  //creating object
			Phone iPhone=new Phone(); 
			iPhone.name="iPhone";
			iPhone.model="13ProMax";
			iPhone.color="red";
			iPhone.audio="FaceTime";
			iPhone.yearBuilt=2021;
			iPhone.video="Cinematic mode";
			
			Phone Android=new Phone();
			Android.name="Google Pixel";
			Android.model="6Pro";
			Android.color="black";
			Android.audio=" no FaceTime";
			Android.yearBuilt=2021;
			Android.video="extra 4K 30fps";
			
			Phone Nokia=new Phone();
			Nokia.name="Nokia";
			Nokia.model="C5 Endi";
			Nokia.color="white";
			Nokia.audio=" no FaceTime";
			Nokia.yearBuilt=2020;
			Nokia.video="screen recording icon";		
			
			iPhone.videoRecording();
			Android.videoRecording();
			Nokia.videoRecording();
			iPhone.audioCalling();
		}
	}


