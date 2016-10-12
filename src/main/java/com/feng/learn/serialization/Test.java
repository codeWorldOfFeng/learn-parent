/**
 * 
 */
package com.feng.learn.serialization;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

/**
 * @author feng
 *
 */
public class Test {
	public static void main(String args[]) throws IOException, ClassNotFoundException {
		Person p = new Person();
		p.setAge(26);
		ByteArrayOutputStream baos = new ByteArrayOutputStream();
		ObjectOutputStream oos = new ObjectOutputStream(baos);

		oos.writeObject(p);
		oos.flush();

		byte[] bs = baos.toByteArray();
		oos.close();

		ByteArrayInputStream bais = new ByteArrayInputStream(bs);
		ObjectInputStream ois = new ObjectInputStream(bais);
		Object o = ois.readObject();
		System.out.println(o.getClass());
		Person pi = null;
		if (o.getClass() == Person.class) {
			pi = (Person) o;
		}
	}
}
