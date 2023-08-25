package org.factorypattern.factory;


import org.factorypattern.buttons.Button;
import org.factorypattern.buttons.WindowsButton;

/**
 * Windows Dialog will produce Windows buttons.
 */
public class WindowsDialog extends Dialog {

    @Override
    public Button createButton() {
        return new WindowsButton();
    }
}
