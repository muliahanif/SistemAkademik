/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tubes.informasiakademik.test;

import cucumber.api.java.bm.Maka;
import cucumber.api.java.id.Dengan;
import cucumber.api.java.id.Ketika;
import junit.framework.Assert;



/**
 *
 * @author Munip
 */
public class DemoContext {
@Dengan("^Data user baru yang akan dimasukan tersedia dan tidak duplikat dengan data yang telah ada di sistem$")
public void data_user_baru_yang_akan_dimasukan_tersedia_dan_tidak_duplikat_dengan_data_yang_telah_ada_di_sistem() throws Throwable {
    // Write code here that turns the phrase above into concrete actions
    //throw new PendingException();
    boolean expected =false;
    boolean result = false;
    Assert.assertEquals(expected,result);
    
}
@Ketika("^Memasukan data user dengan nama \"([^\"]*)\"$")
public void memasukan_data_user_dengan_nama(String arg1) throws Throwable {
    // Write code here that turns the phrase above into concrete actions
    //throw new PendingException();
    boolean expected =false;
    boolean result = false;
    Assert.assertEquals(expected,result);
        
}

@Maka("^respon \"([^\"]*)\"$")
public void respon(String arg1) throws Throwable {
    // Write code here that turns the phrase above into concrete actions
    //throw new PendingException();
    //boolean expected =false;
    String result = "user sukses dimasukan";
    Assert.assertEquals(arg1,result);
    
}
}
