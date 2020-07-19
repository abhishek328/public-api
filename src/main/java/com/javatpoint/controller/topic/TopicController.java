package com.javatpoint.controller.topic;
import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class TopicController {
    @Autowired
    private TopicService topicService;
    @GetMapping("/topics")
    public List<Topic> getAllTopics()
    {
        return topicService.getAllTopics();
    }
    @GetMapping ("/topics/{topicId}")
    public Topic getTopic(@PathVariable String topicId)
    {
        return topicService.getTopic(topicId);
    }


     @PostMapping(path = "/topics", consumes = "application/json ")
    //@RequestMapping(method=RequestMethod.POST, value = "/topics")
    public Topic addTopic(@RequestBody Topic topic)
    {
        return topicService.addTopic(topic);
    }
    @RequestMapping(method=RequestMethod.PUT, value = "/topics/{topicId}" )
    public Topic updatetopic (@RequestBody Topic topic , @PathVariable String topicId)
    {
        return topicService.updateTopic(topicId,topic);
    }
    @RequestMapping(method=RequestMethod.DELETE, value = "/topics/{topicId}" )
    public String deletetopic ( @PathVariable String topicId)
    {
        return topicService.deleteTopic(topicId);
    }


}
