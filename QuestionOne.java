//program to take a number as input and as the output concatenate the frequency of each repeating digit. if not repeating, leave it alone

import java.util.Scanner;
public class QuestionOne {
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number:");
        String x=sc.nextLine();
        System.out.println("The output is:");
        String nstr="";
        int l=x.length();
        if(l==1)
        {
            System.out.println(x);
        }
        for(int i=0;i<l-1;)
        {
            int j=0,count=1;
            char c=x.charAt(i);
            char d=x.charAt(i+1);
            if((int)c==(int)d)
            {
                j=i+2;
                count++;
                if(j<l)
                {
                    char check=x.charAt(j);
                    while((int)check==(int)c)
                    {
                        
                        count++;
                       
                        j++;
                        if(j<l)
                        check=x.charAt(j);
                        else 
                        break;
                        //i=i+2;
    
                    }

                }
               
                nstr+=count;

               
                i=i+count;
                
                if(i==l-1)
                {
                    nstr=nstr+x.charAt(l-1);
                }
            }
            else
            {
                nstr+=c;
                i++;
                if(i==l-1)
                {
                    nstr=nstr+x.charAt(l-1);
                }
            }
        }
        System.out.println(nstr);
    }
    
}