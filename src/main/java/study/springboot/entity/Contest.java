package study.springboot.entity;

import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="contest")
public class Contest {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "contest_id")
	private Long Id;
	
	@Column(name = "teacher_id")
	private Long teacherId;
	
	@Column(name = "contest_name")
	private String name;
	
	@Column(name = "time_begin")
	private Date timeBegin;
	
	@Column(name = "time_end")
	private Date timeEnd;
	
	@Column(name = "language")
	private String language;
	
	@Column(name = "status")
	private int status;
	
	
	public Contest(Long teacherId, String name, Date timeBegin, Date timeEnd, String language) {
		super();
		this.teacherId = teacherId;
		this.name = name;
		this.timeBegin = timeBegin;
		this.timeEnd = timeEnd;
		this.language = language;
	}
	
	public Long getId() {
		return Id;
	}
	public void setId(Long id) {
		Id = id;
	}
	public Long getTeacherId() {
		return teacherId;
	}
	public void setTeacherId(Long teacherId) {
		this.teacherId = teacherId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Date getTimeBegin() {
		return timeBegin;
	}
	public void setTimeBegin(Date timeBegin) {
		this.timeBegin = timeBegin;
	}
	public Date getTimeEnd() {
		return timeEnd;
	}
	public void setTimeEnd(Date timeEnd) {
		this.timeEnd = timeEnd;
	}
	public String getLanguage() {
		return language;
	}
	public void setLanguage(String language) {
		this.language = language;
	}
	public int getStatus() {
		return status;
	}
	public void setStatus(int status) {
		this.status = status;
	}
	
	
}
