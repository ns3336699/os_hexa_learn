
class osproject
{
static int i,j,temp,temp1,temp2,temp_bust1,temp_bust2,temp_bust3;
static int []bt={2,4,8};
static int []id={2132,2102,2153};
static int []arrival_time={0,0,0};
public int bust1()
{
if(bt[0] >bt[1] && bt[0] > bt[2])
{
}
if(bt[1] >bt[0] && bt[1] > bt[2])
{
System.out.println("second student ahve greasest bust time");
}
if(bt[2] >bt[0] && bt[2] > bt[1])
{
        System.out.println("\nAs Last Student have greatest bust time so it will run till its  bust time will became equal to any other students.\n");
for(int i=bt[2];i>=bt[2]-4;i--)
{
 if(i==4)
     
      {
	bt[2]=8-i;
       System.out.println("Student c has given  chance id no."+id[2]+" new bust time is="+bt[2]);        
      }
}
}
return 4;
}

public int id2()
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
public int id1()
{
	 if (id[0]<id[1] && id[0]<id[2])
	 {	 
	 }
	 else if(id[1]<id[0] && id[1]<id[2])
		 
	 { 
	 
	    for(int j=bt[1];j>=bt[1]-1;j--)
		 { 
		 if(j==2)
		 {
		 bt[1]=j;
		 System.out.println("Student b has given chance id no."+id[1]+" new bust time is="+bt[1]);
		 }	 	 
	 }
	 }
	 else if (id[2]<id[0] && id[2]<id[1])
	 {		 
	 }
	 return 1;
}
public int bust2()
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
public int m10()

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
                   if(j==0) 
		 {
		 bt[2]=j;
         System.out.println("Student c has given chance id no."+id[2]+" new bust time is="+bt[2]+"\n\n");
		id[0]=0;
                id[1]=0;
                 id[2]=0;
           }
		 }
}
return 1;
}

public static void main(String ss[])
{
System.out.println("**************\t WELCOME TO MY PROJECT "+"\t************");
System.out.println("**************\t LONGEST REMAINING TIME FIRST ALGORITHM"+"\t************");
temp_bust1=bt[0];
temp_bust2=bt[1];
temp_bust3=bt[2];

temp=id[0];

temp1=id[1];

temp2=id[2];

osproject os=new osproject();
os.bust1();
os.id();
os.id1();
os.bust2();
os.m5();
os.m6();
os.m7();
os.m8();
os.m9();
os.m10();
float completion_time_b =os.m1()+os.m2()+os.m3()+os.m4()+os.m5()+os.m6()+os.m7()+os.m8()+os.m9();

float completion_time_a =os.m1()+os.m2()+os.m3()+os.m4()+os.m5()+os.m6()+os.m7()+os.m8()+os.m9()+os.m10();

float completion_time_c =os.m1()+os.m2()+os.m3()+os.m4()+os.m5()+os.m6()+os.m7()+os.m8()+os.m9()+os.m10()+1;

float turn_around_time_a=completion_time_a - arrival_time[0];
float turn_around_time_b=completion_time_b - arrival_time[1];
float turn_around_time_c=completion_time_c - arrival_time[2];


float average_turn_around_time=(turn_around_time_a + turn_around_time_b + turn_around_time_c)/3;


float waiting_time_a=turn_around_time_a - temp_bust1;
float waiting_time_b=turn_around_time_b - temp_bust2;
float waiting_time_c=turn_around_time_c - temp_bust3;

float average_waiting_time=(waiting_time_a + waiting_time_b + waiting_time_c)/3;


System.out.println("Student Name\t"+"Student ID\t"+"Arrival time"+"\t\tCompletion Time\t\t"+"Bust Time\t"+"Turnaround Time\t\t"+"Average Turnaround Time\t\t"+"Waiting Time\t"+"Average Waiting Time");

System.out.println("a\t\t"+temp+"\t\t"+arrival_time[0]+"\t\t\t "+completion_time_a +" \t\t\t"+temp_bust1+"\t\t\t"+turn_around_time_a+" \t\t\t        \t\t"+waiting_time_a+ " \t                       ");

System.out.println("b\t\t"+temp1+"\t\t"+arrival_time[1]+"\t\t\t "+completion_time_b +" \t\t\t"+temp_bust2+"\t\t\t"+turn_around_time_b+"\t\t\t"+average_turn_around_time+"\t\t\t"+waiting_time_b+"\t\t    "+average_waiting_time);
	
System.out.println("c\t\t"+temp2+"\t\t"+arrival_time[2]+"\t\t\t "+completion_time_c +" \t\t\t"+temp_bust3+"\t\t\t"+turn_around_time_c+"\t\t\t         \t\t"+waiting_time_c+"\t                      ");
}
}
