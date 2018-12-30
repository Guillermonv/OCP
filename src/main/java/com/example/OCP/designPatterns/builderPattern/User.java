package com.example.OCP.designPatterns.builderPattern;

public class User {

    private  String firstName = "";    //required
    private  String lastName = "";    //required
    private  int age = 1;    //optional
    private  String phone = "";    //optional
    private  String address ="";

    public User(UserBuilder userBuilder) {
    }

    public static class UserBuilder {
        private final String firstName;
        private final String lastName;
        private int age;
        private String phone;
        private String address;

        public UserBuilder(String firstName, String lastName) {
            this.firstName = firstName;
            this.lastName = lastName;
        }

        public UserBuilder age(int age) {
            this.age = age;
            return this;
        }

        public UserBuilder phone(String phone) {
            this.phone = phone;
            return this;
        }

        public UserBuilder address(String address) {
            this.address = address;
            return this;
        }

        public User build() {
            return new User(this);
        }

    }
    public static void main (String ...args){
        User.UserBuilder userBuilder = new User.UserBuilder("","");
        userBuilder.address("some street")
                      .age(11)
                      .phone("12")
                      .build();
        
    }
}

