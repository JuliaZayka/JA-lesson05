package ua.lviv;

import java.util.Set;
import java.util.TreeSet;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.TestWatcher;


public class ScheduleTest {

	@SuppressWarnings("unused")
	private Schedule schedule;
	
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
	public void beforeTest() {
		schedule = new Schedule();
	}

	@After
	public void afterTest() {
		schedule = null;
	}
	
	@Test
	public void addSeanceTest() throws MyException{
		Time duration = new Time(1,20);
		Time startTime = new Time(10,30);
		Movie movie = new Movie("New", duration);
		Seance seance = new Seance(movie, startTime);
		Set<Seance> seancesExpected = new TreeSet<>();
		seancesExpected.add(seance);
		Schedule.addSeance(seance);
		
		Assert.assertEquals(seancesExpected, Schedule.seances);
	}

}
