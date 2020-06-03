/**
 * 
 */
package in.thirumal.r2dbc.model;

import java.io.Serializable;
import java.time.LocalDateTime;

import org.springframework.data.annotation.Id;
import org.springframework.data.relational.core.mapping.Column;
import org.springframework.data.relational.core.mapping.Table;

import lombok.AllArgsConstructor;
import lombok.Builder;
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
@ToString@Builder
@Table("public.poll")
public class Poll implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 8349828504401322494L;
	@Id
	@Column("poll_id")
	private Long pollId;
	@Column("election_cd")
	private Long electionCd;
	@Column("title")
	private String title;
	@Column("start_date_time")
	private LocalDateTime startDateTime;
	@Column("end_date_time")
	private LocalDateTime endDateTime;
	@Column("secure")
	private boolean secure;
	@Column("secret_ballot")
	private boolean secretBallot;
}
