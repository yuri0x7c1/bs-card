package org.vaadin.addons.yuri0x7c1.bscard;

import com.vaadin.flow.component.Component;
import com.vaadin.flow.component.HasComponents;
import com.vaadin.flow.component.Tag;
import com.vaadin.flow.component.dependency.JsModule;

/**
 *
 * @author yuri0x7c1
 *
 */
@Tag("bs-card-body")
@JsModule("./bs-card/bs-card-body.js")
public class BsCardBody extends Component implements HasComponents {
	public void addTitleComponent(Component c) {
		c.getElement().setAttribute("slot", "card-title");
		getElement().appendChild(c.getElement());
	}

	public void removeTitleComponent(Component c) {
		getElement().removeChild(c.getElement());
	}

	public void addSubtitleComponent(Component c) {
		c.getElement().setAttribute("slot", "card-subtitle");
		getElement().appendChild(c.getElement());
	}

	public void removeSubtitleComponent(Component c) {
		getElement().removeChild(c.getElement());
	}

	public void addTextComponent(Component c) {
		c.getElement().setAttribute("slot", "card-text");
		getElement().appendChild(c.getElement());
	}

	public void removeTextComponent(Component c) {
		getElement().removeChild(c.getElement());
	}
}
