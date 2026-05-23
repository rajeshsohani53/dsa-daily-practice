class Special
{
    public static void main(String[] args) {
        int n=145;
		int copy=n;
		int factorial=1;
		int sum=0;
		while(n!=0)
		{
		    int reminder=n%10;
		    factorial=1;
		    while(reminder!=0)
	    	{
		        factorial=factorial*reminder;
		        reminder--;
		    }
		    sum=sum+factorial;
		    
		    n=n/10;
		}
		//System.out.print("Message"+factorial);
		if(copy==sum)
		{
		    System.out.println("the given no is Special/Peterson/KrishnaMurti Number");
		}
		else
		{
		    System.out.println("the given is not a Special/Peterson/KrishnaMurti Number");
		}
		System.out.println("Message  "+sum);

    }
}