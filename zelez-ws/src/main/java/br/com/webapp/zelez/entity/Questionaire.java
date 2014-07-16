package br.com.webapp.zelez.entity;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="QUESTIONAIRE")
public class Questionaire {
	@Id
	@Column(name="CD_QUESTIONAIRE")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	@Column(name="QUESTION")
	private String question;

	@Column(name="NB_ANSWERS")
	private Integer numberOfAnswers;

	@OneToMany(mappedBy = "questionaire", cascade = CascadeType.ALL)
	private List<Answers> answers;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getQuestion() {
		return question;
	}

	public void setQuestion(String question) {
		this.question = question;
	}

	public Integer getNumberOfAnswers() {
		return numberOfAnswers;
	}

	public void setNumberOfAnswers(Integer numberOfAnswers) {
		this.numberOfAnswers = numberOfAnswers;
	}

	public List<Answers> getAnswers() {
		return answers;
	}

	public void setAnswers(List<Answers> answers) {
		this.answers = answers;
	}
}
