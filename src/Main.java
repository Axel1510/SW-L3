void main() {
    Repositorio repositorio = new Repositorio();

    repositorio.registrarCommit("C01", "Ana", "Crear el proyecto");
    repositorio.registrarCommit("C02", "Luis", "Agregar la pantalla principal");
    repositorio.registrarCommit("C03", "Ana", "Crear el formulario");
    repositorio.registrarCommit("C04", "Sofia", "Validar los datos");
    repositorio.registrarCommit("C05", "Luis", "Corregir el formulario");
    repositorio.registrarCommit("C06", "Ana", "Actualizar el historial");

    Commit encontrado = repositorio.buscarPorCodigo("C06");
    if (encontrado != null) {
        System.out.println("Commit encontrado: " + encontrado.getCodigo());
    }

    System.out.println("Commits de Ana: " + repositorio.contarPorAutor("Ana"));

    repositorio.eliminarUltimoCommit();
    System.out.print(repositorio.mostrarHistorial());
}
