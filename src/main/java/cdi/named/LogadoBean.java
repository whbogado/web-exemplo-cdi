
package cdi.named;

import java.io.Serializable;
import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.inject.Named;

@Named("usuario")
@RequestScoped
public class LogadoBean implements Serializable {
    @Inject
    private LoginBean login;

    public LogadoBean() {
    }
    
    public String getNome() {
        return login.getLogin();
    }
}
