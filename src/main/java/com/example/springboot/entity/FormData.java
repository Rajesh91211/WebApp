package com.example.springboot.entity;

public class FormData {
	 private String name;
	    private int age;

	    // Getters and Setters
	    public String getName() {
	        return name;
	    }

	    public void setName(String name) {
	        this.name = name;
	    }

	    public int getAge() {
	        return age;
	    }

	    public void setAge(int age) {
	        this.age = age;
	    }

		@Override
		public String toString() {
			return "FormData [name=" + name + ", age=" + age + "]";
		}
	    
}
