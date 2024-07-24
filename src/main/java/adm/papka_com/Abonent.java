package adm.papka_com;

public class Abonent {
    private String name;
    private Integer id;
    private double bankAccount;

    public Abonent(Integer id, double bankAccount, String name) {
        this.id = id;
        this.bankAccount = bankAccount;
        this.name = name;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public double getBankAccount() {
        return bankAccount;
    }

    public void setBankAccount(double bankAccount) {
        this.bankAccount = bankAccount;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((id == null) ? 0 : id.hashCode());
        long temp;
        temp = Double.doubleToLongBits(bankAccount);
        result = prime * result + (int) (temp ^ (temp >>> 32));
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Abonent other = (Abonent) obj;
        if (id == null) {
            if (other.id != null)
                return false;
        } else if (!id.equals(other.id))
            return false;
        if (Double.doubleToLongBits(bankAccount) != Double.doubleToLongBits(other.bankAccount))
            return false;
        return true;
    }

    @Override
    public String toString() {
        return "Abonent [name=" + name + ", id=" + id + ", bankAccount=" + bankAccount + "]";
    }
}
