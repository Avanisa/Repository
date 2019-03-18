package com.qaagility.controller;

import org.junit.Test;
import static org.junit.Assert.assertEquals;
import com.qaagility.javaee.*;
 

public class AppTest {

Calculator myCalc = new Calculator();
Calcmul Calcmul = new Calcmul();

      public void testSlow() {
        System.out.println("slow");
      }

      public void testSlower() {
        System.out.println("slower");
      }

      public void testFast() {
        System.out.println("fast-updated");
      }
	
	@Test	
      public void testCalc() {
        assertEquals("Result", 9, myCalc.add(3,6));


	
      public void testcalcmul1 {
        assertEquals("Result", 9, Calcmul.mul());
      }

    }


