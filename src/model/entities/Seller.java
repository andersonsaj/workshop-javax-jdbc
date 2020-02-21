package model.entities;

import java.io.Serializable;
import java.util.Date;

public class Seller implements Serializable{
	
	
	private static final long serialVersionUID = 1L;
	
	private Integer id;
	private String name,email;
	private Double baseSalary;
	private Date birthDate;
	
	private Department department;
	
	public Seller() {
	}

	public Seller(Integer id, String name, String email, Double baseSalary, Date birthDate, Department department) {
		this.id = id;
		this.name = name;
		this.email = email;
		this.baseSalary = baseSalary;
		this.birthDate = birthDate;
		this.department = department;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Double getBaseSalary() {
		return baseSalary;
	}

	public void setBaseSalary(Double baseSalary) {
		this.baseSalary = baseSalary;
	}

	public Date getBirthDate() {
		return birthDate;
	}

	public void setBirthDate(Date birthDate) {
		this.birthDate = birthDate;
	}

	public Department getDepartment() {
		return department;
	}

	public void setDepartment(Department department) {
		this.department = department;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Seller other = (Seller) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Seller [id=" + id + ", name=" + name + ", email=" + email + ", baseSalary=" + baseSalary
				+ ", birthDate=" + birthDate + ", department=" + department + "]";
	}
	
}
