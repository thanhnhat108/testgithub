

class java{
	 static int x = 10;
	public static void display(){
		x = 50;
		System.out.println(x);
		x++;
	}

}

class test {
	static int y=20;
	public static void main(String[] args) {
		y++;
		System.out.println(y);
	java.display();



	}
}