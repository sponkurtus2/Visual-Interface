# Visual-Interface
 i need a bit of help
 
 im making a visual interface for practicing, and i want to change the icon of the app, i use this 
 setIconImage(new ImageIcon(getClass().getResource("prueba/f.png")).getImage());
 but when i run the program i have this error
 
 Exception in thread "main" java.lang.NullPointerException: Cannot invoke "java.net.URL.toExternalForm()" because "location" is null
        at java.desktop/javax.swing.ImageIcon.<init>(ImageIcon.java:217)
        at prueba.ala.<init>(ala.java:24)
        at prueba.sus.main(sus.java:9)
 
 ¿how can i fix it and put my icon?
