import java.util.Scanner;
class FlamesTest
{
 int i;
 int j;
 char round2[]=new char[4];
 char round3[]=new char[3];
 char round4[]=new char[2];
 char round5[]=new char[1];



//round1*******************************
 public void roundOne(char flames[],char round1[],int count)
 {
  
  if(count<=flames.length)
  {
   //round 1

     int len=flames.length-1;
     int j=0;
     for(i=count;i<flames.length;i++)
     {
      round1[j]=flames[i];
      j++;
      System.out.println(round1[j]);
     }
     j=0;
     for(int i=0;i<len;i++)
     {
      if(round1[i]=='\u0000')
      {
       round1[i]=flames[j]; 
       j++;
      }
     }
     
  }
  else
  {
   //System.out.println("5!!");
   int elseCount=count%6;
   if(elseCount==0)
   {
     int j=0;
     for(int i=0;i<5;i++)
     {
      if(round1[i]=='\u0000')
      {
       round1[i]=flames[j]; 
       j++;
      }
     }
   }
   else
   {
    int len=flames.length-1;
     int j=0;
     for(int i=elseCount;i<flames.length;i++)
     {
      round1[j]=flames[i];
      j++;
     }
     j=0;
     for(int i=0;i<len;i++)
     {
      if(round1[i]=='\u0000')
      {
       round1[i]=flames[j]; 
       j++;
      }
     }
   }
  }
  for(int i=0;i<5;i++)
  {
   //System.out.println(round1[i]);
  }
  roundTwo(flames,round1,count); 
 }






 //****************round222
 public void roundTwo(char flames[],char round1[],int count)
 {
  if(count<=round1.length)
  {
   j=0;
   for(i=count;i<round1.length;i++)
   { 
    round2[j]=round1[i];
    j++;
   }
   j=0;
   for(i=0;i<4;i++)
   {
    if(round2[i]=='\u0000')
    {
     round2[i]=round1[j];
     j++;
    }
   }
  }
  else
  {
   int elseCount=count%5;
   if(elseCount==0)
   {
     int j=0;
     for(int i=0;i<4;i++)
     {
      if(round2[i]=='\u0000')
      {
       round2[i]=round1[j]; 
       j++;
      }
     }
   }
   else
   {
     int len=round1.length-1;
     int j=0;
     for(int i=elseCount;i<round1.length;i++)
     {
      round2[j]=round1[i];
      j++;
     }
     j=0;
     for(int i=0;i<len;i++)
     {
      if(round2[i]=='\u0000')
      {
       round2[i]=round1[j]; 
       j++;
      }
     }
   }
  }
  //System.out.println("round2");
  for(i=0;i<round2.length;i++)
  {
   //System.out.println(round2[i]);
  }
  roundThree(flames,round2,count);
 }






//&&&&&&&&&&&&&round3
 public void roundThree(char flames[],char round2[],int count)
 {
  if(count<=round2.length)
  {
   j=0;
   for(i=count;i<round2.length;i++)
   { 
    round3[j]=round2[i];
    j++;
   }
   j=0;
   for(i=0;i<3;i++)
   {
    if(round3[i]=='\u0000')
    {
     round3[i]=round2[j];
     j++;
    }
   }
  }
  else
  {
   int elseCount=count%4;
   if(elseCount==0)
   {
     int j=0;
     for(int i=0;i<3;i++)
     {
      if(round3[i]=='\u0000')
      {
       round3[i]=round2[j]; 
       j++;
      }
     }
   }
   else
   {
     int len=round2.length-1;
     int j=0;
     for(int i=elseCount;i<round2.length;i++)
     {
      round3[j]=round2[i];
      j++;
     }
     j=0;
     for(int i=0;i<len;i++)
     {
      if(round3[i]=='\u0000')
      {
       round3[i]=round2[j]; 
       j++;
      }
     }
   }
  }
  //System.out.println("round3");
  for(i=0;i<round3.length;i++)
  {
   //System.out.println(round3[i]);
  }
  roundFour(flames,round3,count);
 }





//round4^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^
 public void roundFour(char flames[],char round3[],int count)
 {
  if(count<=round3.length)
  {
   j=0;
   for(i=count;i<round3.length;i++)
   { 
    round4[j]=round3[i];
    j++;
   }
   j=0;
   for(i=0;i<2;i++)
   {
    if(round4[i]=='\u0000')
    {
     round4[i]=round3[j];
     j++;
    }
   }
  }
  else
  {
   int elseCount=count%3;
   if(elseCount==0)
   {
     int j=0;
     for(int i=0;i<2;i++)
     {
      if(round4[i]=='\u0000')
      {
       round4[i]=round3[j]; 
       j++;
      }
     }
   }
   else
   {
     int len=round3.length-1;
     int j=0;
     for(int i=elseCount;i<round3.length;i++)
     {
      round4[j]=round3[i];
      j++;
     }
     j=0;
     for(int i=0;i<len;i++)
     {
      if(round4[i]=='\u0000')
      {
       round4[i]=round3[j]; 
       j++;
      }
     }
   }
  }
  //System.out.println("round4");
  for(i=0;i<round4.length;i++)
  {
   //System.out.println(round4[i]);
  }
  roundFive(flames,round4,count);
 }






//****************5555555
 public void roundFive(char flames[],char round4[],int count)
 {
  if(count<=round4.length)
  {
   j=0;
   for(i=count;i<round4.length;i++)
   { 
    round5[j]=round4[i];
    j++;
   }
   j=0;
   for(i=0;i<1;i++)
   {
    if(round5[i]=='\u0000')
    {
     round5[i]=round4[j];
     j++;
    }
   }
  }
  else
  {
   int elseCount=count%2;
   if(elseCount==0)
   {
     int j=0;
     for(int i=0;i<1;i++)
     {
      if(round5[i]=='\u0000')
      {
       round5[i]=round4[j]; 
       j++;
      }
     }
   }
   else
   {
     int len=round4.length-1;
     int j=0;
     for(int i=elseCount;i<round4.length;i++)
     {
      round5[j]=round4[i];
      j++;
     }
     j=0;
     for(int i=0;i<len;i++)
     {
      if(round5[i]=='\u0000')
      {
       round5[i]=round4[j]; 
       j++;
      }
     }
   }
  }
  //System.out.println("round5");
  //System.out.println(round5.length);
  for(i=0;i<round5.length;i++)
  {
   //System.out.println(round5[i]);
  }
  if((round5.length)==1)
  {
   
   if(round5[0]=='F')
   {
    System.out.println("^^__^^__^^__^^__^^__^^__ F.R.I.E.N.D.S ^^__^^__^^__^^__^^__^^__");
   }
   if(round5[0]=='L')
   {
    System.out.println("^^__^^__^^__^^__^^__^^__ L.O.V.E.R.S ^^__^^__^^__^^__^^__^^__");
   }
   if(round5[0]=='A')
   {
    System.out.println("^^__^^__^^__^^__^^__^^__ A.F.F.E.C.T.I.O.N ^^__^^__^^__^^__^^__^^__");
   }
   if(round5[0]=='M')
   {
    System.out.println("^^__^^__^^__^^__^^__^^__ M.A.R.R.I.G.E ^^__^^__^^__^^__^^__^^__");
   }
   if(round5[0]=='E')
   {
    System.out.println("^^__^^__^^__^^__^^__^^__ E.N.E.M.I.E.S ^^__^^__^^__^^__^^__^^__");
   }
   if(round5[0]=='S')
   {
    System.out.println("^^__^^__^^__^^__^^__^^__ S.I.S.T.E.R ^^__^^__^^__^^__^^__^^__");
   }
  }
  
 }







//*******************************
 public static void main(String ar[])
 {
  System.out.println("$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$");
  System.out.println("___________________________________________________________");
  System.out.println("!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!");
  System.out.println("$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$");
  System.out.println("___________________________________________________________");
  System.out.println("");
  System.out.println("");
  System.out.println("");
  System.out.println("****************F_L_A_M_E_S****************");
  Scanner s=new Scanner(System.in);
  for(int i=0;i<3;i++)
  {
   System.out.println(" ");
  }


  //first name
  System.out.println("**************Enter First Name**************");
  String first=s.nextLine();

  //converting the String to LowerCase Characters Bcoz user may enter in Capital and Small Letters and may lead to misscount.
  first=first.toLowerCase();

  //Removing all single line blank spaces so that it does'nt lead to misscount.
  //here "\\s" means single space in unicode.
  first=first.replaceAll("\\s","");
  char he[]=first.toCharArray();
  /*for(int i=0;i<he.length;i++)
  {
   System.out.println(he[i]);
  }*/
  for(int i=0;i<3;i++)
  {
   System.out.println(" ");
  }


  //second name
  System.out.println("**************Enter Second Name**************");
  String second=s.nextLine();
  second=second.toLowerCase();
  second=second.replaceAll("\\s","");
  char she[]=second.toCharArray();
  /*for(int i=0;i<she.length;i++)
  {
   System.out.println(she[i]);
  }*/



  //checking the characters that are matching in both(i,e in he & she String) 
  //if found change that character to '1'
  //so it will be helpfull while counting the total number of mismatch characters inn both strings
  char repeat=1;
  char swapshe;
  char swaphe;
  int count=0;
  aa:
   for(int i=0;i<he.length;i++)
   {
    bb:
     for(int j=0;j<she.length;j++)
     {
      if(he[i]==she[j])
      {
       swapshe=she[j];
       she[j]=repeat;
       swaphe=he[i];
       he[i]=repeat;
       continue aa;
      }
     }
   }



  //counting the characters that are mismatch of 'he String'

  //instead of (he[i]!=repeat) i can use (he[i]!='1')
  //but it is wrong to use he[i]!='1' bcoz acc to unicode the value of 1 looks like ?
  //So that is reason we use repeat instead of '1';
  //if you still cant understand print repeat and print he[]
  for(int i=0;i<he.length;i++)
  {
   if((he[i]!=repeat)&&(he[i]!='\u0000'))
   {
    count++;
   }
  }


  //counting the characters that are mismatch of 'she String'
  for(int i=0;i<she.length;i++)
  {
   if((she[i]!=repeat)&&(she[i]!='\u0000'))
   {
    count++;
   }
  }



  System.out.println("__________________________________________________________");
  System.out.println(" ");
  System.out.println(" ");
  System.out.println("*************Match Count: "+count+"*************");
  System.out.println(" ");
  System.out.println(" ");
  //System.out.println(" ");
  System.out.println(" ");
  System.out.println("^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^ ");
  System.out.println("___________________________________________________________ ");
  System.out.println(" ");
  System.out.println("^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^");
  String df="FLAMES";
  char flames[]=df.toCharArray();
  FlamesTest ft = new FlamesTest();
  char round1[]=new char[5];
  if(count==1)
  {
   System.out.println("S.I.S.T.E.R");
  }
  //System.out.println("!!");
  else
  {
   ft.roundOne(flames,round1,count);
  }			
 }
}