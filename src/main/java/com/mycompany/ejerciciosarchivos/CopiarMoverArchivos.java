/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.ejerciciosarchivos;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.file.*;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * @author "Erick"
 */
public class CopiarMoverArchivos {

    public static void main(final String[] args) throws IOException {
        Path origen = Paths.get("D:/Archivos/Prueba1/archivo1.txt");
        Path destino = Path.of("D:/Archivos/Prueba2/");

//         Copiar un archivo
        try {
            Path copiar = Files.copy(origen, destino.resolve("copia_" +
                    origen.getFileName()), StandardCopyOption.REPLACE_EXISTING);
            System.out.println("Se copió el archivo a la ubicación : " + destino);
        } catch (IOException ex) {
            Logger.getLogger(CopiarMoverArchivos.class.getName()).log(Level.SEVERE, null,
                    ex);
        }
        // Mover un archivo
        // try {
        //// Path mover = Files.move(origen, destino.resolve(origen.getFileName()),
        // StandardCopyOption.REPLACE_EXISTING);
        //// System.out.println("Se movió el archivo " + mover);
        //
        // Path mismaUbicacion = Files.move(origen,
        // origen.resolveSibling("archivo1.txt"), StandardCopyOption.REPLACE_EXISTING);
        // System.out.println("Se movió y cambió el nombre del archivo " +
        // mismaUbicacion);
        // } catch (IOException ex) {
        // Logger.getLogger(CopiarMoverArchivos.class.getName()).log(Level.SEVERE, null,
        // ex);
        // }
//        final BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        String nombre;
//        int nota, n, i;
//        System.out.println("Numero de alumnos");
//        n = Integer.parseInt(br.readLine());
//        for (i = 1; i <= n; i++) {
//            System.out.println("Nombre: ");
//            nombre = br.readLine();
//            System.out.println("Nota: ");
//            nota = Integer.parseInt(br.readLine());
//            try {
//                final Path path = Files.writeString(Path.of("D:/Archivos/Prueba1/archivo1.txt"),
//                        nombre + "|" + nota + "\n", StandardOpenOption.APPEND);
//
//            } catch (final Exception e) {
//                e.printStackTrace();
//            }
//        }

    }

}
