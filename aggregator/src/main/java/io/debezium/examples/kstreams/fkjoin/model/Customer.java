package io.debezium.examples.kstreams.fkjoin.model;

public class Customer {
    public String _id;
    public String first_name;
    public String last_name;
    public String email;
    @Override
    public String toString() {
        return "Customer [_id=" + _id  + ", first_name=" + first_name + ", last_name=" + last_name + ", email=" + email
                + "]";
    }
}
