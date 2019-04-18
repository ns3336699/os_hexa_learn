
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