package br.com.fiap;

import br.com.fiap.domain.entity.TipoDeAcao;
import jakarta.persistence.*;

public class Main {
    public static void main(String[] args) {

        TipoDeAcao tipo = new TipoDeAcao();
        TipoDeAcao numero = new TipoDeAcao();


        EntityManagerFactory factory = Persistence.createEntityManagerFactory("Oracle");

        EntityManager manager = factory.createEntityManager();



        manager.close();
        factory.close();
    }

}