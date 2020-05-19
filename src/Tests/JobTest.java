package Tests;

import org.junit.Before;
import org.junit.Test;
import org.launchcode.techjobs_oo.*;

import static org.junit.Assert.*;

public class JobTest {

    Job webDev;
    Job backEndDev;
    Job job;
    Job job2;
    Job job3;
    Job job4;

    @Before
    public void createJobObject(){
        webDev = new Job();
        backEndDev = new Job();
        job = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));
        job2 = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));
    }


    @Test
    public void testSettingJobId(){
        assertFalse(webDev.getId() == backEndDev.getId());
    }

    @Test
    public void testJobConstructorSetsAllFields(){
        assertEquals("ACME", job.getEmployer().getValue());
        assertEquals("Product tester", job.getName());
        assertEquals("Desert", job.getLocation().getValue());
        assertEquals("Quality control", job.getPositionType().getValue());
        assertEquals("Persistence", job.getCoreCompetency().getValue());
    }

    @Test
    public void testJobsForEquality(){
        assertFalse(job.equals(job2));
    }

//    //toString tests
    @Test
    public void testForBlankSpaces(){
        assertTrue(job.toString().startsWith("\n") && job.toString().endsWith("\n"));
    }
    @Test
    public void testForDataLabels(){
        assertEquals(job.toString(), ("\n" +
                "ID: " + job.getId() + "\n" +
                "Name: Product tester" + "\n" +
                "Employer: ACME" + "\n" +
                "Location: Desert" + "\n" +
                "Position Type: Quality control" + "\n" +
                "Core Competency: Persistence" + "\n"));
    }
    @Before
    public void createJob2(){
        Employer e = new Employer("");
        Location l = new Location("");
        PositionType p = new PositionType("");
        CoreCompetency c = new CoreCompetency("");
        job3 = new Job("Slacker", e, l, p, c);
        job4 = new Job("",e,l,p,c);
    }
    @Test
    public void checkForEmptyField(){
        createJob2();
        assertTrue(job3.toString().contains("Data not available"));
    }
    @Test
    public void onlyIDFieldFails(){
        assertTrue(job4.toString().contains("OOPS! This job does not seem to exist."));
    }
}
