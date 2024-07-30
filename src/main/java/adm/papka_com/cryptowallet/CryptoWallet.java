package adm.papka_com.cryptowallet;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

public class CryptoWallet {
    public Map<Integer, String> BtcBal = new HashMap<>();
    public Map<Integer, String> EthBal = new HashMap<>();



 
    public void addCrypto(String amount, Integer id) {

        if (amount.startsWith("BTC")) {
            BtcBal.put(id, amount);
        }
        else if (amount.startsWith("ETH")) {
            EthBal.put(id, amount);
        }
        else {
            throw new WrongCryptoException();
        }}

    public Optional<String> getCryptoByTrsId(Integer id) {
        if (BtcBal.containsKey(id)) {
            return Optional.of(BtcBal.get(id));
        }
        else if (EthBal.containsKey(id)) {
            return Optional.of(EthBal.get(id));
        }
        return Optional.empty();


    
        
    }
        //   try {
        //     return Optional.of(db.getUserName());
        // } catch (IOException e) {
        //     e.printStackTrace();
        // }

        // return Optional.empty();







    @Override
    public String toString() {
        return "CryptoWallet" + BtcBal;
    }

}
