package prueba;




import java.awt.Color;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;


public class ala extends JFrame {
    
public ala () {   //ESTE CREA LA VENTANA
    

setSize(600, 350);                      ////DEFINIR EL TAMAÑO DE LA VENTANA////


setIconImage(new ImageIcon(getClass().getResource("prueba/f.png")).getImage());


setDefaultCloseOperation(EXIT_ON_CLOSE);  ///PARA PODER CERRAR///

//setLocation(650, 300);   //X / Y//

//setBounds(650, 300, 600, 350); //ES SETSIZE Y SETLOCATION EN UNO SOLO, PRIMERO VA LA LOCATION LUEGO EL SIZE//

setLocationRelativeTo(null);  //PARA PONER EN EL CENTRO//


setTitle("Holi Vale");  //PONGO EL NOMBRE DE LA VENTANA//


//this.getContentPane().setBackground(Color.gray);   //DAR COLOR AL FONDO//

components(); //INVOCO AL PANEL DE ABAJO
  

}   

private void components(){  //PARA INICIAR ALGO MAS SE TIENE QUE PONER PUBLIC/PRIVATE + VOID + EL NOMBRE QUE LE DE

JPanel panelsito = new JPanel();     //SE CREA EL  OBJETO DEL PANEL//

panelsito.setLayout(null);  //PARA PODER CAMBIAR LA UBICACION DE LAS ETIQUETAS//


this.getContentPane().add(panelsito); //AGREGO UN PANEL//

//panelsito.setBackground(Color.CYAN);   //PARA DARLE COLOR AL PANEL



                             //AQUI ES DONDE TAMBIEN SE PUEDE// 
JLabel etiquetas = new JLabel("Holi crayoli mami", SwingConstants.LEFT);      //UN JLABEL ES ALGUNA ETIQUETA// //SE CREA LA ETIQUETA//    

etiquetas.setBounds(20, 25, 116, 15);

//etiquetas.setText("Holi crayoli Valee :) ");  //TAMBIEN SE PUEDE ASI EN VEZ DE EN EL PARENTESIS


etiquetas.setForeground(Color.red);  // SE ESTABLECE COLOR A LAS LETRAS//

etiquetas.setOpaque(true);  //ACTIVAMOS PARA CAMBIAR EL FONDO DE LETRA
etiquetas.setBackground(Color.white); //SE CAMBIA EL FONDO DE LA LETRA

panelsito.add(etiquetas); //SE AGREGA LA ETIQUETA A EL PANEL QUE CREE ARRIBA//



JLabel etiquetas2 = new JLabel("Estas solo son pruebas :) ", SwingConstants.RIGHT);

etiquetas2.setBounds(430, 25, 150, 30);

//etiquetas2.setText("Estas solo son pruebas :)");



etiquetas2.setForeground(Color.red);

etiquetas2.setOpaque(true);
etiquetas2.setBackground(Color.white);

panelsito.add(etiquetas2);



JLabel etiquetas3 = new JLabel();

etiquetas3.setBounds(15, 230, 125, 30);

etiquetas3.setText("Con esto aprendo :) ");
etiquetas3.setHorizontalAlignment(SwingConstants.LEFT);


etiquetas3.setForeground(Color.red);

etiquetas3.setOpaque(true);
etiquetas3.setBackground(Color.white);

panelsito.add(etiquetas3);




JLabel etiquetas4 = new JLabel();

etiquetas4.setBounds(430, 230, 100, 30);

etiquetas4.setText("pero da flojera :( ");
etiquetas4.setHorizontalAlignment(SwingConstants.RIGHT);


etiquetas4.setForeground(Color.red);

etiquetas4.setOpaque(true);
etiquetas4.setBackground(Color.white);

panelsito.add(etiquetas4);










                                      //CREARE UNA IMAGEN//
JLabel imagenn = new JLabel();

imagenn.setIcon(new ImageIcon("prueba/a.jpg")); //TENGO QUE SELECCIONAR LA UBICACION DE LA IMAGEN
                                                //lUEGO AGREGO UN / MAS EL NOMBRE COMPLETO DE LA IMAGEN

imagenn.setBounds(60, 60, 390, 300);

panelsito.add(imagenn);









}
 









}


