package in.thirumal.r2dbc.model;

import java.io.Serializable;
import java.time.LocalDate;
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

@Data
@Table("look_up.generic_cd")
@Getter@Setter
@NoArgsConstructor@AllArgsConstructor
@ToString@Builder
public class GenericCd implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -5543465891281870604L;
	@Id@Column("generic_cd")
	private Long genericCd;
	@Column("code")
	private String code;
	@Column("start_date")
	private LocalDate startDate;
	@Column("end_date")
	private LocalDate endDate;
	@Column("row_creation_time")
	private LocalDateTime rowCreationTime;
	@Column("row_created_by")
	private String rowCreatedBy;
	@Column("row_updated_by")
	private String rowUpdatedBy;
	@Column("row_update_time")
	private LocalDateTime rowUpdateTime;
	@Column("row_update_info")
	private String rowUpdateInfo;
	@Column("parent_generic_cd")
	private Long parentGenericCd;
}
