package tw.org.iii_2;

public class J_0827_6 {

	public static void main(String[] args) {
		//Brad321.m1();
		Brad321 obj11 = new Brad321();
	//	Brad321 obj12 = new Brad321();
		// Brad322 obj2=new Brad322();
		// Brad322 obj2=new Brad322();

	}
}

class Brad321 {
	int a = 12;
	static {
		System.out.println("Brad321:static{}");
	}
	{
		System.out.println("Brad321{}"+a);
	}

	Brad321() {
		System.out.println("Brad321()");
	}

	static void m1() {
		System.out.println("Brad:m1");
	}
}

class Brad322 extends Brad321 {
	// super()
	Brad322() {
		System.out.println("Brad322()");
	}
}

class Brad323 extends Brad322 {
	// super()
	Brad323() {
		System.out.println("Brad323()");
	}
}
