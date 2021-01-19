package org.ssoft.trial.pitest.test;
import org.junit.runners.Suite;
import org.junit.runner.RunWith;
import org.ssoft.trial.pitest.test.HelloWorldTest;

@RunWith(Suite.class)
@Suite.SuiteClasses({
    HelloWorldTest.class,
})

public class AllTests {

}