package p13.textbook.s130502;

import p06.lecture.p3constructor.TV;

public class ChildProductAndStorageExample {
   public static void main(String[] args) {
	ChildProduct<Tv,String,String> Product = new ChildProduct<>();
	product.setKind(new Tv());
	product.setModel("Smart Tv");
	product.setCompany("Samsung");
	
	Storage<TV> storage = new StorageImpl<Tv>(100);
	storage.add(new Tv(),0);
	Tv tv = storage.get(0);
}
}
