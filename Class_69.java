/*
 
     Date handling: Enter a year and a reference day and print the 
     respective date from the following year. 
     
     Check whether the year is a leap year or not. 
     If the reference day exceeds 366, print the message "invalid".
     
     
     Eg: 
     
     Year: 2016
     Reference day: 28
     Date : 28/1/2016
     
     Year: 2009
     Reference day: 34
     Date : 3/2/2009
     
     
     Month    Days in Month    Cumulative Days (Leap Year)    Cumulative Days (Non-Leap Year)
     
    January         31                        31                             31
    February      29/28                       60                             59
     March          31                        91                             90
     April          30                        121                            120
      May           31                        152                            151
     June           30                        182                            181
     July           31                        213                            212
    August          31                        244                            243
   September        30                        274                            273
    October         31                        305                            304
    November        30                        335                            334
    December        31                        366                            365
 
 */
import java.util.*;
public class Class_69
{
    public static void main()
    {
        Scanner sc = new Scanner (System.in);
        System.out.println("Enter a year: "); //User inputting a year.
        int year = sc.nextInt();
        System.out.println("Enter the reference day: "); //User inputting a reference day.
        int ref_day = sc.nextInt();
        if(year > 0) //Checks if the entered year is valid.
        {
            if(year % 4 == 0) //Checks if the entered year is a leap year.
            {
                if(ref_day > 0 && ref_day <= 366) //Checks if the entered reference day is valid for a leap year.
                {
                    calculate1(year,ref_day);
                }
                else
                {
                    System.out.println("Invalid input.");
                }
            }
            else
            {
                if(ref_day > 0 && ref_day <= 365) //Checks if the entered reference day is valid for a non-leap year.
                {
                    calculate2(year,ref_day);
                }
                else
                {
                    System.out.println("Invalid input.");
                }
            }
        }
        else
        {
            System.out.println("Invalid input.");
        }
    }
    public static void calculate1(int year, int ref_day) //Leap year.
    {
        if(ref_day <= 31) //January
        {
            System.out.println("Date :"+ref_day+"-1-"+year); 
        }
        else if(ref_day <= 60) //February 
        {
            System.out.println("Date :"+(ref_day-31)+"-2-"+year);
        }
        else if(ref_day <= 91) //March 
        {
            System.out.println("Date :"+(ref_day-60)+"-3-"+year);
        }
        else if(ref_day <= 121) //April 
        {
            System.out.println("Date :"+(ref_day-91)+"-4-"+year);
        }
        else if(ref_day <= 152) //May 
        {
            System.out.println("Date :"+(ref_day-121)+"-5-"+year);
        }
        else if(ref_day <= 182) //June 
        {
            System.out.println("Date :"+(ref_day-152)+"-6-"+year);
        }
        else if(ref_day <= 213) //July 
        {
            System.out.println("Date :"+(ref_day-182)+"-7-"+year);
        }
        else if(ref_day <= 244) //August 
        {
            System.out.println("Date :"+(ref_day-213)+"-8-"+year);
        }
        else if(ref_day <= 274) //September 
        {
            System.out.println("Date :"+(ref_day-244)+"-9-"+year);
        }
        else if(ref_day <= 305) //October 
        {
            System.out.println("Date :"+(ref_day-274)+"-10-"+year);
        }
        else if(ref_day <= 335) //November
        {
            System.out.println("Date :"+(ref_day-305)+"-11-"+year);
        }
        else //December 
        {
            System.out.println("Date :"+(ref_day-335)+"-12-"+year);
        }
    }
    public static void calculate2(int year, int ref_day) //Not a leap year.
    {
        if(ref_day <= 31) //January
        {
            System.out.println("Date :"+ref_day+"-1-"+year); 
        }
        else if(ref_day <= 59) //February 
        {
            System.out.println("Date :"+(ref_day-31)+"-2-"+year);
        }
        else if(ref_day <= 90) //March 
        {
            System.out.println("Date :"+(ref_day-59)+"-3-"+year);
        }
        else if(ref_day <= 120) //April 
        {
            System.out.println("Date :"+(ref_day-90)+"-4-"+year);
        }
        else if(ref_day <= 151) //May 
        {
            System.out.println("Date :"+(ref_day-120)+"-5-"+year);
        }
        else if(ref_day <= 181) //June 
        {
            System.out.println("Date :"+(ref_day-151)+"-6-"+year);
        }
        else if(ref_day <= 212) //July 
        {
            System.out.println("Date :"+(ref_day-181)+"-7-"+year);
        }
        else if(ref_day <= 243) //August 
        {
            System.out.println("Date :"+(ref_day-212)+"-8-"+year);
        }
        else if(ref_day <= 273) //September 
        {
            System.out.println("Date :"+(ref_day-243)+"-9-"+year);
        }
        else if(ref_day <= 304) //October 
        {
            System.out.println("Date :"+(ref_day-273)+"-10-"+year);
        }
        else if(ref_day <= 334) //November
        {
            System.out.println("Date :"+(ref_day-304)+"-11-"+year);
        }
        else //December 
        {
            System.out.println("Date :"+(ref_day-334)+"-12-"+year);
        }
    }
}