package com.bhavish.spring_boot_rest;
import com.bhavish.spring_boot_rest.model.JobPost;
import com.bhavish.spring_boot_rest.service.JobService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin(origins = "http://localhost:3000")
public class JobRestController {

    @Autowired
    private JobService service;

    @GetMapping("jobPosts")
    public List<JobPost> getAllJobs(){
        return service.getAlljobs();
    }

    @GetMapping("jobPost/{postId}")
    public JobPost getAllJobs(@PathVariable("postId") int postId){
        return service.getjob(postId);
    }

    @PostMapping(path = "addJob", produces = {"application/xml"})
    public JobPost addJob(@RequestBody JobPost job){
        service.addJob(job);
        return service.getjob(job.getPostId());
    }

//    @PutMapping(path = "updateJob", consumes = {"application/xml"})
    @PutMapping("updateJob")
    public JobPost updateJob(@RequestBody JobPost job){
        service.updateJob(job);
        return service.getjob(job.getPostId());
    }

    @DeleteMapping("delete/{postId}")
    public JobPost deleteJob(@PathVariable int postId){
        JobPost jobdelete = service.getjob(postId);
        service.deleteJob(postId);
        return jobdelete;
    }

}
