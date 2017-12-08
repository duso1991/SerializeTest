package com.cmfintech.ds.Test;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

import com.cmfintech.ds.Serialize.Student;
import com.cmfintech.ds.Serialize.Student3;

/**   
  * @Title: TransientAndStaicTest.java
  * @Description:
  * @Company  电子科技大学自动化研究所
  * @author  杜松   
  * @date 2017年12月8日 上午11:12:18
  * @version V1.0   
*/
public class TransientAndStaicTest {
	public static void main(String[] args) throws IOException, ClassNotFoundException {
		Student3 student=new Student3();
		student.setId(new Long(1));
		student.setName("杜松");
		student.setAge(new Integer(26));
		student.setSchool("电子科技大学");
		student.setGrade(new Integer(17));
		student.setSclass(new Integer(2));
		
		
		FileOutputStream fos=new FileOutputStream(new File("D:/Strs3.txt"));
		ObjectOutputStream oos=new ObjectOutputStream(fos);
		oos.writeObject(student);
		oos.close();
		System.out.println("写入成功");
		
		FileInputStream fis=new FileInputStream(new File("D:/Strs3.txt"));
		ObjectInputStream ois=new ObjectInputStream(fis);
		Student3 student3=(Student3) ois.readObject();
		ois.close();
		
		System.out.println("读取成功");
		System.out.println(student3.toString());
		
		
		
	}

}
