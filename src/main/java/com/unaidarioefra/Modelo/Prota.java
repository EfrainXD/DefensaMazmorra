package com.unaidarioefra.Modelo;

public class Prota {
    private int vida;
    private int ataque;
    private int defensa;
    private int evasion;
    private int velocidad;

    // Atributos para posición
    private int posX;
    private int posY;

    public Prota(int vida, int ataque, int defensa, int evasion, int velocidad) {
        setVida(vida);
        setAtaque(ataque);
        setDefensa(defensa);
        setEvasion(evasion);
        setVelocidad(velocidad);
        this.posX = 1; // Valor inicial para X
        this.posY = 1; // Valor inicial para Y
    }

    // Métodos para obtener y establecer las posiciones
    public int getPosicionX() {
        return posX;
    }

    public void setPosicionX(int posX) {
        this.posX = posX;
    }

    public int getPosicionY() {
        return posY;
    }

    public void setPosicionY(int posY) {
        this.posY = posY;
    }

    // Métodos para mover al Prota
    public void moverArriba() {
        if (posY > 0) {
            this.posY--;
        }
    }

    public void moverAbajo(int maxY) {
        if (posY < maxY) {
            this.posY++;
        }
    }

    public void moverIzquierda() {
        if (posX > 0) {
            this.posX--;
        }
    }

    public void moverDerecha(int maxX) {
        if (posX < maxX) {
            this.posX++;
        }
    }

    // Métodos para manejar vida, ataque, etc.
    public int getVida() {
        return vida;
    }

    public void setVida(int vida) {
        this.vida = (vida < 0 || vida > 20) ? 15 : vida;
    }

    public void quitarVida(int cantidad) {
        this.vida -= cantidad;
        if (this.vida < 0) {
            this.vida = 0;
        }
    }

    public int getAtaque() {
        return ataque;
    }

    public void setAtaque(int ataque) {
        this.ataque = (ataque < 0 || ataque > 20) ? 15 : ataque;
    }

    public int getDefensa() {
        return defensa;
    }

    public void setDefensa(int defensa) {
        this.defensa = (defensa < 0 || defensa > 20) ? 15 : defensa;
    }

    public int getEvasion() {
        return evasion;
    }

    public void setEvasion(int evasion) {
        this.evasion = (evasion < 0 || evasion > 20) ? 15 : evasion;
    }

    public int getVelocidad() {
        return velocidad;
    }

    public void setVelocidad(int velocidad) {
        this.velocidad = (velocidad < 0 || velocidad > 20) ? 15 : velocidad;
    }

    
}
