
class osproject
{
static int i,j,temp,temp1,temp2,temp_bust1,temp_bust2,temp_bust3;
static int []bt={2,4,8};
static int []id={2132,2102,2153};

static int []arrival_time={0,0,0};
public int m1()
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
