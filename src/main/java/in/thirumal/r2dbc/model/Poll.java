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
import lombok.NoArgsConstructor;
import lombok.ToString;

/**
 * @author thirumal
 *
 */
@Data
@AllArgsConstructor@NoArgsConstructor
@ToString@Builder
@Table("public.poll")
public class Poll implements Serializable {

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
	public Long getPollId() {
		return pollId;
	}
	public void setPollId(Long pollId) {
		this.pollId = pollId;
	}
	public Long getElectionCd() {
		return electionCd;
	}
	public void setElectionCd(Long electionCd) {
		this.electionCd = electionCd;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public LocalDateTime getStartDateTime() {
		return startDateTime;
	}
	public void setStartDateTime(LocalDateTime startDateTime) {
		this.startDateTime = startDateTime;
	}
	public LocalDateTime getEndDateTime() {
		return endDateTime;
	}
	public void setEndDateTime(LocalDateTime endDateTime) {
		this.endDateTime = endDateTime;
	}
	public boolean isSecure() {
		return secure;
	}
	public void setSecure(boolean secure) {
		this.secure = secure;
	}
	public boolean isSecretBallot() {
		return secretBallot;
	}
	public void setSecretBallot(boolean secretBallot) {
		this.secretBallot = secretBallot;
	}
}
