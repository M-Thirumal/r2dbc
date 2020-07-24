package in.thirumal.r2dbc.model;

import java.io.Serializable;

import org.springframework.data.annotation.Id;
import org.springframework.data.relational.core.mapping.Table;

import lombok.Data;

@Data
@Table("public.test")
public class Test implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 4205798689305488147L;

	@Id//@Column("id")
	private Long id;
	
	private String name;

	public Test() {
	}

	public Test(Long id, String name) {
		this.id = id;
		this.name = name;
	}

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

	@Override
	public String toString() {
		return "Test [id=" + id + ", name=" + name + "]";
	}

	
}
