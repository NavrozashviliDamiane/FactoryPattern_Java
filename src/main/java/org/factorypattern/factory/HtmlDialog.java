package org.factorypattern.factory;

import org.factorypattern.buttons.Button;
import org.factorypattern.buttons.HtmlButton;

/**
 * HTML Dialog will produce HTML buttons.
 */
public class HtmlDialog extends Dialog {

    @Override
    public Button createButton() {
        return new HtmlButton();
    }
}
