package org.factorypattern;


import org.factorypattern.factory.Dialog;
import org.factorypattern.factory.HtmlDialog;
import org.factorypattern.factory.WindowsDialog;

/**
 * Demo class. Everything comes together here.
 */
public class Main {
    private static Dialog dialog;

    public static void main(String[] args) {
        configure();
        runBusinessLogic();
    }

    /**
     * The concrete factory is usually chosen depending on configuration or
     * environment options.
     */
    static void configure() {
        if (System.getProperty("os.name").equals("Windows 10")) {
            dialog = new WindowsDialog();

        } else {
            dialog = new HtmlDialog();

        }
    }


    static void runBusinessLogic() {
        dialog.renderWindow();
    }
}