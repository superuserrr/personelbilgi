/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package _service;

import _entity.Kisi;
import _facade.KisiFacade;
import javax.ejb.EJB;
import javax.ejb.Stateless;

/**
 *
 * @author resul
 */
@Stateless
public class KisiService {

    @EJB
    private KisiFacade kisiFacade;

    public void ekle(Kisi p_kisi) {
        kisiFacade.create(p_kisi);
    }
}
