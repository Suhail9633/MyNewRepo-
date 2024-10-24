package pack1;

import pack1.AbstractClassSp;
import pack1.AbstractClassSp2;

public class AbstractClassSp2 extends AbstractClassSp {
	
	@Override
	public void run() {
		System.out.println("Hello");
		
	}

	public static void main(String[] args) {
		AbstractClassSp cc=new AbstractClassSp2 ();
		
		AbstractClassSp2 bb=new AbstractClassSp2 ();
		
		cc.run();
		bb.run();
		cc.test();
		bb.test();
		

	}

	
}
