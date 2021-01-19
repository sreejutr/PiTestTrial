package org.ssoft.trial.pitest.test;

import org.junit.Assert;
import org.junit.Test;
import org.ssoft.trial.pitest.HelloWorld;


public class HelloWorldTest {

  @Test
   public void testAddOne(){
     HelloWorld hw = new HelloWorld();
     Assert.assertEquals(hw.addOne(1),2);
   }
}
