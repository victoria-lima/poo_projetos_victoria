package br.ufpb.dcx.victoria.cafeteria;
import br.ufpb.dcx.victoria.cafeteria.Cafeteria;

import java.util.ArrayList;
import java.util.List;

public class GerenciadorCafeterias {
    private List<Cafeteria> listaCafeterias;

    public GerenciadorCafeterias()
    {
        this.listaCafeterias = new ArrayList<>();
    }
    public void adicionarCafeterias(Cafeteria c) {
        this.listaCafeterias.add(c);
    }
    public Cafeteria buscarCafeteriaPorNome(String nomeProcurado) throws Exception {
        for (Cafeteria c : this.listaCafeterias) {
            if (c.getNome().equalsIgnoreCase(nomeProcurado)) {
                return c;
            }
        }
        throw new Exception("Cafeteris não encontrada: " + nomeProcurado);
    }
}