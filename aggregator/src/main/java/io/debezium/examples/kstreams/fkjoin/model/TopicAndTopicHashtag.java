package io.debezium.examples.kstreams.fkjoin.model;

public class TopicAndTopicHashtag {
    public Topic topic;
    public TopicHashtag topichashtag;

    public TopicAndTopicHashtag() {
    }

    public TopicAndTopicHashtag(TopicHashtag topichashtag, Topic topic) {
        this.topichashtag = topichashtag;
        this.topic = topic;
    }

    public static TopicAndTopicHashtag create(TopicHashtag topichashtag, Topic topic) {
        return new TopicAndTopicHashtag(topichashtag, topic);
    }

    public TopicHashtag topichashtag() {
        return topichashtag;
    }

    @Override
    public String toString() {
        return "TopicAndTopicHashtag [topichashtag=" + topichashtag + ", topic=" + topic + "]";
    }
}
