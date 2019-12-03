package com.example.OCP.streams;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class MapStrams {
    static String tipos;

   public static class objecto {
        static String tipo;
        String valor;
        public String toString(){         return tipo +""+ valor;     }
        public objecto(String tipo, String valor) {
            this.tipo = tipo;
            this.valor = valor;
        }

        public String getTipo() {
            return tipo;
        }

        public void setTipo(String tipo) {
            this.tipo = tipo;
        }

        public String getValor() {
            return valor;
        }

        public void setValor(String valor) {
            this.valor = valor;
        }
    }

    public static void main(String[] args) {
        List<objecto> list = new ArrayList<>();
        MapStrams object = new MapStrams();
        MapStrams.tipos.concat("asd");
        list.add(new objecto("letter","a"));
        list.add(new objecto("letter","b"));
        list.add(new objecto("number","1"));
        list.add(new objecto("number","2"));

        //list.forEach(x->x.valor ="10");
       // list.stream().collect(Collectors.groupingBy(x->x.getTipo())).forEach((x,y)->System.out.println(y));
        list.parallelStream().forEachOrdered(System.out::println);
    }
    void man (int ab ){
        int a = 1;
        a = a + a;
        int c = a * ab;
        a = c;

    }
}

