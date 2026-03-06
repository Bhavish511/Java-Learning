package com.bhavish.spring_boot_rest.service;


import com.bhavish.spring_boot_rest.model.JobPost;
import com.bhavish.spring_boot_rest.repo.JobRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class JobService {

    @Autowired
    private JobRepo repo;

    public void addJob(JobPost job){
        repo.addJob(job);
    }

    public List<JobPost> getAlljobs(){
        return repo.getAllJobs();
    }
    public JobPost getjob(int PostId){
        return repo.getJob(PostId);
    }

    public void updateJob(JobPost job){
        repo.updateJob(job);
    }

    public void deleteJob(int postId) {

        repo.deleteJob(postId);
    }
}

