package dia_5;

public interface GestorBoliche extends PersonaIngresante, EstadisticasBoliche, MenuBoliche {
    @Override
    default boolean esAptoParaIngreso() {
        return false;
    }

    void gestionarIngreso();

    @Override
    default void mostrarMenu() {

    }

}
