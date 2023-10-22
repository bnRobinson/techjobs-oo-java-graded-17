package org.launchcode.techjobs.oo;

import org.junit.Test;

import java.lang.annotation.Target;

import static org.junit.Assert.*;

public class JobTest {
    //TODO: Create your unit tests here
@Test
    public void testSettingJobID(){
    Job testDeveloper= new Job();
    Job testDeveloperTwo= new Job();

    assertNotEquals(testDeveloper.getId(), testDeveloperTwo.getId());
    }
    @Test
    public void testJobConstructorSetsAllFields(){
        Job productTester= new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));
        assertEquals("Product tester", productTester.getName());
        assertEquals("ACME", productTester.getEmployer().getValue());
        assertEquals("Desert", productTester.getLocation().getValue());
        assertEquals("Quality control", productTester.getPositionType().getValue());
        assertEquals("Persistence", productTester.getCoreCompetency().getValue());
        assertTrue(productTester.getName() instanceof String);
        assertTrue(productTester.getEmployer() instanceof Employer);
        assertTrue(productTester.getLocation() instanceof Location);
        assertTrue(productTester.getPositionType() instanceof PositionType);
        assertTrue(productTester.getCoreCompetency() instanceof CoreCompetency);

    }

    @Test
    public void testJobsForEquality(){
    Job testJobOne= new Job("Test", new Employer("Boeing"), new Location("St. Louis"), new PositionType("Intern"), new CoreCompetency("JavaScript") );
    Job testJobTwo= new Job("Test", new Employer("Boeing"), new Location("St. Louis"), new PositionType("Intern"), new CoreCompetency("JavaScript"));

        assertNotEquals(testJobOne, testJobTwo);

    }
}
