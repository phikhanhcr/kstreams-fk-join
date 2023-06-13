package io.debezium.examples.kstreams.fkjoin.model;

public class TopicHashtag {
  public String _id;
  public String hash_tag_id;
  public String hash_tag_code;
  public String country;
  public String topic_id;
  public String topic_title;
  public Integer topic_level;
  public Integer priority;
  public String topic_lang;
  public Boolean is_public;

  @Override
  public String toString() {
    return "Topic [_id=" + _id + ", hash_tag_id=" + hash_tag_id + ", hash_tag_code=" + hash_tag_code + ", is_public="
        + is_public + ", country=" + country + ", topic_id=" + topic_id + ", topic_title=" + topic_title
        + ", topic_lang=" + topic_lang + ", topic_level=" + topic_level + "]";
  }
}
