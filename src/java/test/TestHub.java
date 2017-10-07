package test;

import it.mibact.bonus.verificavoucher.Check;
import it.mibact.bonus.verificavoucher.CheckRequestObj;
import it.mibact.bonus.verificavoucher.CheckResponse;
import it.mibact.bonus.verificavoucher.VerificaVoucher_Service;

import java.security.NoSuchAlgorithmException;

public class TestHub {


    public static void main(String[] args) throws NoSuchAlgorithmException {

        System.setProperty("javax.net.ssl.trustStore", "cacerts");
        System.setProperty("javax.net.ssl.trustStorePassword", "changeit");

        VerificaVoucher_Service verificaVoucher_service = new VerificaVoucher_Service("AAAAAA00H01H501P.p12", "m3D0T4aM");
        CheckRequestObj checkRequestObj = new CheckRequestObj();
        Check check = new Check();
        check.setCodiceVoucher("2a75f266");
        check.setTipoOperazione("1");
        checkRequestObj.setCheckReq(check);
        CheckResponse checkResp = null;
        try {
            checkResp = verificaVoucher_service.getVerificaVoucherSOAP().check(checkRequestObj).getCheckResp();
        } catch (Exception e) {
            // TODO: 07/10/17 Navigare il DOM alla ricerca del codice di errore.
            e.printStackTrace();
        }


        System.out.println(checkResp);

    }

}
