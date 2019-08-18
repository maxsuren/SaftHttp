package hideme;

import java.util.Map;

/**
 * hideme server-side kit, helps to manage encrypted message on server.
 */

public class HidemeServer {
    /**
     * load rsa private key
     */
    public static void loadkeys(){}

    /**
     * Interface to encrypt plaintext
     * @param pt
     * @return
     */
    public String encrypt(String pt){
        return null;
    }

    /**
     * Interface to decrypt ciphertext
     * @param ct
     * @return
     */
    public String decrypt(String ct){
        return null;
    }

    /**
     * General interface to send data.
     * @param url
     * @param method
     * @param header
     * @param payload
     */
    public static void send(String url, String method, Map<String, String> header, String payload){

    }

    public static void post(String url, String payload){

    }
}
