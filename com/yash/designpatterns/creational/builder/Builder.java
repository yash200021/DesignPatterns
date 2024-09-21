package com.yash.designpatterns.creational.builder;

class Builder {
    private Integer rollNo;
    private String name;
    private String batch;
    private Double psp;
    private Integer age;
    private String gender;

    public Integer getRollNo() {
        return rollNo;
    }

    public Builder setRollNo(Integer rollNo) {
        this.rollNo = rollNo;
        return this;
    }

    public String getName() {
        return name;
    }

    public Builder setName(String name) {
        this.name = name;
        return this;
    }

    public String getBatch() {
        return batch;
    }

    public Builder setBatch(String batch) {
        this.batch = batch;
        return this;
    }

    public Double getPsp() {
        return psp;
    }

    public Builder setPsp(Double psp) {
        this.psp = psp;
        return this;
    }

    public Integer getAge() {
        return age;
    }

    public Builder setAge(Integer age) {
        this.age = age;
        return this;
    }

    public String getGender() {
        return gender;
    }

    public Builder setGender(String gender) {
        this.gender = gender;
        return this;
    }

    public Student build(){
        if(age < 18 || age > 60) throw new IllegalArgumentException("Age must in limit");
        if(psp < 0) throw new IllegalArgumentException("PSP can't be negative");


        //return new Student(this);  --> we can't do this as the Student Constructor is private
        //So we need to keep it as static inner class in Student class itself.
        return null;
    }
}
