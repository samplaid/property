package com.search.engine.property.core.persistence.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.IdClass;
import javax.persistence.Table;

@Entity
@Table(name = "CODE_LABELS")
@IdClass(CodeLabelEntityId.class)
public class CodeLabelEntity {

	@Id
	@Column(name = "code")
	private String code;
	@Id
	@Column(name = "value")
	private String value;
	@Column(name = "label")
	private String label;

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getValue() {
		return value;
	}

	public void setValue(String value) {
		this.value = value;
	}

	public String getLabel() {
		return label;
	}

	public void setLabel(String label) {
		this.label = label;
	}
}
