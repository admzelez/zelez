package br.com.webapp.zelez.entity;

import java.io.Serializable;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="ANSWERS")
public class Answers implements Serializable {

	private static final long serialVersionUID = 8804973589171586090L;

	@Id
	@Column(name = "CD_ANSWERS")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	@Column(name = "DS_VALUE")
	private String value;

//	@Column(name = "IMAGE")
//	@Lob
//	private Blob image;

	@ManyToOne(fetch = FetchType.EAGER)
	@JoinColumn(name="CD_QUESTIONAIRE")
	private Questionaire questionaire;

	@OneToMany(mappedBy = "answer", cascade = CascadeType.ALL)
	private List<UserAnswer> userAnswers;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getValue() {
		return value;
	}

	public void setValue(String value) {
		this.value = value;
	}

//	public Blob getImage() {
//		return image;
//	}
//
//	public void setImage(Blob image) {
//		this.image = image;
//	}

	public Questionaire getQuestionaire() {
		return questionaire;
	}

	public void setQuestionaire(Questionaire questionaire) {
		this.questionaire = questionaire;
	}

	public List<UserAnswer> getUserAnswers() {
		return userAnswers;
	}

	public void setUserAnswers(List<UserAnswer> userAnswers) {
		this.userAnswers = userAnswers;
	}
}
