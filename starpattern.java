_______________________	STAR PATTERN AND IT'S SOLUTION____________________________




Q1.
/*


*****
*****
*****
*****
*****



*/



public class patten1
{
    public static void main(String[] args)
    {
         
       for(int i=0;i<5;i++)
       {
        for(int j=0;j<5;j++)
        {
            System.out.print("*");
        }
        System.out.println();
       }
    }
}
________________________________________________________________________
Q2.
/* 


*****
****
***
**
*


*/


public class pattern2 
{
    public static void main(String[] args)
    {
         
       for(int i=0;i<5;i++)
       {
        for(int j=0;j<5;j++)
        {
            if(j+i<=4)
            System.out.print("*");
            else
            System.out.print(" ");
        }
        System.out.println();
       }
    }
}
________________________________________________________________________
Q3.

/*  



*
**
***
****
*****


*/		
public class pattern3 {
    public static void main(String[] args)
    {
         
       for(int i=0;i<5;i++)
       {
        for(int j=0;j<5;j++)
        {
            if(j-i<=0)
            System.out.print("*");
            else
            System.out.print(" ");
        }
        System.out.println();
       }
    }
}

________________________________________________________________________
Q4.

/* 4,


*
**
***
****
*****
****
***
**
*


*/

public class pattern4 
{
    public static void main(String[] args)
    {
         
       for(int i=0;i<9;i++)
       {
        for(int j=0;j<5;j++)
        {
            if(j-i<=0&&j+i<=8)
            System.out.print("*");
            else
            System.out.print(" ");
        }
        System.out.println();
       }
    }
}

________________________________________________________________________
Q5.

/*  


*****
****
***
**
*
**
***
****
*****


*/
public class pattern5 
{
    public static void main(String[] args)
    {
         
       for(int i=0;i<9;i++)
       {
        for(int j=0;j<5;j++)
        {
            if(j+i<=4||j-i<=-4)
            System.out.print("*");
            else
            System.out.print(" ");
        }
        System.out.println();
       }
    }
}
   
________________________________________________________________________
Q6.  
/*



    *
   **
  ***
 ****
*****

*/ 
public class pattern6 
{
    public static void main(String[] args)
    {
         
       for(int i=0;i<5;i++)
       {
        for(int j=0;j<5;j++)
        {
            if(j+i>=4)
            System.out.print("*");
            else
            System.out.print(" ");
        }
        System.out.println();
       }
    }
}

________________________________________________________________________

Q7.
/*
  

*****
 ****
  ***
   **
    *

*/ 

public class pattern7 
{
    public static void main(String[] args)
    {
         
       for(int i=0;i<5;i++)
       {
        for(int j=0;j<5;j++)
        {
            if(j-i>=0)
            System.out.print("*");
            else
            System.out.print(" ");
        }
        System.out.println();
       }
    }
}
   
________________________________________________________________________   
   
Q8.
   
/*   

*****
****
***
**
*
**
***
****
*****

*/ 

public class pattern8
{
    public static void main(String[] args)
    {
         
       for(int i=0;i<9;i++)
       {
        for(int j=0;j<5;j++)
        {
            if(j+i<=4||j-i<=-4)
            System.out.print("*");
            else
            System.out.print(" ");
        }
        System.out.println();
       }
    }
}

________________________________________________________________________

Q9.
/* 



    *
   **
  ***
 ****
*****
 ****
  ***
   **
    *
	
*/
public class pattern9 
{
    public static void main(String[] args)
    {
         
       for(int i=0;i<9;i++)
       {
        for(int j=0;j<5;j++)
        {
            if(j+i>=4&&j-i>=-4)
            System.out.print("*");
            else
            System.out.print(" ");
        }
        System.out.println();
       }
    }
}

________________________________________________________________________

Q10.

/*   

    *
   * *
  * * *
 * * * *
* * * * *

*/

public class pattern10 
{
    public static void main(String[] args)
    {
         
       for(int i=0;i<5;i++)
       {
        for(int j=0;j<5;j++)
        {
            if(j+i>=4)
            System.out.print("* ");
            else
            System.out.print(" ");
        }
        System.out.println();
       }
    }
}

________________________________________________________________________

Q11.

/*  

    *
   ***
  *****
 *******
*********

*/

public class pattern11
{
    public static void main(String[] args)
    {
         
       for(int i=0; i<5; i++)
       {
        for(int j=0; j<9; j++)
        {
            if(j+i>=4 && j-i<=4)
            System.out.print("*");
            else
            System.out.print(" ");
        }
        System.out.println();
       }
    }
}

________________________________________________________________________

Q12.
*  

* * * * *
 * * * *
  * * *
   * *
    *
	
*/

public class pattern12 
{
    public static void main(String[] args)
    {
         
       for(int i=0; i<5; i++)
       {
        for(int j=0; j<5; j++)
        {
            if(j-i>=0)
            System.out.print("* ");
            else
            System.out.print(" ");
        }
        System.out.println();
       }
    }
}

________________________________________________________________________

Q13.

/*  

*********
 *******
  *****
   ***
    *
 

*/

public class pattern13
{
    public static void main(String[] args)
    {
         
       for(int i=0; i<5; i++)
       {
        for(int j=0; j<9; j++)
        {
            if(j-i>=0 && j+i<=8)
            System.out.print("*");
            else
            System.out.print(" ");
        }
        System.out.println();
       }
    }
}

________________________________________________________________________

Q14.
/*


* * * * *
 * * * *
  * * *
   * *
    *
	
*/

public class pattern14
{
    public static void main(String[] args)
    {
         
       for(int i=0; i<5; i++)
       {
        for(int j=0; j<5; j++)
        {
            if(j-i>=0)
            System.out.print("* ");
            else
            System.out.print(" ");
        }
        System.out.println();
       }
    }
}

________________________________________________________________________


Q15.
/* 


*****
 ****
  ***
   **
    *
   **
  ***
 ****
*****


*/

public class pattern15
{
    public static void main(String[] args)
    {
         
       for(int i=0; i<9; i++)
       {
        for(int j=0; j<5; j++)
        {
            if(j-i>=0 || j+i>=8)
            System.out.print("*");
            else
            System.out.print(" ");
        }
        System.out.println();
       }
    }
}

________________________________________________________________________

Q16.

/*   

*****
 ****
  ***
   **
    *
    **
    ***
    ****
    *****
	
*/

public class pattern16
{
    public static void main(String[] args)
    {
         
       for(int i=0; i<9; i++)
       {
        for(int j=0; j<9; j++)
        {
            if((j-i>=0 && j<=4) || (j-i<=0 && j>=4))
            System.out.print("*");
            else
            System.out.print(" ");
        }
        System.out.println();
       }
    }
}

________________________________________________________________________

Q17.

/*   


*********
 *******
  *****
   ***
    *
   ***
  *****
 *******
*********

*/

public class pattern17
{
    public static void main(String[] args)
    {
         
       for(int i=0; i<9; i++)
       {
        for(int j=0; j<9; j++)
        {
            if((j-i>=0 && j+i<=8) || (j+i>=8 && j-i<=0))
            System.out.print("*");
            else
            System.out.print(" ");
        }
        System.out.println();
       }
    }
}

________________________________________________________________________


Q18.

/*



* * * * *
 * * * *
  * * *
   * *
    *
   * *
  * * *
 * * * *
* * * * *

*/

public class pattern18
{
    public static void main(String[] args)
    {
         
       for(int i=0; i<9; i++)
       {
        for(int j=0; j<5; j++)
        {
            if(j-i>=0 || j+i>=8)
            System.out.print("* ");
            else
            System.out.print(" ");
        }
        System.out.println();
       }
    }
}

________________________________________________________________________

Q19.
/*  

    *
   * *
  * * *
 * * * *
* * * * *
 * * * *
  * * *
   * *
    *
	
*/


public class pattern19
{
    public static void main(String[] args)
    {
         
       for(int i=0; i<9; i++)
       {
        for(int j=0; j<5; j++)
        {
            if(j+i>=4 && j-i>=-4)
            System.out.print("* ");
            else
            System.out.print(" ");
        }
        System.out.println();
       }
    }
}

________________________________________________________________________


Q20.
/*  



    *
   ***
  *****
 *******
*********
 *******
  *****
   ***
    *
	
*/

public class pattern20 
{
    public static void main(String[] args)
    {
         
       for(int i=0; i<9; i++)
       {
        for(int j=0; j<9; j++)
        {
            if((j+i>=4 && j-i<=4) && (j-i>=-4 && j+i<=12))
            System.out.print("*");
            else
            System.out.print(" ");
        }
        System.out.println();
       }
    }
}

________________________________________________________________________


Q21.
/* 


*********
**** ****
***   ***
**     **
*       *
**     **
***   ***
**** ****
*********
	
*/


public class pattern21
{
    public static void main(String[] args)
    {
         
       for(int i=0; i<9; i++)
       {
        for(int j=0; j<9; j++)
        {
            if((j+i<=4 || j-i<=-4) || (j-i>=4 || j+i>=12))
            System.out.print("*");
            else
            System.out.print(" ");
        }
        System.out.println();
       }
    }
}

________________________________________________________________________


Q22.
/*


    *****
   *****
  *****
 *****
*****

*/


public class pattern22 {
    public static void main(String[] args) {
        
       for(int i=0; i<5; i++)
       {
        for(int j=0; j<9; j++)
        {
            if(j+i>=4&&j+i<=8)
            System.out.print("*");
            else
            System.out.print(" ");
        }
        System.out.println();
       }
    }  
}

________________________________________________________________________


Q23.
/*


*****
 *****
  *****
   *****
    *****
   *****
  *****
 *****
*****
*/


public class pattern23 {
    public static void main(String[] args) {
        
       for(int i=0; i<9; i++)
       {
        for(int j=0; j<9; j++)
        {
            if((j-i>=0 && j-i<=4 && i<=4) || (j+i>=8 && j+i<=12 && i>=5))
            System.out.print("*");
            else
            System.out.print(" ");
        }
        System.out.println();
       }
    }
}

________________________________________________________________________

Q24.
/*


    *****
   *****
  *****
 *****
*****
 *****
  *****
   *****
    *****

*/


public class pattern24 {
    public static void main(String[] args) {
        
       for(int i=0; i<9; i++)
       {
        for(int j=0; j<9; j++)
        {
            if((j+i>=4 && j+i<=8 && i<=4)||(j-i>=-4 && j-i<=0 && i>=5))
            System.out.print("*");
            else
            System.out.print(" ");
        }
        System.out.println();
       }
    }
}

________________________________________________________________________

Q25.
/*

*
***
*****
*******
*********

*/


public class pattern25 {
    public static void main(String[] args) {
        
       for(int i=0; i<9; i=i+2)
       {
        for(int j=0; j<9; j++)
        {
            if(j-i<=0)
            System.out.print("*");
            else
            System.out.print(" ");
        }
        System.out.println();
       }
    }
}

________________________________________________________________________

Q26.
/*

* *
** **
*** ***
**** ****

*/


public class pattern26 {
    public static void main(String[] args) {
        
       for(int i=2; i<9; i=i+2)
       {
        for(int j=0; j<9; j++)
        {
            if(j-i<=0)
            {
            if(j*2==i)
            System.out.print(" ");
            else 
            System.out.print("*");
            }
            else
            System.out.print(" ");
        }
        System.out.println();
       }
    }
}

________________________________________________________________________

Q27.
/*

*        *
**      **
***    ***
****  ****
**********

*/


public class pattern27 {
    public static void main(String[] args) {
        
       for(int i=0; i<5; i++)
       {
        for(int j=0; j<9; j++)
        {
            if(j-i<=0 || j+i>=8)
            System.out.print("*");
            else
            System.out.print(" ");
        }
        System.out.println();
       }
    }
}

________________________________________________________________________

Q28.
/* 

*        *
**      **
***    ***
****  ****
**********
****  ****
***    ***
**      **
*        *

*/


public class pattern28 {
    public static void main(String[] args) {
        
       for(int i=0; i<9; i++)
       {
        for(int j=0; j<9; j++)
        {
            if(j-i<=0 && j+i<=8 || j+i>=8 && j-i>=0)
            System.out.print("*");
            else
            System.out.print(" ");
        }
        System.out.println();
       }
    }
}

________________________________________________________________________

Q29.

/* 

  *
  *
*****
  *
  *

*/


public class pattern29 
{
    public static void main(String[] args) 
	{
       for(int i=0; i<5; i++)
       {
        for(int j=0; j<5; j++)
        {
            if(j==2 || i==2)
            System.out.print("*");
            else
            System.out.print(" ");
        }
        System.out.println();
       }
    }
}

________________________________________________________________________

Q30.
/* 

*****
*  *
* *
**
*

*/


public class pattern30 
{
    public static void main(String[] args) 
	{        
       for(int i=0; i<5; i++)
       {
        for(int j=0; j<5; j++)
        {
            if(j==0 || i==0 || j+i==4)
            System.out.print("*");
            else
            System.out.print(" ");
        }
        System.out.println();
       }
    }
}

________________________________________________________________________

Q31.

/* 

*****
 *  *
  * *
   **
    *

*/


public class pattern31
{
    public static void main(String[] args)
	{    
       for(int i=0; i<5; i++)
       {
        for(int j=0; j<5; j++)
        {
            if(j==4 || i==0 || j-i==0)
            System.out.print("*");
            else
            System.out.print(" ");
        }
        System.out.println();
       }
    }
}

________________________________________________________________________

Q32.

/* 

    *
   * *
  *   *
 *     *
*********

*/


public class pattern32 
{
    public static void main(String[] args) {
        
       for(int i=0; i<5; i++)
       {
        for(int j=0; j<9; j++)
        {
            if(i==4 || j-i==4 || j+i==4)
            System.out.print("*");
            else
            System.out.print(" ");
        }
        System.out.println();
       }
    }
}

________________________________________________________________________


Q33.
/* 


*********
 *     *
  *   *
   * *
    *


*/


public class pattern22 {
    public static void main(String[] args) {
        
       for(int i=0; i<5; i++)
       {
        for(int j=0; j<9; j++)
        {
            if(i==0 || j-i==0 || j+i==8)
            System.out.print("*");
            else
            System.out.print(" ");
        }
        System.out.println();
       }
    }
}

________________________________________________________________________

Q34.

/* 


    *
   * *
  *   *
 *     *
*       *
 *     *
  *   *
   * *
    *

*/


public class pattern34 
{
    public static void main(String[] args) {
        
       for(int i=0; i<9; i++)
       {
        for(int j=0; j<9; j++)
        {
            if(j+i==4 || j-i==4 || j-i==-4 || j+i==12)
            System.out.print("*");
            else
            System.out.print(" ");
        }
        System.out.println();
       }
    }
}

________________________________________________________________________

Q35.
/*

*
**
* *
*  *
*   *
*  *
* *
**
*

*/


public class pattern35
{
    public static void main(String[] args) {
        
       for(int i=0; i<9; i++)
       {
        for(int j=0; j<5; j++)
        {
            if(j==0 || j-i==0 || j+i==8)
            System.out.print("*");
            else
            System.out.print(" ");
        }
        System.out.println();
       }
    }
}

________________________________________________________________________

Q36.
/* 



    *
   **
  * *
 *  *
*   *
 *  *
  * *
   **
    *

*/


public class pattern36 
{
    public static void main(String[] args) {
        
       for(int i=0; i<9; i++)
       {
        for(int j=0; j<5; j++)
        {
            if(j==4 || j-i==-4 || j+i==4)
            System.out.print("*");
            else
            System.out.print(" ");
        }
        System.out.println();
       }
    }
}

________________________________________________________________________

Q37.
/*

    *****
   *   *
  *   *
 *   *
*****


*/


public class pattern37 
{
    public static void main(String[] args) {
        
       for(int i=0; i<5; i++)
       {
        for(int j=0; j<9; j++)
        {
            if((i==0 && j>4) || (i==4 && j<=4) || j+i==4 || j+i==8)
            System.out.print("*");
            else
            System.out.print(" ");
        }
        System.out.println();
       }
    }
}

________________________________________________________________________

Q38.

/*

*****
 *   *
  *   *
   *   *
    *****

*/


public class pattern38 
{
    public static void main(String[] args) {
        
       for(int i=0; i<5; i++)
       {
        for(int j=0; j<9; j++)
        {
            if((i==0 && j<4) || (i==4 && j>=4) || j-i==4 || j-i==0)
            System.out.print("*");
            else
            System.out.print(" ");
        }
        System.out.println();
       }
    }
}

________________________________________________________________________

Q39.

/* 


*****
 * *
  *
 * *
*****

*/


public class pattern39 
{
    public static void main(String[] args) {
        
       for(int i=0; i<5; i++)
       {
        for(int j=0; j<5; j++)
        {
            if(i==0 || j+i==4 || j-i==0 || i==4)
            System.out.print("*");
            else
            System.out.print(" ");
        }
        System.out.println();
       }
    }
}

________________________________________________________________________

Q40.

/*


 ** **
*  *  *
 *   *
  * *
   *

*/

public class pattern40 
{
    public static void main(String[] args) 
	{
       for(int i=0; i<5; i++)
       {
        for(int j=0; j<7; j++)
        {
            if((i==0 && j!=0 && j!=3 && j!=6) || (i==1 &&  j==3 ) ||(j-i==-1) || (j+i==7))
            System.out.print("*");
            else
            System.out.print(" ");
        }
        System.out.println();
       }
    }
}

Method 2---->

public class pattern40
{

public static void main(String [] args)
{
	for(int i=0;i<5;i++)
	{int ch=5,ch1=5;
		for(int j=0;j<7;j++)
		{
			if(j+i==1 || (j-i==2 && i<=1) || (j+i==4 && i<=1) || j-i==5 || j+i==7 || j-i==-1)
			{
			System.out.print("*");
			
			}
			else
			System.out.print(" ");
		ch--;
		}
		System.out.println();
	}
}
}

________________________________________________________________________ 


Q41.
/* 


  ***     ***
 *****   *****
******* *******
***************
 *************
  ***********
   *********
    *******
     *****
      ***
       *
	   
	*/


public class pattern41 
{
    public static void main(String[] args) {
        
       for(int i=0; i<12; i++)
       {
        for(int j=0; j<15; j++)
        {
        //System.out.print("*");
        if(j-i<=-4 || j+i>=18 || j+i<=1 || j-i>=13  || ((j-i>=5 && j+i<=9)))
             System.out.print(" ");
             else
             System.out.print("*");
         }
        System.out.println();
       }
    }
}

________________________________________________________________________

Q42.

/*


 ***
*   *
*   *
*****
*   *
*   *
*   *

*/


public class pattern42 {
    public static void main(String[] args) {
        
       for(int i=0; i<7; i++)
       {
        for(int j=0; j<5; j++)
        {
        if((i==0 && j!=0 && j!=4) || (j==0 && i!=0) || (j==4 && i!=0) || i==3)
             System.out.print("*");
             else
             System.out.print(" ");
         }
        System.out.println();
       }
    }
}

________________________________________________________________________


Q43.

/*


****
*   *
*   *
****
*   *
*   *
****

*/


public class pattern22 {
    public static void main(String[] args) {
        
       for(int i=0; i<7; i++)
       {
        for(int j=0; j<5; j++)
        {
            if((i==0 && j!=4) || (i==3 && j!=4) || (i==6 && j!=4) || (j==0) || (j==4 && i!=0 && i!=3 && i!=6))
            System.out.print("*");
            else
            System.out.print(" ");
         }
        System.out.println();
       }
    }
}

________________________________________________________________________

Q44
/*


 ****
*
*
*
*
*
 ****

*/



public class pattern44 
{
    public static void main(String[] args) 
	{
        
       for(int i=0; i<7; i++)
       {
        for(int j=0; j<5; j++)
        {
            if((i==0 && j!=0)  || (i==6 && j!=0) || (j==0 && i!=0 && i!=6))
            System.out.print("*");
            else
            System.out.print(" ");
         }
        System.out.println();
       }
    }
}

________________________________________________________________________

Q45.

/* 


****
*   *
*   *
*   *
*   *
*   *
****

*/

public class pattern45 {
    public static void main(String[] args) {
        
       for(int i=0; i<7; i++)
       {
        for(int j=0; j<5; j++)
        {
            if((i==0 && j!=4)  || (i==6 && j!=4) || (j==4 && i!=0 && i!=6) || (j==0))
            System.out.print("*");
            else
            System.out.print(" ");
         }
        System.out.println();
       }
    }
}

________________________________________________________________________

Q46.

/*


*****
*
*
*****
*
*
*****

*/

public class pattern46 {
    public static void main(String[] args) {
        
       for(int i=0; i<7; i++)
       {
        for(int j=0; j<5; j++)
        {
            if((i==0)  || (i==6) || (i==3) || (j==0))
            System.out.print("*");
            else
            System.out.print(" ");
         }
        System.out.println();
       }
    }
}

________________________________________________________________________

Q47.

/*

*****
*
*
*****
*
*
*

*/


public class pattern47 {
    public static void main(String[] args) {
        
       for(int i=0; i<7; i++)
       {
        for(int j=0; j<5; j++)
        {
            if((i==0)  || (i==3) || (j==0))
            System.out.print("*");
            else
            System.out.print(" ");
         }
        System.out.println();
       }
    }
}

________________________________________________________________________

Q48.

/*


*****
*
*
*  ***
*   *
*   *
*****

*/


public class pattern48 {
    public static void main(String[] args) {
        
       for(int i=0; i<7; i++)
       {
        for(int j=0; j<7; j++)
        {
            if((i==0 && j<=4)  || (i==3 && j>=3 && j<=5) || (i==6 && j<=4) || j==0 || (j==4 && i>=3))
            System.out.print("*");
            else
            System.out.print(" ");
         }
        System.out.println();
       }
    }
}

________________________________________________________________________

Q 49.

/*


*   *
*   *
*   *
*****
*   *
*   *
*   *

*/

public class pattern49 
{
    public static void main(String[] args) {
        
       for(int i=0; i<7; i++)
       {
        for(int j=0; j<5; j++)
        {
            if(j==0 || j==4 || i==3)
            System.out.print("*");
            else
            System.out.print(" ");
         }
        System.out.println();
       }
    }
}

________________________________________________________________________

Q50.
/* 


*****
  *
  *
  *
  *
  *
*****

*/

public class pattern50 
{
    public static void main(String[] args) {
        
       for(int i=0; i<7; i++)
       {
        for(int j=0; j<5; j++)
        {
            if(i==0 || j==2 || i==6)
            System.out.print("*");
            else
            System.out.print(" ");
         }
        System.out.println();
       }
    }
}

________________________________________________________________________

Q51.

/*


*****
  *
  *
  *
  *
* *
***

*/

public class pattern51
{
    public static void main(String[] args) {
        
       for(int i=0; i<7; i++)
       {
        for(int j=0; j<5; j++)
        {
            if(i==0 || j==2 || (i==6 && i<=2) || (i==6 && j<=2) || (j==0 && i>=5))
            System.out.print("*");
            else
            System.out.print(" ");
         }
        System.out.println();
       }
    }
}

________________________________________________________________________


Q52.
/*


*   *
*  *
* *
**
* *
*  *
*   *

*/


public class pattern 52
{
    public static void main(String[] args) {
        
       for(int i=0; i<7; i++)
       {
        for(int j=0; j<5; j++)
        {
            if(j==0 || (j+i==4) || (j-i==-2))
            System.out.print("*");
            else
            System.out.print(" ");
         }
        System.out.println();
       }
    }
}

________________________________________________________________________

Q53.
/*


*
*
*
*
*
*
*****

*/

public class pattern53
{
    public static void main(String[] args) {
        
       for(int i=0; i<7; i++)
       {
        for(int j=0; j<5; j++)
        {
            if(j==0 || i==6)
            System.out.print("*");
            else
            System.out.print(" ");
         }
        System.out.println();
       }
    }
}

________________________________________________________________________


Q54.
/*


*       *
**     **
* *   * *
*  * *  *
*   *   *
*       *
*       *

*/

public class pattern54
{
    public static void main(String[] args) {
        
       for(int i=0; i<7; i++)
       {
        for(int j=0; j<9; j++)
        {
            if(j==0 || j==8 || (j-i==0 && i<=4) || (j+i==8 && i<=4))
            System.out.print("*");
            else
            System.out.print(" ");
         }
        System.out.println();
       }
    }
}

________________________________________________________________________


Q55.

/*


*     *
**    *
* *   *
*  *  *
*   * *
*    **
*     *

*/

public class pattern55
{
    public static void main(String[] args) {
        
       for(int i=0; i<7; i++)
       {
        for(int j=0; j<7; j++)
        {
            if(j==0 || j==6 || (j-i==0))
            System.out.print("*");
            else
            System.out.print(" ");
         }
        System.out.println();
       }
    }
}

________________________________________________________________________

Q56.

/*

 ***
*   *
*   *
*   *
*   *
*   *
 ***


*/

public class pattern56
{
    public static void main(String[] args) {
        
       for(int i=0; i<7; i++)
       {
        for(int j=0; j<5; j++)
        {
            if((j==0 && i>=1 && i<=5) || ((j==4 && i>=1 && i<=5)) || (i==0 && j>=1 && j<=3) || (i==6 && j>=1 && j<=3))
            System.out.print("*");
            else
            System.out.print(" ");
         }
        System.out.println();
       }
    }
}

________________________________________________________________________

Q57.

/* 

 ***
*   *
*   *
****
*
*
*


*/

public class pattern57
{
    public static void main(String[] args) {
        
       for(int i=0; i<7; i++)
       {
        for(int j=0; j<5; j++)
        {
            if((j==0 && i>=1) || (i==0 && j>=1 && j<=3) || (j==4 && i>=1&&i<=2) || (i==3 && j<4))
            System.out.print("*");
            else
            System.out.print(" ");
         }
        System.out.println();
       }
    }
}

________________________________________________________________________

Q58.
/* 130

 ***
*   *
*   *
*   *
**  *
 ***
   *


*/

public class pattern58
{
    public static void main(String[] args)
    {
        
       for(int i=0; i<7; i++)
       {
        for(int j=0; j<5; j++)
        {
            if((j==0 && i>=1 && i<=4) || ((j==4 && i>=1 && i<=4)) || (i==0 && j>=1 && j<=3) || (i==5 && j>=1 && j<=3) || j-i==-3)
            System.out.print("*");
            else
            System.out.print(" ");
         }
        System.out.println();
       }
    }
}

________________________________________________________________________

Q59.
/*


 ***
*   *
*   *
****
*   *
*   *
*   *

*/

public class pattern59
{
    public static void main(String[] args)
    {
        
       for(int i=0; i<7; i++)
       {
        for(int j=0; j<5; j++)
        {
            if((j==0 && i>=1) || (i==0 && j>=1 && j<=3) || (j==4 && i!=0 && i!=3) || (i==3 && j<4))
            System.out.print("*");
            else
            System.out.print(" ");
        }
        System.out.println();
       }
    }
}

________________________________________________________________________


Q60.

/*

*****
*
*
*****
    *
    *
*****

*/


public class pattern60
{
    public static void main(String[] args)
    {
        
       for(int i=0; i<7; i++)
       {
        for(int j=0; j<5; j++)
        {
            if(i==0 || i==3 || i==6 || (j==0 && i<=3) || (j==4 && i>=4))
            System.out.print("*");
            else
            System.out.print(" ");
         }
        System.out.println();
       }
    }
}

________________________________________________________________________

Q61.

/*


*****
  *
  *
  *
  *
  *
  *

*/

public class pattern61
{
    public static void main(String[] args)
    {
        
       for(int i=0; i<7; i++)
       {
        for(int j=0; j<5; j++)
        {
            if(j==2 || i==0)
            System.out.print("*");
            else
            System.out.print(" ");
         }
        System.out.println();
       }
    }
}

________________________________________________________________________

Q62.

/*


*   *
*   *
*   *
*   *
*   *
*   *
 ***


*/

public class pattern62
{
    public static void main(String[] args)
    {
        
       for(int i=0; i<7; i++)
       {
        for(int j=0; j<5; j++)
        {
            if((j==0 && i<=5) || (j==4 && i<=5) || (i==6 && j>=1 && j<=3))
            System.out.print("*");
            else
            System.out.print(" ");
         }
        System.out.println();
       }
    }
}
   
Method 2--------->

public class pattern62
{

public static void main(String [] args)
{
	for(int i=0;i<7;i++)
	{
		for(int j=0;j<5;j++)
		{
		if((j==0&& i!=6) || (j==4 && i!=6)|| (i==6 && j!=0 && j!=4))
			{
			System.out.print("*");
			}
			else
			System.out.print(" ");
		}
		System.out.println();
	}
}
}

________________________________________________________________________

   
   
Q63.

/*

*           *
 *         *
  *       *
   *     *
    *   *
     * *
      *


*/

public class pattern63
{
    public static void main(String[] args)
    {
        
       for(int i=0; i<7; i++)
       {
        for(int j=0; j<13; j++)
        {
            if(j-i==0 || j+i==12 )
            System.out.print("*");
            else
            System.out.print(" ");
         }
        System.out.println();
       }
    }
}

________________________________________________________________________


Q64.

/*

*     *
 *   *
  * *
   *
  * *
 *   *
*     *


*/

public class pattern64
{
    public static void main(String[] args)
    {
        
       for(int i=0; i<7; i++)
       {
        for(int j=0; j<7; j++)
        {
            if(j-i==0 || j+i==6 )
            System.out.print("*");
            else
            System.out.print(" ");
         }
        System.out.println();
       }
    }
}

________________________________________________________________________

Q65.

/*

*  *  *
* * * *
**   **
*     *


*/
 
public class pattern65
{
    public static void main(String[] args)
    {
        
       for(int i=0; i<7; i++)
       {
        for(int j=0; j<7; j++)
        {
            if( j==0 || j==6 || (j+i==6 && i>=3) || (j-i==0 && i>=3) )
            System.out.print("*");
            else
            System.out.print(" ");
         }
        System.out.println();
       }
    }
}

________________________________________________________________________

Q66.

/*

*     *
 *   *
  * *
   *
   *
   *
   *


*/  

public class pattern66
{
    public static void main(String[] args)
    {
        
       for(int i=0; i<7; i++)
       {
        for(int j=0; j<7; j++)
        {
            if((j-i==0 && i<=3) || (j+i==6 && i<=3) || (j==3 && i>=3))
            System.out.print("*");
            else
            System.out.print(" ");
         }
        System.out.println();
       }
    }
}

________________________________________________________________________

Q67.

/*

*******
     *
    *
   *
  *
 *
*******


*/

public class pattern67
{
    public static void main(String[] args)
    {
        
       for(int i=0; i<7; i++)
       {
        for(int j=0; j<7; j++)
        {
            if(i==0 || i==6 || j+i==6)
            System.out.print("*");
            else
            System.out.print(" ");
         }
        System.out.println();
       }
    }
}

________________________________XXXOXXX________________________________________


	

    


