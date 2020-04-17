package com.ip.testcasses;

import com.ip.programs.SecondLargest;
import org.junit.Assert;
import org.junit.Test;

public class SecondLargestTest {

    static SecondLargest s=null;

    @Test
    public void test1() {
        s=new SecondLargest();
        int a[]= {1,3,5,6,4,7,34,10,5,0,-2,11};
        int actual=	s.findLargest(a);
        Assert.assertEquals(actual,11 );
    }
    @Test
    public void test2() {
        s=new SecondLargest();
        int a1[]= {4,7,34,10,5,0,-2,11};
        int actual=	s.findLargest(a1);
        int expected=s.findLargest(a1);
        Assert.assertEquals(actual,expected );
    }
    @Test
    public void test3()
    {
        s=new SecondLargest();
        int a1[]= {4,7,34,10,5,0,-2,11};
        int actual=	s.findLargest(a1);
        int expected=s.findLargest(a1);

    }
}
