package com.bhavish.JobApp.service;

import com.bhavish.JobApp.model.JobPost;
import com.bhavish.JobApp.repo.JobRepo;
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
}

