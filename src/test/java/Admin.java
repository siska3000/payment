import java.util.List;

public class Admin {

    private List<computer> assests;

    public Admin (List<computer> assests) {
        this.assests = assests;
    }

    public List<computer> getAssests() {
        return assests;
    }

    public void setAssests(List<computer> assests) {
        this.assests = assests;
    }

}
