package exemplo;

import java.util.HashMap;
import java.util.Map;
// remover , recuperar , listar
public class Catalogo {

    public Map<String,Produto> c  = new HashMap<>();

    public Catalogo() {
        this.c =  new c;
    }

    public String addProduto(Produto p) {
       c.put(p.getId(),Produto p);
       return p.getId();
    }

    public Produto atualizarProduto(Produto p){

    }


}
