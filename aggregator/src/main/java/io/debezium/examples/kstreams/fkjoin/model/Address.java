package io.debezium.examples.kstreams.fkjoin.model;

public class Address {
    public String _id;
    public String customer_id;
    public String street;
    public String city;
    public String zipcode;
    public String country;

    @Override
    public String toString() {
        return "Address [_id=" + _id  + ", customer_id=" + customer_id + ", street=" + street + ", city=" + city
                + ", zipcode=" + zipcode + ", country=" + country + "]";
    }
}
