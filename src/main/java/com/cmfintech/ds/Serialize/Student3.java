package com.cmfintech.ds.Serialize;

import java.io.Serializable;

/**   
  * @Title: Student.java
  * @Description:
  * @Company  电子科技大学自动化研究所
  * @author  杜松   
  * @date 2017年12月8日 上午9:54:57
  * @version V1.0   
*/
public class Student3 implements Serializable{

	private static final long serialVersionUID = 1L;
	private Long id;
	private String name;
	private Integer age;
	private Integer grade;
	private Integer sclass;
	private transient String school;
	private static int count=0;
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
	public static int getCount() {
		return count;
	}
	public static void setCount(int count) {
		Student3.count = count;
	}
	
	@Override
	public String toString() {
		return "Student2 [id=" + id + ", name=" + name + ", age=" + age + ", grade=" + grade + ", sclass=" + sclass
				+ ", school=" + school + "]";
	}

}
