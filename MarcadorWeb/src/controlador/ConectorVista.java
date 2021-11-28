/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import java.awt.Color;
import java.awt.Cursor;
import java.util.ArrayList;
import java.util.List;
import modelo.Marcador;
import modelo.Usuario;
import vistas.VistaUsuario;
import static vistas.VistaUsuario.lblPl1;

/**
 *
 * @author 56930
 */
public class ConectorVista {

    public static void pagina(Usuario usr1, int pagina) {
        int i = 0;
        int dieciseis = 0;
        Marcador marc = new Marcador();
        Registro rg = new Registro();

        List<Marcador> lista = rg.listarTodosLosMarcPorUsuario(usr1);
        for (Marcador tmp : lista) {
            i += 1;
            dieciseis += 1;
            String nombreMarcador = tmp.getNombreMarcador();
            String color = tmp.getColorMarcador();

            if (dieciseis == 17) {
                dieciseis = 1;
            }

            switch (pagina) {
                case 1:
                    if (i <= 16) {
                        actualizarDatos(dieciseis, color, nombreMarcador);
                    }
                    break;
                case 2:
                    if (i > 16 && i <= 32) {
                        actualizarDatos(dieciseis, color, nombreMarcador);
                    }
                    break;
                case 3:
                    if (i > 32 && i <= 48) {
                        actualizarDatos(dieciseis, color, nombreMarcador);
                    }
                    break;
                case 4:
                    if (i > 48 && i <= 64) {
                        actualizarDatos(dieciseis, color, nombreMarcador);
                    }
                    break;
                case 5:
                    if (i > 64 && i <= 80) {
                        actualizarDatos(dieciseis, color, nombreMarcador);
                    }
                    break;
                case 6:
                    if (i > 80 && i <= 96) {
                        actualizarDatos(dieciseis, color, nombreMarcador);
                    }
                    break;
                case 7:
                    if (i > 96 && i <= 112) {
                        actualizarDatos(dieciseis, color, nombreMarcador);
                    }
                    break;
                case 8:
                    if (i > 112 && i <= 128) {
                        actualizarDatos(dieciseis, color, nombreMarcador);
                    }
                    break;
                default:
                    break;
            }
        }
    }

    public static void colorearPanel(int valor, String col) {

        switch (valor) {
            case 1:
                switch (col) {
                    case "Lila":
                        VistaUsuario.pl1.setBackground(new Color(204, 204, 255));
                        break;
                    case "Rosa":
                        VistaUsuario.pl1.setBackground(new Color(255, 153, 204));
                        break;
                    case "Verde":
                        VistaUsuario.pl1.setBackground(new Color(204, 255, 204));
                        break;
                    default:
                        VistaUsuario.pl1.setBackground(new Color(255, 255, 204)); //por defecto es Amarillo 

                        break;
                }
                break;
            case 2:
                switch (col) {
                    case "Lila":
                        VistaUsuario.pl2.setBackground(new Color(204, 204, 255));
                        break;
                    case "Rosa":
                        VistaUsuario.pl2.setBackground(new Color(255, 153, 204));
                        break;
                    case "Verde":
                        VistaUsuario.pl2.setBackground(new Color(204, 255, 204));
                        break;
                    default:
                        VistaUsuario.pl2.setBackground(new Color(255, 255, 204)); //por defecto es Amarillo 
                        break;
                }
                break;
            case 3:
                switch (col) {
                    case "Lila":
                        VistaUsuario.pl3.setBackground(new Color(204, 204, 255));
                        break;
                    case "Rosa":
                        VistaUsuario.pl3.setBackground(new Color(255, 153, 204));
                        break;
                    case "Verde":
                        VistaUsuario.pl3.setBackground(new Color(204, 255, 204));
                        break;
                    default:
                        VistaUsuario.pl3.setBackground(new Color(255, 255, 204)); //por defecto es Amarillo 
                        break;
                }
                break;
            case 4:
                switch (col) {
                    case "Lila":
                        VistaUsuario.pl4.setBackground(new Color(204, 204, 255));
                        break;
                    case "Rosa":
                        VistaUsuario.pl4.setBackground(new Color(255, 153, 204));
                        break;
                    case "Verde":
                        VistaUsuario.pl4.setBackground(new Color(204, 255, 204));
                        break;
                    default:
                        VistaUsuario.pl4.setBackground(new Color(255, 255, 204)); //por defecto es Amarillo 
                        break;
                }
                break;
            case 5:
                switch (col) {
                    case "Lila":
                        VistaUsuario.pl5.setBackground(new Color(204, 204, 255));
                        break;
                    case "Rosa":
                        VistaUsuario.pl5.setBackground(new Color(255, 153, 204));
                        break;
                    case "Verde":
                        VistaUsuario.pl5.setBackground(new Color(204, 255, 204));
                        break;
                    default:
                        VistaUsuario.pl5.setBackground(new Color(255, 255, 204)); //por defecto es Amarillo 
                        break;
                }
                break;
            case 6:
                switch (col) {
                    case "Lila":
                        VistaUsuario.pl6.setBackground(new Color(204, 204, 255));
                        break;
                    case "Rosa":
                        VistaUsuario.pl6.setBackground(new Color(255, 153, 204));
                        break;
                    case "Verde":
                        VistaUsuario.pl6.setBackground(new Color(204, 255, 204));
                        break;
                    default:
                        VistaUsuario.pl6.setBackground(new Color(255, 255, 204)); //por defecto es Amarillo 
                        break;
                }
                break;
            case 7:
                switch (col) {
                    case "Lila":
                        VistaUsuario.pl7.setBackground(new Color(204, 204, 255));
                        break;
                    case "Rosa":
                        VistaUsuario.pl7.setBackground(new Color(255, 153, 204));
                        break;
                    case "Verde":
                        VistaUsuario.pl7.setBackground(new Color(204, 255, 204));
                        break;
                    default:
                        VistaUsuario.pl7.setBackground(new Color(255, 255, 204)); //por defecto es Amarillo 
                        break;
                }
                break;
            case 8:
                switch (col) {
                    case "Lila":
                        VistaUsuario.pl8.setBackground(new Color(204, 204, 255));
                        break;
                    case "Rosa":
                        VistaUsuario.pl8.setBackground(new Color(255, 153, 204));
                        break;
                    case "Verde":
                        VistaUsuario.pl8.setBackground(new Color(204, 255, 204));
                        break;
                    default:
                        VistaUsuario.pl8.setBackground(new Color(255, 255, 204)); //por defecto es Amarillo
                        break;
                }
                break;
            case 9:
                switch (col) {
                    case "Lila":
                        VistaUsuario.pl9.setBackground(new Color(204, 204, 255));
                        break;
                    case "Rosa":
                        VistaUsuario.pl9.setBackground(new Color(255, 153, 204));
                        break;
                    case "Verde":
                        VistaUsuario.pl9.setBackground(new Color(204, 255, 204));
                        break;
                    default:
                        VistaUsuario.pl9.setBackground(new Color(255, 255, 204)); //por defecto es Amarillo 
                        break;
                }
                break;
            case 10:
                switch (col) {
                    case "Lila":
                        VistaUsuario.pl10.setBackground(new Color(204, 204, 255));
                        break;
                    case "Rosa":
                        VistaUsuario.pl10.setBackground(new Color(255, 153, 204));
                        break;
                    case "Verde":
                        VistaUsuario.pl10.setBackground(new Color(204, 255, 204));
                        break;
                    default:
                        VistaUsuario.pl10.setBackground(new Color(255, 255, 204)); //por defecto es Amarillo 
                        break;
                }
                break;
            case 11:
                switch (col) {
                    case "Lila":
                        VistaUsuario.pl11.setBackground(new Color(204, 204, 255));
                        break;
                    case "Rosa":
                        VistaUsuario.pl11.setBackground(new Color(255, 153, 204));
                        break;
                    case "Verde":
                        VistaUsuario.pl11.setBackground(new Color(204, 255, 204));
                        break;
                    default:
                        VistaUsuario.pl11.setBackground(new Color(255, 255, 204)); //por defecto es Amarillo 
                        break;
                }
                break;
            case 12:
                switch (col) {
                    case "Lila":
                        VistaUsuario.pl12.setBackground(new Color(204, 204, 255));
                        break;
                    case "Rosa":
                        VistaUsuario.pl12.setBackground(new Color(255, 153, 204));
                        break;
                    case "Verde":
                        VistaUsuario.pl12.setBackground(new Color(204, 255, 204));
                        break;
                    default:
                        VistaUsuario.pl12.setBackground(new Color(255, 255, 204)); //por defecto es Amarillo 
                        break;
                }
                break;
            case 13:
                switch (col) {
                    case "Lila":
                        VistaUsuario.pl13.setBackground(new Color(204, 204, 255));
                        break;
                    case "Rosa":
                        VistaUsuario.pl13.setBackground(new Color(255, 153, 204));
                        break;
                    case "Verde":
                        VistaUsuario.pl13.setBackground(new Color(204, 255, 204));
                        break;
                    default:
                        VistaUsuario.pl13.setBackground(new Color(255, 255, 204)); //por defecto es Amarillo 
                        break;
                }
                break;
            case 14:
                switch (col) {
                    case "Lila":
                        VistaUsuario.pl14.setBackground(new Color(204, 204, 255));
                        break;
                    case "Rosa":
                        VistaUsuario.pl14.setBackground(new Color(255, 153, 204));
                        break;
                    case "Verde":
                        VistaUsuario.pl14.setBackground(new Color(204, 255, 204));
                        break;
                    default:
                        VistaUsuario.pl14.setBackground(new Color(255, 255, 204)); //por defecto es Amarillo 
                        break;
                }
                break;
            case 15:
                switch (col) {
                    case "Lila":
                        VistaUsuario.pl15.setBackground(new Color(204, 204, 255));
                        break;
                    case "Rosa":
                        VistaUsuario.pl15.setBackground(new Color(255, 153, 204));
                        break;
                    case "Verde":
                        VistaUsuario.pl15.setBackground(new Color(204, 255, 204));
                        break;
                    default:
                        VistaUsuario.pl15.setBackground(new Color(255, 255, 204)); //por defecto es Amarillo 
                        break;
                }
                break;
            case 16:
                switch (col) {
                    case "Lila":
                        VistaUsuario.pl16.setBackground(new Color(204, 204, 255));
                        break;
                    case "Rosa":
                        VistaUsuario.pl16.setBackground(new Color(255, 153, 204));
                        break;
                    case "Verde":
                        VistaUsuario.pl16.setBackground(new Color(204, 255, 204));
                        break;
                    default:
                        VistaUsuario.pl16.setBackground(new Color(255, 255, 204)); //por defecto es Amarillo 
                        break;
                }
                break;
            default:
                System.out.println("Se terminó");
        }
    }

    public static void actualizarDatos(int contador, String color, String nombreMarcador) {
        switch (contador) {
            case 1:
                VistaUsuario.lblPl1.setText(nombreMarcador);
                VistaUsuario.chk1.setEnabled(true);
                colorearPanel(1, color);
                break;
            case 2:
                VistaUsuario.lblPl2.setText(nombreMarcador);
                VistaUsuario.chk2.setEnabled(true);
                colorearPanel(2, color);
                break;
            case 3:
                VistaUsuario.lblPl3.setText(nombreMarcador);
                VistaUsuario.chk3.setEnabled(true);
                colorearPanel(3, color);
                break;
            case 4:
                VistaUsuario.lblPl4.setText(nombreMarcador);
                VistaUsuario.chk4.setEnabled(true);
                colorearPanel(4, color);
                break;
            case 5:
                VistaUsuario.lblPl6.setText(nombreMarcador);
                VistaUsuario.chk5.setEnabled(true);
                colorearPanel(5, color);
                break;
            case 6:
                VistaUsuario.lblPl7.setText(nombreMarcador);
                VistaUsuario.chk6.setEnabled(true);
                colorearPanel(6, color);
                break;
            case 7:
                VistaUsuario.lblPl8.setText(nombreMarcador);
                VistaUsuario.chk7.setEnabled(true);
                colorearPanel(7, color);
                break;
            case 8:
                VistaUsuario.lblPl9.setText(nombreMarcador);
                VistaUsuario.chk8.setEnabled(true);
                colorearPanel(8, color);
                break;
            case 9:
                VistaUsuario.lblPl10.setText(nombreMarcador);
                VistaUsuario.chk9.setEnabled(true);
                colorearPanel(9, color);
                break;
            case 10:
                VistaUsuario.lblPl11.setText(nombreMarcador);
                VistaUsuario.chk10.setEnabled(true);
                colorearPanel(10, color);
                break;
            case 11:
                VistaUsuario.lblPl12.setText(nombreMarcador);
                VistaUsuario.chk11.setEnabled(true);
                colorearPanel(11, color);
                break;
            case 12:
                VistaUsuario.lblPl13.setText(nombreMarcador);
                VistaUsuario.chk12.setEnabled(true);
                colorearPanel(12, color);
                break;
            case 13:
                VistaUsuario.lblPl14.setText(nombreMarcador);
                VistaUsuario.chk13.setEnabled(true);
                colorearPanel(13, color);
                break;
            case 14:
                VistaUsuario.lblPl15.setText(nombreMarcador);
                VistaUsuario.chk14.setEnabled(true);
                colorearPanel(14, color);
                break;
            case 15:
                VistaUsuario.lblPl16.setText(nombreMarcador);
                VistaUsuario.chk15.setEnabled(true);
                colorearPanel(15, color);
                break;
            case 16:
                VistaUsuario.lblPl17.setText(nombreMarcador);
                VistaUsuario.chk16.setEnabled(true);
                colorearPanel(16, color);
                break;
            default:
                break;
        }
        handCursor();
    }

    public static void activarVisualMas(int pagActual, int pagMas) {
        if (Integer.parseInt(VistaUsuario.lblPagina.getText()) >= 1 && pagActual < pagMas) {
            VistaUsuario.lblMas.setForeground(Color.black);
            VistaUsuario.lblMas.setCursor(new Cursor(Cursor.HAND_CURSOR));
        } else {
            VistaUsuario.lblMas.setForeground(Color.WHITE);
            VistaUsuario.lblMas.setCursor(new Cursor(Cursor.DEFAULT_CURSOR));
        }
    }

    public static void activarVisualMenos(int pagActual) {
        if (Integer.parseInt(VistaUsuario.lblPagina.getText()) > 1) {
            VistaUsuario.lblMenos.setForeground(Color.black);
            VistaUsuario.lblMenos.setCursor(new Cursor(Cursor.HAND_CURSOR));
        } else {
            VistaUsuario.lblMenos.setForeground(Color.WHITE);
            VistaUsuario.lblMenos.setCursor(new Cursor(Cursor.DEFAULT_CURSOR));
        }
    }

    public static List<String> traerLinkDePag(Usuario usr1, String pagina) {
        int i = 0;
        int dieciseis = 0;
        Marcador marc = new Marcador();
        Registro rg = new Registro();
        List<String> urlPag = new ArrayList<>();

        List<Marcador> lista = rg.listarTodosLosMarcPorUsuario(usr1);
        for (Marcador tmp : lista) {
            i += 1;
            dieciseis += 1;
            String nombreMarcador = tmp.getNombreMarcador();
            String color = tmp.getColorMarcador();

            if (dieciseis == 17) {
                dieciseis = 1;
            }

            switch (pagina) {
                case "1":
                    if (i <= 16) {
                        actualizarDatos(dieciseis, color, nombreMarcador);
                        urlPag.add(tmp.getUrl());
                    }
                    break;
                case "2":
                    if (i > 16 && i <= 32) {
                        actualizarDatos(dieciseis, color, nombreMarcador);
                        urlPag.add(tmp.getUrl());
                    }
                    break;
                case "3":
                    if (i > 32 && i <= 48) {
                        actualizarDatos(dieciseis, color, nombreMarcador);
                        urlPag.add(tmp.getUrl());
                    }
                    break;
                case "4":
                    if (i > 48 && i <= 64) {
                        actualizarDatos(dieciseis, color, nombreMarcador);
                        urlPag.add(tmp.getUrl());
                    }
                    break;
                case "5":
                    if (i > 64 && i <= 80) {
                        actualizarDatos(dieciseis, color, nombreMarcador);
                        urlPag.add(tmp.getUrl());
                    }
                    break;
                case "6":
                    if (i > 80 && i <= 96) {
                        actualizarDatos(dieciseis, color, nombreMarcador);
                        urlPag.add(tmp.getUrl());
                    }
                    break;
                case "7":
                    if (i > 96 && i <= 112) {
                        actualizarDatos(dieciseis, color, nombreMarcador);
                        urlPag.add(tmp.getUrl());
                    }
                    break;
                case "8":
                    if (i > 112 && i <= 128) {
                        actualizarDatos(dieciseis, color, nombreMarcador);
                        urlPag.add(tmp.getUrl());
                    }
                    break;
                default:
                    break;
            }
        }
        return urlPag;
    }

    public static void handCursor() {
        if (VistaUsuario.lblPl1.getText().isEmpty()) {
            VistaUsuario.lblPl1.setCursor(new Cursor(Cursor.DEFAULT_CURSOR));
        } else {
            VistaUsuario.lblPl1.setCursor(new Cursor(Cursor.HAND_CURSOR));
        }
        if (VistaUsuario.lblPl2.getText().isEmpty()) {
            VistaUsuario.lblPl2.setCursor(new Cursor(Cursor.DEFAULT_CURSOR));
        } else {
            VistaUsuario.lblPl2.setCursor(new Cursor(Cursor.HAND_CURSOR));
        }
        if (VistaUsuario.lblPl3.getText().isEmpty()) {
            VistaUsuario.lblPl3.setCursor(new Cursor(Cursor.DEFAULT_CURSOR));
        } else {
            VistaUsuario.lblPl3.setCursor(new Cursor(Cursor.HAND_CURSOR));
        }
        if (VistaUsuario.lblPl4.getText().isEmpty()) {
            VistaUsuario.lblPl4.setCursor(new Cursor(Cursor.DEFAULT_CURSOR));
        } else {
            VistaUsuario.lblPl4.setCursor(new Cursor(Cursor.HAND_CURSOR));
        }
        if (VistaUsuario.lblPl6.getText().isEmpty()) {
            VistaUsuario.lblPl6.setCursor(new Cursor(Cursor.DEFAULT_CURSOR));
        } else {
            VistaUsuario.lblPl6.setCursor(new Cursor(Cursor.HAND_CURSOR));
        }
        if (VistaUsuario.lblPl7.getText().isEmpty()) {
            VistaUsuario.lblPl7.setCursor(new Cursor(Cursor.DEFAULT_CURSOR));
        } else {
            VistaUsuario.lblPl7.setCursor(new Cursor(Cursor.HAND_CURSOR));
        }
        if (VistaUsuario.lblPl8.getText().isEmpty()) {
            VistaUsuario.lblPl8.setCursor(new Cursor(Cursor.DEFAULT_CURSOR));
        } else {
            VistaUsuario.lblPl8.setCursor(new Cursor(Cursor.HAND_CURSOR));
        }
        if (VistaUsuario.lblPl9.getText().isEmpty()) {
            VistaUsuario.lblPl9.setCursor(new Cursor(Cursor.DEFAULT_CURSOR));
        } else {
            VistaUsuario.lblPl9.setCursor(new Cursor(Cursor.HAND_CURSOR));
        }
        if (VistaUsuario.lblPl10.getText().isEmpty()) {
            VistaUsuario.lblPl10.setCursor(new Cursor(Cursor.DEFAULT_CURSOR));
        } else {
            VistaUsuario.lblPl10.setCursor(new Cursor(Cursor.HAND_CURSOR));
        }
        if (VistaUsuario.lblPl11.getText().isEmpty()) {
            VistaUsuario.lblPl11.setCursor(new Cursor(Cursor.DEFAULT_CURSOR));
        } else {
            VistaUsuario.lblPl11.setCursor(new Cursor(Cursor.HAND_CURSOR));
        }
        if (VistaUsuario.lblPl12.getText().isEmpty()) {
            VistaUsuario.lblPl12.setCursor(new Cursor(Cursor.DEFAULT_CURSOR));
        } else {
            VistaUsuario.lblPl12.setCursor(new Cursor(Cursor.HAND_CURSOR));
        }
        if (VistaUsuario.lblPl13.getText().isEmpty()) {
            VistaUsuario.lblPl13.setCursor(new Cursor(Cursor.DEFAULT_CURSOR));
        } else {
            VistaUsuario.lblPl13.setCursor(new Cursor(Cursor.HAND_CURSOR));
        }
        if (VistaUsuario.lblPl14.getText().isEmpty()) {
            VistaUsuario.lblPl14.setCursor(new Cursor(Cursor.DEFAULT_CURSOR));
        } else {
            VistaUsuario.lblPl14.setCursor(new Cursor(Cursor.HAND_CURSOR));
        }
        if (VistaUsuario.lblPl15.getText().isEmpty()) {
            VistaUsuario.lblPl15.setCursor(new Cursor(Cursor.DEFAULT_CURSOR));
        } else {
            VistaUsuario.lblPl15.setCursor(new Cursor(Cursor.HAND_CURSOR));
        }
        if (VistaUsuario.lblPl16.getText().isEmpty()) {
            VistaUsuario.lblPl16.setCursor(new Cursor(Cursor.DEFAULT_CURSOR));
        } else {
            VistaUsuario.lblPl16.setCursor(new Cursor(Cursor.HAND_CURSOR));
        }
        if (VistaUsuario.lblPl17.getText().isEmpty()) {
            VistaUsuario.lblPl17.setCursor(new Cursor(Cursor.DEFAULT_CURSOR));
        } else {
            VistaUsuario.lblPl17.setCursor(new Cursor(Cursor.HAND_CURSOR));
        }
    }

}
