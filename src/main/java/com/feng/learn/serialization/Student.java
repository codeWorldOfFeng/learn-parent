/**
 * 
 */
package com.feng.learn.serialization;

/**
 * @author feng
 *
 */
public class Student extends Person {

	/**
	 * 
	 */
	private static final long serialVersionUID = -2122601887288301568L;
	private Person teacher;

	public Student(String name, int age) {
		super(name, age);
	}

	/**
	 * return the teacher
	 * 
	 * @return the teacher
	 */
	public Person getTeacher() {
		return teacher;
	}

	/**
	 * the teacher to set
	 * 
	 * @param teacher
	 *            the teacher to set
	 */
	public void setTeacher(Person teacher) {
		this.teacher = teacher;
	}

}
