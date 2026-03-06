package com.bhavish.spring_boot_rest.repo;

import com.bhavish.spring_boot_rest.model.JobPost;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Repository
public class JobRepo {
    List<JobPost> jobs = new ArrayList<>(Arrays.asList(
            new JobPost(1, "Java Developer", "Develop and maintain Spring Boot applications", 3, Arrays.asList("Java", "Spring Boot", "Hibernate", "MySQL")),
            new JobPost(2, "Frontend Developer", "Build responsive UI using React", 2, Arrays.asList("HTML", "CSS", "JavaScript", "React")),
            new JobPost(3, "Full Stack Developer", "Work on both backend and frontend systems", 4, Arrays.asList("Java", "Spring Boot", "React", "MongoDB")),
            new JobPost(4,"DevOps Engineer","Manage CI/CD pipelines and cloud deployment", 5,Arrays.asList("Docker", "Kubernetes", "AWS", "Jenkins")),
            new JobPost(5,"Data Analyst","Analyze business data and generate reports", 2, Arrays.asList("Python", "SQL", "Power BI", "Excel"))
    ));
    public List<JobPost> getAllJobs(){
        return jobs;
    }

    public void addJob(JobPost jobpost){
        jobs.add(jobpost);
        System.out.println(jobs);
    }

    public JobPost getJob(int PostId){
        for(JobPost job: jobs){
            if(job.getPostId() == PostId){
                return job;
            }
        }
        return null;
    }

    public void updateJob(JobPost job){
        for(JobPost jobpost : jobs){
            if(jobpost.getPostId() == job.getPostId()){
                jobpost.setPostDesc(job.getPostDesc());
                jobpost.setPostProfile(job.getPostProfile());
                jobpost.setReqExperience(job.getReqExperience());
                jobpost.setPostTechStack(job.getPostTechStack());
            }
        }
    }

    public void deleteJob(int postId) {
        jobs.removeIf(job -> job.getPostId() == postId);
    }
}
