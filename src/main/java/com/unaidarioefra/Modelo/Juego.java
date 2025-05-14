package com.unaidarioefra.Modelo;

import java.util.ArrayList;

public class Juego {
    private static Juego instance;
    private int nivel;
    private ArrayList<Enemigo> enemigos = new ArrayList<>();

    private Prota prota;
    private int posX = 1; // posición inicial del jugador
    private int posY = 1;

    public static Juego getInstance() {
        if (instance == null) {
            instance = new Juego();
        }
        return instance;
    }

    private Juego() {
        this.prota = new Prota(20, 15, 10, 8, 10); // valores de ejemplo
    }

    public Prota getProta() {
        return prota;
    }

    public int getPosicionJugadorX() {
        return posX;
    }

    public int getPosicionJugadorY() {
        return posY;
    }

    public void setPosicionJugador(int x, int y) {
        this.posX = x;
        this.posY = y;
    }

    public int getNivel() {
        return nivel;
    }

    public void setNivel(int nivel) {
        this.nivel = nivel;
    }

    public GestorMapa getGestorMapas() {
        return new GestorMapa();
    }

    public void iniciarentidades() {
        enemigos.clear();
        enemigos.add(new Enemigo(2, 5, 5));
        enemigos.add(new Enemigo(3, 10, 8));
        enemigos.add(new Enemigo(4, 3, 12));
    }

    public ArrayList<Enemigo> getEnemigos() {
        return enemigos;
    }

    public void agregarEnemigo(Enemigo enemigo) {
        enemigos.add(enemigo);
    }

    public void limpiarEnemigos() {
        enemigos.clear();
    }
}
