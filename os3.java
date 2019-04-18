
public int m4()
{
	if(bt[0]> bt[1] && bt[1]>bt[0])
	{
		
	}
	else if(bt[1]> bt[2] && bt[1]>bt[0])
	{
	}
	else if(bt[2]> bt[1] && bt[2]>bt[0])
	{
		 for(int j=bt[2];j>=bt[2]-1;j--)
		 { 
		 if(j==2)
		 {
		 bt[2]=j;
         System.out.println("Student c has given chance id no."+id[2]+" new bust time is="+bt[2]);
		 
		 }
	}
		
}
return 1;
}
public int m5()
{

	if(id[0]<id[1] && id[0]<id[2])
	{
		for(int j=bt[2];j>=bt[2]-1;j--)
		 { 
		 if(j==1)
		 {
		 bt[0]=j;
         System.out.println("Student a has given chance id no."+id[0]+" new bust time is="+bt[0]);
		
		 }
		 }
	}
	else if(id[1]<id[2] && id[1]<id[0])
	{
		for(int j=bt[1];j>=bt[1]-1;j--)
		 { 
		 if(j==1)
		 {
		 bt[1]=j;
         System.out.println("Student b has given chance id no."+id[1]+" new bust time is="+bt[1]);
		
	      }
		 }
	}
	else if(id[2]<id[1] && id[2]<id[0])
	{
	}
	return 1;
}
public int m6()
{
	if(id[0]< id[1] || id[0]<id[2])
	{
		for(int j=bt[0];j>=bt[0]-1;j--)
		 { 
		 if(j==1)
		   {
                      
		 bt[0]=j;
         System.out.println("Student a has given chance id no."+id[0]+" new bust time is="+bt[0]);
                    }
		 }
       }	
	else if(id[1]< id[0] && id[1]<id[2])
	{
	}
	else if(id[2]< id[0] && id[2]<id[1])
	{
	}
	return 1;
    }
public int m7()
{
if(bt[0] >bt[1] && bt[0] > bt[2])
{
}
else if(bt[1] >bt[0] && bt[1] > bt[2])
{
}
else if(bt[2] >bt[0] && bt[2] > bt[1])
{
        for(int j=bt[2];j>=bt[2]-1;j--)
		 { 
                   if(j==1) 
		 {
		 bt[2]=j;
         System.out.println("Student c has given chance id no."+id[2]+" new bust time is="+bt[2]);
           }
		 }
}
return 1;
}

public int m8()
{
	if(id[0]<id[1] && id[0]<id[2])
	{
		 
	}
	else if(id[1]<id[2] && id[1]<id[0])
	{
		for(int j=bt[1];j>=bt[1]-1;j--)
		 { 
		 if(j==0)
		 {
		 bt[1]=j;
         System.out.println("Student b has given chance id no."+id[1]+" new bust time is="+bt[1]);
		
	      }
		 }
	}
	else if(id[2]<id[1] && id[2]<id[0])
	{
	}
return 1;
}
public int m9()
{
	if(id[0]< id[1] || id[0]<id[2])
	{
		for(int j=bt[0];j>=bt[0]-1;j--)
		 { 
		 if(j==0)
		   {
                     
		 bt[0]=j;
         System.out.println("Student a has given chance id no."+id[0]+" new bust time is="+bt[0]);
                    }
		 }
       }	
	else if(id[1]< id[0] && id[1]<id[2])
	{
	}
	else if(id[2]< id[0] && id[2]<id[1])
	{
	}
	return 1;
    }