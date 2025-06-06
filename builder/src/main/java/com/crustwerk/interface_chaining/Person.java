package com.crustwerk.interface_chaining;

import java.util.Collections;
import java.util.List;

//interface chaining, mandatory firstName then lastName
public class Person {
    private final String firstName;
    private final List<String> middleNames;
    private final String lastName;
    private final String email;
    private final String phone;

    private Person(Builder builder) {
        this.firstName = builder.firstName;
        this.middleNames = builder.middleNames;
        this.lastName = builder.lastName;
        this.email = builder.email;
        this.phone = builder.phone;
    }

    public static FirstNameSetter builder() {
        return new Builder();
    }

    public String getFirstName() {
        return firstName;
    }

    public List<String> getMiddleNames() {
        return middleNames;
    }

    public String getLastName() {
        return lastName;
    }

    public String getEmail() {
        return email;
    }

    public String getPhone() {
        return phone;
    }

    public interface FirstNameSetter {
        LastNameSetter firstName(String firstName);
    }

    public interface LastNameSetter {
        OptionalFieldsSetter lastName(String lastName);
    }

    public interface OptionalFieldsSetter {
        OptionalFieldsSetter middleNames(List<String> middleNames);

        OptionalFieldsSetter email(String email);

        OptionalFieldsSetter phone(String phone);

        Person build();
    }

    private static class Builder implements FirstNameSetter, LastNameSetter, OptionalFieldsSetter {
        private String firstName;
        private List<String> middleNames = Collections.emptyList();
        private String lastName;
        private String email;
        private String phone;

        @Override
        public LastNameSetter firstName(String firstName) {
            this.firstName = firstName;
            return this;
        }

        @Override
        public OptionalFieldsSetter lastName(String lastName) {
            this.lastName = lastName;
            return this;
        }

        @Override
        public OptionalFieldsSetter middleNames(List<String> middleNames) {
            this.middleNames = middleNames;
            return this;
        }

        @Override
        public OptionalFieldsSetter email(String email) {
            this.email = email;
            return this;
        }

        @Override
        public OptionalFieldsSetter phone(String phone) {
            this.phone = phone;
            return this;
        }

        @Override
        public Person build() {
            return new Person(this);
        }
    }
}