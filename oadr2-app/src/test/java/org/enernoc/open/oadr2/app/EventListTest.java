package org.enernoc.open.oadr2.app;

import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Locale;
import java.util.TimeZone;

import javax.xml.datatype.DatatypeConfigurationException;
import javax.xml.datatype.DatatypeFactory;
import javax.xml.datatype.XMLGregorianCalendar;

import org.junit.Test;

/*
 * Description: This code is to show as an example the comparison between Date/Time
 * objects. Will end up using Comparator into Priority Queue to order events during
 * runtime
 */
public class EventListTest {

   @Test
   public void eventListTest() throws DatatypeConfigurationException {
	   DatatypeFactory fac = DatatypeFactory.newInstance();

      // This code block creates specifies date and time of when the event
      // starts
      final GregorianCalendar cal = (GregorianCalendar) Calendar.getInstance(
            TimeZone.getTimeZone("America/Los_Angeles"), Locale.US);
      // parameters: year, month, date, hour, minute, second
      cal.set(2013, Calendar.MAY, 31, 17, 35, 55);
      XMLGregorianCalendar startdt = fac.newXMLGregorianCalendar(cal);
      System.out.println(startdt);

      // This commented block retrieves all possible ID inputs to timezone
      /*
       * String[] tz = TimeZone.getAvailableIDs(); for(int i = 0; i < tz.length;
       * i++) { System.out.println(TimeZone.getAvailableIDs()[i]); }
       */

      // This code block implements a way to retrieve a Comparable object
      GregorianCalendar gc = startdt.toGregorianCalendar(
            TimeZone.getTimeZone("America/Phoenix"), Locale.US, startdt);
      System.out.println(gc);

      GregorianCalendar gc1 = (GregorianCalendar) Calendar.getInstance(
            TimeZone.getTimeZone("America/Los_Angeles"), Locale.US);
      GregorianCalendar gc2 = (GregorianCalendar) Calendar.getInstance(
            TimeZone.getTimeZone("America/Los_Angeles"), Locale.US);
      gc2.set(2013, Calendar.DECEMBER, 23, 05, 41, 50);
      
      System.out.println(gc1.getTime().toString());
      System.out.println(gc2.getTime().toString());
      System.out.println(gc1.compareTo(gc2));

   }
}
