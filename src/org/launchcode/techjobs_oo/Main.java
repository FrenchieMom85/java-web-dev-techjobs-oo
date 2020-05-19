package org.launchcode.techjobs_oo;

public class Main {

    public static void main(String[] args) {
        Job job1 = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));
//        Job job2 = new Job("Web Developer", new Employer("LaunchCode"), new Location("St. Louis"), new PositionType("Front-end developer"), new CoreCompetency("JavaScript"));
//        Job job3 = new Job("Ice cream taster", new Employer(""), new Location("Home"), new PositionType("UX"), new CoreCompetency("Taste"));
        Employer e = new Employer("");
        Location l = new Location("");
        PositionType p = new PositionType("");
        CoreCompetency c = new CoreCompetency("");
        Job job4 = new Job("",e,l,p,c);
//        ArrayList<Job> jobs = new ArrayList<>();
//        jobs.add(job1);
//        jobs.add(job2);
//        jobs.add(job3);
//
//        for (Job job : jobs){
//            System.out.println(job);
//        }

        System.out.println(job1.toString());
    }

}
