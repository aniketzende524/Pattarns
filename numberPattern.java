			_____________Number Patterns & It'solution___________
		-------------------------------------------------------------
		
	

Q1.

/*

1
12
123
1234
12345

*/

Method 1~~~>
by using counter---->

public class pattern1
{
    public static void main(String[] args)
    {
       int count=1; 
       for(int i=0; i<5; i++)
       {
        int count1=count; 
        for(int j=0; j<5; j++)
        {
            if(j-i<=0)
            System.out.print(count1++);
            else
            System.out.print(" ");
        }
        System.out.println();
       }
    }
}

**************************************************

Method 2~~~>
by using Equation----->


public class pattern1
{
    public static void main(String[] args)
    { 
       for(int i=0; i<5; i++)
       {
        for(int j=0; j<5; j++)
        {
            if(j-i<=0)
            System.out.print(j+1);
            else
            System.out.print(" ");
         }
        System.out.println();
       }
    }
}

--------------------------------------------------------------------------------------------------------------------------------------------------

Q2.

/*

5
54
543
5432
54321

*/

Method 1~~~>
by using counter---->

public class pattern2
{
    public static void main(String[] args)
    {
       int count=5; 
       for(int i=0; i<5; i++)
       {
        int count1=count; 
        for(int j=0; j<5; j++)
        {
            if(j-i<=0)
            System.out.print(count1--);
            else
            System.out.print(" ");
        }
        System.out.println();
       }
    }
}

**************************************************

Method 2~~~>
by using Equation----->

public class pattern2
{
    public static void main(String[] args)
    {
        for(int i=0; i<5; i++)
        {
         for(int j=0; j<5; j++)
         {
             if(j-i<=0)
             System.out.print(5-j);
             else
             System.out.print(" ");
          }
         System.out.println();
        } 
    }
}

--------------------------------------------------------------------------------------------------------------------------------------------------

Q3.

/*

12345
2345
345
45
5

*/


Method 1~~~>
by using counter---->

public class pattern3
{
    public static void main(String[] args)
    {
       int count=1; 
       for(int i=0; i<5; i++)
       {
        int count1=count; 
        for(int j=0; j<5; j++)
        {
            if(j+i<=4)
            System.out.print(count1++);
            else
            System.out.print(" ");
        }
        count++;
        System.out.println();
       }
    }
}

**************************************************

Method 2~~~>
by using Equation----->

public class pattern3
{
    public static void main(String[] args)
    {
        for(int i=0; i<5; i++)
        {
         for(int j=0; j<5; j++)
         {
             if(j+i<=4)
             System.out.print(j+i+1);
             else
             System.out.print(" ");
          }
         System.out.println();
        } 
    }
}

--------------------------------------------------------------------------------------------------------------------------------------------------

Q4.
/*

1 2 3 4 5
 2 3 4 5
  3 4 5
   4 5
    5
    5
   4 5
  3 4 5
 2 3 4 5
1 2 3 4 5

*/

Method 1~~~>
by using counter---->

public class pattern4
{
    public static void main(String[] args)
    {
       int count=1; 
       int count2=5;
       for(int i=0; i<10; i++)
       {
        int count1=count; 
        int count3=count2;
        for(int j=0; j<5; j++)
        {
            if(j-i>=0 || j+i>=9)
            {
                if(i<=4)
                System.out.print(count1++);
                else
                System.out.print(count3++);
            }
            System.out.print(" ");
        }
        count++;
        if(i>4)
        count2--;
        System.out.println();
       }
    }
}

**************************************************

Method 2~~~>
by using Equation----->

public class pattern4
{
    public static void main(String[] args)
    {
        for(int i=0; i<10; i++)
        {
         for(int j=0; j<5; j++)
        {
            if(j-i>=0 || j+i>=9)
            System.out.print(j+1+" ");
            else
            System.out.print(" ");
        }
         System.out.println();
        } 
    }
}

--------------------------------------------------------------------------------------------------------------------------------------------------

Q5.

/*

    5
   4 5
  3 4 5
 2 3 4 5
1 2 3 4 5

*/
Method 1~~~>
by using counter---->

public class pattern5
{
    public static void main(String[] args)
    {
       int count=5; 
       for(int i=0; i<5; i++)
       {
        int count1=count; 
        for(int j=0; j<5; j++)
        {
            if(j+i>=4)
            System.out.print(count1++ +" ");
            else
            System.out.print(" ");
        }
        count--;
        System.out.println();
       }
    }
}

**************************************************

Method 2~~~>
by using Equation----->

public class pattern5
{
    public static void main(String[] args)
    {
        for(int i=0; i<5; i++)
        {
         for(int j=0; j<5; j++)
        {
            if(j+i>=4)
            System.out.print(j+1+" ");
            else
            System.out.print(" ");
        }
         System.out.println();
        } 
    }
}

--------------------------------------------------------------------------------------------------------------------------------------------------

Q6.

/*44,

    1
   2 2
  3 3 3
 4 4 4 4
5 5 5 5 5

*/

Method 1~~~>
by using counter---->

public class pattern6
{
    public static void main(String[] args)
    {
       int count=1; 
       for(int i=0; i<5; i++)
       {
        for(int j=0; j<5; j++)
        {
            if(j+i>=4)
            System.out.print(count +" ");
            else
            System.out.print(" ");
        }
        count++;
        System.out.println();
       }
    }
}

**************************************************

Method 2~~~>
by using Equation----->

public class pattern 
{
    public static void main(String[] args)
    {
        for(int i=0; i<5; i++)
        {
         for(int j=0; j<5; j++)
        {
            if(j+i>=4)
            System.out.print(i+1+" ");
            else
            System.out.print(" ");
        }
         System.out.println();
        } 
    }

--------------------------------------------------------------------------------------------------------------------------------------------------

Q7.

/*

1
12
123
1234
12345
123456
1234567
12345678
123456789

*/
Method 1~~~>
by using counter---->

public class pattern7
{
    public static void main(String[] args)
    {
       int count=1; 
       for(int i=0; i<9; i++)
       {
        int count1=count;
        for(int j=0; j<9; j++)
        {
            if(j-i<=0)
            System.out.print(count1 ++);
            else
            System.out.print(" ");
        }
        System.out.println();
       }
    }
}

**************************************************

Method 2~~~>
by using Equation----->

public class pattern7 
{
    public static void main(String[] args)
    {
        for(int i=0; i<9; i++)
        {
         for(int j=0; j<9; j++)
        {
            if(j-i<=0)
            System.out.print(j+1);
            else
            System.out.print(" ");
        }
         System.out.println();
        } 
    }
}

--------------------------------------------------------------------------------------------------------------------------------------------------

Q8.

/*

1
22
333
4444
55555
666666
7777777
88888888
999999999

*/

Method 1~~~>
by using counter---->

public class pattern8
{
    public static void main(String[] args)
    {
       int count=1; 
       for(int i=0; i<9; i++)
       {
        for(int j=0; j<9; j++)
        {
            if(j-i<=0)
            System.out.print(count);
            else
            System.out.print(" ");
        }
        count++;
        System.out.println();
       }
    }
}

**************************************************

Method 2~~~>
by using Equation----->

public class pattern8 
{
    public static void main(String[] args)
    {
        for(int i=0; i<9; i++)
        {
         for(int j=0; j<9; j++)
        {
            if(j-i<=0)
            System.out.print(i+1);
            else
            System.out.print(" ");
        }
         System.out.println();
        } 
    }
}

--------------------------------------------------------------------------------------------------------------------------------------------------

Q9.

/*

9
98
987
9876
98765
987654
9876543
98765432
987654321

*/

Method 1~~~>
by using counter---->

public class pattern9
{
    public static void main(String[] args)
    {
       int count=9; 
       for(int i=0; i<9; i++)
       {
        int count1=count;
        for(int j=0; j<9; j++)
        {
            if(j-i<=0)
            System.out.print(count1--);
            else
            System.out.print(" ");
        }
        System.out.println();
       }
    }
}

**************************************************

Method 2~~~>
by using Equation----->

public class pattern9 
{
    public static void main(String[] args)
    {
        for(int i=0; i<9; i++)
        {
         for(int j=0; j<9; j++)
        {
            if(j-i<=0)
            System.out.print(9-j);
            else
            System.out.print(" ");
        }
         System.out.println();
        } 
    }
}

--------------------------------------------------------------------------------------------------------------------------------------------------

Q10.

/*

9
88
777
6666
55555
444444
3333333
22222222
111111111

*/

Method 1~~~>
by using counter---->

public class pattern10
{
    public static void main(String[] args)
    {
       int count=9; 
       for(int i=0; i<9; i++)
       {
        for(int j=0; j<9; j++)
        {
            if(j-i<=0)
            System.out.print(count);
            else
            System.out.print(" ");
        }
        count--;
        System.out.println();
       }
    }
}

**************************************************

Method 2~~~>
by using Equation----->

public class pattern10
{
    public static void main(String[] args)
    {
        for(int i=0; i<9; i++)
        {
         for(int j=0; j<9; j++)
        {
            if(j-i<=0)
            System.out.print(9-i);
            else
            System.out.print(" ");
        }
         System.out.println();
        } 
    }
}

--------------------------------------------------------------------------------------------------------------------------------------------------

Q11.

/*

        1
       12
      123
     1234
    12345
   123456
  1234567
 12345678
123456789
*/

Method 1~~~>
by using counter---->

public class pattern11
{
    public static void main(String[] args)
    {
       int count=1; 
       for(int i=0; i<9; i++)
       {
        int count1=count;
        for(int j=0; j<9; j++)
        {
            if(j+i>=8)
            System.out.print(count1++);
            else
            System.out.print(" ");
        }
        System.out.println();
       }
    }
}

**************************************************

Method 2~~~>
by using Equation----->

public class pattern11
{
    public static void main(String[] args)
    {
        for(int i=0; i<9; i++)
        {
         for(int j=0; j<9; j++)
        {
            if(j+i>=8)
            System.out.print(j+i-7);
            else
            System.out.print(" ");
        }
         System.out.println();
        } 
    }
}

--------------------------------------------------------------------------------------------------------------------------------------------------

Q12.

/*

000111222333444555666777888999
000111222333444555666777888999
000111222333444555666777888999
000111222333444555666777888999
000111222333444555666777888999


*/

public class pattern12 
{
    public static void main(String[] args)
    {
        for(int i=0; i<5; i++)
        {
         for(int j=0; j<10; j++)
        {
            for (int k = 0; k < 3; k++) 
            {
            System.out.print(j);
            }
        }
         System.out.println();
        } 
    }
}

--------------------------------------------------------------------------------------------------------------------------------------------------

Q13.

/* 

    1
   2 2
  3 3 3
 4 4 4 4
5 5 5 5 5
 4 4 4 4
  3 3 3
   2 2
    1

*/

Method 1~~~>
by using counter---->

public class pattern13
{
    public static void main(String[] args)
    {
       int count=1; 
       int count2=4;
       for(int i=0; i<9; i++)
       {
        int count1=count;
        int count3=count2;
        for(int j=0; j<5; j++)
        {
            if(j+i>=4 && j-i>=-4)
            {
            if(i<=4)
            System.out.print(count1 +" ");
            else
            System.out.print(count3 +" ");
            }
            else
            System.out.print(" ");
        }
        if(i<=4)
        count++;
        else
        count2--;
        System.out.println();
       }
    }
}

**************************************************

Method 2~~~>
by using Equation----->

public class pattern13
{
    public static void main(String[] args)
    {
        for(int i=0; i<9; i++)
        {
         for(int j=0; j<5; j++)
        {
            if(j+i>=4 && j-i>=-4)
            {
                if(i<=4)
                System.out.print(i+1 +" ");
                else
                System.out.print(9-i +" ");
            }
            else
            System.out.print(" ");
        }
         System.out.println();
        } 
    }
}

--------------------------------------------------------------------------------------------------------------------------------------------------

Q14.

/*

        1
       2 2
      3 3 3
     4 4 4 4
    5 5 5 5 5
   6 6 6 6 6 6
  7 7 7 7 7 7 7
 8 8 8 8 8 8 8 8
9 9 9 9 9 9 9 9 9

*/

Method 1~~~>
by using counter---->

public class pattern14
{
    public static void main(String[] args)
    {
       int count=1; 
       for(int i=0; i<9; i++)
       {
        for(int j=0; j<9; j++)
        {
            if(j+i>=8)
            System.out.print(count +" ");
            else
            System.out.print(" ");
        }
        count++;
        System.out.println();
       }
    }
}

**************************************************

Method 2~~~>
by using Equation----->

public class pattern14 
{
    public static void main(String[] args)
    {
        for(int i=0; i<9; i++)
        {
            for(int j=0; j<9; j++)
            {
            if(j+i>=8)
            System.out.print(i+1 +" ");
            else
            System.out.print(" ");
            }       
            System.out.println();
        }
    } 
}

--------------------------------------------------------------------------------------------------------------------------------------------------

Q15.

/*

        1
       1 2
      1 2 3
     1 2 3 4
    1 2 3 4 5
   1 2 3 4 5 6
  1 2 3 4 5 6 7
 1 2 3 4 5 6 7 8
1 2 3 4 5 6 7 8 9

*/

Method 1~~~>
by using counter---->

public class pattern15
{
    public static void main(String[] args)
    {
        int count=1;
        for(int i=0; i<9; i++)
        {
            int count1=count;
            for(int j=0; j<9; j++)
            {
            if(j+i>=8)
            System.out.print(count1++ +" ");
            else
            System.out.print(" ");
            }       
            System.out.println();
        }
    } 
}


**************************************************

Method 2~~~>
by using Equation----->

public class pattern15 
{
    public static void main(String[] args)
    {
        for(int i=0; i<9; i++)
        {
            for(int j=0; j<9; j++)
            {
            if(j+i>=8)
            System.out.print(j+i-7 +" ");
            else
            System.out.print(" ");
            }       
            System.out.println();
        }
    } 
}

--------------------------------------------------------------------------------------------------------------------------------------------------

Q16.
/*

9 9 9 9 9 9 9 9 9
 8 8 8 8 8 8 8 8
  7 7 7 7 7 7 7
   6 6 6 6 6 6
    5 5 5 5 5
     4 4 4 4
      3 3 3
       2 2
        1

*/


Method 1~~~>
by using counter---->

public class pattern16
{
    public static void main(String[] args)
    {
        int count=9;
        for(int i=0; i<9; i++)
        {
            for(int j=0; j<9; j++)
            {
            if(j-i>=0)
            System.out.print(count+" ");
            else
            System.out.print(" ");
            }       
            count--;
            System.out.println();
        }
    } 
}

**************************************************

Method 2~~~>
by using Equation----->

public class pattern16
{
    public static void main(String[] args)
    {
        for(int i=0; i<9; i++)
        {
            for(int j=0; j<9; j++)
            {
            if(j+i>=8)
            System.out.print(i+1 +" ");
            else
            System.out.print(" ");
            }       
            System.out.println();
        }
    } 
}

--------------------------------------------------------------------------------------------------------------------------------------------------

Q17.

/*

1
1 2
1 2 3
1 2 3 4
1 2 3 4 5
1 2 3 4
1 2 3
1 2
1


*/
Method 1~~~>
by using counter---->

public class pattern17
{
    public static void main(String[] args)
    {
        int count=1;
        for(int i=0; i<9; i++)
        {
            int count1=count;
            for(int j=0; j<5; j++)
            {
            if(j-i<=0 && j+i<=8)
            System.out.print(count1++ +" ");
            else
            System.out.print(" ");
            }
            System.out.println();
        }
    } 
}

**************************************************

Method 2~~~>
by using Equation----->

public class pattern17
{
    public static void main(String[] args)
    {
        for(int i=0; i<9; i++)
        {
            for(int j=0; j<5; j++)
            {
            if(j-i<=0 && j+i<=8)
            System.out.print(j+1+" ");
            else
            System.out.print(" ");
            }       
            System.out.println();
        }
    } 
}

--------------------------------------------------------------------------------------------------------------------------------------------------

Q18.

/*58

12345
1234
123
12
1
12
123
1234
12345

*/

Method 1~~~>
by using counter---->

public class pattern18
{
    public static void main(String[] args)
    {
        int count=1;
        for(int i=0; i<9; i++)
        {
            int count1=count;
            for(int j=0; j<5; j++)
            {
            if(j+i<=4 || j-i<=-4)
            System.out.print(count1++ );
            else
            System.out.print(" ");
            }
            System.out.println();
        }
    } 
}

**************************************************

Method 2~~~>
by using Equation----->

public class pattern18 
{
    public static void main(String[] args)
    {
        for(int i=0; i<9; i++)
        {
            for(int j=0; j<5; j++)
            {
            if(j+i<=4 || j-i<=-4)
            System.out.print(j+1);
            else
            System.out.print(" ");
            }       
            System.out.println();
        }
    } 
}

--------------------------------------------------------------------------------------------------------------------------------------------------

Q19.

/* 

12345
 1234
  123
   12
    1
   12
  123
 1234
12345
*/
Method 1~~~>
by using counter---->

public class pattern19
{
    public static void main(String[] args)
    {
        int count=1;
        for(int i=0; i<9; i++)
        {
            int count1=count;
            for(int j=0; j<5; j++)
            {
            if(j-i>=0 || j+i>=8)
            System.out.print(count1++ );
            else
            System.out.print(" ");
            }
            System.out.println();
        }
    } 
}


**************************************************

Method 2~~~>
by using Equation----->

public class pattern 
{
    public static void main(String[] args)
    {
        for(int i=0; i<9; i++)
        {
            for(int j=0; j<5; j++)
            {
            if(j-i>=0 || j+i>=8)
            System.out.print(j+1);
            else
            System.out.print(" ");
            }       
            System.out.println();
        }
    } 
}

--------------------------------------------------------------------------------------------------------------------------------------------------

Q20.

/*

1 2 3 4 5
 2 3 4 5
  3 4 5
   4 5
    5
   4 5
  3 4 5
 2 3 4 5
1 2 3 4 5

*/

Method 1~~~>
by using counter---->

public class pattern20
{
    public static void main(String[] args)
    {
        int count=1;
        int count2=4;
        for(int i=0; i<9; i++)
        {
            int count1=count;
            int count3=count2;
            for(int j=0; j<5; j++)
            {
            if(j-i>=0 || j+i>=8)
            {
                if(i<=4)
                System.out.print(count1++ +" ");
                else
                System.out.print(count3++ +" ");
            }
            else
            System.out.print(" ");
            }
            count++;
            if(i>4)
            count2--;
            System.out.println();
        }
    } 
}


**************************************************

Method 2~~~>
by using Equation----->

public class pattern20
{
    public static void main(String[] args)
    {
        for(int i=0; i<9; i++)
        {
            for(int j=0; j<5; j++)
            {
            if(j-i>=0 || j+i>=8)
            System.out.print(j+1+" ");
            else
            System.out.print(" ");
            }       
            System.out.println();
        }
    } 
}

--------------------------------------------------------------------------------------------------------------------------------------------------

Q21.
/* 

1
121
12321
1234321
123454321


*/

Method 1~~~>
by using counter---->
public class pattern21
{
public static void main(String[] args)
{	
	for(int i=0;i<9;i=i+2)
	{
		int cnt=1;
		for(int j=0;j<9;j++)
		{
			if(j-i<=0)
			{   if(j*2<i)
				System.out.print(cnt++);
				else
				System.out.print(cnt--);	
			}
			else
			{
				System.out.print(" ");
			}	
		}
		System.out.println();
	}
	}
}

--------------------------------------------------------------------------------------------------------------------------------------------------

Q22.

/* 

    1
   121
  12321
 1234321
123454321

*/

public class pattern22
{
    public static void main(String[] args)
    {
        int count=1;
        for(int i=0; i<5; i++)
        {
            int count1=count;
            for(int j=0; j<9; j++)
            {
            if(j+i>=4 && j-i<=4)
            {
                if(j<4)
                System.out.print(count1++);
                else
                System.out.print(count1--);
            }
            else
            System.out.print(" ");
            }
            System.out.println();
        }
    } 
}

--------------------------------------------------------------------------------------------------------------------------------------------------

Q23.

/*

1
2 3
4 5 6
7 8 9 10
11 12 13 14 15
*/


public class pattern23
{
    public static void main(String[] args)
    {
        int count=1;
        for(int i=0; i<5; i++)
        {
            for(int j=0; j<9; j++)
            {
            if(j-i<=0)
            System.out.print(count++ +" ");
            else
            System.out.print(" ");
            }
           System.out.println();
        }
    } 
}

--------------------------------------------------------------------------------------------------------------------------------------------------

Q24.

/*

1
26
3710
481113
59121415


*/

public class pattern24
{
public static void main(String[] args)
{	int cnt=1;
	for(int i=0;i<5;i++)
	{ 
	  int diff=4;
	  int cnt1=cnt;
		for(int j=0;j<5;j++)
		{
			if(j-i<=0)
			{  
				System.out.print(cnt1);
			}
			else
			{
				System.out.print(" ");
			}
			cnt1=cnt1+diff;
			diff--;
		}
		cnt++;
		System.out.println();
	}
}
}

--------------------------------------------------------------------------------------------------------------------------------------------------

Q25.
/*

1        1
12      21
123    321
1234  4321
1234554321

*/

public class pattern25
{
    public static void main(String[] args)
    {
        int cnt1=1;
        for(int i=0; i<5; i++)
        {   
            int cnt=1;
            int cnt2=cnt1;
            for(int j=0; j<10; j++)
            {
            if(j-i<=0 || j+i>=9)
            {
                if(j<=4)
                System.out.print(cnt++);
                else
                System.out.print(cnt2--);
            }
            else
           System.out.print(" ");
            }
            cnt1++;
        System.out.println();
        }
    } 
}

--------------------------------------------------------------------------------------------------------------------------------------------------

Q26.

/*

1        1
22      22
333    333
4444  4444
5555555555

*/

Method 1~~~>
by using counter---->

public class pattern26
{
    public static void main(String[] args)
    {
        int cnt=1;
        for(int i=0; i<5; i++)
        {   
            for(int j=0; j<10; j++)
            {
            if(j-i<=0 || j+i>=9)
                System.out.print(cnt);
                else
           System.out.print(" ");
            }
            cnt++;
        System.out.println();
        }
    } 
}

**************************************************

Method 2~~~>
by using Equation----->

public class pattern26
{
    public static void main(String[] args)
    {
        for(int i=0; i<5; i++)
        {
            for(int j=0; j<10; j++)
            {
            if(j-i<=0 || j+i>=9)
            System.out.print(i+1);
            else   
            System.out.print(" ");
            }
            System.out.println();
        }
    } 
}

--------------------------------------------------------------------------------------------------------------------------------------------------

Q27.
/*

1        1
12      12
123    123
1234  1234
1234512345

*/

Method 1~~~>
by using counter---->

public class pattern27
{

public static void main(String [] args)
{   
	for(int i=0;i<5;i++)
	{   int cnt=1,cnt1=1;
		for(int j=0;j<10;j++)
		{
			if(j-i<=0 || i+j>=9)
			{ if(j<=4)
				System.out.print(cnt++);
				
				else
				System.out.print(cnt1++);
			}
			else
				System.out.print(" ");
		}
		System.out.println();
	}
}
}

--------------------------------------------------------------------------------------------------------------------------------------------------

Q.28
/*

10101
10101
10101
10101
10101

*/


public class pattern28
{

public static void main(String [] args)
{   
    
	for(int i=0;i<5;i++)
	{   
		for(int j=0;j<5;j++)
		{
	        if(j%2==0)
				
			{
			System.out.print("1");
			}
			else
			System.out.print("0");
		}
		
		System.out.println();
	}
}
}

Q29.
/*

10101
01010
10101
01010
10101

*/


public class pattern29
{

public static void main(String [] args)
{   
    
	for(int i=0;i<5;i++)
	{   
		for(int j=0;j<5;j++)
		{
	        if((i+j)%2==0)
				
			{
			System.out.print("1");
			}
			else
			System.out.print("0");
		}
		
		System.out.println();
	}
}
}


--------------------------------------------------------------------------------------------------------------------------------------------------


Q30.
/* 

1
01
101
0101
10101

*/


public class pattern30
{

public static void main(String [] args)
{   
    
	for(int i=0;i<5;i++)
	{   
		for(int j=0;j<5;j++)
		{ 
			if(j-i<=0){
		
				if((i+j)%2==0)
				
				{
				System.out.print("1");
				}
				else
				System.out.print("0");
				}
			else
			System.out.print(" ");
		}
		
		System.out.println();
	}
}
}



--------------------------------------------------------------------------------------------------------------------------------------------------

Q31.
/*

10000
01000
00100
00010
00001

*/

public class pattern31
{

public static void main(String [] args)
{   
    
	for(int i=0;i<5;i++)
	{   
		for(int j=0;j<5;j++)
		{ 
			if(j-i==0)
				
				{
				System.out.print("1");
				}
				else
				System.out.print("0");
				
			
		}
		
		System.out.println();
	}
}
}

--------------------------------------------------------------------------------------------------------------------------------------------------

Q32.
/*

10000
02000
00300
00040
00005

*/

public class pattern32
{

public static void main(String [] args)
{   
    int count=1;
	for(int i=0;i<5;i++)
	{   
		for(int j=0;j<5;j++)
		{ 
			if(j-i==0)
				
				{
				System.out.print(count);
				}
				else
				System.out.print("0");
				
			
		}
		count++;
		System.out.println();
	}
}
}


--------------------------------------------------------------------------------------------------------------------------------------------------

Q33.
/*

11111
11122
11333
14444
55555

*/

public class pattern33
{

public static void main(String [] args)
{   
    int count=1;
	for(int i=0;i<5;i++)
	{   
		for(int j=0;j<5;j++)
		{ 
			if(j+i>=4)
				
				{
				System.out.print(count);
				}
				else
				System.out.print("1");
				
			
		}
		count++;
		System.out.println();
	}
}
}

--------------------------------------------------------------------------------------------------------------------------------------------------



Q34.
/*

55555
45555
34555
23455
12345

*/

public class pattern34
{

public static void main(String [] args)
{   
    int count=5;
	for(int i=0;i<5;i++)
	{   int cnt1=count;
		for(int j=0;j<5;j++)
		{ 
			if(j-i<=0)
				
				{
				System.out.print(cnt1++);
				}
				else
				System.out.print("5");
				
			
		}
		count--;
		System.out.println();
	}
}
}

--------------------------------------------------------------------------------------------------------------------------------------------------

Q35.
/*

55555
54444
54333
54322
54321

*/


public class pattern35
{

public static void main(String [] args)
{   
    int cnt=5;
	for(int i=0;i<5;i++)
	{   int cnt1=5;
		for(int j=0;j<5;j++)
		{ 
			if(j-i<=0)
				
				{
				System.out.print(cnt1--);
				}
				else
				System.out.print(cnt);
				
			
		}
		cnt--;
		System.out.println();
	}
}
}
