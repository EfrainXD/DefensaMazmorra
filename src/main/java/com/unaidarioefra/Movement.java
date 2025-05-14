package com.unaidarioefra;

public interface Movement {

    /**
     * Ejecuta una acción de ataque.
     * @param damage Daño a aplicar al objetivo.
     */
    void atacar(int damage);

    /**
     * Mueve a la entidad (jugador o enemigo) de acuerdo a su lógica.
     */
    void movimiento();

    /**
     * Intenta evadir un ataque, usando la estadística de evasión.
     */
    void evasion();

    /**
     * Verifica si la entidad sigue viva (vida > 0).
     * @return true si sigue viva, false si está derrotada.
     */
    boolean estaVivo();

    /**
     * Aplica un daño directo a la entidad.
     * @param cantidad Cantidad de vida a restar.
     */
    void recibirDanio(int cantidad);
}
