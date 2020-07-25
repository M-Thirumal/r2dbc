package in.thirumal.r2dbc.model;

import java.io.Serializable;
import java.time.LocalDate;
import java.time.LocalDateTime;

import org.springframework.data.annotation.Id;
import org.springframework.data.relational.core.mapping.Column;
import org.springframework.data.relational.core.mapping.Table;

import lombok.Data;

@Data
@Table("look_up.generic_cd")
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
	public Long getGenericCd() {
		return genericCd;
	}
	public void setGenericCd(Long genericCd) {
		this.genericCd = genericCd;
	}
	public String getCode() {
		return code;
	}
	public void setCode(String code) {
		this.code = code;
	}
	public LocalDate getStartDate() {
		return startDate;
	}
	public void setStartDate(LocalDate startDate) {
		this.startDate = startDate;
	}
	public LocalDate getEndDate() {
		return endDate;
	}
	public void setEndDate(LocalDate endDate) {
		this.endDate = endDate;
	}
	public LocalDateTime getRowCreationTime() {
		return rowCreationTime;
	}
	public void setRowCreationTime(LocalDateTime rowCreationTime) {
		this.rowCreationTime = rowCreationTime;
	}
	public String getRowCreatedBy() {
		return rowCreatedBy;
	}
	public void setRowCreatedBy(String rowCreatedBy) {
		this.rowCreatedBy = rowCreatedBy;
	}
	public String getRowUpdatedBy() {
		return rowUpdatedBy;
	}
	public void setRowUpdatedBy(String rowUpdatedBy) {
		this.rowUpdatedBy = rowUpdatedBy;
	}
	public LocalDateTime getRowUpdateTime() {
		return rowUpdateTime;
	}
	public void setRowUpdateTime(LocalDateTime rowUpdateTime) {
		this.rowUpdateTime = rowUpdateTime;
	}
	public String getRowUpdateInfo() {
		return rowUpdateInfo;
	}
	public void setRowUpdateInfo(String rowUpdateInfo) {
		this.rowUpdateInfo = rowUpdateInfo;
	}
	public Long getParentGenericCd() {
		return parentGenericCd;
	}
	public void setParentGenericCd(Long parentGenericCd) {
		this.parentGenericCd = parentGenericCd;
	}
}
