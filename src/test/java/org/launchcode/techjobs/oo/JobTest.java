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

    @Test
    public void testToStringStartsAndEndsWithNewLine() {
// tests that the toString method starts and ends with a new line
        // use the System.lineSeparator() method
        Job productTester= new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));
        assertEquals(System.lineSeparator(),productTester.toString());

    }

    @Test
    public void testToStringContainsCorrectLabelsAndData(){
        Job productTester= new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));
assertTrue(productTester.toString().contains("Name: Product tester"));
assertTrue(productTester.toString().contains("Employer: ACME"));
assertTrue(productTester.toString().contains("Location: Desert"));
assertTrue(productTester.toString().contains("Position Type: Quality control"));
assertTrue(productTester.toString().contains("Core Competency: Persistence"));
    }

    @Test
    public void testToStringHandlesEmptyField(){
    // if the field is empty, method should add "Data not available" after label
        Job productTesterTwo= new Job("Product tester",new Employer(), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));
        assertTrue(productTesterTwo.toString().contains("Employer: Data not Available"));
    }
}
