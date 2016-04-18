/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package _facade;

import _entity.Kisi;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author resul
 */
@Stateless
public class KisiFacade extends AbstractFacade<Kisi> {
    @PersistenceContext(unitName = "com.javakurs_PersonelBilgi_war_1.0-SNAPSHOTPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public KisiFacade() {
        super(Kisi.class);
    }
    
}
