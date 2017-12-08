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
public class Student4 implements Serializable{

	
	private Long id;
	private String name;
	private Integer age;
	private Integer grade;
	private Integer sclass;
	
	
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
	
	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", age=" + age + ", grade=" + grade + ", sclass=" + sclass
				+ "]";
	}
	

}
