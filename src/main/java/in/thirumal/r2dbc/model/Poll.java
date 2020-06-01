/**
 * 
 */
package in.thirumal.r2dbc.model;

import java.io.Serializable;
import java.time.LocalDateTime;

import org.springframework.data.annotation.Id;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

/**
 * @author thirumal
 *
 */
@Data
@Getter@Setter
@AllArgsConstructor@NoArgsConstructor
@ToString
@JsonIgnoreProperties(ignoreUnknown=true)
public class Poll implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 8349828504401322494L;
	@Id Long poll_id;
	private Long pollId;
	private Long electionCd;
	private String title;
	private LocalDateTime start_date_time;
	private LocalDateTime end_date_time;
	private boolean secure;
	private boolean secret_ballot;
}
