package Model;

public class LoginModel {
    private String tk;
    private String mk;
    public LoginModel(){
        tk="";
        mk="";
    }
    public LoginModel(String tk, String mk) {
        this.tk = tk;
        this.mk = mk;
    }

    public String getTk() {
        return tk;
    }

    public void setTk(String tk) {
        this.tk = tk;
    }

    public String getMk() {
        return mk;
    }

    public void setMk(String mk) {
        this.mk = mk;
    }
}
