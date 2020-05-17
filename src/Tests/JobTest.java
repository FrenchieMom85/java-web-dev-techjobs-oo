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
        assertEquals("ACME", job.getEmployer(), job.getEmployer());
        assertEquals("Product tester", job.getName());
        assertEquals("Desert", job.getLocation(), job.getLocation());
        assertEquals("Quality control", job.getPositionType(), job.getPositionType());
        assertEquals("Persistence", job.getCoreCompetency(), job.getCoreCompetency());
    }

    @Test
    public void testJobsForEquality(){
        assertFalse(job.equals(job2));
    }


}
