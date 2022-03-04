package lab7p2_victorvalladares_12141026;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class AdministrarEquipos {
    private ArrayList<Equipos> listaEquipos = new ArrayList();
    private File archivo = null;
    
    public AdministrarEquipos(String path) {
        archivo = new File(path);
    }

    public ArrayList<Equipos> getListaEquipos() {
        return listaEquipos;
    }

    public void setListaEquipos(ArrayList<Equipos> listaEquipos) {
        this.listaEquipos = listaEquipos;
    }

    public File getArchivo() {
        return archivo;
    }

    public void setArchivo(File archivo) {
        this.archivo = archivo;
    }

    @Override
    public String toString() {
        return "listaEquipos=" + listaEquipos;
    }
    
    public void setPersona(Equipos a) {
        this.listaEquipos.add(a);
    }

    public void escribirArchivo() throws IOException {
        FileWriter fw = null;
        BufferedWriter bw = null;
        try {
            fw = new FileWriter(archivo, false);
            bw = new BufferedWriter(fw);
            for (Equipos x : listaEquipos) {
                bw.write(x.getNombre() + "," + x.getPartidos() +"," + x.getGanados() + "," + x.getEmpatados() + "," + x.getPerdidios() + "," +
                x.getGf()+","+x.getGc()+","+x.getDiff()+","+x.getPts());
            }
            bw.flush();
        } catch (Exception ex) {
        }
        bw.close();
        fw.close();
    }

    public void cargarArchivo() {
        Scanner sc = null;
        listaEquipos = new ArrayList();
        if (archivo.exists()) {
            try {
                sc = new Scanner(archivo);
                sc.useDelimiter(",");
                while (sc.hasNext()) {
                    listaEquipos.add(new Equipos(sc.next(),
                                    sc.nextInt(),
                                    sc.nextInt(),
                                    sc.nextInt(),
                                    sc.nextInt(),
                                    sc.nextInt(),
                                    sc.nextInt(),
                                    sc.nextInt(),
                                    sc.nextInt()
                                 )
                    );
                }
            } catch (Exception ex) {
            }
            sc.close();
        }
    }
}
