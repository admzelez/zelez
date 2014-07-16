package br.com.webapp.zelez.dao;

import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public final class EMF {
	private static final EntityManagerFactory emfInstance = Persistence
			.createEntityManagerFactory("zelezPU");

	private EMF() {
	}

	public static EntityManagerFactory get() {
		return emfInstance;
	}
}