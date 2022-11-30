import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.event.*;
import java.util.*;
import java.io.IOException;
import java.nio.file.Paths;
import java.io.BufferedWriter;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.nio.file.*;
  
public class FilePickerIO {
private JFrame frame;
  public FilePickerIO() { 
        JFrame frame = new JFrame();
        JMenuBar menubar = new JMenuBar();
        frame.setJMenuBar(menubar);

        JMenu menu;
        JMenuItem item;

        // create the File menu
        menu = new JMenu("File");
        menubar.add(menu);

        item = new JMenuItem("Load");

        item.addActionListener(e -> load());
        menu.add(item);
        menu.addSeparator();

        item = new JMenuItem("Save");
   
        item.addActionListener(e -> save());
        menu.add(item);
        
        frame.pack();
        frame.setVisible(true);
  }
  private static JFileChooser fileChooser = new JFileChooser(System.getProperty("user.dir"));
        public void load(){
          int returnVal = fileChooser.showOpenDialog(frame); 
          
          if(returnVal != JFileChooser.APPROVE_OPTION) {
            return;  // cancelled
          }
          
          String fname = fileChooser.getSelectedFile().getName();
          
          loadFromFile(fname);
  }
  public void save(){
          int returnVal = fileChooser.showSaveDialog(frame); 
          
          if(returnVal != JFileChooser.APPROVE_OPTION) {
            return;  // cancelled
          }
          
          String fname = fileChooser.getSelectedFile().getName();
          
          listToFile(fname);
  } 
  public void loadFromFile(String filename) {
        Path p1 = Paths.get(filename);
        try (BufferedReader reader = Files.newBufferedReader(p1)) {
            System.out.println(reader.readLine());
        }
        catch(FileNotFoundException e) {
            System.err.println("Unable to open " + filename);
        }
        catch(IOException e) {
            System.err.println("Error occured reading " + filename);
        }
    }
  public void listToFile(String filename) {
        Path p1 = Paths.get(filename);
        try(BufferedWriter writer = Files.newBufferedWriter(p1)){
            writer.write("This is working");
        }
        catch(FileNotFoundException e) {
            System.err.println("A problem was encountered writing " +
                filename);
        }
        catch(IOException e) {
            System.err.println("Error occured reading " + filename);
        }
    }
}
