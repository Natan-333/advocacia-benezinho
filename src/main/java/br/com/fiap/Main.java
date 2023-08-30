package br.com.fiap.domain;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class Main {

    public static void main(String[] args) {
        // Create an EntityManagerFactory
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("persistence-unit");

        // Create an EntityManager
        EntityManager em = emf.createEntityManager();

        // Create some entities
        Advogado advogado1 = new Advogado("Fulano de Tal", "12345678901234", new Estado("SP"));
        Advogado advogado2 = new Advogado("Beltrano de Tal", "98765432109876", new Estado("RJ"));
        TipoDeAcao tipoDeAcao1 = new TipoDeAcao("Ação Civil");
        TipoDeAcao tipoDeAcao2 = new TipoDeAcao("Ação Penal");
        Processo processo1 = new Processo(1L, "1234567890", true, advogado1, tipoDeAcao1);
        Processo processo2 = new Processo(2L, "9876543210", false, advogado2, tipoDeAcao2);

        // Persist the entities
        em.getTransaction().begin();
        em.persist(advogado1);
        em.persist(advogado2);
        em.persist(tipoDeAcao1);
        em.persist(tipoDeAcao2);
        em.persist(processo1);
        em.persist(processo2);
        em.getTransaction().commit();

        // Query for a process by its id
        System.out.println("Processo 1:");
        Processo processo = em.find(Processo.class, 1L);
        System.out.println(processo);

        // Query for all processes
        System.out.println("Todos os processos:");
        List<Processo> processos = em.createQuery("SELECT p FROM Processo p", Processo.class).getResultList();
        for (Processo p : processos) {
            System.out.println(p);
        }

        // Close the EntityManager
        em.close();
        emf.close();
    }
}
