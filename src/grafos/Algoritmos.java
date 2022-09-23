package grafos;

import java.util.ArrayList;
import java.util.Queue;
import java.util.LinkedList;
import java.util.Stack;

/**
 * Nesta classe devem ser implementados todos os métodos de grafos de forma estática
 * @author vilson.junior
 */
public class Algoritmos {
    
    public static ArrayList<Vertice> percorreLarguraDistancia(Grafo g, Vertice inicio) {
        ArrayList<Vertice> resultado = new ArrayList();
        for (Vertice vertice : g.obterVertices()) {
            vertice.zerarVisitas();
            vertice.zerarDistancia();
        }
        inicio.visitar();
        inicio.definirDistancia(0);
        resultado.add(inicio);
        Queue<Vertice> fila = new LinkedList<>();
        fila.add(inicio);
        while (!fila.isEmpty()) {
            Vertice u = fila.remove();
            for (Arco arco : u.obterArcos()) {
                Vertice adj = arco.getDestino();
                if (adj.obterVisitado() == 0) {
                    adj.visitar();
                    adj.definirDistancia(u.obterDistancia() + 1);
                    adj.setCaminho(u.getCaminho());
                    resultado.add(adj);
                    fila.add(adj);
                }
            }
            u.visitar();
        }

        return resultado;
    }

    public static ArrayList<Vertice> percorreProfundidadeDistancia(Grafo g, Vertice inicio) {
        ArrayList<Vertice> resultado = new ArrayList();
        for (Vertice vertice : g.obterVertices()) {
            vertice.zerarVisitas();
            vertice.zerarDistancia();
        }
        inicio.visitar();
        inicio.definirDistancia(0);
        resultado.add(inicio);
        Stack<Vertice> pilha = new Stack<>();
        pilha.push(inicio);
        while (!pilha.isEmpty()) {
            Vertice u = pilha.pop();
            for (Arco arco : u.obterArcos()) {
                Vertice adj = arco.getDestino();
                if (adj.obterVisitado() == 0) {
                    adj.visitar();
                    adj.definirDistancia(u.obterDistancia() + 1);
                    adj.setCaminho(u.getCaminho());
                    resultado.add(adj);
                    pilha.push(adj);
                }
            }
            u.visitar();
        }

        return resultado;
    }
    
    public static ArrayList<Vertice> percorreLarguraPeso(Grafo g, Vertice inicio) {
        ArrayList<Vertice> resultado = new ArrayList();
        for (Vertice vertice : g.obterVertices()) {
            vertice.zerarVisitas();
            vertice.zerarDistancia();
        }
        inicio.visitar();
        inicio.definirDistancia(0);
        resultado.add(inicio);
        Queue<Vertice> fila = new LinkedList<>();
        fila.add(inicio);
        while (!fila.isEmpty()) {
            Vertice u = fila.remove();
            for (Arco arco : u.obterArcos()) {
                Vertice adj = arco.getDestino();
                if (adj.obterVisitado() == 0) {
                    adj.visitar();
                    adj.definirDistancia(u.obterDistancia() + arco.getPeso());
                    adj.setCaminho(u.getCaminho());
                    resultado.add(adj);
                    fila.add(adj);
                }
            }
            u.visitar();
        }

        return resultado;
    }

    public static ArrayList<Vertice> percorreProfundidadePeso(Grafo g, Vertice inicio) {
        ArrayList<Vertice> resultado = new ArrayList();
        for (Vertice vertice : g.obterVertices()) {
            vertice.zerarVisitas();
            vertice.zerarDistancia();
        }
        inicio.visitar();
        inicio.definirDistancia(0);
        resultado.add(inicio);
        Stack<Vertice> pilha = new Stack<>();
        pilha.push(inicio);
        while (!pilha.isEmpty()) {
            Vertice u = pilha.pop();
            for (Arco arco : u.obterArcos()) {
                Vertice adj = arco.getDestino();
                if (adj.obterVisitado() == 0) {
                    adj.visitar();
                    adj.definirDistancia(u.obterDistancia() + arco.getPeso());
                    adj.setCaminho(u.getCaminho());
                    resultado.add(adj);
                    pilha.push(adj);
                }
            }
            u.visitar();
        }

        return resultado;
    }
    
    
}
