package com.javatpoint.controller.topic;
import java.util.Arrays;
import java.util.List;
import java.util.ArrayList;
import org.springframework.stereotype.Service;
@Service
public class TopicService {
    private  List<Topic>topics = new ArrayList<> (Arrays.asList(
                new Topic("Spring101", "SpringBoot","This is Spring Boot"),
                new Topic("Java101", "Java","This is Java"),
                new Topic("Microprocessor", "Microprocessor","This is Microprocessor")
    ));
    public List<Topic> getAllTopics()
    {
        return topics;
    }
    public Topic getTopic(String topicId)
    {
        Topic t = null ;
        for(Topic top: topics)
        {
            if(top.getId().equals(topicId))
            {
                t = top; break;
            }
        }
        return t;
    }
    public Topic addTopic(Topic t1)
    {
        topics.add(t1);
        return t1;
    }
    public Topic updateTopic(String topicId , Topic t2)
    {
        for(int i=0; i<topics.size();i++)
        {
            Topic t = topics.get(i);
            if(t.getId().equals(topicId))
            {
                topics.set(i,t2);
                break;
            }
        }
        return t2;
    }
    public String deleteTopic(String topicId)
    {
        topics.removeIf(t -> t.getId().equals(topicId));
        return ("topic deleted");

    }

}
