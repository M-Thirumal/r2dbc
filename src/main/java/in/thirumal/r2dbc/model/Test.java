package in.thirumal.r2dbc.model;

import java.io.Serializable;

import org.springframework.data.annotation.Id;
import org.springframework.data.relational.core.mapping.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data@NoArgsConstructor@AllArgsConstructor
@ToString
@Table("public.test")
public class Test implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 4205798689305488147L;

	@Id//@Column("id")
	private Long id;
	
	private String name;

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
	
}
