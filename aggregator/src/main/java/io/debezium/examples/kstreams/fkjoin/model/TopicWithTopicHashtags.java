package io.debezium.examples.kstreams.fkjoin.model;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Collectors;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class TopicWithTopicHashtags {

    private static final Logger LOGGER = LoggerFactory.getLogger(TopicWithTopicHashtags.class);

    public Topic itopic;
    public List<TopicHashtag> topic_hashtags = new ArrayList<>();

    public TopicWithTopicHashtags addTopicHashtag(TopicAndTopicHashtag topic_hashtag) {
        LOGGER.info("Adding: " + topic_hashtag);

        Iterator<TopicHashtag> it = topic_hashtags.iterator();
        while (it.hasNext()) {
            TopicHashtag a = it.next();
            if (new String(a._id).equals(topic_hashtag.topichashtag._id)) {
                it.remove();
            }
        }

        itopic = topic_hashtag.topic;
        topic_hashtags.add(topic_hashtag.topichashtag);

        return this;
    }

    public TopicWithTopicHashtags removeTopicHashtag(TopicAndTopicHashtag topic_hashtag) {
        LOGGER.info("Removing: " + topic_hashtag);

        Iterator<TopicHashtag> it = topic_hashtags.iterator();
        while (it.hasNext()) {
            TopicHashtag a = it.next();
            if (new String(a._id).equals(topic_hashtag.topichashtag._id)) {
                it.remove();
            }
        }

        return this;
    }

    @Override
    public String toString() {
        return "TopicWithTopicHashtags [topic=" + itopic + ", topicHashtags=" + topic_hashtags + "]";
    }
}
