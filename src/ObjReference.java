class TestObj {
	String a = "";
	
}

public class ObjReference {

	public static void main(String[] args) {
		ObjReference a = new ObjReference();
		TestObj o = new TestObj();
		
		System.out.println("a: "+ o.a);
		
		TestObj obj2 = a.getNewString(o);
		
		System.out.println("obj2.a: "+ obj2.a);
		
		System.out.println("o.a: "+ o.a);
		

	}
	
	TestObj getNewString(TestObj inObj){
		inObj.a = "Hello";
		return inObj;
	}

}
