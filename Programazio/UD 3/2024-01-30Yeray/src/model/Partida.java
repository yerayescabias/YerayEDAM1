package model;

import java.time.LocalDateTime;

abstract public class Partida {
    
    protected LocalDateTime noiz;
    protected String t1;
    protected String t2;

    abstract protected String  getIrabazlea();
}
