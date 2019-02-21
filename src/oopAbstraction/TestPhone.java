package oopAbstraction;

public class TestPhone {

	public static void main(String[] args) {
		Phone ph = new Apple(); //Cannot instantiate the type Phone, why? because interface can't be instantiate
        ph.talk();
        ph.message();
        ph.camera();
        
        Apple iphone = new Apple();
        iphone.retinaDisplay();
        iphone.talk();
        iphone.message();
        iphone.camera();
        iphone.speakerWeight();
        iphone.sound();
        iphone.materials();
        iphone.quality();
        
        Bose bs = new Apple(); //Cannot instantiate the type Bose, why? because abstract class can't be instantitale similar like interface
        bs.sound();
        bs.speakerWeight();
        bs.materials();
        bs.quality();
        
        MIT mt = new Apple();
        mt.materials();
        mt.quality();
        
        Hyundai hd = new Hyundai();
        hd.talk();
        hd.message();
        hd.camera();
        hd.soundQuality();
        hd.speakerColor();
        
        Doyel dl = new Hyundai();
        dl.soundQuality();
        dl.speakerColor();
        
        
	}

}
