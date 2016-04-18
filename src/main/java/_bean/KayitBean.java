/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package _bean;

import _entity.Kisi;
import _entity.Telefon;
import _service.KisiService;
import java.util.ArrayList;
import java.util.List;
import javax.ejb.EJB;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;

/**
 *
 * @author resul
 */
@ManagedBean
@RequestScoped
public class KayitBean {
    
    //alt-insert "Call EJB" şeklinde çağırabiliriz.
    //Aşağıdaki kullanımı yaptığımızdan dolayı GET ve 
    //SET mettolarını yazmaya gerek kalmadan kullanabiliriz.
    //Aşağıdaki kullanımlar birbirinin eşiti.;
    //KisiService kisiService=new KisiService();
    @EJB
    private KisiService kisiService;
    
    

    private Kisi kisi=new Kisi();
    private Telefon cepTel=new Telefon();
    private Telefon evTel=new Telefon();
    
    public KayitBean() {
    }
    
    public void ekle(){
        
        //one-to-many çift taraflı ikisindende set etmek gerekiyor.
        List<Telefon> telefonList=new ArrayList<Telefon>();
        telefonList.add(evTel);
        telefonList.add(cepTel);
        
        //Eğer one-to-many çift taraflı ilişki varsa her iki tarafı
        //karşılıklı olarak setlemeliyiz 
        kisi.setTelefonList(telefonList);
        cepTel.setKisi(kisi);
        evTel.setKisi(kisi);
        
        kisiService.ekle(kisi);
        
    }

    public Kisi getKisi() {
        return kisi;
    }

    public void setKisi(Kisi kisi) {
        this.kisi = kisi;
    }

    public Telefon getCepTel() {
        return cepTel;
    }

    public void setCepTel(Telefon cepTel) {
        this.cepTel = cepTel;
    }

    public Telefon getEvTel() {
        return evTel;
    }

    public void setEvTel(Telefon evTel) {
        this.evTel = evTel;
    }
    
}
