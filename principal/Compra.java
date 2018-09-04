
package principal;

import java.util.List;

public class Compra {
    private StatusCompra status; 
    private List<Troca> trocas;

    public StatusCompra getStatus() {
        return status;
    }

    public void setStatus(StatusCompra status) {
        this.status = status;
    }

    public List<Troca> getTrocas() {
        return trocas;
    }

    public void setTrocas(List<Troca> trocas) {
        this.trocas = trocas;
    }

}
