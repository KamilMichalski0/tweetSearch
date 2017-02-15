package michalski.kamil.user;


import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class User {
    private String email;
    private LocalDate birthDate;
    private List<String> tastes = new ArrayList<>();


    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public LocalDate getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(LocalDate birthDate) {
        this.birthDate = birthDate;
    }

    public List<String> getTastes() {
        return tastes;
    }

    public void setTastes(List<String> tastes) {
        this.tastes = tastes;
    }
}
