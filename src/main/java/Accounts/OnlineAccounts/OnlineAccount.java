package Accounts.OnlineAccounts;

import java.io.*;

/**
 * Created by james on 24/05/2019.
 */
public class OnlineAccount {
    int i=4;

    int waitTime = 200;


    public boolean method1(){
        try {
            Thread.sleep(waitTime);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return true;
    }
    public boolean method2(){
        try {
            Thread.sleep(waitTime);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return false;
        //return true;
    }
    public boolean method3(){
        try {
            Thread.sleep(waitTime);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return false;
        //return true;
    }
    public boolean method4(){
        try {
            Thread.sleep(waitTime);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return true;
        //return makeFlaky1();
    }
    public boolean method5(){
        try {
            Thread.sleep(waitTime);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return false;
        //return true;
    }
    public boolean method6(){
        try {
            Thread.sleep(waitTime);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return true;
        //return makeFlaky2();
    }
    public boolean method7(){
        try {
            Thread.sleep(waitTime);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return true;
    }
    public boolean method8(){
        try {
            Thread.sleep(waitTime);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return true;
    }
    public boolean method9(){
        try {
            Thread.sleep(waitTime);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return true;
    }
    public boolean method10(){
        try {
            Thread.sleep(waitTime);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return true;
    }


    public boolean makeFlaky1(){
        int numToStore = 0;
        BufferedWriter out = null;
        try {

            // Read File Contents - score
            BufferedReader br = new BufferedReader(new FileReader("flaky1.txt"));
            String storedScore="0";
            int storedScoreNumber = 0;
            while ((storedScore = br.readLine()) != null) {
                storedScoreNumber=(Integer.parseInt(storedScore==null?"0":storedScore));
            }

            // Write File Contents - incremented socre
            numToStore = storedScoreNumber;
            if(numToStore == 999){
                numToStore = 0;
            }else{
                numToStore++;
            }
            out = new BufferedWriter(new FileWriter("flaky1.txt", false));
            out.write(String.valueOf(numToStore));

        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (out != null) {
                try {
                    out.close();
                } catch (IOException e) {
                    // TODO Auto-generated catch block
                    e.printStackTrace();
                }
            }
        }
        if ((numToStore % 2) == 0){
            return false;
        }
        return true;
    }
    public boolean makeFlaky2(){
        int numToStore = 0;
        BufferedWriter out = null;
        try {

            // Read File Contents - score
            BufferedReader br = new BufferedReader(new FileReader("flaky2.txt"));
            String storedScore="0";
            int storedScoreNumber = 0;
            while ((storedScore = br.readLine()) != null) {
                storedScoreNumber=(Integer.parseInt(storedScore==null?"0":storedScore));
            }

            // Write File Contents - incremented socre
            numToStore = storedScoreNumber;
            if(numToStore == 999){
                numToStore = 0;
            }else{
                numToStore++;
            }
            out = new BufferedWriter(new FileWriter("flaky2.txt", false));
            out.write(String.valueOf(numToStore));

        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (out != null) {
                try {
                    out.close();
                } catch (IOException e) {
                    // TODO Auto-generated catch block
                    e.printStackTrace();
                }
            }
        }
        if ((numToStore % 2) == 0){
            return false;
        }
        return true;
    }
}
