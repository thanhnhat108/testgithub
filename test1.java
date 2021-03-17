public class test1 {
	public static void main(String[] args) {
		int p=1;
		int i=0;
		while (true) {
			i++;
			if(i>10)break;
			if(i%2==1){
				continue;
			}
			p = p*i;
			}
			System.out.println(p);
		}
		
	}

