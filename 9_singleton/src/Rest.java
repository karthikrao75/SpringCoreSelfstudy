
public final class Rest {
	private static Rest r;
	
	private Rest(){
		
	}
	public static Rest getInstance(){
		if(r==null){
			r=new Rest();
			return r;
		}
		else 
			return r;
	}

}
