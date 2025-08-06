package com.wipro.test;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;

@RunWith(Suite.class)
@Suite.SuiteClasses({
    TestSort.class,
    TestCheckPresence.class,
    TestStringConcate.class
})
public class AllTests {
    // No code needed here. This runs all the above test classes.
}

