/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.celestial.simplemavenwebapp;

import java.sql.Time;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 *
 * @author selvy_000
 */
public class TimeAndDateHandler
{
    private Date    theDate;
    private Time    theTime;
    private long    milliSecs;


    //returns the current date, printing out it out to the command line as it does so
    public  String  getDate()
    {
        DateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
        theDate = new Date();
        System.out.println(dateFormat.format(theDate));
        return dateFormat.format(theDate);
    }

      //returns the current time, printing it out
    public  String  getTime()
    {
        DateFormat dateFormat = new SimpleDateFormat("HH:mm");
        theDate = new Date();
        System.out.println(dateFormat.format(theDate));
        return dateFormat.format(theDate);

    }

    //main method, gets the date and time
    public static void main( String[] args )
    {
        TimeAndDateHandler tadh = new TimeAndDateHandler();

        tadh.getDate();
        tadh.getTime();
    }
}
