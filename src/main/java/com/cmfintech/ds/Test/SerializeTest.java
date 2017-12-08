package com.cmfintech.ds.Test;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

import com.cmfintech.ds.Serialize.Student;

/**   
  * @Title: SerializeTest.java
  * @Description:
  * @Company  电子科技大学自动化研究所
  * @author  杜松   
  * @date 2017年12月8日 上午11:12:18
  * @version V1.0   
*/
public class SerializeTest {
	public static void main(String[] args) throws IOException, ClassNotFoundException {
		Student student=new Student();
		student.setId(new Long(1));
		student.setName("杜松");
		student.setAge(new Integer(26));
		student.setSchool("电子科技大学");
		student.setGrade(new Integer(17));
		student.setSclass(new Integer(2));
		
		
		FileOutputStream fos=new FileOutputStream(new File("D:/Strs.txt"));
		ObjectOutputStream oos=new ObjectOutputStream(fos);
		oos.writeObject(student);
		oos.close();
		System.out.println("写入成功");
		
		FileInputStream fis=new FileInputStream(new File("D:/Strs.txt"));
		ObjectInputStream ois=new ObjectInputStream(fis);
		Student stuednt=(Student) ois.readObject();
		ois.close();
		
		System.out.println("读取成功");
		System.out.println(student.toString());
		
		
		
	}

}
