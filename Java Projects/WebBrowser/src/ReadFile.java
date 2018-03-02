import com.sun.deploy.util.SyncAccess;

import javax.swing.*;
import java.awt.event.*;
import java.awt.*;
import javax.swing.event.*;



/**
 * Created by Sign in on 19-06-2017.
 */
public class ReadFile  extends JFrame{

    private JTextField addressBar;

    private JEditorPane display;

    //constructor

    public ReadFile() {

        super("Zunaki Browser");

        addressBar = new JTextField("Enter a URL");

        addressBar.addActionListener(
                new ActionListener() {
                    public void actionPerformed(ActionEvent event) {

                        loadCrap(event.getActionCommand());
                    }
                }
        );
        add(addressBar, BorderLayout.NORTH);

        display = new JEditorPane();

        display.setEditable(false);

        display.addHyperlinkListener(

                new HyperlinkListener() {

                    @Override

                    public void hyperlinkUpdate(HyperlinkEvent event) {

                        if(event.getEventType() == HyperlinkEvent.EventType.ACTIVATED ) {

                            loadCrap(event.getURL().toString());
                        }
                    }
                }
        );
        add(new JScrollPane(display), BorderLayout.CENTER );

        setSize(500,300);
        setVisible(true);

    }

    // loadCram to display on the screen

    private void loadCrap(String userText) {

        try{

            display.setPage(userText);

            addressBar.setText(userText);

        }
        catch (Exception e){
            System.out.println("Crap !");
        }
    }
}
