package fuud.projects;

import javax.swing.*;
import javax.swing.event.AncestorListener;

public class JComponentWrapper extends JComponent {
    private final JComponent component;

    public JComponentWrapper(JComponent component){
        this.component = component;
    }

    protected JComponent getWrappedComponent() {
        return component;
    }

    /**
     * Registers <code>listener</code> so that it will receive
     * <code>AncestorEvents</code> when it or any of its ancestors
     * move or are made visible or invisible.
     * Events are also sent when the component or its ancestors are added
     * or removed from the containment hierarchy.
     *
     * @param listener the <code>AncestorListener</code> to register
     * @see javax.swing.event.AncestorEvent
     */
    @Override
    public void addAncestorListener(AncestorListener listener) {
        super.addAncestorListener(listener);
    }


}