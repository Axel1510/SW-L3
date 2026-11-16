import java.util.ArrayList;

public class Repositorio {
    private ArrayList<Commit> historial;

    public Repositorio() {
        historial = new ArrayList<>();
    }

    public void registrarCommit(String codigo, String autor, String descripcion) {
        Commit commit = new Commit(codigo, autor, descripcion);
        historial.add(commit);
    }

    public void eliminarUltimoCommit() {
        if (historial.size() > 0) {
            historial.remove(historial.size() - 1);
        }
    }

    public Commit buscarPorCodigo(String codigo) {
        for (Commit commit : historial) {
            if (commit.getCodigo().equals(codigo)) {
                return commit;
            }
        }
        return null;
    }

    public int contarPorAutor(String autor) {
        int cantidad = 0;

        for (Commit commit : historial) {
            if (commit.getAutor().equals(autor)) {
                cantidad++;
            }
        }

        return cantidad;
    }

    public String mostrarHistorial() {
        String resultado = "";

        for (Commit commit : historial) {
            resultado += commit.getCodigo() + " " + commit.getAutor()
                    + " " + commit.getDescripcion() + "\n";
        }

        return resultado;
    }
}
