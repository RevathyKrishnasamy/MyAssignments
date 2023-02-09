package week1.day2;

public class LearnMethod {
	
	public static void main(String[] args) {
		LearnMethod obj = new LearnMethod();
		int a=2,b=5,x;
		x=a*b;
		
		System.out.println(x);
				int number=obj.getCarNumber();
						System.out.println(number);
					String name=obj.getOwnerName();
					System.out.println(name);
					obj.carModel();
				boolean f=obj.isPunctured();
				System.out.println(f);
					//System.out.println("enter 2 number");
					int c = obj.subOfTwonum(8, 4);
					System.out.println(c);
					int d = obj.mulOfThreenum(2, 4,5);
					System.out.println(d);
					int e = obj.divOfTwonum(4, 2);
					System.out.println(e);


					
					
	}
	
	public int getCarNumber()
	{
		int carnumber=2345;
		return carnumber;
	}		

	private String getOwnerName()
	{
		String name= "revathy";
		return name;
	}
	
	void carModel()
	{
		System.out.println("swift");
	}
	
	public boolean isPunctured()
	{
		return false;
		
	}
	
	public int subOfTwonum(int num1, int num2)
	{
		return num1-num2;
	}
	
	public int mulOfThreenum(int num1, int num2,int num3)
	{
		return num1*num2*num3;
	}
	
	public int divOfTwonum(int num1, int num2)
	{
		return num1/num2;
	}
	
				
	
	
	}

