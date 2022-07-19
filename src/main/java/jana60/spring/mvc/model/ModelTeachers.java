package jana60.spring.mvc.model;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

@Entity
@Table(name = "teachers")
public class ModelTeachers {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private Integer teachersId;

	private String name;
	private String surname;
	private String phone;
	private String email;
	private String officeAddress;
	private String officeNumber;

	@ManyToMany(mappedBy = "teachers")
	public List<ModelCourse> courses;

	public Integer getTeachersId() {
		return teachersId;
	}

	public void setTeachersId(Integer teachersId) {
		this.teachersId = teachersId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSurname() {
		return surname;
	}

	public void setSurname(String surname) {
		this.surname = surname;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getOfficeAddress() {
		return officeAddress;
	}

	public void setOfficeAddress(String officeAddress) {
		this.officeAddress = officeAddress;
	}

	public String getOfficeNumber() {
		return officeNumber;
	}

	public void setOfficeNumber(String officeNumber) {
		this.officeNumber = officeNumber;
	}

	public List<ModelCourse> getCourses() {
		return courses;
	}

	public void setCourses(List<ModelCourse> courses) {
		this.courses = courses;
	}

}
