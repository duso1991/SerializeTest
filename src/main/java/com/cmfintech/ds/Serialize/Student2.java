package com.cmfintech.ds.Serialize;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

/**   
  * @Title: Student.java
  * @Description:
  * @Company  电子科技大学自动化研究所
  * @author  杜松   
  * @date 2017年12月8日 上午9:54:57
  * @version V1.0   
*/
public class Student2 implements Externalizable{

	private static final long serialVersionUID = 1L;
	private Long id;
	private String name;
	private Integer age;
	private Integer grade;
	private Integer sclass;
	private String school;
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Integer getAge() {
		return age;
	}
	public void setAge(Integer age) {
		this.age = age;
	}
	public Integer getGrade() {
		return grade;
	}
	public void setGrade(Integer grade) {
		this.grade = grade;
	}
	public Integer getSclass() {
		return sclass;
	}
	public void setSclass(Integer sclass) {
		this.sclass = sclass;
	}
	public String getSchool() {
		return school;
	}
	public void setSchool(String school) {
		this.school = school;
	}
	
	/**
	  *@Description:
	  *@param out
	  *@throws IOException
	  *@author  杜松   
	  *@date 2017年12月8日 下午3:18:38  
	*/
	public void writeExternal(ObjectOutput out) throws IOException {
		out.writeLong(id);
		out.writeObject(name);
		out.writeInt(age);
		
	}
	/**
	  *@Description:
	  *@param in
	  *@throws IOException
	  *@throws ClassNotFoundException
	  *@author  杜松   
	  *@date 2017年12月8日 下午3:18:38  
	*/
	public void readExternal(ObjectInput in) throws IOException, ClassNotFoundException {
		id= (Long) in.readLong();
		name=(String) in.readObject();
		age=(Integer) in.readInt();
		
	}
	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", age=" + age + "]";
	}
	

}
