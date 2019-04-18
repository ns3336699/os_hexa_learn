
public int m2()
{
     if (id[0]<id[1] && id[0]<id[2])
  {
	   System.out.println("first student has lowest id no. so give chance to id"+id[0]);
      }
     else if (id[1]<id[0] && id[1]<id[2])
      {
	  
	  for(int j=4; j>=3; j--)
	   {
		
		if(j==3)
		{
			bt[1]=j;
     System.out.println("student b has given chance  id no."+id[1]+" new bust time is="+bt[1]);
			if(bt[2]>bt[0] ||bt[2]>bt[1])
			{
	            bt[2]=j;
		
        System.out.println("stutent c has given chance id no."+id[2]+" new bust time is="+bt[2]);
			}
			
		}
	   }
	
      }
      else if (id[2]<id[0] && id[2]<id[1])
       {
	System.out.println("third student has lowest id no. so give chance to id="+id[2]);
	
       }
 return 1;
}