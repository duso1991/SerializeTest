package com.cmfintech.ds.Test;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import com.cmfintech.ds.Serialize.KyroStudent;
import com.cmfintech.ds.Serialize.Student;
import com.esotericsoftware.kryo.Kryo;
import com.esotericsoftware.kryo.io.Input;
import com.esotericsoftware.kryo.io.Output;

/**   
  * @Title: KryoTest.java
  * @Description:
  * @Company  电子科技大学自动化研究所
  * @author  杜松   
  * @date 2017年12月8日 下午8:38:18
  * @version V1.0   
*/
public class KryoTest {
	public static void main(String[] args) throws IOException {
		KyroStudent student=new KyroStudent();
		student.setId(new Long(1));
		student.setName("杜松");
		student.setAge(new Integer(26));
		student.setSchool("电子科技大学");
		student.setGrade(new Integer(17));
		student.setSclass(new Integer(2));
		
		FileOutputStream fileOut = new FileOutputStream(new File("D:/Strs.txt"));
	      
	      Output objectOutput = new Output(fileOut);
	      Kryo kryo=new Kryo();
	      kryo.writeObject(objectOutput, student);
	      objectOutput.close();
	      fileOut.close();
	      System.out.println("序列化完成");
	      
	      FileInputStream filein = new FileInputStream(new File("D:/Strs.txt"));
		   
	      Input oInput=new Input(filein);
	    KyroStudent kStudent= (KyroStudent) kryo.readObject(oInput,KyroStudent.class);
	    System.out.println(kStudent.toString());
	}

}
