package ua.lviv;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.TestWatcher;

public class TimeTest {
	

@SuppressWarnings("unused")
private Time time, time2;

@Rule
public TestWatcher testWatcher = new TestWatcher() {
	protected void failed(Throwable e, org.junit.runner.Description description) {
		System.out.println("FAILED--> " + description.getMethodName());
	};

	protected void succeeded(org.junit.runner.Description description) {
		System.out.println("SUCCEED--> " + description.getMethodName());
	};
};

@Before
public void beforeTest() throws MyException {
	time = new Time(0,0);
	time2 = new Time(1,45);
}

@After
public void afterTest() {
	time = null;
}

@Test
public void plusTimeTest() throws MyException{
	
	Time time3 = time.plusTime(time2);
	
	Assert.assertEquals(time2.getHour(), time3.getHour());
}

@Test
public void plusTimeTest2() throws MyException{
	
	Time time3 = time.plusTime(time2);
	
	Assert.assertEquals(time2.getMin(), time3.getMin());
}

}
