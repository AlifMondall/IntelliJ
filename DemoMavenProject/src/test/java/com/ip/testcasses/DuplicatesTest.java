package com.ip.testcasses;


import com.ip.programs.Duplicates;
import org.junit.Assert;
import org.junit.Test;


public class DuplicatesTest {
    @Test
    public void testNormalDuplicates() {

        Assert.assertEquals(Duplicates.getDuplicates("AABBCC"), "ABC");
    }

    @Test
    public void testNoDuplicates() {

        Assert.assertEquals(Duplicates.getDuplicates("ABC"),"");
    }

    @Test
    public void testFirstDuplicates() {

        Assert.assertEquals(Duplicates.getDuplicates("AABC"), "A");
    }

    @Test
    public void testLastDuplicates() {
        String act=Duplicates.getDuplicates("ABCC");
        String exp="C";
        Assert.assertEquals(act, exp);
    }

    @Test
    public void testNullString() {

        Assert.assertNull(Duplicates.getDuplicates(null));
    }

    @Test
    public void testEmptyString() {
        String actual=Duplicates.getDuplicates("");

        Assert.assertNull(actual);
    }

    @Test
    public void testSingleCharString() {

        Assert.assertEquals(Duplicates.getDuplicates("A"),"");
    }

    @Test
    public void testCaseSensitiveString() {

        Assert.assertEquals(Duplicates.getDuplicates("AabbCc"), "b");
    }
}
