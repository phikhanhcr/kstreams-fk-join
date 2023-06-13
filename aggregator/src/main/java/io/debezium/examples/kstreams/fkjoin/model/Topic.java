package io.debezium.examples.kstreams.fkjoin.model;

public class Topic {
  public String _id;
  public String title;
  public String content;
  public String image;
  public Boolean is_active;
  public String lang;
  public Integer type;
  public Integer level;

  @Override
  public String toString() {
    return "Topic [_id=" + _id + ", title=" + title + ", content=" + content + ", is_active=" + is_active
        + ", is_active=" + is_active + ", lang=" + lang + ", type=" + type + ", level=" + level
        + ", image=" + image + "]";
  }
}
