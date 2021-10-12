package study.springboot.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="contest_detail")
public class ContestDetail {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private Long id;
	
	@Column(name = "contest_id")
	private Long contestId;
	
	@Column(name = "problem_id")
	private String problemId;
	
	@Column(name = "path_problem")
	private String problemPath;
	
	@Column(name = "path_testcase")
	private String testcasePath;
	
	@Column(name = "times")
	private int times;
	
	
	public ContestDetail(Long contestId, String problemId, String problemPath, String testcasePath, int times) {
		super();
		this.contestId = contestId;
		this.problemId = problemId;
		this.problemPath = problemPath;
		this.testcasePath = testcasePath;
		this.times = times;
	}
	
	public Long getContestId() {
		return contestId;
	}
	public void setContestId(Long contestId) {
		this.contestId = contestId;
	}
	public String getProblemId() {
		return problemId;
	}
	public void setProblemId(String problemId) {
		this.problemId = problemId;
	}
	public String getProblemPath() {
		return problemPath;
	}
	public void setProblemPath(String problemPath) {
		this.problemPath = problemPath;
	}
	public String getTestcasePath() {
		return testcasePath;
	}
	public void setTestcasePath(String testcasePath) {
		this.testcasePath = testcasePath;
	}
	public int getTimes() {
		return times;
	}
	public void setTimes(int times) {
		this.times = times;
	}
	
}
