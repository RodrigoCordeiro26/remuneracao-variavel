package br.com.portoseguro.rbc.remuneracaovariavel.Entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name="PPOKMDLGRP")
@Getter
@Setter
@NoArgsConstructor
public class GrupoProdutoEntity implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 5852176839447979809L;

	@Id
	@Column(name="MDLGRPNUM")
	private Integer numGrupo;
	
	@Column(name="MDLGRPNOM")
	private String nomGrupo;
	

}