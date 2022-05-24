package com.codigoagil.rest.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EntityListeners;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.springframework.data.jpa.domain.support.AuditingEntityListener;

/**
 * La Clase Persona.
 */
@Entity
@Table(name = "persona")
@EntityListeners(AuditingEntityListener.class)
public class Persona {

	/** La id persona. */
	@Id
	@Column(name = "idPersona")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long idPersona;

	/** El nombre. */
	@Column(name = "nombre")
	private String nombre;

	/** Los apellidos. */
	@Column(name = "apellidos")
	private String apellidos;

	/**
	 * Instanciar una nueva persona.
	 */
	public Persona() {
		super();
	}

	/**
	 * Instanciar una nueva persona.
	 *
	 * @param idPersona
	 *        the id persona
	 * @param nombre
	 *        the nombre
	 * @param apellidos
	 *        the apellidos
	 */
	public Persona(final Long idPersona, final String nombre, final String apellidos) {
		super();
		this.idPersona = idPersona;
		this.nombre = nombre;
		this.apellidos = apellidos;
	}

	/**
	 * Obtiene la id persona.
	 *
	 * @return la id persona
	 */
	public Long getIdPersona() {
		return this.idPersona;
	}

	/**
	 * Setea la id persona.
	 *
	 * @param idPersona
	 *        la nueva id persona
	 */
	public void setIdPersona(final Long idPersona) {
		this.idPersona = idPersona;
	}

	/**
	 * Obtiene el nombre.
	 *
	 * @return el nombre
	 */
	public String getNombre() {
		return this.nombre;
	}

	/**
	 * Setea el nombre.
	 *
	 * @param nombre
	 *        el nuevo nombre
	 */
	public void setNombre(final String nombre) {
		this.nombre = nombre;
	}

	/**
	 * Obtiene los apellidos.
	 *
	 * @return los apellidos
	 */
	public String getApellidos() {
		return this.apellidos;
	}

	/**
	 * Setea los apellidos.
	 *
	 * @param apellidos
	 *        the new apellidos
	 */
	public void setApellidos(final String apellidos) {
		this.apellidos = apellidos;
	}

	/**
	 * Método toString.
	 *
	 * @return el string
	 */
	@Override
	public String toString() {
		return "Persona [idPersona=" + this.idPersona + ", nombre=" + this.nombre + ", apellidos=" + this.apellidos + "]";
	}

}
