package br.com.etechoracio.calculadora_ferias.Enum;

public enum diasSimEnum {
    vinte("20"),
    trinta("30");

    private String dias;

    private diasSimEnum(String dias) {this.dias = dias; }

    public String getDias(){return dias; }

    @Override
    public String toString(){return dias; }

    public static Dias getBy(int ordinal) { return Dias.values()[ordinal];}
}
