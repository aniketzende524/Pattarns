
		_____________character Patterns & It'solution___________
		-------------------------------------------------------------

Q1.

/*

A
AB
ABC
ABCD
ABCDE

*/

public class pattern1
{
public static void main(String [] args){
	
	for(int i=0;i<5;i++){
		int  cnt=0;
		for(int j=0;j<5;j++){
			if(j-i<=0)
			{
				System.out.print((char)(cnt+65));
				cnt++;
			}
			else
				System.out.print(" ");
				
		}
		System.out.println();
		}
		
	
	}
}

method 2------>>>>>>>>

public class pattern1
{
public static void main(String [] args){
	
	for(int i=0;i<5;i++){
		char ch='A';
		for(int j=0;j<5;j++){
			if(j-i<=0)
			{
				System.out.print(ch);
				ch++;
			}
			else
				System.out.print(" ");		
		}
		System.out.println();
		}
	}
}


eq method ------>>>>
public class character_pattern_25{
public static void main(String [] args){
	
	for(int i=0;i<5;i++){
		
		for(int j=0;j<5;j++){
			if(j-i<=0)
			{
				System.out.print((char)(j+65));
				cnt++;
			}
			else
				System.out.print(" ");
		}
		System.out.println();
		}
	}
}

--------------------------------------------------------------------------------------------------------


Q2.
/*

A
BB
CCC
DDDD
EEEEE

*/

public class pattern2
{
public static void main(String [] args){
	int  cnt=0;
	for(int i=0;i<5;i++){
	
		for(int j=0;j<5;j++){
			if(j-i<=0)
			{
				System.out.print((char)(cnt+65));
				
			}
			else
				System.out.print(" ");
				
		}cnt++;
		System.out.println();
		}
	}
}

Method 2 ------->>>>>>>


public class pattern2
{
public static void main(String [] args){
	char ch='A';
	for(int i=0;i<5;i++){
	
		for(int j=0;j<5;j++){
			if(j-i<=0)
			{
				System.out.print(ch);
			}
			else
				System.out.print(" ");
				
		}ch++;
		System.out.println();
		}
	}
}
	


---------------------------------------------------------------------------------------------------

Q3.
/* 

A
BB
CCC
DDDD
EEEEE
DDDD
CCC
BB
A
*/

public class pattern3
{
public static void main(String [] args){
	int  cnt=0,cnt2=4;
	for(int i=0;i<9;i++)
	{   
		for(int j=0;j<5;j++)
		{
	        if(j-i<=0 && j+i<=8)	
			{
				if(i<4)
				System.out.print((char)(cnt+65) );
			    else
				System.out.print((char)(cnt+65));
			}
			else
			System.out.print(" ");
		}
		cnt++;
		if(i>=4)
			cnt--;
		System.out.println();
	}
	}
}

method 2nd ---------->>>>>>>



public class pattern3
{

public static void main(String [] args)
{   
    char ch='A',ch2='E';
	for(int i=0;i<9;i++)
	{   
		for(int j=0;j<5;j++)
		{
	        if(j-i<=0 && j+i<=8)
				
			{
				if(i<4)
				System.out.print(ch );
			    else
				System.out.print(ch2 );
			}
			else
			System.out.print(" ");
		}
		ch++;
		if(i>=4)
			ch2--;
		System.out.println();
	}
}
}


------------------------------------------------------------------------------------------------

Q4.
/* 

A
AB
ABC
ABCD
ABCDE
ABCD
ABC
AB
A
*/



public class pattern4
{
public static void main(String [] args){
	for(int i=0;i<9;i++)
	{   int  ch1=0;
		for(int j=0;j<5;j++)
		{
	        if(j-i<=0 && j+i<=8)	
			{
				System.out.print((char)(ch1++ + 65) );
			    
			}
			else
			System.out.print(" ");
		}
		System.out.println();
	}
	}
}
 


method 2------>>>>>>



public class pattern4
{

public static void main(String [] args)
{   
    for(int i=0;i<9;i++)
	{   char ch1='A';
		for(int j=0;j<5;j++)
		{
	        if(j-i<=0 && j+i<=8)	
			{
				System.out.print(ch1++ );	    
			}
			else
			System.out.print(" ");
		}
		System.out.println();
	}
}
}

----------------------------------------------------------------------------------------------

Q5.
/* 

ABCDE
ABCD
ABC
AB
A
AB
ABC
ABCD
ABCDE
*/



public class pattern5{
public static void main(String [] args)
{   
    for(int i=0;i<9;i++)
	{   int ch1=0;
		for(int j=0;j<5;j++)
		{
	        if(j+i<=4 || j-i<=-4)	
			{
				System.out.print((char)(ch1++ +65) );	    
			}
			else
			System.out.print(" ");
		}
		System.out.println();
	}
}
}

Method 2 ------->>>>>>

public class pattern5
{
public static void main(String [] args)
{   
    for(int i=0;i<9;i++)
	{   char ch1='A';
		for(int j=0;j<5;j++)
		{
	        if(j+i<=4 || j-i<=-4)	
			{
				System.out.print(ch1++ );   
			}
			else
			System.out.print(" ");
		}
		System.out.println();
	}
}
}

------------------------------------------------------------------------------------------------------
Q6.
/* 

FEDCBA
EDCBA
DCBA
CBA
AB
A
AB
ABC
ABCD
ABCDE
ABCDEF
*/

public class pattern6
{

public static void main(String [] args)
{   
    int ch=5;
	for(int i=0;i<11;i++)
	{   int ch1=ch;
		int ch3=0;
		for(int j=0;j<6;j++)
		{
	        if(j+i<=5 || j-i<=-5)
				
			{   if(i<4)
				System.out.print((char)(ch1-- +65) );
				else
				System.out.print((char)(ch3++ + 65)); 
			}
			else
			System.out.print(" ");
		}
		ch--;
		System.out.println();
	}
}
}


Method 2 -------->>>>>>>>>

public class pattern6
{

public static void main(String [] args)
{   
    char ch='F';
	for(int i=0;i<11;i++)
	{   char ch1=ch;
		char ch3='A';
		for(int j=0;j<6;j++)
		{
	        if(j+i<=5 || j-i<=-5)
				
			{   if(i<4)
				System.out.print(ch1-- );
				else
				System.out.print(ch3++);  
			}
			else
			System.out.print(" ");
		}
		ch--;
		System.out.println();
	}
}
}


------------------------------------------------------------------------------------------

Q7.
/* 

     A
    A B
   A B C
  A B C D
 A B C D E
A B C D E F

*/




public class pattern7
{
public static void main(String [] args)
{   
	for(int i=0;i<6;i++)
	{   int  ch1=0;
		
		for(int j=0;j<6;j++)
		{
	        if(j+i>=5 )
			System.out.print((char)(ch1++ + 65)  + " " );
				
			else
			System.out.print(" ");
		}
		System.out.println();
	}
}
}

Method 2 ------------------>>>>>>>

public class pattern7
{
public static void main(String [] args)
{      
	for(int i=0;i<6;i++)
	{   char ch1='A';		
		for(int j=0;j<6;j++)
		{
	        if(j+i>=5 )
			System.out.print(ch1++ + " " );
			else
			System.out.print(" ");
		}
		System.out.println();
	}
}
}


----------------------------------------------------------------------------------------------------------
Q8.
/* 

FEDCBA
FEDCB
FEDC
FED
FE
F

*/


public class pattern8
{

public static void main(String [] args)
{   
    
	for(int i=0;i<6;i++)
	{   int ch1=5;
		
		for(int j=0;j<6;j++)
		{
	        if(j+i<=5 )
			System.out.print((char)(ch1-- +65) );
				
			else
			System.out.print(" ");
		}
		System.out.println();
	}
}
}

Method 2------------>>>>>>>


public class pattern8
{
public static void main(String [] args)
{   
	for(int i=0;i<6;i++)
	{   char ch1='F';	
		for(int j=0;j<6;j++)
		{
	        if(j+i<=5 )
			System.out.print(ch1-- );
				
			else
			System.out.print(" ");
		}
		System.out.println();
	}
}
}


----------------------------------------------------------------------------------------------

Q9.
/* 

F
FE
FED
FEDC
FEDCB
*/



public class pattern9
{
public static void main(String [] args)
{      
	for(int i=0;i<5;i++)
	{   int  ch1=5;
		for(int j=0;j<5;j++)
		{
	        if(j-i<=0 )
			{			
				System.out.print((char)(ch1-- +65) );
			}
			else
			System.out.print(" ");
		}
		System.out.println();
	}
}
}


Method -------->>>>>>

public class pattern9
{
public static void main(String [] args)
{      
	for(int i=0;i<5;i++)
	{   char ch1='F';
		for(int j=0;j<5;j++)
		{
	        if(j-i<=0 )			
			{
				System.out.print(ch1-- );   
			}
			else
			System.out.print(" ");
		}
		System.out.println();
	}
}
}


--------------------------------------------------------------------------------------------------

Q10.

/*

ABCDEF
ABCDE
ABCD
ABC
AB
A

*/

public class pattern10
{
public static void main(String [] args)
{      
	for(int i=0;i<6;i++)
	{   int ch1=0;	
		for(int j=0;j<6;j++)
		{
	        if(j+i<=5 )
			System.out.print((char)(ch1++ + 65) );
			else
			System.out.print(" ");
		}
		System.out.println();
	}
}
}


Method ----------->>>>>> 


public class pattern10
{
public static void main(String [] args)
{   
	for(int i=0;i<6;i++)
	{   char ch1='A';	
		for(int j=0;j<6;j++)
		{
	        if(j+i<=5 )
			System.out.print(ch1++ );
			else
			System.out.print(" ");
		}
		System.out.println();
	}
}
}



------------------------------------------------------------------------------------------------


Q11.
/* 

A
BC
DEF
GHIJ
KLMNO
*/

public class pattern11
{
public static void main(String [] args)
{   
	int  ch=0;   
	for(int i=0;i<5;i++)
	{   int ch1=ch;
		for(int j=0;j<5;j++)
		{
	        if(j-i<=0 )
			{
				System.out.print((char)(ch++ + 65) );   
			}
			else
			System.out.print(" ");
		}
		System.out.println();
	}
}
}

Method 2----->>>>>

public class pattern11
{
public static void main(String [] args)
{   
	char  ch='A';   
	for(int i=0;i<5;i++)
	{   int ch1=ch;
		for(int j=0;j<5;j++)
		{
	        if(j-i<=0 )
				System.out.print(ch++  );
			else
			System.out.print(" ");
		}
		System.out.println();
	}
}
}


-----------------------------------------------------------------------------------------------

Q12.
/* 

A
BA
CBA
DCBA
EDCBA
*/


public class pattern12
{
public static void main(String [] args)
{   
	int ch=0;
	for(int i=0;i<5;i++)
	{   int ch1=ch;
		for(int j=0;j<5;j++)
		{
	        if(j-i<=0 )	
				System.out.print((char)(ch1--) );
			else
			System.out.print(" ");
		}
		ch++;
		System.out.println();
	}
}
}

Method 2------------------->>>>>>>>>>>>>>>>



public class pattern12
{
public static void main(String [] args)
{   
	char ch='A';   
	for(int i=0;i<5;i++)
	{   char ch1=ch;
		for(int j=0;j<5;j++)
		{
	        if(j-i<=0 )
				System.out.print(ch1-- );
			else
			System.out.print(" ");
		}
		ch++;
		System.out.println();
	}
}
}


--------------------------------------------------------------------------------------------------------


Q13.
/* 

A
BG
CHM
DINS
EJOTY
FKPUZ_

*/

public class pattern13
{
public static void main(String [] args)
{   
	int ch=0;
	for(int i=0;i<6;i++)
	{   int ch1=ch;
		for(int j=0;j<6;j++)
		{
	        if(j-i<=0 )
				System.out.print((char)(ch1+65));
				ch1+=5;
			else
			System.out.print(" ");
		}
		ch++;
		System.out.println();
	}
}
}



Method 2------>>>>>>>>>



public class pattern13
{
public static void main(String [] args)
{   
	char ch='A';   
	for(int i=0;i<6;i++)
	{   char ch1=ch;
		for(int j=0;j<6;j++)
		{
	        if(j-i<=0 )
				System.out.print(ch1);
				ch1+=5;
			else
			System.out.print(" ");
		}
		ch++;
		System.out.println();
	}
}
}


------------------------------------------------------------------------------------------------

Q14.
/* 

A
ABA
ABCBA
ABCDCBA
ABCDEDCBA

*/


public class pattern14
{
public static void main(String[] args)
{	
	for(int i=0;i<9;i=i+2)
	{
		int ch=0;        
		for(int j=0;j<9;j++)
		{
			if(j-i<=0)
			{   if(j*2<i)
				System.out.print((char)(ch++ + 65));
				else
				System.out.print((char)(ch-- + 65));
				
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

Method 2------>>>>>>>>


public class pattern14
{
public static void main(String[] args)
{	
	for(int i=0;i<9;i=i+2)
	{
		char ch='A';
        
		for(int j=0;j<9;j++)
		{
			if(j-i<=0)
			{   if(j*2<i)
				System.out.print(ch++);
				else
				System.out.print(ch--);	
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

------------------------------------------------------------------------------------------------------


Q15.
/* 

    A
   ABA
  ABCBA
 ABCDCBA
ABCDEDCBA


*/



public class pattern15
{
public static void main(String[] args)
{	
	for(int i=0;i<5;i++)
	{
		int ch=0;

		for(int j=0;j<10;j++)
		{
			if(j+i>=4 && j-i<=4)
			{   if(j<4)
				System.out.print((char)(ch++ + 65));
				else
				System.out.print((char)(ch-- + 65));	
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



Method 2------>>>>>>>




public class pattern15
{
public static void main(String[] args)
{	
	for(int i=0;i<5;i++)
	{
		char ch='A';
		for(int j=0;j<10;j++)
		{
			if(j+i>=4 && j-i<=4)
			{   if(j<4)
				System.out.print(ch++);
				else
				System.out.print(ch--);				
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


------------------------------------------------------------------------------------------

Q16.
/* 

OO*OO
OO*OO
*****
OO*OO
OO*OO

*/




public class pattern16
{
public static void main(String [] args)
{      
	for(int i=0;i<5;i++)
	{   
		for(int j=0;j<5;j++)
		{
	        if(i==2 || j==2 )			
			{
				System.out.print("*");
			}
			else
			System.out.print("O");
		}
		System.out.println();
	}
}
}

---------------------------------------------------------------------------------------------------


Q17.
/* 

OXXXX
XOXXX
XXOXX
XXXOX
XXXXO

*/




public class pattern17
{
public static void main(String [] args)
{      
	for(int i=0;i<5;i++)
	{   
		for(int j=0;j<5;j++)
		{
	        if(j-i==0 )			
			{
				System.out.print("O");
			}
			else
			System.out.print("X");
		}
		System.out.println();
	}
}
}


------------------------------------------------------------------------------------------------------

Q18.
/* 

A   A
 A A
  A
 A A
A   A

*/


public class pattern18
{
public static void main(String [] args)
{      
	for(int i=0;i<5;i++)
	{   
		for(int j=0;j<5;j++)
		{
	        if(j-i==0 || j+i==4 )			
			{
				System.out.print("A");
			}
			else
			System.out.print(" ");
		}
		
		System.out.println();
	}
}
}


--------------------------------------------------------------------------------------------------------

Q19.
/* 

ABBBA
BABAB
BBABB
BABAB
ABBBA

*/


public class pattern19
{
public static void main(String [] args)
{   
    for(int i=0;i<5;i++)
	{   
		for(int j=0;j<5;j++)
		{
	        if(j-i==0 || j+i==4 )	
			{			
				System.out.print("A");
			}
			else
			System.out.print("B");
		}
		System.out.println();
	}
}
}


----------------------------------------------------------------------------------------------


Q20.
/* 

PPPPP
P   P
P   P
P   P
PPPPP

*/


public class pattern20
{
public static void main(String [] args)
{      
	for(int i=0;i<5;i++)
	{   
		for(int j=0;j<5;j++)
		{
	        if(i==0 || j==0 || i==4 || j==4 || i==4 )			
			System.out.print("P");
			else
			System.out.print(" ");
		}
		System.out.println();
	}
}
}


--------------------------------------------------------------------------------------------------


Q21.
/* 

PPPPP
PQQQP
PQQQP
PQQQP
PPPPP

*/


public class pattern21
{
public static void main(String [] args)
{   	
    for(int i=0;i<5;i++)
	{   
		for(int j=0;j<5;j++)
		{
	        if(i==0 || j==0 || i==4 || j==4 || i==4 )			
			System.out.print("P");
			else
			System.out.print("Q");
		}
		System.out.println();
	}
}
}


--------------------------------------------------------------------------------------------------------------

Q22.
/* 

    N
   N
  N
 N
N

*/

public class pattern22
{
public static void main(String [] args)
{  	 
	for(int i=0;i<5;i++)
	{   
		for(int j=0;j<5;j++)
		{
	        if(j+i==4)	
			System.out.print("N");
			else
			System.out.print(" ");
		}
		System.out.println();
	}
}
}


------------------------------------------------------------------------------------------------------------

Q23.
/* 

N
 N
  N
   N
    N

*/


public class pattern23
{
public static void main(String [] args)
{   
	for(int i=0;i<5;i++)
	{   
		for(int j=0;j<9;j++)
		{
	        if(j-i==0 )				
			System.out.print("N");
			else
			System.out.print(" ");
		}
		System.out.println();
	}
}
}


-----------------------------------------------------------------------------------------------------------------


Q24.
/* 

N       N
 N     N
  N   N
   N N
    N

*/

public class pattern24
{
public static void main(String [] args)
{   	
	for(int i=0;i<5;i++)
	{   
		for(int j=0;j<9;j++)
		{
	        if(j-i==0  || j+i ==8)
			System.out.print("N");
			else
			System.out.print(" ");
		}
		System.out.println();
	}
}
}

___________________________________XXXXXOOXXXXXX_______________________________________________