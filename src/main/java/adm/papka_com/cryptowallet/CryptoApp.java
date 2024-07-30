package adm.papka_com.cryptowallet;

public class CryptoApp {
    public static void main(String[] args) {
        CryptoWallet wallet = new CryptoWallet();
        System.out.println("Created Crypto wallet");

        try {
           
            wallet.addCrypto("BTCdsf", 1);
            wallet.addCrypto("ETHdsfs", 2);
            wallet.addCrypto("BTCdsf", 3);
            
        } 
        catch (WrongCryptoException WCE) {
            System.err.println("Invalid Crypto");
        }

        System.out.println(wallet.getCryptoByTrsId(1));
        
        
    }
}

