package examen2_jesúsmeraz;

import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

public class AdminClientes {

    private ArrayList<Clientes> ListaClientes = new ArrayList();
    private File archivo = null;

    public AdminClientes(String path) {
        archivo = new File(path);
    }

    public ArrayList<Clientes> getListaClientes() {
        return ListaClientes;
    }

    public void setListaClientes(ArrayList<Clientes> ListaClientes) {
        this.ListaClientes = ListaClientes;
    }

    public File getArchivo() {
        return archivo;
    }

    public void setArchivo(File archivo) {
        this.archivo = archivo;
    }

    public void setClientes(Clientes a) {
        ListaClientes.add(a);
    }

    public void cargarArchivo() {
        try {
            ListaClientes = new ArrayList();
            Clientes temp;
            if (archivo.exists()) {
                FileInputStream entrada = new FileInputStream(archivo);
                ObjectInputStream objeto = new ObjectInputStream(entrada);
                try {
                    while ((temp = (Clientes) objeto.readObject()) != null) {
                        ListaClientes.add(temp);
                    }
                } catch (EOFException e) {
                    //encontro el final del archivo
                }
                objeto.close();
                entrada.close();
            }
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }

    public void escribirArchivo() {
        FileOutputStream fw = null;
        ObjectOutputStream bw = null;
        try {
            fw = new FileOutputStream(archivo);
            bw = new ObjectOutputStream(fw);
            for (Clientes t : ListaClientes) {
                bw.writeObject(t);
            }
            bw.flush();
        } catch (Exception ex) {
        } finally {
            try {
                bw.close();
                fw.close();
            } catch (Exception ex) {
            }
        }
    }
}
